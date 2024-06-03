
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class Main extends javax.swing.JFrame {

    private final ArrayList<Contenido> flixnet;
    private JButton btnAgregarPelicula, btnAgregarSerie, btnEliminarContenido, btnVerContenido, btnListarContenido, btnListarPendientes, btnBonusTrack, btnSalir;
    private JTextArea txtAreaContenido;

    public Main() {
        super("FlixNet");
        flixnet = new ArrayList<>();
        cargarContenidoInicial();
        initComponents();
    }

    private void cargarContenidoInicial() {
        //CREAMOS VARIAS PELICULAS
        Contenido pelicula1 = new Pelicula(0, 0, "El ataque de los muero vivientes", "Sangre films", 1985);
        flixnet.add(pelicula1);
        Contenido pelicula2 = new Pelicula(5, 0, "La guerra de las galaxias", "Cosa nostra", 1982);
        flixnet.add(pelicula2);
        Contenido pelicula3 = new Pelicula(1, 1, "Todo sobre mi madre", "Almodovar films", 1992);
        flixnet.add(pelicula3);
        boolean visto = false;

        //CREAMOS VARIAS SERIES
        Contenido serie1 = new Serie(15, true, visto, "Big Bang Theory", "Tractor amarillo", 1982);
        flixnet.add(serie1);
        Contenido serie2 = new Serie(1, false, visto, "Armaggedon", "Netflix", 2023);
        flixnet.add(serie2);
        Contenido serie3 = new Serie(15, true, visto, "Curro Jiménez", "Chicho Ibañez", 1980);
        flixnet.add(serie3);

        serie3.setVisto(true); //Para comprobar de que funciona
    }

    private void agregarPelicula() {
        Pelicula pelicula = Pelicula.crearPeliculaDesdeFormulario(this);
        if (pelicula != null) {
            flixnet.add(pelicula);
            actualizarTxtArea();
        }
    }

    private void agregarSerie() {
        Serie serie = Serie.crearSerieDesdeFormulario(this);
        if (serie != null) {
            flixnet.add(serie);
            actualizarTxtArea();
        }
    }

    private void eliminarContenido() {
        String titulo = JOptionPane.showInputDialog(this, "Introduce el título del contenido a eliminar:");
        if (titulo != null && !titulo.isEmpty()) {
            boolean contenidoEncontrado = false;
            for (Contenido contenido : flixnet) {
                if (contenido.getTitulo().equals(titulo)) {
                    flixnet.remove(contenido);
                    contenidoEncontrado = true;
                    break;
                }
            }
            if (contenidoEncontrado) {
                JOptionPane.showMessageDialog(this, "El contenido ha sido eliminado correctamente.");
                actualizarTxtArea();
            } else {
                JOptionPane.showMessageDialog(this, "No se ha encontrado el contenido especificado.");
            }
        }
    }

    private void verContenido() {
        String titulo = JOptionPane.showInputDialog(this, "Introduce el título del contenido a marcar como visto:");
        if (titulo != null && !titulo.isEmpty()) {
            boolean contenidoEncontrado = false;
            for (Contenido contenido : flixnet) {
                if (contenido.getTitulo().equals(titulo)) {
                    contenido.setVisto(true);
                    contenidoEncontrado = true;
                    break;
                }
            }
            if (contenidoEncontrado) {
                JOptionPane.showMessageDialog(this, "El contenido ha sido marcado como visto.");
                actualizarTxtArea();
            } else {
                JOptionPane.showMessageDialog(this, "No se ha encontrado el contenido especificado.");
            }
        }
    }

    private void listarContenido() {
        StringBuilder contenidoStr = new StringBuilder("Contenido en FlixNet:\n");
        for (Contenido contenido : flixnet) {
            contenidoStr.append(contenido.toString()).append("\n");
        }
        txtAreaContenido.setText(contenidoStr.toString());
    }

    private void listarPendientes() {
        StringBuilder pendientesStr = new StringBuilder("Contenido pendiente de ver en FlixNet:\n");
        for (Contenido contenido : flixnet) {
            if (!contenido.isVisto()) {
                pendientesStr.append(contenido.toString()).append("\n");
            }
        }
        txtAreaContenido.setText(pendientesStr.toString());
    }

    private void bonusTrack() {
        StringBuilder bonusStr = new StringBuilder("Películas con nominaciones y Oscars:\n");
        for (Contenido contenido : flixnet) {
            if (contenido instanceof Pelicula) {
                bonusStr.append("Título: ").append(contenido.getTitulo()).append(" Nominaciones: ").append(((Pelicula) contenido).getNumNominaciones()).append(" Oscars: ").append(((Pelicula) contenido).getNumOscars()).append("\n");
            }
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