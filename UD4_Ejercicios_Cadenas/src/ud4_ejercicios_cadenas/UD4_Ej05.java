/*
 * Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay
 *(cuantas ‘a’, cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe
 * diferenciar entre mayúsculas y minúsculas.
 * 
 */
package ud4_ejercicios_cadenas;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class UD4_Ej05 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String cadena;
        int i, aes=0,es=0,ies=0,os=0,us=0;
        char vocal;
        
        System.out.print("Dame una frase: ");
        cadena = leer.nextLine();
        
        for (i=0;(i<(cadena.length()));i++) {
            vocal = cadena.toUpperCase().charAt(i);
            
            switch (vocal) {
                case 'A': aes++; break;
                case 'E': es++; break;
                case 'I': ies++; break;
                case 'O': os++; break;
                case 'U': us++; break;
                
            }
        }
        
        System.out.println("Hay "+aes+" A "+es+" E "+ies+" I "+os+" O "+us+" U");
        
    }
    
}
