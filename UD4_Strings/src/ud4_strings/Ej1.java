package ud4_strings;

import java.util.Scanner;



public class Ej1 {

/*
Crea un programa que pida una cadena de texto y luego la muestre tanto en
mayúsculas como en minúsculas.
    */

    public static void main(String[] args) {
        
        //Declaración de variables
        String cadena;
        
        //Declaración de Scanner
        Scanner scr = new Scanner(System.in);
        System.out.print("Dame una cadena de texto: ");
        cadena = scr.nextLine();
        
        
        System.out.print("La cadena en mayúsculas es: " + cadena.toUpperCase());
        System.out.println("");
        System.out.print("La cadena en minúsculas es: " + cadena.toLowerCase());
        System.out.println("");

    }
    
}
