
public class Contenido {
    
    protected String titulo, productora;
    protected int anio;
    protected boolean visto;

    public Contenido(String titulo, String productora, int anio, boolean visto) {
        this.titulo = titulo;
        this.productora = productora;
        this.anio = anio;
        this.visto = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getProductora() {
        return productora;
    }

    public int getAño() {
        return anio;
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

    public void setAño(int anio) {
        this.anio = anio;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }

    @Override
    public String toString() {
        return "Titulo= " + titulo + ", Productora= " + productora + ", Año= " + anio;
    }

}