
public class Contenido {
    
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

    public String toString() {
        return "Titulo= " + titulo + ", Productora= " + productora + ", Año= " + año + ", Visto= " + visto;
    }

}