
package entregable_07;

/**
 *
 * @author JAVIER ARMESTO - 1º DAW
 */
public class Biblioteca {
    
    //ATRIBUTOS
    private String nomBiblioteca;
    private Ejemplar libro = new Ejemplar();
    int copiasEjemplar;
    int copiasPrestadas;
    
    //CONSTRUCTORES
    public Biblioteca() {
    }

    public Biblioteca(String nomBiblioteca, Ejemplar libro, int copiasEjemplar, int copiasPrestadas) {
        this.nomBiblioteca = nomBiblioteca;
        this.libro = libro;
        this.copiasEjemplar = copiasEjemplar;
        this.copiasPrestadas = copiasPrestadas;
    }
    
    //GETTERS
    public int getCopiasEjemplar() {
        return copiasEjemplar;
    }

    public int getCopiasPrestadas() {
        return copiasPrestadas;
    }

    public Ejemplar getLibro() {
        return libro;
    }
    
    
    
    //SETTERS
    public void setCopiasEjemplar(int copiasEjemplar) {
        this.copiasEjemplar = copiasEjemplar;
    }

    public void setCopiasPrestadas(int copiasPrestadas) {
        this.copiasPrestadas = copiasPrestadas;
    }

    //METODOS
    
    
    
}
