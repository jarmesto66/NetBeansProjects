
package entregable_07;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JAVIER ARMESTO - 1º DAW
 */
public class Entregable_07 {
    
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
    
    public static Ejemplar.Genero leerGenero() {
    boolean correcto = false;
    Ejemplar.Genero genero = null;
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
                genero = Ejemplar.Genero.CIENCIA_FICCION;
                correcto = true;
                break;
            case 2:
                genero = Ejemplar.Genero.COMEDIA;
                correcto = true;
                break;
            case 3:
                genero = Ejemplar.Genero.DRAMA;
                correcto = true;
                break;
            case 4:
                genero = Ejemplar.Genero.EDUCATIVO;
                correcto = true;
                break;
            case 5:
                genero = Ejemplar.Genero.FANTASIA;
                correcto = true;
                break;
            case 6:
                genero = Ejemplar.Genero.HISTORICO;
                correcto = true;
                break;
            case 7:
                genero = Ejemplar.Genero.OTROS;
                correcto = true;
                break;
            default:
                System.err.println("Opción no válida.");
                System.out.println("");
        }
    }
    return genero; // Devolvemos el género seleccionado
}
    
    public static void registrarLibro(ArrayList<Biblioteca> inventario) {
        Scanner scanner = new Scanner(System.in);
        String titulo, autor;
        Ejemplar.Genero genero;

        // Solicitar información del libro al usuario
        System.out.println("Ingrese el título del libro:");
        titulo = scanner.nextLine();
        System.out.println("Ingrese el autor del libro:");
        autor = scanner.nextLine();
        genero = leerGenero(); // Deberás implementar el método leerGenero() si aún no lo has hecho

        // Solicitar el número de copias disponibles al usuario
        System.out.println("Ingrese el número de copias disponibles:");
        int copiasDisponibles = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente

        // Crear un nuevo objeto Ejemplar con la información proporcionada
        Ejemplar libro = new Ejemplar(titulo, autor, genero);

        // Crear un nuevo objeto Biblioteca y agregarlo al inventario
        Biblioteca nuevoLibro = new Biblioteca("Biblioteca Central", libro, copiasDisponibles, 0);
        inventario.add(nuevoLibro);

        System.out.println("El libro se ha registrado correctamente en el inventario.");
}

    public static void listarLibros(ArrayList<Biblioteca> inventario){
    
        System.out.println("Lista de libros de la biblioteca: ");
        for (Biblioteca biblioteca : inventario) {
            Ejemplar libro = biblioteca.getLibro(); //Obtenemos el libro dela biblioteca
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: "+ libro.getAutor());
            System.out.println("Género: "+ libro.getGenero());
            System.out.println("Número de copias: "+ biblioteca.getCopiasEjemplar());
            System.out.println("Número de copias prestadas: "+ biblioteca.getCopiasPrestadas());
            
        }
    }
    
    public static void aumentarCopias(ArrayList<Biblioteca> inventario) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Ingrese el título del libro para aumentar las copias:");
    String titulo = scanner.nextLine();
    
    // Buscamos el libro por su título en el inventario
    for (Biblioteca biblioteca : inventario) {
        if (biblioteca.getLibro().getTitulo().equalsIgnoreCase(titulo)) {
            System.out.println("Ingrese la cantidad de copias a aumentar:");
            int cantidad = scanner.nextInt();
            
            int copiasActuales = biblioteca.getCopiasEjemplar();
            biblioteca.setCopiasEjemplar(copiasActuales + cantidad); // Actualizamos el número de copias
            
            System.out.println("Se han aumentado " + cantidad + " copias del libro '" + titulo + "'.");
            return; // Terminamos el método una vez que se ha aumentado las copias
        }
    }
    
    // Si el libro no se encuentra en el inventario
    System.err.println("El libro '" + titulo + "' no está en el inventario.");
}
    
    public static void disminuirCopias(ArrayList<Biblioteca> inventario) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Ingrese el título del libro para disminuir las copias:");
    String titulo = scanner.nextLine();
    
    // Buscamos el libro por su título en el inventario
    for (Biblioteca biblioteca : inventario) {
        if (biblioteca.getLibro().getTitulo().equalsIgnoreCase(titulo)) {
            System.out.println("Ingrese la cantidad de copias a disminuir:");
            int cantidad = scanner.nextInt();
            
            int copiasActuales = biblioteca.getCopiasEjemplar();
            
            // Verificamos que hay suficientes copias para disminuir
            if (cantidad > copiasActuales) {
                System.out.println("No hay suficientes copias para disminuir.");
                return; // Salimos del método si no hay suficientes copias
            }
            
            biblioteca.setCopiasEjemplar(copiasActuales - cantidad); // Actualizamos el número de copias
            
            System.out.println("Se han disminuido " + cantidad + " copias del libro '" + titulo + "'.");
            return; // Terminamos el método una vez que se ha disminuido las copias
        }
    }
    
    // Si el libro no se encuentra en el inventario
    System.out.println("El libro '" + titulo + "' no está en el inventario.");
}
    
    public static void prestarLibro(ArrayList<Biblioteca> inventario) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Ingrese el título del libro para prestar:");
    String titulo = scanner.nextLine();
    
    // Buscamos el libro por su título en el inventario
    for (Biblioteca biblioteca : inventario) {
        if (biblioteca.getLibro().getTitulo().equalsIgnoreCase(titulo)) {
            int copiasDisponibles = biblioteca.getCopiasEjemplar() - biblioteca.getCopiasPrestadas();
            
            if (copiasDisponibles > 0) {
                // Si hay copias disponibles, prestamos el libro
                biblioteca.setCopiasPrestadas(biblioteca.getCopiasPrestadas() + 1);
                System.out.println("Se ha prestado el libro '" + titulo + "'.");
            } else {
                // Si no hay copias disponibles
                System.out.println("No hay copias disponibles del libro '" + titulo + "'.");
            }
            return; // Terminamos el método después de prestar el libro
        }
    }
    
    // Si el libro no se encuentra en el inventario
    System.out.println("El libro '" + titulo + "' no está en el inventario.");
}
    
    public static void devolverLibro(ArrayList<Biblioteca> inventario) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Ingrese el título del libro para devolver:");
    String titulo = scanner.nextLine();
    
    // Buscamos el libro por su título en el inventario
    for (Biblioteca biblioteca : inventario) {
        if (biblioteca.getLibro().getTitulo().equalsIgnoreCase(titulo)) {
            int copiasPrestadas = biblioteca.getCopiasPrestadas();
            
            if (copiasPrestadas > 0) {
                // Si hay copias prestadas, permitimos devolver el libro
                biblioteca.setCopiasPrestadas(copiasPrestadas - 1);
                System.out.println("Se ha devuelto el libro '" + titulo + "'.");
            } else {
                // Si no hay copias prestadas
                System.out.println("No hay copias prestadas del libro '" + titulo + "'.");
            }
            return; // Terminamos el método después de devolver el libro
        }
    }
    
    // Si el libro no se encuentra en el inventario
    System.out.println("El libro '" + titulo + "' no está en el inventario.");
}
    
    public static void listarLibrosDisponibles(ArrayList<Biblioteca> inventario) {
    System.out.println("Libros disponibles para préstamo:");
    for (Biblioteca biblioteca : inventario) {
        int copiasDisponibles = biblioteca.getCopiasEjemplar() - biblioteca.getCopiasPrestadas();
        if (copiasDisponibles > 0) {
            Ejemplar libro = biblioteca.getLibro();
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Género: " + libro.getGenero());
            System.out.println("Copias disponibles: " + copiasDisponibles);
            System.out.println("-----------------------------");
        }
    }
}
    
    public static void mostrarInformacionLibro(Biblioteca biblioteca) {
    Ejemplar libro = biblioteca.getLibro();
    System.out.println("Título: " + libro.getTitulo());
    System.out.println("Autor: " + libro.getAutor());
    System.out.println("Género: " + libro.getGenero());
    System.out.println("Copias disponibles: " + (biblioteca.getCopiasEjemplar() - biblioteca.getCopiasPrestadas()));
    System.out.println("-----------------------------");
}
    
    public static void eliminarLibro(ArrayList<Biblioteca> inventario) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Ingrese el título del libro que desea eliminar:");
    String titulo = scanner.nextLine();
    
    // Iterar sobre la lista de bibliotecas en el inventario
    for (int i = 0; i < inventario.size(); i++) {
        Biblioteca biblioteca = inventario.get(i);
        if (biblioteca.getLibro().getTitulo().equalsIgnoreCase(titulo)) {
            // Si el título del libro coincide, eliminar la biblioteca del inventario
            inventario.remove(i);
            System.out.println("Se ha eliminado el libro '" + titulo + "' del inventario.");
            return; // Terminamos el método después de eliminar el libro
        }
    }
    
    // Si el libro no se encuentra en el inventario
    System.out.println("El libro '" + titulo + "' no está en el inventario.");
}
    
    public static void buscarLibroPorTitulo(ArrayList<Biblioteca> inventario) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Ingrese el título del libro que desea buscar:");
    String titulo = scanner.nextLine();
    
    // Iterar sobre la lista de bibliotecas en el inventario
    for (Biblioteca biblioteca : inventario) {
        if (biblioteca.getLibro().getTitulo().equalsIgnoreCase(titulo)) {
            // Si el título del libro coincide, mostrar la información del libro
            mostrarInformacionLibro(biblioteca);
            return; // Terminamos el método después de encontrar el libro
        }
    }
    
    // Si el libro no se encuentra en el inventario
    System.out.println("No se encontró ningún libro con el título '" + titulo + "'.");
}
    
    public static void buscarLibroPorAutor(ArrayList<Biblioteca> inventario) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Ingrese el autor del libro que desea buscar:");
    String autor = scanner.nextLine();
    
    // Iterar sobre la lista de bibliotecas en el inventario
    for (Biblioteca biblioteca : inventario) {
        if (biblioteca.getLibro().getAutor().equalsIgnoreCase(autor)) {
            // Si el autor del libro coincide, mostrar la información del libro
            mostrarInformacionLibro(biblioteca);
            return; // Terminamos el método después de encontrar el libro
        }
    }
    
    // Si el libro no se encuentra en el inventario
    System.out.println("No se encontró ningún libro del autor '" + autor + "'.");
}
    
    public static void main(String[] args) {
        
        ArrayList<Biblioteca> inventario = new ArrayList();
        final String biblioteca="Biblioteca Central";
        Scanner op = new Scanner(System.in);
        int opMenu;
        boolean salir = false;
        
        //CREAMOS VARIOS EJEMPLARES
        Ejemplar libro = new Ejemplar("Harry Potter", "J.K. Rwoling", Ejemplar.Genero.FANTASIA);
        Biblioteca anotacion = new Biblioteca (biblioteca, libro, 5, 0);
        inventario.add(anotacion);
        
        libro = new Ejemplar("100 años de soledad", "Gabriel García Márquez", Ejemplar.Genero.DRAMA);
        anotacion = new Biblioteca (biblioteca, libro, 5, 0);
        inventario.add(anotacion);
        
        libro = new Ejemplar("El Señor de los anillos", "R.R.Tolkien", Ejemplar.Genero.FANTASIA);
        anotacion = new Biblioteca (biblioteca, libro, 5, 0);
        inventario.add(anotacion);
        
        libro = new Ejemplar("Marie Curie", "Adela Muñoz Paéz", Ejemplar.Genero.HISTORICO);
        anotacion = new Biblioteca (biblioteca, libro, 1, 0);
        inventario.add(anotacion);
        
        libro = new Ejemplar("Proegramación en Pascal", "O.M. Stefania", Ejemplar.Genero.EDUCATIVO);
        anotacion = new Biblioteca (biblioteca, libro, 1, 0);
        inventario.add(anotacion);
        
        // public Biblioteca(String nomBiblioteca, Ejemplar libro, int copiasEjemplar, int copiasPrestadas)
        // public Ejemplar(String titulo, String autor, Genero genero)
        
        while (!salir){
        
        escribirMenu();
        opMenu = op.nextInt();
        switch (opMenu) {
        case 1:
            registrarLibro(inventario);
            break;
        case 2:
            eliminarLibro(inventario);
            break;
        case 3:
            aumentarCopias(inventario);
            break;
        case 4:
            disminuirCopias(inventario);
            break;
        case 5:
            prestarLibro(inventario);
            break;
        case 6:
            devolverLibro(inventario);
            break;
        case 7:
            listarLibros(inventario);
            break;
        case 8:
            listarLibrosDisponibles(inventario);
            break;
        case 9:
            buscarLibroPorTitulo(inventario);
            break;
        case 10:
            buscarLibroPorAutor(inventario);
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
