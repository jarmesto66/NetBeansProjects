/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_D4;

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
    
    public double getPVP(){
        return (this.precio+(this.precio*this.iva/100));
    }
    
    public double getPVPDescuento(int descuento){
        return (this.precio-this.precio*descuento/100)+((this.precio-this.precio*descuento/100)*this.iva/100);
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
    
    public void imprimir(){
        System.out.println(this.nombre + " con precio " + this.precio + " quedan " + this.cuantosQuedan + " unidades.");
    }
    
    public boolean vender(int vendidos){
        if ((vendidos<=this.cuantosQuedan)&&(vendidos>0)) {
            this.cuantosQuedan -= vendidos;
            return true;
        }
        else return false;
    }
    
    public boolean almacenar(int unidades){
        if (unidades>0){
            this.cuantosQuedan += unidades;
            return true;
        }
        else return false;
    }
    
}
