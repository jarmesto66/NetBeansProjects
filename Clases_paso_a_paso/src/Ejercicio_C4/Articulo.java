/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_C4;


/**
 *
 * @author María
 */

public class Articulo {
    
    private String nombre;
    private double precio;
    private final int iva = 21;
    private int cuantosQuedan;
    
    
    //CONSTRUCTOR

    public Articulo(String nombre, double precio, int cuantosQuedan) {
        this.nombre = nombre;
        if (precio>=0) this.precio = precio;
        else System.out.println("ERROR. El precio no puede ser negativo.");
        if (cuantosQuedan>0) this.cuantosQuedan = cuantosQuedan;
        else System.out.println("ERROR. El inventario debe ser mayor que cero.");
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    public int getIva() {
        return iva;
    }
    
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCuantosQuedan(int cuantosQuedan) {
        this.cuantosQuedan = cuantosQuedan;
    }
    
    
    
    
}
