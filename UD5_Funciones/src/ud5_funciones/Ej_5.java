/*
Escribe un programa que pida un valor entero en millas y muestre su equivalente en
kilómetros. Recuerda que una milla son 1,60934 kilómetros. Implementa y utiliza la
función:
double millas_a_kilometros(int millas) // Devuelve la conversión de millas a kilómetros
 */
package ud5_funciones;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ej_5 {
    
    public static double millas_a_kilometros(int millas) {
        
        return(millas*1.60934);
        
    }
    
    public static void main(String[] args) {
        
        Scanner scr = new Scanner (System.in);
        int millas;
        System.out.print("Dame un valor en millas: ");
        millas = scr.nextInt();
        
        System.out.println(millas+" millas son "+millas_a_kilometros(millas)+" kuilometros");
        
    }
    
}
