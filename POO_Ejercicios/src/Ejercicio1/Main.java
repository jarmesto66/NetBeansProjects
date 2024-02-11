
package Ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author jarmesto
 */
public class Main {
    public static void main(String[] args) {
        Cuadrilatero c1;
        float lado1, lado2;
        
        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Teclee el valor del lado 1: "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Teclee el valor del lado 2: "));
        
        if (lado1 == lado2){ //Es un cuadrado
            c1 = new Cuadrilatero(lado1);
        }
        else{ //No es un cuadrado
            c1 = new Cuadrilatero(lado1,lado2);
        }
        
        System.out.println("El perímetro es: "+c1.getPerimetro());
        System.out.println("El área es: "+c1.getArea());
        
    }
}
