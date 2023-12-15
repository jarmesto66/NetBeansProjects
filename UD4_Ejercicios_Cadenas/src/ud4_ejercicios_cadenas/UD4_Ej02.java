/*
 * Crea un programa que pida dos cadenas de texto por teclado y luego indique si son
 * iguales o no, además de si son iguales sin diferenciar entre mayúsculas y minúsculas.
 */
package ud4_ejercicios_cadenas;

import java.util.Scanner;

/**
 *
 * @jarmesto66 USER
 */
public class UD4_Ej02 {
    
    public static void main(String[] args) {
        
        //Declara variables
        String s1,s2;
        
        //Crea Scanner
        Scanner in = new Scanner(System.in);
        
        //Pide las cadenas
        System.out.print("Dame una cadena de texto:  ");
        s1 = in.nextLine();
        System.out.print("Dame otra cadena de texto: ");
        s2 = in.nextLine();
        
        //Compara cadenas
        if (s1.equals(s2)) {
            System.out.println("Las cadenas son iguales");
        }
        else if (s1.equalsIgnoreCase(s2)) {
             System.out.println("Las cadenas son iguales sin diferenciar entre mayúsculas y minúsculas");
             }
        
    }
    
}
