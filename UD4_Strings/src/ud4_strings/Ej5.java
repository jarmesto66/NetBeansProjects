package ud4_strings;

import java.util.Scanner;

/**
Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay
(cuantas ‘a’, cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe
diferenciar entre mayúsculas y minúsculas.
 */
public class Ej5 {
    
    public static void main(String[] args) {
        
        //Declaración de variables
        String cadena;
        int na=0, ne=0, ni=0, no=0, nu=0; //Vocales de cada
        
        //Declaración de Scanner
        Scanner scr = new Scanner(System.in);
        System.out.print("Dame una cadena de texto: ");
        cadena = scr.nextLine();
        
        cadena = cadena.toUpperCase();
        
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            switch (c){
                case 'A':
                    na++;
                    break;
                case 'E':
                    ne++;
                    break;
                case 'I':
                    ni++;
                    break;
                case 'O':
                    no++;
                    break;
                case 'U':
                    nu++;
                    break;
            }
        }
        System.out.println("Hay "+ na + " aes");
        System.out.println("Hay "+ ne + " es");
        System.out.println("Hay "+ ni + " ies");
        System.out.println("Hay "+ no + " oes");
        System.out.println("Hay "+ nu + " us");
        
        
    }
    
}
