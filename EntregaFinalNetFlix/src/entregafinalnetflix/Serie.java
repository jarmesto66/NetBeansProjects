package entregafinalnetflix;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Serie extends Contenido {
    private int nTemporadas;

    public Serie(int nTemporadas, boolean visto, String titulo, String productora, int año) {
        super(titulo, productora, año);
        this.nTemporadas = nTemporadas;
        this.visto = false;
    }

    public int getnTemporadas() {
        return nTemporadas;
    }

    public void setnTemporadas(int nTemporadas) {
        this.nTemporadas = nTemporadas;
    }

    @Override
    public void saveToDatabase() throws SQLException {
        try (Connection conn = DatabaseManager.getConnection()) {
            String query = "INSERT INTO series (titulo, nTemporadas, productora) VALUES (?, ?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, titulo);
                stmt.setInt(2, nTemporadas);
                stmt.setString(3, productora != null ? productora : ""); // Valor predeterminado para productora
                stmt.executeUpdate();
            }
        }
    }




    public static Serie fromResultSet(ResultSet rs) throws SQLException {
        Contenido contenido = Contenido.fromResultSet(rs);
        int nTemporadas = rs.getInt("nTemporadas");

        return new Serie(nTemporadas, contenido.isVisto(), contenido.getTitulo(), contenido.getProductora(), contenido.getAño());
    }
    
    public static Serie crearSerieDesdeFormulario(JFrame frame) {
        String titulo = JOptionPane.showInputDialog(frame, "Introduce el título de la serie:");
        String productora = JOptionPane.showInputDialog(frame, "Introduce la productora de la serie:");
        int año = Integer.parseInt(JOptionPane.showInputDialog(frame, "Introduce el año de la serie:"));
        int nTemporadas = Integer.parseInt(JOptionPane.showInputDialog(frame, "Introduce el número de temporadas de la serie:"));
        return new Serie(nTemporadas, false, titulo, productora, año);
    }
    
    @Override
    public String toString() {
        return "Serie " +
                "-> TÍTULO= '" + titulo + '\'' +
                " PRODUCTORA= '" + productora + '\'' +
                " AÑO= " + año +
                " TEMPORADAS= " + nTemporadas
                ;
    }
}
