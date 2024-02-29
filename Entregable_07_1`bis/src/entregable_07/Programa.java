
package entregable_07;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JAVIER ARMESTO - 1º DAW
 */
public class Programa {
    
    public static void escribirMenu(){
        
        System.out.println("\n*** Menú de la Biblioteca ***");
        System.out.println("1. Registrar un libro");
        System.out.println("2. Eliminar un libro");
        System.out.println("3. Aumentar copias de un libro");
        System.out.println("4. Disminuir copias de un libro");
        System.out.println("5. Prestar un libro");
        System.out.println("6. Devolver un libro");
        System.out.println("7. Mostrar todos los libros");
        System.out.println("8. Mostrar libros disponibles para préstamo");
        System.out.println("9. Buscar libro por título");
        System.out.println("10. Buscar libro por autor");
        System.out.println("0. Salir");
        System.out.println("----------------------------------");
        System.out.print("Introduzca opción: ");
        
    }
    
    public static void main(String[] args) {
        
        ArrayList<Biblioteca> inventario = new ArrayList();
        final String biblio="Biblioteca Central"; //Gestionamos una biblioteca concreta.
        Scanner op = new Scanner(System.in);
        int opMenu;
        boolean salir = false;
        Biblioteca biblioteca = new Biblioteca();
        
        //CREAMOS VARIOS EJEMPLARES
        Ejemplar libro = new Ejemplar("Harry Potter", "J.K. Rwoling", Ejemplar.Genero.FANTASIA);
        Biblioteca anotacion = new Biblioteca (biblio, libro, 5, 0);
        inventario.add(anotacion);
        
        libro = new Ejemplar("100 años de soledad", "Gabriel García Márquez", Ejemplar.Genero.DRAMA);
        anotacion = new Biblioteca (biblio, libro, 5, 0);
        inventario.add(anotacion);
        
        libro = new Ejemplar("El Señor de los anillos", "R.R.Tolkien", Ejemplar.Genero.FANTASIA);
        anotacion = new Biblioteca (biblio, libro, 5, 0);
        inventario.add(anotacion);
        
        libro = new Ejemplar("Marie Curie", "Adela Muñoz Paéz", Ejemplar.Genero.HISTORICO);
        anotacion = new Biblioteca (biblio, libro, 1, 0);
        inventario.add(anotacion);
        
        libro = new Ejemplar("Programación en Pascal", "O.M. Stefania", Ejemplar.Genero.EDUCATIVO);
        anotacion = new Biblioteca (biblio, libro, 1, 0);
        inventario.add(anotacion);
        
        while (!salir){
        
            escribirMenu();
            opMenu = op.nextInt();
            switch (opMenu) {
            case 1:
                biblioteca.registrarLibro(inventario);
                break;
            case 2:
                biblioteca.eliminarLibro(inventario);
                break;
            case 3:
                biblioteca.aumentarCopias(inventario);
                break;
            case 4:
                biblioteca.disminuirCopias(inventario);
                break;
            case 5:
                biblioteca.prestarLibro(inventario);
                break;
            case 6:
                biblioteca.devolverLibro(inventario);
                break;
            case 7:
                biblioteca.listarLibros(inventario);
                break;
            case 8:
                biblioteca.listarLibrosDisponibles(inventario);
                break;
            case 9:
                biblioteca.buscarLibroPorTitulo(inventario);
                break;
            case 10:
                biblioteca.buscarLibroPorAutor(inventario);
                break;
            case 0:
                System.out.println("Saliendo del programa...");
                salir = true;
                //rl.close();
                break;
            default:
                System.err.println("Opción no válida.");
                System.out.println("");

            }
    }
    
}

}
