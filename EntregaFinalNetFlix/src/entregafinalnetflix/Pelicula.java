package entregafinalnetflix;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.ResultSet;


public class Pelicula extends Contenido {
    private int numNominaciones, numOscars;

    public Pelicula(int numNominaciones, int numOscars, String titulo, String productora, int año) {
        super(titulo, productora, año);
        this.numNominaciones = numNominaciones;
        this.numOscars = numOscars;
    }

    public int getNumNominaciones() {
        return numNominaciones;
    }

    public int getNumOscars() {
        return numOscars;
    }

    public void setNumNominaciones(int numNominaciones) {
        this.numNominaciones = numNominaciones;
    }

    public void setNumOscars(int numOscars) {
        this.numOscars = numOscars;
    }
    

    @Override
    public void saveToDatabase() throws SQLException {
        try (Connection conn = DatabaseManager.getConnection()) {
            String query = "INSERT INTO peliculas (titulo, productora, año, numNominaciones, numOscars) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, titulo);
                stmt.setString(2, productora);
                stmt.setInt(3, año); // Asegúrate de establecer el valor de 'año'
                stmt.setInt(4, numNominaciones);
                stmt.setInt(5, numOscars);
                stmt.executeUpdate();
            }
        }
    }

    public static Pelicula fromResultSet(ResultSet rs) throws SQLException {
        String titulo = rs.getString("titulo");
        String productora = rs.getString("productora");
        int año = rs.getInt("año");
        int numNominaciones = rs.getInt("numNominaciones");
        int numOscars = rs.getInt("numOscars");

        return new Pelicula(numNominaciones, numOscars, titulo, productora, año);
    }

    public static Pelicula crearPeliculaDesdeFormulario(JFrame frame) {
        String titulo = JOptionPane.showInputDialog(frame, "Introduce el título de la película:");
        String productora = JOptionPane.showInputDialog(frame, "Introduce la productora de la película:");
        int año = Integer.parseInt(JOptionPane.showInputDialog(frame, "Introduce el año de la película:"));
        int numNominaciones = Integer.parseInt(JOptionPane.showInputDialog(frame, "Introduce el número de nominaciones de la película:"));
        int numOscars = Integer.parseInt(JOptionPane.showInputDialog(frame, "Introduce el número de Oscars de la película:"));
        return new Pelicula(numNominaciones, numOscars, titulo, productora, año);
    }

    @Override
    public String toString() {
        return "Pelicula " +
                "-> TÍTULO= '" + titulo + '\'' +
                ", PRODUCTORA= '" + productora + '\'' +
                ", AÑO= " + año +
                ", NOMINACIONES=" + numNominaciones +
                ", OSCARS=" + numOscars
                ;
    }

    }

