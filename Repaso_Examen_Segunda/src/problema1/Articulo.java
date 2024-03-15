
package problema1;

/**
 *
 * @author jarmesto
 */
public class Articulo {

    //ATRIBUTOS DE OBJETO
    private String nombre;
    private double precio; //sin iva
    private int stock;
    
    //ATRIBUTO DE CLASE
    private final int iva = 21;

    public Articulo(String nombre, double precio, int stock) {
        this.nombre = nombre;
        setPrecio(precio);
        setStock(stock);
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getIva() {
        return iva;
    }

    public int getStock() {
        return stock;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public double get_precio_con_iva(){
        return (precio + precio*iva/100);
    }

    public boolean vender(int unidades){
        if ((stock >= unidades) && (unidades > 0)) {
            stock -= unidades;
            return true;
        }
        return false;
    }
    
    public boolean aumentar_stock(int unidades){
        if (unidades >0){
            stock += unidades;
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return nombre + " tiene un precio de " + precio + " y un stock de " + stock + " con IVA del " + iva + "%";
    }
    
    
}
