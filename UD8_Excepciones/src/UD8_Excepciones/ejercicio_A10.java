/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD8_Excepciones;

import java.util.Scanner;

/**
 *
 * @author María
 */
public class ejercicio_A10 {
    
    public static void main(String[] args) {
        
        double[] miArray = new double [5];
        double valor;
        Scanner sc = new Scanner (System.in);
        
        for (int i = 0; i < miArray.length; i++) {
            System.out.print("Introduce valor " + (i+1) + ": ");
            try{
            valor = sc.nextDouble();
            valor = miArray[i];
            }
            catch(Exception e1){
                sc.nextLine();
                System.out.println("VALOR INCORRECTO");
                i--;
            }
            
        }
        
    }
    
}
