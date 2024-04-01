/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD8_Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author María
 */
public class Ejercicio_A9 {
    
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        
        
        
        try{
        System.out.print("Dime un número entero: ");
        a = sc.nextInt();
        System.out.print("Dime un número entero: ");
        b = sc.nextInt();
        System.out.println("La división es: " + a/b);
        }
        catch(InputMismatchException e1){
            System.out.println("VALOR INTRODUCIDO INCORRECTO.");
        }
        
        catch(ArithmeticException e2){
            System.out.println("Dividiendo por cero.");
        }
        
        System.out.println("FIN DEL PROGRAMA");
    }
    
}
