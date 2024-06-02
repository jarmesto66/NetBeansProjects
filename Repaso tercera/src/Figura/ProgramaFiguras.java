/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figura;

import java.util.ArrayList;

/**
 *
 * @author María
 */
public class ProgramaFiguras {
    
    public static void main(String[] args) {
        
        ArrayList<Figura> figuras = new ArrayList<Figura>();
        figuras.add(new Circulo(10)); // Radio=10
        figuras.add(new Cuadrado(10)); // Lado=10
        figuras.add(new Triangulo(10,5)); // Base=10, Altura=5;
        for (Figura f: figuras)
        System.out.println("Área: " + f.area());
        
    }
    
}
