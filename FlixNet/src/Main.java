
import java.util.ArrayList;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    

    
    public static void escribirMenu(){
        
        System.out.println("***********************");
        System.out.println("*** Menú de FLIXNET ***");
        System.out.println("***********************");
        System.out.println("");
        System.out.println("1. Dar de alta una película");
        System.out.println("2. Dar de alta una serie");
        System.out.println("3. Eliminar un contenido");
        System.out.println("4. Ver un contenido");
        System.out.println("5. Listar contenido");
        System.out.println("6. Listar contenidos pendientes de ver");
        System.out.println("7. Salir");
        System.out.println("----------------------------------");
        System.out.print("Introduzca opción: ");
        
    }
    
    
    
    public static Pelicula crearPelicula(){
        
        Scanner scanner = new Scanner(System.in);
        String titulo, productora;
        Calendar cal = Calendar.getInstance();
        int numNominaciones, numOscars, año;
        
        // Solicitar información de la película al usuario
        System.out.print("Ingrese el título de la película: ");
        titulo = scanner.nextLine();
        System.out.print("Ingrese la productora: ");
        productora = scanner.nextLine();

        do {
        
            try{
                System.out.print("Ingrese el año: "); //Entre 1895 (invención del cine) y el actual
                año = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea pendiente
            }
            catch (InputMismatchException eIMEaño){ //Por si leemos algo distinto de Integer
                scanner.nextLine();
                System.err.print("Revise el año introducido");
                año = 0;
                System.out.println("");
            }
            
        } while (!(1894 < año && año <= cal.get(Calendar.YEAR)));
        
        do {
                
            try{
                System.out.print("Ingrese el número de nominaciones: ");
                numNominaciones = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea pendiente

                System.out.print("Ingrese el número de Oscars: ");
                numOscars = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea pendiente
            }
            catch (InputMismatchException eIMEnom){ //Por si leemos algo distinto de Integer
                scanner.nextLine();
                System.err.println("Revise los Oscars y nominaciones");
                numNominaciones = 0;
                numOscars = 1;
                System.out.println("");
            }
        }
        while (numNominaciones < numOscars);
        
        // Crear un nuevo objeto pelicula con la información proporcionada
        Pelicula pel = new Pelicula(numNominaciones, numOscars, titulo, productora, año);
        
        System.out.println("");
        System.out.println("La película se ha registrado correctamente en el catálogo.");
        return pel;

    }

    public static Serie crearSerie(){

        Scanner scanner = new Scanner(System.in);
        String titulo, productora;
        int nTemporadas, año;
        Calendar cal = Calendar.getInstance();
        char respuesta;
        boolean finalizada;
        
        // Solicitar información de la película al usuario
        System.out.print("Ingrese el título de la serie: ");
        titulo = scanner.nextLine();
        System.out.print("Ingrese la productora: ");
        productora = scanner.nextLine();

        do {
            try{
                System.out.print("Ingrese las temporadas: ");
                nTemporadas = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea pendiente
            }
            catch (InputMismatchException eIMEnom){ //Por si leemos algo distinto de Integer
                scanner.nextLine();
                System.err.print("Revise el número de temporadas");
                nTemporadas = 0;
                System.out.println("");
            }
        }
        while (nTemporadas<1);
        
        do {
        
            try{
                System.out.print("Ingrese el año: "); //Entre 1895 (invención del cine) y el actual
                año = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea pendiente
            }
            catch (InputMismatchException eIMEaño){ //Por si leemos algo distinto de Integer
                scanner.nextLine();
                System.err.print("Revise el año introducido");
                año = 0;
                System.out.println("");
            }
            
        } while (!(1894 < año && año <= cal.get(Calendar.YEAR)));
        
        do{
            System.out.print("¿Ha finalizado? S/N");
            respuesta = scanner.next().charAt(0);
            scanner.nextLine();
        }
        while (respuesta != 's' && respuesta != 'n' && respuesta != 'S' && respuesta != 'N');
        
        if ((respuesta == 'S') && (respuesta == 's')) {
            finalizada = true;
        }
        else finalizada = false;
        
        // Crear un nuevo objeto serie con la información proporcionada
        Serie ser = new Serie(nTemporadas, finalizada, titulo, productora, año);
        
        System.out.println("*******************************************************");
        System.out.println("La serie se ha registrado correctamente en el catálogo.");
        System.out.println("*******************************************************");
        return ser;

    }

    public void listarContenido(){
        System.out.println(toString());
    }
    
    public static void main(String[] args) {
        boolean salir = false;
        int opMenu = 0;
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
        
        serie3.setVisto(true);
        
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
                flixnet.add(crearPelicula());
                break;
            case 2:
                flixnet.add(crearSerie());
                break;
            case 3:
                Scanner vista3 = new Scanner(System.in);
                String titulo3;
                
                System.out.print("Dime el titulo del contenido a borrar: ");
                titulo3 = vista3.nextLine();
                for (Contenido f : flixnet) {
                    if (f.titulo.equals(titulo3)) {
                        System.out.println("Se BORRA del catálogo " + f.titulo);
                        flixnet.remove(f);
                        break;
                    }
                }
                break;
            case 4:
                Scanner vista4 = new Scanner(System.in);
                String titulo4;
                
                System.out.print("Dime el titulo del contenido visto: ");
                titulo4 = vista4.nextLine();
                for (Contenido f : flixnet) {
                    if (f.titulo.equals(titulo4)) {
                        System.out.println("Se marca como VISTA " + f.titulo);
                        f.setVisto(true);
                        break;
                    }
                }
                break;
            case 5:
                for (Contenido f : flixnet) {
                    System.out.println(f);
                }
                break;
            case 6:
                for (Contenido f : flixnet) {
                    if (!f.isVisto()) System.out.println(f);
                }
                break;
            case 7:
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
}
