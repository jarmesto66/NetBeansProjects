/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_B3;

/**
 *
 * @author María
 */
public class Rectangulo {
    
    int x1, y1, x2, y2;

    public Rectangulo(int x1, int y1, int x2, int y2) {
        
        if ((x1<=x2) && (y1<=y2)) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        }
        else System.out.println("ERROR al instanciar Rectángulo");
        
    }

    public Rectangulo() {
    }
    
    
    
    
    
}
