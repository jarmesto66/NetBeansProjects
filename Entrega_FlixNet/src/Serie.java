
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

    
class Serie extends Contenido {
        
        protected int nTemporadas;
        

    public Serie(int nTemporadas, String titulo, String productora, int año) {
        super(titulo, productora, año);
        this.nTemporadas = nTemporadas;
    }

    public int getnTemporadas() {
        return nTemporadas;
    }

    public void setnTemporadas(int nTemporadas) {
        this.nTemporadas = nTemporadas;
    }

    static Serie crearSerie(){

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
        
        // Crear un nuevo objeto serie con la información proporcionada
        Serie ser = new Serie(nTemporadas, titulo, productora, año);
        
        System.out.println("*******************************************************");
        System.out.println("La serie se ha registrado correctamente en el catálogo.");
        System.out.println("*******************************************************");
        return ser;

    }

}