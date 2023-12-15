import java.util.Scanner;
/**
 *
 * @author USER
 */
public class RetosBasicosUD2_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int precio;
        Scanner lector = new Scanner(System.in);
        System.out.print("Introduce el precio del artículo y pulsa <intro>: ");
        precio = lector.nextInt();
        System.out.println("El precio más IVA es: " + (precio*1.21));
        
    }
    
}
