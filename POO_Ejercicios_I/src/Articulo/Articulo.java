/*
 
 */
package Articulo;

/**
 *
 * @author jarmesto
 */
public class Articulo {
    
    //Atributos
    String nombre;
    double precio;
    final double iva = 21.0;
    int cuantosQuedan;
    
    //Constructor

    public Articulo(String nombre, double precio, int cuantosQuedan) {
        
        if (precio<0) {
            System.err.println("ERROR, el precio no puede ser negativo.");
        }
        
        if (cuantosQuedan<0) {
            System.err.println("ERROR, el inventario no puede ser negativo.");
        }
        
        this.nombre = nombre;
        this.precio = precio;
        this.cuantosQuedan = cuantosQuedan;
        
        
        
    }
    
    
    
    
}
