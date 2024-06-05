import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main extends javax.swing.JFrame {

    private JButton btnAgregarPelicula, btnAgregarSerie, btnEliminarContenido, btnVerContenido, btnListarContenido, btnListarPendientes, btnBonusTrack, btnSalir;
    private JTextArea txtAreaContenido;
    
    private Connection connection;

    public Main() {
        super("FlixNet");
        initComponents();
        initializeDatabaseConnection();
    }
    
    private void initializeDatabaseConnection() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/flixnet", "javier", "1234javier1234");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error conectando a la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }
    
    private void agregarPelicula() {
        Pelicula pelicula = Pelicula.crearPeliculaDesdeFormulario(this);
        if (pelicula != null) {
            try (PreparedStatement stmt = connection.prepareStatement("INSERT INTO peliculas (titulo, productora, anio, nominaciones, oscars, visto) VALUES (?, ?, ?, ?, ?)")) {
                stmt.setString(1, pelicula.getTitulo());
                stmt.setString(2, pelicula.getProductora());
                stmt.setInt(3, pelicula.getAño());
                stmt.setInt(4, pelicula.getNumNominaciones());
                stmt.setInt(5, pelicula.getNumOscars());
                stmt.setBoolean(6, pelicula.isVisto());
                stmt.executeUpdate();
                actualizarTxtArea();
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error agregando película.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void agregarSerie() {
        Serie serie = Serie.crearSerieDesdeFormulario(this);
        if (serie != null) {
            try (PreparedStatement stmt = connection.prepareStatement("INSERT INTO series (titulo, productora, anio, temporadas, episodios, visto) VALUES (?, ?, ?, ?, ?, ?)")) {
                stmt.setString(1, serie.getTitulo());
                stmt.setString(2, serie.getProductora());
                stmt.setInt(3, serie.getAño());
                stmt.setInt(4, serie.getnTemporadas());
                stmt.setBoolean(5, serie.isFinalizada());
                stmt.setBoolean(6, serie.isVisto());
                stmt.executeUpdate();
                actualizarTxtArea();
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error agregando serie.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
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

    private void eliminarContenido() {
        String titulo = JOptionPane.showInputDialog(this, "Introduce el título del contenido a eliminar:");
        if (titulo != null && !titulo.isEmpty()) {
            try (PreparedStatement stmt = connection.prepareStatement("DELETE FROM peliculas WHERE titulo = ?")) {
                stmt.setString(1, titulo);
                int rowsAffected = stmt.executeUpdate();
                if (rowsAffected == 0) {
                    try (PreparedStatement stmt2 = connection.prepareStatement("DELETE FROM series WHERE titulo = ?")) {
                        stmt2.setString(1, titulo);
                        rowsAffected = stmt2.executeUpdate();
                    }
                }
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "El contenido ha sido eliminado correctamente.");
                    actualizarTxtArea();
                } else {
                    JOptionPane.showMessageDialog(this, "No se ha encontrado el contenido especificado.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error eliminando contenido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void verContenido() {
        String titulo = JOptionPane.showInputDialog(this, "Introduce el título del contenido a marcar como visto:");
        if (titulo != null && !titulo.isEmpty()) {
            try {
                //Actualizar tabla Series
                PreparedStatement stmt = connection.prepareStatement("UPDATE series SET visto = true WHERE titulo = ?");
                stmt.setString(1, titulo);
                int rowsAffected = stmt.executeUpdate();
                
                //Si no se encontró en Series lo intentamos en Películas
                if (rowsAffected == 0) {
                    stmt = connection.prepareStatement("UPDATE peliculas SET visto = true WHERE titulo = ?");
                    stmt.setString(1, titulo);
                    rowsAffected = stmt.executeUpdate();
                }
                
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "El contenido ha sido marcado como visto.");
                    actualizarTxtArea();
                } else {
                    JOptionPane.showMessageDialog(this, "No se ha encontrado el contenido especificado.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error marcando contenido como visto.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void listarContenido() {
        StringBuilder contenidoStr = new StringBuilder("Contenido en FlixNet:\n");
    try {
        // Consulta para obtener películas
        String queryPeliculas = "SELECT titulo, productora, anio, 'Película' AS tipo FROM peliculas";
        // Consulta para obtener series
        String querySeries = "SELECT titulo, productora, anio, finalizada, 'Serie' AS tipo FROM series";

        try (PreparedStatement stmtPeliculas = connection.prepareStatement(queryPeliculas);
             ResultSet rsPeliculas = stmtPeliculas.executeQuery();
             PreparedStatement stmtSeries = connection.prepareStatement(querySeries);
             ResultSet rsSeries = stmtSeries.executeQuery()) {

            while (rsPeliculas.next()) {
                contenidoStr.append(rsPeliculas.getString("titulo")).append(" - ")
                            .append(rsPeliculas.getString("productora")).append(" (")
                            .append(rsPeliculas.getInt("anio")).append(") [")
                            .append(rsPeliculas.getString("tipo")).append("]\n");
            }

            while (rsSeries.next()) {
                contenidoStr.append(rsSeries.getString("titulo")).append(" - ")
                            .append(rsSeries.getString("productora")).append(" (")
                            .append(rsSeries.getInt("anio")).append(") [")
                            .append(rsSeries.getString("tipo")).append("]")
                            .append(rsSeries.getBoolean("finalizada") ? " - Finalizada" : "")
                            .append("\n");
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error listando contenido.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    txtAreaContenido.setText(contenidoStr.toString());
}

    private void listarPendientes() {
        StringBuilder contenidoStr = new StringBuilder("Contenido pendiente en FlixNet:\n");
        try {
        // Consulta para obtener películas no vistas
            String queryPeliculas = "SELECT titulo, productora, anio, 'Película' AS tipo FROM peliculas WHERE visto = false";
        // Consulta para obtener series no vistas
            String querySeries = "SELECT titulo, productora, anio, finalizada, 'Serie' AS tipo FROM series WHERE visto = false";

            try (PreparedStatement stmtPeliculas = connection.prepareStatement(queryPeliculas);
             ResultSet rsPeliculas = stmtPeliculas.executeQuery();
             PreparedStatement stmtSeries = connection.prepareStatement(querySeries);
             ResultSet rsSeries = stmtSeries.executeQuery())
            
            {

            while (rsPeliculas.next()) {
                contenidoStr.append(rsPeliculas.getString("titulo")).append(" - ")
                            .append(rsPeliculas.getString("productora")).append(" (")
                            .append(rsPeliculas.getInt("anio")).append(") [")
                            .append(rsPeliculas.getString("tipo")).append("]\n");
            }

            while (rsSeries.next()) {
                contenidoStr.append(rsSeries.getString("titulo")).append(" - ")
                            .append(rsSeries.getString("productora")).append(" (")
                            .append(rsSeries.getInt("anio")).append(") [")
                            .append(rsSeries.getString("tipo")).append("]")
                            .append(rsSeries.getBoolean("finalizada") ? " - Finalizada" : "")
                            .append("\n");
            }
        }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error listando contenido pendiente.", "Error", JOptionPane.ERROR_MESSAGE);
          }
        txtAreaContenido.setText(contenidoStr.toString());
}

    private void bonusTrack() {
        StringBuilder bonusStr = new StringBuilder("Películas con nominaciones y Oscars:\n");
        try (PreparedStatement stmt = connection.prepareStatement("SELECT titulo, nominaciones, oscars FROM peliculas");
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                bonusStr.append("Título: ").append(rs.getString("titulo")).append(" Nominaciones: ").append(rs.getInt("nominaciones")).append(" Oscars: ").append(rs.getInt("oscars")).append("\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error listando bonus track.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        txtAreaContenido.setText(bonusStr.toString());
    }

    private void actualizarTxtArea() {
        listarContenido();
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        txtAreaContenido = new JTextArea(15, 40);
        txtAreaContenido.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(txtAreaContenido);
        add(scrollPane, BorderLayout.CENTER);

        JPanel panelBotones = new JPanel(new GridLayout(2, 4));
        btnAgregarPelicula = new JButton("Agregar Película");
        btnAgregarSerie = new JButton("Agregar Serie");
        btnEliminarContenido = new JButton("Eliminar Contenido");
        btnVerContenido = new JButton("Ver Contenido");
        btnListarContenido = new JButton("Listar Contenido");
        btnListarPendientes = new JButton("Listar Pendientes");
        btnBonusTrack = new JButton("Películas y Oscars");
        btnSalir = new JButton("Salir");

        panelBotones.add(btnAgregarPelicula);
        panelBotones.add(btnAgregarSerie);
        panelBotones.add(btnEliminarContenido);
        panelBotones.add(btnVerContenido);
        panelBotones.add(btnListarContenido);
        panelBotones.add(btnListarPendientes);
        panelBotones.add(btnBonusTrack);
        panelBotones.add(btnSalir);

        add(panelBotones, BorderLayout.SOUTH);

        btnAgregarPelicula.addActionListener(e -> agregarPelicula());
        btnAgregarSerie.addActionListener(e -> agregarSerie());
        btnEliminarContenido.addActionListener(e -> eliminarContenido());
        btnVerContenido.addActionListener(e -> verContenido());
        btnListarContenido.addActionListener(e -> listarContenido());
        btnListarPendientes.addActionListener(e -> listarPendientes());
        btnBonusTrack.addActionListener(e -> bonusTrack());
        btnSalir.addActionListener(e -> System.exit(0));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main().setVisible(true));
    }
}