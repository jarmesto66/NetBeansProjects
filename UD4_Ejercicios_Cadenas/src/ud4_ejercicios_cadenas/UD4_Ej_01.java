/*
 * Crea un programa que pida una cadena de texto y luego la muestre tanto en
 * mayúsculas como en minúsculas.
 */
package ud4_ejercicios_cadenas;

import java.util.Scanner;

/**
 * @jarmesto66
 */
public class UD4_Ej_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaramos variables
        String texto,mayus,minus;
        
        //Creamos Scanner
        Scanner scr = new Scanner(System.in);
        
        //Pedimos y leemos cadena de texto
        System.out.print("Escribe una cadena de texto: ");
        texto = scr.nextLine();
        
        //Convertimos
        mayus=texto.toUpperCase();
        minus=texto.toLowerCase();
        
        //Mostramos
        System.out.println(mayus);
        System.out.println(minus);
    }
}
