/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figura;

/**
 *
 * @author María
 */
public class Circulo extends Figura {
    
    double radio;
    
    @Override
    public double area(){
        
        return (this.radio*this.radio)*Math.PI;
        
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    
    
}
