/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_E4;

/**
 *
 * @author USER
 */
public class Articulo {
    
    private String nombre;
    private double precio;
    private int iva, cuantosQuedan;
    
    public static final int ivaGeneral = 21;
    public static final int ivaReducido = 10;
    public static final int ivaSuperReducido = 4;    
    
    
    //CONSTRUCTOR

    public Articulo(String nombre, double precio, int cuantosQuedan, int iva) {
        if (nombre.equals("")) {
            System.out.println("ERROR. El nombre no puede estar vacío.");
        }   else    if (precio<=0) {
                        System.out.println("ERROR. El precio no puede ser negativo.");
                    }   else    if (iva != Articulo.ivaGeneral && iva != Articulo.ivaReducido && iva != Articulo.ivaSuperReducido) {
                                    System.out.println("ERROR: IVA no válido.");
                                }   else    if (cuantosQuedan < 0){
                                                System.out.println("ERROR. El inventario debe ser mayor que cero.");
                                            }   else {
                                                    this.nombre = nombre;
                                                    this.precio = precio;
                                                    this.iva = iva;
                                                    this.cuantosQuedan = cuantosQuedan;
                                                }
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
    
    public void setIva(int iva) {
        if (iva != Articulo.ivaGeneral && iva != Articulo.ivaReducido && iva != Articulo.ivaSuperReducido) {
            System.err.println("ERROR: IVA no valido");
        } else {
            this.iva = iva;
        }
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
