
package entregable_07;

import java.util.ArrayList;
import java.util.Scanner;

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

    public String toString(){
        return (libro.toString() + " Copias prestadas: " + copiasPrestadas + " de un total de " + copiasEjemplar + " copias");
    }
    
    //OTROS METODOS
    public void registrarLibro(ArrayList<Biblioteca> inventario) {
        Scanner scanner = new Scanner(System.in);
        String titulo, autor;
        Ejemplar.Genero genero;

        // Solicitar información del libro al usuario
        System.out.println("Ingrese el título del libro:");
        titulo = scanner.nextLine();
        System.out.println("Ingrese el autor del libro:");
        autor = scanner.nextLine();
        genero = Ejemplar.leerGenero(); // Llamada al método leerGenero() de la clase Ejemplar

        // Solicitar el número de copias disponibles al usuario
        System.out.println("Ingrese el número de copias disponibles:");
        int copiasDisponibles = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente

        // Crear un nuevo objeto Ejemplar con la información proporcionada
        Ejemplar libro = new Ejemplar(titulo, autor, genero);

        // Crear un nuevo objeto Biblioteca y agregarlo al inventario de la Biblioteca Central
        Biblioteca nuevoLibro = new Biblioteca("Biblioteca Central", libro, copiasDisponibles, 0);
        inventario.add(nuevoLibro);

        System.out.println("El libro se ha registrado correctamente en el inventario.");
    }
    
    public void listarLibros(ArrayList<Biblioteca> inventario){
    
        System.out.println("Lista de libros de la biblioteca: ");
        for (Biblioteca biblioteca : inventario) {
            Ejemplar libro = biblioteca.getLibro(); //Obtenemos el libro dela biblioteca
            System.out.println(biblioteca.toString().toString());
            
        }
    }
        
    public void aumentarCopias(ArrayList<Biblioteca> inventario) {
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
    
    public void disminuirCopias(ArrayList<Biblioteca> inventario) {
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

    public void prestarLibro(ArrayList<Biblioteca> inventario) {
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
    
    public void devolverLibro(ArrayList<Biblioteca> inventario) {
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
    
    public void listarLibrosDisponibles(ArrayList<Biblioteca> inventario) {
        
    System.out.println("Libros disponibles para préstamo:");
    for (Biblioteca biblioteca : inventario) {
        int copiasDisponibles = biblioteca.getCopiasEjemplar() - biblioteca.getCopiasPrestadas();
        if (copiasDisponibles > 0) {
            Ejemplar libro = biblioteca.getLibro();
            System.out.println(biblioteca.toString().toString() + " --------- Copias disponibles: " + copiasDisponibles);
            System.out.println("-----------------------------");
        }
    }
}
    
    public void mostrarInformacionLibro(Biblioteca biblioteca) {
    Ejemplar libro = biblioteca.getLibro();
    System.out.println("Título: " + libro.getTitulo());
    System.out.println("Autor: " + libro.getAutor());
    System.out.println("Género: " + libro.getGenero());
    System.out.println("Copias disponibles: " + (biblioteca.getCopiasEjemplar() - biblioteca.getCopiasPrestadas()));
    System.out.println("-----------------------------");
}
    
    public void eliminarLibro(ArrayList<Biblioteca> inventario) {
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
    
    public void buscarLibroPorTitulo(ArrayList<Biblioteca> inventario) {
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
    
    public void buscarLibroPorAutor(ArrayList<Biblioteca> inventario) {
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
    
}
