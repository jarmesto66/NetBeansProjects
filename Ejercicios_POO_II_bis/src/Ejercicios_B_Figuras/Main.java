
package Ejercicios_B_Figuras;

import java.util.ArrayList;

public class Main {
    
   public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList();
        figuras.add(new Circulo(10)); // Radio=10
        figuras.add(new Cuadrado(10)); // Lado=10
        figuras.add(new Triangulo(10,5)); // Base=10, Altura=5;
        for (Figura f: figuras)
            System.out.println("Área: " + f.area());
    } 
    
}
