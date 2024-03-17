package problema1;

public class Articulo {

    // atributos de objeto
    private final String nombre;
    private double precio; // sin IVA
    private int stock;

    // atributo de clase
    private static final int IVA = 21;

    // constructor
    public Articulo(String nombre, double precio, int stock) {
        this.nombre = nombre;
        setPrecio(precio);
        setStock(stock);
    }
    
    // getters y setters
    
    public String getNombre(){
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio > 0.0) {
            this.precio = precio;
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        }
    }

    public static int getIVA() {
        return IVA;
    }

    // devuelve el precio con IVA
    public double get_precio_con_iva() {
        return (precio + precio * IVA / 100);
    }

    // devuvle el objeto como un String
    @Override
    public String toString() {
        return (nombre + " " + precio + " " + stock);
    }

    // vende una cantidad del artículo, devuelve true/false si fué posible
    public boolean vender(int cantidad) {
        // si cantidad es positiva y hay stock suficiente, se hace la venta
        if (cantidad > 0 && cantidad <= stock) {
            stock -= cantidad;
            return true;
        }
        return false;
    }
    
    // aumenta el stock del artículo, devuelve true/false si fué posible
    public boolean aumentar_stock(int cantidad){
        // si cantidad es positiva, se aumenta el stock
        if (cantidad > 0) {
            stock += cantidad;
            return true;
        }
        return false;
    }

}
