/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entregable_ud7_blibi.otk;

/**
 *
 * @author JAVIER ARMESTO - 1º DAW
 */
public class Biblioteca {
    
    private String nomBiblioteca;
    private Ejemplar libro;
    private int numCopias;
    private int prestados;

    public Biblioteca(String nomBiblioteca, Ejemplar libro, int numCopias, int prestados) {
        this.nomBiblioteca = nomBiblioteca;
        this.libro = libro;
        this.numCopias = numCopias;
        this.prestados = prestados;
    }

    public String getNomBiblioteca() {
        return nomBiblioteca;
    }

    public void setNomBiblioteca(String nomBiblioteca) {
        this.nomBiblioteca = nomBiblioteca;
    }

    public Ejemplar getLibro() {
        return libro;
    }

    public void setLibro(Ejemplar libro) {
        this.libro = libro;
    }

    public int getNumCopias() {
        return numCopias;
    }

    public void setNumCopias(int numCopias) {
        this.numCopias = numCopias;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }
    
    //OTROS METODOS
    
    public void imprimir() {
        System.out.println(this);
    }
    
    public void registrarLibro(Ejemplar libro){
        
        this.libro.
        
    }
    
    public void eliminarLibro(){
        
    }
    
    public void aumentarCopias(String titulo, int cantidad){
        
        const libro = this.buscarLibroTitulo();
        if (libro) {
            
        }
        
    }
    
    public void disminuirCopias(){
        
    }
    
    public void prestarLibro(){
        
    }
    
    public void devolverLibro(){
    
    }
    public void listarLibros(){
        
        libro.
        
    }
    
    public void buscarLibroTitulo(){
        
    }
    
    public void buscarLibroAutor(){
        
    }
}
