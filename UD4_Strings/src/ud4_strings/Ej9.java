package ud4_strings;

import java.util.Scanner;

/**
Crea un programa que pida al usuario introducir una cadena de texto con dos
palabras y luego muestre por pantalla las dos palabras en líneas distintas. Por
ejemplo, dada la cadena de texto “Hola Lionel” mostrará por pantalla:
    hola
    Lionel
 */
public class Ej9 {
    
    public static void main(String[] args) {
        
        //Declaración de variables
        String cadena;
        int pos;
        
        //Declaración de Scanner
        Scanner scr = new Scanner(System.in);
        System.out.print("Dame una cadena de texto de dos palabras: ");
        cadena = scr.nextLine();
        
        //Buscamos la posición del espacio
        pos = cadena.indexOf(" ");
        
        //Mostramos desde 0 hasta pos
        System.out.println(cadena.substring(0, pos));
        System.out.println(cadena.substring(pos+1, cadena.length()));
        
    }
    
}
