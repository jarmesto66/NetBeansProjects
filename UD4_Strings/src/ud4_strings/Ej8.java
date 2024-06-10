package ud4_strings;

import java.util.Scanner;

/**
Crea un programa que pida al usuario introducir una frase F y una palabra P, y
muestre por pantalla cuántas veces aparece P en F
 */
public class Ej8 {
    
    public static void main(String[] args) {
        
        String f , p;
        int pos=0, contador=0;

        //Declaración de Scanner
        Scanner scr = new Scanner(System.in);
        System.out.print("Dame una frase: ");
        f = scr.nextLine();
        System.out.print("Dame una palabra: ");
        p = scr.nextLine();
        
        do {
            //Busca p a partir de pos. Nos dice si p aparece a partir de posición cero
            pos = f.indexOf(p, pos);
            
            //Si encuentra p actualizamos contador (incremento porque aparece) y vamos a siguiente posición para volver a buscar
            if(pos>=0) {
                contador++;
                pos++;
            }
        } while(pos<=f.length());
        
        System.out.println(p + " aparece " + contador + " veces.");
        
    }
    
}
