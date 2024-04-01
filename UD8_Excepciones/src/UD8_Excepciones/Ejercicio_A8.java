/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UD8_Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author María
 */
public class Ejercicio_A8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime un número entero: ");
        
        try{
        a = sc.nextInt();
        }
        catch(InputMismatchException e1){
            System.out.println("VALOR INTRODUCIDO INCORRECTO");
        }
        
        System.out.println("FIN DEL PROGRAMA");
         
                
    }
    
}
