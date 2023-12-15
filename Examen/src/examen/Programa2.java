/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Programa2 {
    
     public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaración de variables
        int capacidad, lluvia, dia = 0;
        boolean llena = false;
        
        //Declaración de Scanner
        Scanner scr = new Scanner(System.in);
        
        //Pedimos al usuario la capacidad de la cubeta
        System.out.print("Introduce la capacidad de la cubeta: ");
        capacidad = scr.nextInt();
        
        //Iniciamos bucle mientras 'no esté llena la cubeta'
        while (!llena) {
            
            dia++; //Contador de días
            lluvia = (int) (Math.random()*(20-0+1)+0); //Lluvia diaria aleatoria
            capacidad = capacidad - lluvia;
            
            if (capacidad < 0) {
                capacidad = 0; //Para que no aparezcan valores negativos por cubeta desbordada
                llena = true; //SE HA LLENADO LA CUBETA
            }
            
            System.out.println("Día: "+ dia +" Lluvia: "+ lluvia + " Capacidad: "+ capacidad);
            
        }
        System.out.println("Fin de la simulación. Se ha llenado en : "+ dia + " días.");
    }
    
}
