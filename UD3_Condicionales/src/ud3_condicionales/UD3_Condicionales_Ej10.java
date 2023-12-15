/*
Escribe un programa que pida introducir dos números decimales y luego muestre el
valor de su suma, resta, producto y división. Se deberá evitar dividir por cero.
 */
package ud3_condicionales;

import java.util.Scanner;

/**
 *
 * @author María
 */
public class UD3_Condicionales_Ej10 {
    
        public static void main(String[] args) {
        double A, B;
    Scanner sc = new Scanner (System.in);
    
    System.out.print("Dame un primer número decimal: ");
    A=sc.nextDouble();
    
    System.out.print("Dame un segundo número decimal: ");
    B=sc.nextDouble();
    
    System.out.println("Su suma es "+(A+B));
    System.out.println("Su resta es "+(A-B));
    System.out.println("Su producto es "+(A*B));
    if (B!=0) System.out.println("Su división es "+(A/B));
    else System.out.println("NO SE PUEDE DIVIDIR POR CERO");
    
}
}
