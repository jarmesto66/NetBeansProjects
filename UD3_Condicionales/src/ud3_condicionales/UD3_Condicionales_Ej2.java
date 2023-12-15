/*
Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “Eres
mayor de edad” o el mensaje de “Eres menor de edad”.
 */
package ud3_condicionales;

import java.util.Scanner;

/**
 *
 * @author María
 */
public class UD3_Condicionales_Ej2 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad; 
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Dime cuántos años tienes: ");
        edad=sc.nextInt();
        
        if (edad > 17) System.out.println("Eres mayor de edad. ¡Enhorabuena!");
        else System.out.println("Eres menor de edad.");
    }
    
}
