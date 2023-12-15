import java.util.Scanner;
/**
 *
 * @author JAVIER ARMESTO
 */
public class TareaEntregableUD2_Ej1 {

    public static void main(String[] args) {
        
        int eval=1 ;
        float  not1 , not2 , not3 , notmedia ;
        Scanner lector = new Scanner(System.in);
        
    System.out.print("Dime la nota de la " + eval + "ª evaluación: ");
    not1 = lector.nextInt();
    eval++ ;
    System.out.print("Dime la nota de la " + eval + "ª evaluación: ");
    not2 = lector.nextInt();
    eval++ ;
    System.out.print("Dime la nota de la " + eval + "ª evaluación: ");
    not3 = lector.nextInt();
    notmedia = (not1+not2+not3)/3 ;
    System.out.println("La nota media es: " + notmedia) ;
    }
    
}
