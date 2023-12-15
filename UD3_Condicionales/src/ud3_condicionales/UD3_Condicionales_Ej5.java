/*
Escribe un programa que lee dos números y los visualiza en orden ascendente.
 */
package ud3_condicionales;

import java.util.Scanner;

/**
 *
 * @author María
 */
public class UD3_Condicionales_Ej5 {
    
    public static void main(String[] args) {
        
        int primero, segundo;
    Scanner sc = new Scanner (System.in);
    
    System.out.print("Dame un primer número entero: ");
    primero=sc.nextInt();
    
    
    System.out.print("Dame un segundo número entero: ");
    segundo=sc.nextInt();
        
    if (primero>segundo) System.out.println(primero+" "+segundo);
    else System.out.println("En orden ascendente se escriben "+segundo+" y "+primero);
        
    }
    
}
