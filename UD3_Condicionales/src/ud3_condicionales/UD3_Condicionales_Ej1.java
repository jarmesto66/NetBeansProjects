/*
Escribe un programa que pide la edad por teclado y muestre el mensaje de “Eres
mayor de edad” si lo somos.
 */
package ud3_condicionales;

import java.util.Scanner;

/**
 *
 * @author María
 */
public class UD3_Condicionales_Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad; 
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Dime cuántos años tienes: ");
        edad=sc.nextInt();
        
        if (edad > 17) System.out.println("Eres mayor de edad. ¡Enhorabuena!");
    }
    
}
