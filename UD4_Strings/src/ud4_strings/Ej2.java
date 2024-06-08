package ud4_strings;

import java.util.Scanner;

/**
Crea un programa que pida dos cadenas de texto por teclado y luego indique si son
iguales o no, además de si son iguales sin diferenciar entre mayúsculas y minúsculas.
 */

public class Ej2 {
    
    public static void main(String[] args) {
        
        //Declaración de variables
        String cadena1, cadena2;
        
        
        //Declaración de Scanner
        Scanner scr = new Scanner(System.in);
        System.out.print("Dame una cadena de texto: ");
        cadena1 = scr.nextLine();
        System.out.print("Dame otra cadena de texto: ");
        cadena2 = scr.nextLine();
        
        if (cadena1.equals(cadena2))
            { System.out.println("SON IGUALES.");
        } else if (cadena1.equalsIgnoreCase(cadena2)) { System.out.println("SON IGUALES SIN DIFERENCIA MAY Y min");
               } else { System.out.println("SON DISTINTAS");
               }
        }
}
