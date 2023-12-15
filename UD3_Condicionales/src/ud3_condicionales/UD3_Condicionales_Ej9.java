/*
Escribe un programa que pida dos números (A y B) y muestre un mensaje por
pantalla indicando si alguno de ellos es múltiplo del otro
 */
package ud3_condicionales;

import java.util.Scanner;

/**
 *
 * @author María
 */
public class UD3_Condicionales_Ej9 {
    
        public static void main(String[] args) {
        int A, B;
    Scanner sc = new Scanner (System.in);
    
    System.out.print("Dame un primer número entero: ");
    A=sc.nextInt();
    
    System.out.print("Dame un segundo número entero: ");
    B=sc.nextInt();
    
    if ((A%B)==0) System.out.println(A+" es múltiplo de "+B);
    else if ((B%A)==0) System.out.println(B+" es múltiplo de "+A);
    }
    
}
