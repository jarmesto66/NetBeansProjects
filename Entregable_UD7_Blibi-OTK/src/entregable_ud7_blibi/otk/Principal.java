
package entregable_ud7_blibi.otk;

import java.util.Scanner;

/**
 *
 * @author JAVIER ARMESTO - 1º DAW
 */
public class Principal {

    public static void main(String[] args) {
    
    boolean salir = false;
    Scanner opcion = new Scanner(System.in);
    int opMenu;
    Ejemplar libro = new Ejemplar();
    Ejemplar libro1 = new Ejemplar("Cien años de soledad", "Gabriel García Márquez", Ejemplar.Genero.DRAMA);
    Ejemplar libro2 = new Ejemplar("El señor de los anillos", "J.R.R. Tolkien", Ejemplar.Genero.FANTASIA);
    Ejemplar libro3 = new Ejemplar("Harry Potter y la piedra filosofal", "J.K. Rowling", Ejemplar.Genero.FANTASIA);
    
    while (!salir) {
    
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
    
    opMenu = opcion.nextInt();
    
    switch (opMenu) {
        case 1:
            registrarLibro(libro);
            break;
        case 2:
            eliminarLibro();
            break;
        case 3:
            aumentarCopias();
            break;
        case 4:
            disminuirCopias();
            break;
        case 5:
            prestarLibro();
            break;
        case 6:
            devolverLibro();
            break;
        case 7:
            biblioteca.listarLibros();
            break;
        case 8:
            biblioteca.listarLibrosDisponibles();
            break;
        case 9:
            buscarLibroPorTitulo();
            break;
        case 10:
            buscarLibroPorAutor();
            break;
        case 0:
            System.out.println("Saliendo del programa...");
            break;
        default:
            System.err.print("Opción no válida.");
    
    }
    }
    }
}
