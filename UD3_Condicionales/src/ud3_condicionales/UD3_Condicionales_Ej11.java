/*
Realiza un programa que pida el día de la semana (del 1 al 7) y muestre por pantalla
el día correspondiente (Lunes, martes...). Si introducimos otro número mostrará un
mensaje de error.
 */
package ud3_condicionales;

import java.util.Scanner;

/**
 *
 * @author María
 */
public class UD3_Condicionales_Ej11 {
    
        public static void main(String[] args) {
        int dia ;
        Scanner sc = new Scanner (System.in);
    
    System.out.print("Dime el número del día de la semana: ");
    dia=sc.nextInt();
    
    switch (dia) {
    case 1:
        System.out.println("lunes");
    break;
    case 2:
        System.out.println("martes");
    break;
    case 3:
        System.out.println("miércoles");
    break;
    case 4:
        System.out.println("jueves");
    break;
    case 5:
        System.out.println("viernes");
    break;
    case 6:
        System.out.println("sábado");
    break;
    case 7:
        System.out.println("domingo");
    break;
    default:
    System.out.println("no es un día de la semana");
                    }
    }
}
