/*
 * Crea un programa que pida por teclado tres cadenas de texto: nombre y dos
 * apellidos. Luego mostrará un código de usuario (en mayúsculas) formado por la
 * concatenación de las tres primeras letras de cada uno de ellos. Por ejemplo si se
 * introduce “Lionel”, “Tarazón” y “Alcocer” mostrará “LIOTARALC”
 */
package ud4_ejercicios_cadenas;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class UD4_Ej04 {
    
    public static void main (String[] args) {
        
    String s1,s2,s3,cod;
    Scanner lee = new Scanner(System.in);
    
    System.out.print("Dame el nombre: ");
    s1 = lee.nextLine();
    System.out.print("Dame el primer apellido: ");
    s2 = lee.nextLine();
    System.out.print("Dame el segundo apellido: ");
    s3 = lee.nextLine();
    
    cod = s1.substring(0,3).toUpperCase()+s2.substring(0,3).toUpperCase()+s3.substring(0,3).toUpperCase();
    System.out.println(cod);
    
    }
    
}
