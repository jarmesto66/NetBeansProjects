package entregafinalnetflix;

import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class Contenido {
    protected String titulo, productora;
    protected int año;
    protected boolean visto;

    public Contenido(String titulo, String productora, int año) {
        this.titulo = titulo;
        this.productora = productora;
        this.año = año;
        this.visto = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getProductora() {
        return productora;
    }

    public int getAño() {
        return año;
    }

    public boolean isVisto() {
        return visto;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }

    public abstract void saveToDatabase() throws SQLException;

    public static Contenido fromResultSet(ResultSet rs) throws SQLException {
        String titulo = rs.getString("titulo");
        String productora = rs.getString("productora");
        int año = rs.getInt("año");
        boolean visto = rs.getBoolean("visto");
        return new Contenido(titulo, productora, año) {
            @Override
            public void saveToDatabase() throws SQLException {
                // Implementación vacía para el tipo genérico Contenido
            }
        };
    }

    @Override
    public String toString() {
        return "Contenido{" +
                "titulo='" + titulo + '\'' +
                ", productora='" + productora + '\'' +
                ", año=" + año +
                ", visto=" + visto +
                '}';
    }
}

