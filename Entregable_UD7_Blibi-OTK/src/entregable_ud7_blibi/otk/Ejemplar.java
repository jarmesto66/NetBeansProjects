
package entregable_ud7_blibi.otk;

/**
 *
 * @author JAVIER ARMESTO - 1º DAW
 */
public class Ejemplar {
    
    //ATRIBUTOS DE LIBRO
    private String titulo;
    private String autor;
    enum Genero {
        FANTASIA,
        DRAMA,
        HISTORICO,
        COMEDIA,
        CIENCIA_FICCION,
        EDUCATIVO,
        OTROS
    }
    
    private Genero genero;
    

    //CONSTRUCTOR

    public Ejemplar(String titulo, String autor, Genero genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }

    public Ejemplar() {
    }
    
    
    
    
    //SETTERS

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

        
    
    //GETTERS

    public Genero getGenero() {
        return genero;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

}
