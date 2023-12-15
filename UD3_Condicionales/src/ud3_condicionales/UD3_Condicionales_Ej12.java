/*
Realiza un programa que pida un número entero entre uno y doce e imprima el
número de días que tiene el mes correspondiente
 */
package ud3_condicionales;

import java.util.Scanner;

/**
 *
 * @author María
 */
public class UD3_Condicionales_Ej12 {
            public static void main(String[] args) {
        int mes, dias ;
        Scanner sc = new Scanner (System.in);
    
    System.out.print("Dime el número del mes: ");
    mes=sc.nextInt();
    
    switch (mes) {
    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
        System.out.println(" tiene 31 días");
    break;
    case 2:
        System.out.println("febrero tiene 28 días s no es bisiesto");
    break;
    case 4: case 6: case 9:
        System.out.println("abril tiene 30 días");
    break;
    default:
    System.out.println("no es un mes del año");
                    }
    }
}
