
package problema1;

/**
 *
 * @author USER
 */
public class Articulo {

    private String nombre;
    private double precioSinIVA;
    private final double iva = 0.21; // IVA fijo del 21%
    private int stock;

    // Constructor
    public Articulo(String nombre, double precioSinIVA, int stock) {
        this.nombre = nombre;
        this.precioSinIVA = precioSinIVA;
        this.stock = stock;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public double getPrecioSinIVA() {
        return precioSinIVA;
    }

    public void setPrecioSinIVA(double precioSinIVA) {
        this.precioSinIVA = precioSinIVA;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // Métodos públicos
    public double getPrecioConIVA() {
        return precioSinIVA * (1 + iva);
    }

    public String toString() {
        return "Nombre: " + nombre + ", Precio sin IVA: " + precioSinIVA + "€, Precio con IVA: " + getPrecioConIVA() + "€, Stock: " + stock;
    }

    public boolean vender(int cantidad) {
        if (cantidad <= stock && cantidad > 0) {
            stock -= cantidad;
            return true;
        }
        return false;
    }

    public boolean aumentarStock(int cantidad) {
        if (cantidad > 0) {
            stock += cantidad;
            return true;
        }
        return false;
    }
}