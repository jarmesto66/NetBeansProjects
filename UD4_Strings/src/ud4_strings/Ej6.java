package ud4_strings;

import java.util.Scanner;

/**
Crea un programa que pida al usuario introducir una frase F y una palabra P, y
muestre por pantalla:
◦ Si F contiene P.
◦ Si F empieza por P.
◦ Si F termina por P.
 */
public class Ej6 {
    
    public static void main(String[] args) {
        
    //Declaración de variables
    String f , p;
    
            //Declaración de Scanner
    Scanner scr = new Scanner(System.in);
    System.out.print("Dame una frase: ");
    f = scr.nextLine();
    System.out.print("Dame una palabra: ");
    p = scr.nextLine();
    
    if (f.contains(p)) System.out.println("La frase contiene la palabra.");
    if (f.startsWith(p)) System.out.println("La frase comienza por la palabra.");
    if (f.endsWith(p)) System.out.println("La frase termina por la palabra.");
    
    }
}
