package ud4_strings;

import java.util.Scanner;

/**
Crea un programa que pida al usuario introducir una frase F, una palabra P1 y otra
palabra P2. Luego, mostrará F sustituyendo todas las ocurrencias de P1 por P2.
 */
public class Ej7 {
    
    public static void main(String[] args) {
        
        String f , p1, p2;

        //Declaración de Scanner
        Scanner scr = new Scanner(System.in);
        System.out.print("Dame una frase: ");
        f = scr.nextLine();
        System.out.print("Dame una palabra: ");
        p1 = scr.nextLine();
        System.out.print("Dame una palabra: ");
        p2 = scr.nextLine();
        
        //Se imprime f tras sustituir p1 por p2
        System.out.println(f.replaceAll(p1, p2));
        
    }
    
}