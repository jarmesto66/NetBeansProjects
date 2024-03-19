/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_C1;

/**
 *
 * @author María
 */
public class Main {
    
    public static void main(String[] args) {
        
        Punto p1 = new Punto(5,0);
        Punto p2 = new Punto(10,10);
        Punto p3 = new Punto(-3,7);
        
        System.out.println(p1.getX() + " " + p1.getY());
        System.out.println(p2.getX() + " " + p2.getY());
        System.out.println(p3.getX() + " " + p3.getY());
        
        p1.setX(1);
        p1.setY(1);
        
        System.out.println(p1.getX() + " " + p1.getY());
        System.out.println(p2.getX() + " " + p2.getY());
        System.out.println(p3.getX() + " " + p3.getY());
        
    }
    
}
