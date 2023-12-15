package ud3_condicionales;

import java.util.Scanner;

/*
Escribe un programa que pida dos números (A y B) y muestre un mensaje por
pantalla indicando si A es mútiplo de B.
 */

/**
 *
 * @author María
 */
public class UD3_Condicionales_Ej8 {
    
    public static void main(String[] args) {
        int A, B;
    Scanner sc = new Scanner (System.in);
    
    System.out.print("Dame un primer número entero: ");
    A=sc.nextInt();
    
    System.out.print("Dame un segundo número entero: ");
    B=sc.nextInt();
    
    if ((A%B)==0) System.out.println(A+" es múltiplo de "+B);
    }
    
}
