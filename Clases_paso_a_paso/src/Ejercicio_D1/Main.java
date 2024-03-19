/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_D1;

/**
 *
 * @author María
 */
public class Main {
    
        public static void main(String[] args) {
        
        Punto p1 = new Punto(7,5);
        Punto p2 = new Punto(4,1);
        Punto p3 = new Punto(4,1);
        
        System.out.println(p1.getX() + " " + p1.getY());
        System.out.println(p2.getX() + " " + p2.getY());
        System.out.println(p3.getX() + " " + p3.getY());
        
        p1.setX(1);
        p1.setY(1);
        
        System.out.println(p1.getX() + " " + p1.getY());
        System.out.println(p2.getX() + " " + p2.getY());
        System.out.println(p3.getX() + " " + p3.getY());
        
            System.out.println("La distancia entre 1 y 3 es: " + p1.distancia(p2));
        
    }
    
}
