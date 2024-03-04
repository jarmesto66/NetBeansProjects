
package entregable_07;

import java.util.Scanner;

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
    
    public String toString(){
        return ("Título: " + titulo + "ort Autor: " + autor + " Género: " + genero);
    }
    
    public static Genero leerGenero() {
        boolean correcto = false;
        Genero genero = null;
        Scanner rc = new Scanner(System.in);

        while (!correcto) {
            System.out.println("Selecciona el género:");
            System.out.println("1. Ciencia ficción");
            System.out.println("2. Comedia");
            System.out.println("3. Drama");
            System.out.println("4. Educativo");
            System.out.println("5. Fantasía");
            System.out.println("6. Histórico");
            System.out.println("7. Otros");
            int opMenu = rc.nextInt();

            switch (opMenu) {
                case 1:
                    genero = Genero.CIENCIA_FICCION;
                    correcto = true;
                    break;
                case 2:
                    genero = Genero.COMEDIA;
                    correcto = true;
                    break;
                case 3:
                    genero = Genero.DRAMA;
                    correcto = true;
                    break;
                case 4:
                    genero = Genero.EDUCATIVO;
                    correcto = true;
                    break;
                case 5:
                    genero = Genero.FANTASIA;
                    correcto = true;
                    break;
                case 6:
                    genero = Genero.HISTORICO;
                    correcto = true;
                    break;
                case 7:
                    genero = Genero.OTROS;
                    correcto = true;
                    break;
                default:
                    System.err.println("Opción no válida.");
                    System.out.println("");
            }
        }
        return genero; // Devolvemos el género seleccionado
    }
}
