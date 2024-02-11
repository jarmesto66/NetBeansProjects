/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto;

/**
 *
 * @author María
 */
public class Main {
    
    public static void main(String[] args) {
        
        Punto p1 = new Punto(5,0);
        Punto p2 = new Punto(10,10);
        Punto p3 = new Punto(-3,7);
        
        System.out.println(p1.x+ " "+p1.y);
        System.out.println(p2.x+ " "+p2.y);
        System.out.println(p3.x+ " "+p3.y);
        
        p1.x = p1.x + 10;
        
        System.out.println(" ");
        System.out.println(p1.x+ " "+p1.y);
        System.out.println(p2.x+ " "+p2.y);
        System.out.println(p3.x+ " "+p3.y);
    }
    
}
