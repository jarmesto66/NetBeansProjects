import java.util.Scanner ;
import java.lang.Math ;
import static java.lang.Math.random;
/**
 *
 * @author JAVIER ARMESTO
 */
public class TareaEntregableUD2_Ej2 {

    public static void main(String[] args) {
                
        double A , B ;
        int C ;
        
        Scanner lector = new Scanner(System.in);
        System.out.print("Escribe el número A decimal: ");
        A = lector.nextDouble();
        System.out.print("Escribe el número B decimal: ");
        B = lector.nextDouble();
        C = (int) (Math.random() * (B-A)+A) ; /* La he buscado en Internet sin entender muy bien pero funciona */
        System.out.println("El entero más próximo de A es: " + Math.round(A));
        System.out.println("El entero más próximo de B es: " + Math.round(B));
        System.out.println("El mayor es: " + Math.max(A, B));
        System.out.println("El menor es: " + Math.min(A, B));
        System.out.println("Un número aleatorio entre A y B es: " + C);
    }
    
}
