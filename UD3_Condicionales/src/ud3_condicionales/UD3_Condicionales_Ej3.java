/*
Escribe un programa que pida 2 números enteros y muestre el mayor.
 */
package ud3_condicionales;

import java.util.Scanner;

/**
 *
 * @author María
 */
public class UD3_Condicionales_Ej3 {
    
        public static void main(String[] args) {
    
    int primero, segundo;
    Scanner sc = new Scanner (System.in);
    
    System.out.print("Dame un primer número entero: ");
    primero=sc.nextInt();
    
    System.out.print("Dame un segundo número entero: ");
    segundo=sc.nextInt();
    
    if (primero>segundo) System.out.println(primero+" es mayor que "+segundo);
    else if (primero<segundo) System.out.println(segundo+" es mayor que "+primero);
    else System.out.println(primero+" y "+segundo+" son iguales");
}}
