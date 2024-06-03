/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figura;

/**
 *
 * @author María
 */
public class Cuadrado extends Figura {
    
    double lado;
    
    @Override
    public double area(){
        
        return this.lado*this.lado;
        
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    
    
}
