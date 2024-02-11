
package Ejercicio2;

/**
 *
 * @author jarmesto
 */
public class Vehiculo {
    
    //Atributos
    private String marca;
    private String modelo;
    private float precio;
    
    
    
    //Métodos
        
    //Método constructor
    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }
    
    public String monstrarDatos(){
        return "Marca: "+marca+"\nModelo: "+modelo+"\nPrecio: "+precio+"€\n";
    }
    
}
