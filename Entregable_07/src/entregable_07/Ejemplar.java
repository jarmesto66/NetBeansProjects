
package entregable_07;

/**
 *
 * @author JAVIER ARMESTO - 1º DAW
 */

public class Ejemplar {
    
    //ATRIBUTOS
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
    
    Genero genero;
    
    
    //CONSTRUCTOR
    public Ejemplar(String titulo, String autor, Genero genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }

    public Ejemplar() {
    }
    
    
    
    //GETTERS

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Genero getGenero() {
        return genero;
    }
    
}
