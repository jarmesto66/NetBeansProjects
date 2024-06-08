package ud4_strings;

import java.util.Scanner;

/**
Crea un programa que pida dos cadenas de texto y luego las muestre en orden
alfabético (sin diferenciar entre mayúsculas y minúsculas).
 */
public class Ej3 {
    
    public static void main(String[] args) {
        
        String cadena1, cadena2;
        
        //Declaración de Scanner
        Scanner scr = new Scanner(System.in);
        System.out.print("Dame una cadena de texto: ");
        cadena1 = scr.nextLine();
        System.out.print("Dame otra cadena de texto: ");
        cadena2 = scr.nextLine();
        
        if (cadena1.compareToIgnoreCase(cadena2)<=0) {
            System.out.println(cadena1);
            System.out.println(cadena2);
        } else {
        System.out.println(cadena2);
        System.out.println(cadena1);
        }
        
        
    }
            
    
}
