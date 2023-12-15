/*
Escribe un programa que pida al usuario introducir una letra y luego muestre un
mensaje indicando si es mayúscula o minúscula
 */
package ud3_condicionales;

import java.util.Scanner;

/**
 *
 * @author María
 */
public class UD3_Condicionales_Ej18 {
    
    public static void main(String[] args) {
        char c; int ascii;
        Scanner sc = new Scanner(System.in); 
        System.out.print("Dame una letra: ");
        c = sc.next().charAt(0);
        System.out.println("El carácter introducido es: "+c);
        ascii = (int) c;
        if ((ascii>=65)&&(ascii<=90)) System.out.println("'"+c+"'"+" es una mayúscula");
        if ((ascii>=97)&&(ascii<=122)) System.out.println("'"+c+"'"+" es una minúscula");
    }
}
