/*
Escribe un programa que lea tres números enteros y nos diga cuál es el mayor
 */
package ud3_condicionales;

import java.util.Scanner;

/**
 *
 * @author María
 */
public class UD3_Condicionales_Ej7 {
    
    public static void main(String[] args) {
        int primero, segundo, tercero ;
    Scanner sc = new Scanner (System.in);
    
    System.out.print("Dame un primer número entero: ");
    primero=sc.nextInt();
    
    System.out.print("Dame un segundo número entero: ");
    segundo=sc.nextInt();
    
    System.out.print("Dame un tercer número entero: ");
    tercero=sc.nextInt();
    
    if ((primero>segundo)&&(primero>tercero)) System.out.println(primero+" es el mayor de los tres");
    else if ((segundo>primero)&&(segundo>tercero)) System.out.println(segundo+" es eñ mayor de los tres");
    else System.out.println(tercero+" es el mayor de los tres");
    }
    
}
