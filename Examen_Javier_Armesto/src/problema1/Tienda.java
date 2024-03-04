
package problema1;


import java.util.ArrayList;

public class Tienda {
    
    //Atributos
    private String nombre;
    private ArrayList<Articulo> articulos;

    // Constructor
    public Tienda(String nombre) {
        this.nombre = nombre;
        this.articulos = new ArrayList<>();
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }
    
    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos públicos
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Articulo articulo : articulos) {
            sb.append(articulo.toString()).append("\n");
        }
        return sb.toString();
    }

    public void añadir(Articulo articulo) {
        articulos.add(articulo);
    }

    public boolean eliminar(int posicion) {
        if (posicion >= 0 && posicion < articulos.size()) {
            articulos.remove(posicion);
            return true;
        }
        return false;
    }

    public boolean eliminar(String nombre) {
        for (Articulo articulo : articulos) {
            if (articulo.getNombre().equals(nombre)) {
                articulos.remove(articulo);
                return true;
            }
        }
        return false;
    }
}