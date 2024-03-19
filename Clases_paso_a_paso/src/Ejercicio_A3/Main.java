/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_A3;

/**
 *
 * @author María
 */
public class Main {
    
    public static void main(String[] args) {
        
        Rectangulo r1 = new Rectangulo();
        Rectangulo r2 = new Rectangulo();
        
        r1.x1 = 0;
        r1.y1 = 0;
        r1.x2 = 5;
        r1.y2 = 5;
        
        r2.x1 = 7;
        r2.y1 = 9;
        r2.x2 = 2;
        r2.y2 = 3;
        
        System.out.println("Las coordenadas de r1 son: (" + r1.x1 + "," + r1.y1 + ") (" + r1.x2 + "," + r1.y2 + ")");
        System.out.println("Las coordenadas de r2 son: (" + r2.x1 + "," + r2.y1 + ") (" + r2.x2 + "," + r2.y2 + ")");
        
        System.out.println("El perímetro de r1 es: " + (((r1.x2-r1.x1)*2) + ((r1.y2-r1.y1)*2)));
        System.out.println("El área de r1 es: " + ((r1.x2-r1.x1) * (r1.y2-r1.y1)));
        
        System.out.println("El perímetro de r2 es: " + (((r2.x2-r2.x1)*2) + ((r2.y2-r2.y1)*2)));
        System.out.println("El área de r2 es: " + ((r2.x2-r2.x1) * (r2.y2-r2.y1)));
        
        
    }
    
}
