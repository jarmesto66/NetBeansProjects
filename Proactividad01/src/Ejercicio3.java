/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla del " + i + ":");
            // Bucle para multiplicar cada número de 1 a 10
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            // Línea en blanco para separar las tablas
            System.out.println();
        }
        
    }
    
}
