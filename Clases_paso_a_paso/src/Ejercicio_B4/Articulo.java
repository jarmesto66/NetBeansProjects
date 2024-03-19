/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_B4;

/**
 *
 * @author María
 */
public class Articulo {
    
    String nombre;
    double precio;
    final int iva = 21;
    int cuantosQuedan;
    
    
    //CONSTRUCTOR

    public Articulo(String nombre, double precio, int cuantosQuedan) {
        this.nombre = nombre;
        if (precio>=0) this.precio = precio;
        else System.out.println("ERROR. El precio no puede ser negativo.");
        if (cuantosQuedan>0) this.cuantosQuedan = cuantosQuedan;
        else System.out.println("ERROR. El inventario debe ser mayor que cero.");
    }
    
    
}
