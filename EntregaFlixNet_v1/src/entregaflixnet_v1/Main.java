import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean salir = false;
        int opMenu;
        Scanner op = new Scanner(System.in);
        ArrayList<Contenido> flixnet = new ArrayList();
        
        //CREAMOS VARIAS PELICULAS
        Contenido pelicula1 = new Pelicula(0, 0, "El ataque de los muero vivientes", "Sangre films", 1985);
        flixnet.add(pelicula1);
        Contenido pelicula2 = new Pelicula(5, 0, "La guerra de las galaxias", "Cosa nostra", 1982);
        flixnet.add(pelicula2);
        Contenido pelicula3 = new Pelicula(1, 1, "Todo sobre mi madre", "Almodovar films", 1992);
        flixnet.add(pelicula3);
        
        //CREAMOS VARIAS SERIES
        Contenido serie1 = new Serie(15, true, "Big Bang Theory", "Tractor amarillo", 1982);
        flixnet.add(serie1);
        Contenido serie2 = new Serie(1, false, "Armaggedon", "Netflix", 2023);
        flixnet.add(serie2);
        Contenido serie3 = new Serie(15, true, "Curro Jiménez", "Chicho Ibañez", 1980);
        flixnet.add(serie3);
        
        serie3.setVisto(true); //Para comprobar de que funciona
        
        while (!salir){
        
            escribirMenu();
            
            try { 
                opMenu = op.nextInt();
            }
            catch (InputMismatchException e1) { //Al introducir algo que no sea Integer
                op.nextLine();
                opMenu = 0;
            }
                        
            switch (opMenu) {
            case 1:
                flixnet.add(Pelicula.crearPelicula());
                break;
            case 2:
                flixnet.add(Serie.crearSerie());
                break;
            case 3:
                Scanner vista3 = new Scanner(System.in);
                String titulo3;
                boolean peliculaEncontradaBorr = false;
                
                System.out.print("Dime el titulo del contenido a borrar: ");
                titulo3 = vista3.nextLine();
                for (Contenido f : flixnet) {
                    if (f.titulo.equals(titulo3)) {
                        System.out.println("");
                        System.out.println("Se BORRA del catálogo " + f.titulo);
                        System.out.println("");
                        flixnet.remove(f);
                        peliculaEncontradaBorr = true;
                        break;
                    }
                }
                if (!peliculaEncontradaBorr) {
                        System.out.println("");
                        System.out.println("No se ha encontrado el contenido propuesto para ser borrado");
                        System.out.println("");
                }
                break;
            case 4:
                Scanner vista4 = new Scanner(System.in);
                String titulo4;
                boolean peliculaEncontradaVer = false;
                
                System.out.print("Dime el titulo del contenido visto: ");
                titulo4 = vista4.nextLine();
                for (Contenido f : flixnet) {
                    if (f.titulo.equals(titulo4)) {
                        System.out.println("");
                        System.out.println("Se marca como VISTA " + f.titulo);
                        System.out.println("");
                        f.setVisto(true);
                        peliculaEncontradaVer = true;
                        break;
                    }
                }
                if (!peliculaEncontradaVer) {
                        System.out.println("");
                        System.out.println("No se ha encontrado el contenido propuesto para visto");
                        System.out.println("");
                }
                break;
            case 5:
                System.out.println("");
                for (Contenido f : flixnet) {
                    System.out.println("\033[34m" + f + "\033[30m");
                }
                System.out.println("");
                break;
            case 6:
                System.out.println("");
                for (Contenido f : flixnet) {
                    if (!f.isVisto()) System.out.println("\033[35m" + f + "\033[30m");
                }
                System.out.println("");
                break;
            case 7: //Opción BONUS-TRACK. Listamos solo películas con información de Nominaciones y Oscars
                System.out.println("");
                for (Contenido contenido : flixnet) {
                    if (contenido instanceof Pelicula) {
                        System.out.println("Título: " + contenido.titulo + " Nominaciones: " + ((Pelicula) contenido).getNumNominaciones() + " Oscars: " + ((Pelicula) contenido).getNumOscars());
                    }
                }
                System.out.println("");
                break;
            case 8:
                System.out.println("Saliendo del programa...");
                salir = true;
                break;
            default:
                System.out.println("");    
                System.err.println("Opción no válida.");
                System.out.println("");

            }
        
    }
        
    }

    public static void escribirMenu(){
        
        System.out.println("\033[31m***********************\033[30m");
        System.out.println("\033[31m*** Menú de FLIXNET ***\033[30m");
        System.out.println("\033[31m***********************\033[30m");
        System.out.println("");
        System.out.println("1. Dar de alta una película");
        System.out.println("2. Dar de alta una serie");
        System.out.println("3. Eliminar un contenido");
        System.out.println("4. Ver un contenido");
        System.out.println("\033[34m5. Listar contenido\033[30m");
        System.out.println("\033[35m6. Listar contenidos pendientes de ver\033[30m");
        System.out.println("\033[31m7. Hazme un listado de películas con nominaciones y Oscars ganados - OPCION BONUS-TRACK\033[30m"); //Opción BONUS-TRACK
        System.out.println("8. Salir");
        System.out.println("----------------------------------");
        System.out.print("Introduzca opción: ");
        
    }
    
    public void listarContenido(){
        System.out.println(toString());
    }
    
}