/*
Escribe un programa que pida un número y me dice si es positivo o negativo.
Consideraremos el cero como positivo.
 */
package ud3_condicionales;

import java.util.Scanner;

/**
 *
 * @author María
 */
public class UD3_Condicionales_Ej4 {
    
    public static void main(String[] args) {
        
        int numero;
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Dame un número entero: ");
        numero=sc.nextInt();
        if (numero<0) System.out.println("El número es negativo");
        else    System.out.println("El número es positivo");
    
    }
    
}
