package entregafinalnetflix;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;

public class Main extends javax.swing.JFrame {

    private final ArrayList<Contenido> flixnet;
    private JButton btnAgregarPelicula, btnAgregarSerie, btnEliminarContenido, btnVerContenido, btnListarContenido, btnListarPendientes, btnBonusTrack, btnSalir;
    private JTextArea txtAreaContenido;
    private Connection connection;


    public Main() {
        super("FlixNet");
        flixnet = new ArrayList<>();
        cargarContenidoInicial();
        initComponents();
    }
    
    private void cargarContenidoInicial() {
    try (Connection conn = DatabaseManager.getConnection()) {
        // Consulta SQL para seleccionar películas desde la tabla 'peliculas'
        String queryPeliculas = "SELECT * FROM peliculas";
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(queryPeliculas);
            while (rs.next()) {
                Pelicula pelicula = Pelicula.fromResultSet(rs);
                flixnet.add(pelicula);
            }
        }

        // Consulta SQL para seleccionar series desde la tabla 'series'
        String querySeries = "SELECT * FROM series";
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(querySeries);
            while (rs.next()) {
                Serie serie = Serie.fromResultSet(rs);
                flixnet.add(serie);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    // Imprimir la lista flixnet para verificar si se han cargado los datos correctamente
    System.out.println("Datos cargados inicialmente:");
    for (Contenido contenido : flixnet) {
        System.out.println(contenido);
    }
}

    private void eliminarContenido() {
            String titulo = JOptionPane.showInputDialog(this, "Introduce el título del contenido a eliminar:");
            if (titulo != null && !titulo.isEmpty()) {
                boolean encontrado = false;
                for (Contenido contenido : flixnet) {
                    if (contenido.getTitulo().equals(titulo)) {
                        encontrado = true;
                        if (contenido instanceof Pelicula) {
                            eliminarPelicula((Pelicula) contenido);
                        } else if (contenido instanceof Serie) {
                            eliminarSerie((Serie) contenido);
                        }
                        break;
                    }
                }
                if (!encontrado) {
                    JOptionPane.showMessageDialog(this, "No se ha encontrado el contenido especificado.");
                }
            }
        }
    
    private void eliminarSerie(Serie serie) {
    try (Connection conn = DatabaseManager.getConnection()) {
        String query = "DELETE FROM series WHERE titulo = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, serie.getTitulo());
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                flixnet.remove(serie);
                JOptionPane.showMessageDialog(this, "La serie ha sido eliminada correctamente.");
                actualizarTxtArea();
            } else {
                JOptionPane.showMessageDialog(this, "No se ha encontrado la serie especificada.");
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    }
    
    private void eliminarPelicula(Pelicula pelicula) {
    try (Connection conn = DatabaseManager.getConnection()) {
        String query = "DELETE FROM peliculas WHERE titulo = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, pelicula.getTitulo());
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                flixnet.remove(pelicula);
                JOptionPane.showMessageDialog(this, "La película ha sido eliminada correctamente.");
                actualizarTxtArea();
            } else {
                JOptionPane.showMessageDialog(this, "No se ha encontrado la película especificada.");
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    }
    
    private void agregarPelicula() {
        Pelicula pelicula = Pelicula.crearPeliculaDesdeFormulario(this);
        if (pelicula != null) {
            try {
                pelicula.saveToDatabase();
                flixnet.add(pelicula);
                actualizarTxtArea();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

public void agregarSerie(int nTemporadas, boolean visto, String titulo, String productora, int año) {
    Serie serie = new Serie(nTemporadas, visto, titulo, productora, año);
    System.out.println("Serie agregada correctamente.");
}


    
    private void finalizarSerie() {
    String titulo = JOptionPane.showInputDialog(this, "Introduce el título de la serie a marcar como finalizada:");
    if (titulo != null && !titulo.isEmpty()) {
        try (PreparedStatement stmt = connection.prepareStatement("UPDATE series SET finalizada = true WHERE titulo = ?")) {
            stmt.setString(1, titulo);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "La serie ha sido marcada como finalizada.");
                actualizarTxtArea();
            } else {
                JOptionPane.showMessageDialog(this, "No se ha encontrado la serie especificada.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error marcando la serie como finalizada.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

    private void verContenido() {
        String titulo = JOptionPane.showInputDialog(this, "Introduce el título del contenido a marcar como visto:");
        if (titulo != null && !titulo.isEmpty()) {
            try (Connection conn = DatabaseManager.getConnection()) {
                String query = "UPDATE contenido SET visto = true WHERE titulo = ?";
                try (PreparedStatement stmt = conn.prepareStatement(query)) {
                    stmt.setString(1, titulo);
                    int rowsAffected = stmt.executeUpdate();
                    if (rowsAffected > 0) {
                        for (Contenido contenido : flixnet) {
                            if (contenido.getTitulo().equals(titulo)) {
                                contenido.setVisto(true);
                                break;
                            }
                        }
                        JOptionPane.showMessageDialog(this, "El contenido ha sido marcado como visto.");
                        actualizarTxtArea();
                    } else {
                        JOptionPane.showMessageDialog(this, "No se ha encontrado el contenido especificado.");
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void listarContenido() {
        actualizarTxtArea();
    }


    private void listarPendientes() {
        StringBuilder sb = new StringBuilder();
        for (Contenido contenido : flixnet) {
            if (!contenido.isVisto()) {
                sb.append(contenido).append("\n");
            }
        }
        txtAreaContenido.setText(sb.toString());
    }

    private void bonusTrack() {
        StringBuilder sb = new StringBuilder();
        for (Contenido contenido : flixnet) {
            if (contenido instanceof Pelicula) {
                Pelicula pelicula = (Pelicula) contenido;
                if (pelicula.getNumOscars() > 3) {
                    sb.append(pelicula).append("\n");
                }
            }
        }
        txtAreaContenido.setText(sb.toString());
    }

    private void salir() {
        System.exit(0);
    }

    private void actualizarTxtArea() {
        StringBuilder sb = new StringBuilder();
        for (Contenido contenido : flixnet) {
            sb.append(contenido).append("\n");
        }
        txtAreaContenido.setText(sb.toString());
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());

    JPanel panelBotones = new JPanel(new GridLayout(8, 1));

    btnAgregarPelicula = new JButton("Agregar Película");
    btnAgregarPelicula.addActionListener(evt -> agregarPelicula());
    panelBotones.add(btnAgregarPelicula);

	btnAgregarSerie = new JButton("Agregar Serie");
	btnAgregarSerie.addActionListener(evt -> {
		Serie serie = Serie.crearSerieDesdeFormulario(this);
		if (serie != null) {
			try {
				serie.saveToDatabase();
				flixnet.add(serie);
				actualizarTxtArea();
				System.out.println("Serie agregada correctamente.");
			} catch (SQLException e) {
				System.err.println("Error al agregar la serie: " + e.getMessage());
			}
		}
	});
	panelBotones.add(btnAgregarSerie);

    btnEliminarContenido = new JButton("Eliminar Contenido");
    btnEliminarContenido.addActionListener(evt -> eliminarContenido());
    panelBotones.add(btnEliminarContenido);

    btnVerContenido = new JButton("Marcar como Visto");
    btnVerContenido.addActionListener(evt -> verContenido());
    panelBotones.add(btnVerContenido);

    btnListarContenido = new JButton("Listar Contenido");
    btnListarContenido.addActionListener(evt -> listarContenido());
    panelBotones.add(btnListarContenido);

    btnListarPendientes = new JButton("Listar Pendientes");
    btnListarPendientes.addActionListener(evt -> listarPendientes());
    panelBotones.add(btnListarPendientes);

    btnBonusTrack = new JButton("Listado de películas");
    btnBonusTrack.addActionListener(evt -> bonusTrack());
    panelBotones.add(btnBonusTrack);

    btnSalir = new JButton("Salir");
    btnSalir.addActionListener(evt -> salir());
    panelBotones.add(btnSalir);

    txtAreaContenido = new JTextArea(15, 40);
    txtAreaContenido.setEditable(false);
    JScrollPane scrollPane = new JScrollPane(txtAreaContenido);
    add(scrollPane, BorderLayout.CENTER);

    add(panelBotones, BorderLayout.WEST);

    pack();
}// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
        Main mainFrame = new Main();
        mainFrame.setVisible(true);
    });
}

}