/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_B4;

/**
 *
 * @author María
 */
public class Main {
    
        public static void main(String[] args) {
        
        Articulo a1 = new Articulo("Pijama", 23.99, 0);
        //Articulo a2 = new Articulo();
        
//        a1.nombre = "Pijama";
//        a1.precio = 23.99;
//        a1.cuantosQuedan = 10;
        
        System.out.println(a1.nombre + " - Precio: " + a1.precio + " - IVA: " + a1.iva + "% - PVP: " + (a1.precio + ((a1.precio*a1.iva)/100)));
        
    }
    
}
