package ud4_strings;

import java.util.Scanner;

/**
Crea un programa que lea una frase por teclado e indique si la frase es un palíndromo
o no (ignorando espacios y sin diferenciar entre mayúsculas y minúsculas).
Supondremos que el usuario solo introducirá letras y espacios (ni comas, ni puntos, ni
acentos, etc.). NOTA: Un palíndromo es un texto que se lee igual de izquierda a
derecha que de derecha a izquierda. Por ejemplo:
◦ Amigo no gima
◦ Dabale arroz a la zorra el abad
◦ Amo la pacífica paloma
◦ A man a plan a canal Panama
 */
public class Ej11v2 {
    
    public static void main(String[] args) {
        
    
    
        //Declaración de variables
       String cadena, inversa="";
       boolean palindromo;

       //Declaración de Scanner
       Scanner scr = new Scanner(System.in);
       System.out.print("Introduce una frase: ");
       cadena = scr.nextLine();
       
        for (int i = 0; i < cadena.length(); i++) {
            //System.out.println(i);
            //System.out.println(cadena.length()-1-i);            
            inversa += cadena.charAt(cadena.length()-1-i);
        }
        palindromo = cadena.equalsIgnoreCase(inversa);
        System.out.println("Palindromo es " + palindromo);
    }
}
