
package problema1;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Tienda {
    
    //ATRIBUTOS
    String nombre;
    ArrayList<Articulo> articulo;
    
    //CONSTRUCTORES (no son necesarios los dos, con uno sobra)
    public Tienda(String nombre) {
        this.nombre = nombre;
    }
    
    public Tienda(String nombre, ArrayList<Articulo> articulos) {
        this.nombre = nombre;
        if (articulos != null)this.articulo = articulos;
        else this.articulo = new ArrayList<>();
    }

    
    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulo;
    }

    
    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulo = articulos;
    }

    @Override
    public String toString() {
        String str = ("Tienda: " + nombre + "\n");
        for (Articulo a : articulo) {
            str += (a + "\n");
        }
        return str;
    }
    
    //Añade un artículo a la tienda
    public void añadir(String nombre, double precio, int stock){
        if (articulo == null) articulo = new ArrayList<>();
        Articulo a = new Articulo(nombre, precio, stock);
        articulo.add(a);
    }
    
    //Elimina un artículo de la tienda de la posición posición
    public boolean eliminar(int posicion){
        if (posicion >= 0 && posicion < articulo.size()) { //valida que la posición exista
        articulo.remove(posicion);
        return true;
        }
        return false;
    }
    
    public boolean eliminar(String nombre){
        //recorreremos todos los artículos
        for (int i = 0; i < articulo.size(); i++) {
            if (articulo.get(i).getNombre().equals(nombre)){
                eliminar(i);
                return true;
            }
        }
        //si llega aquí es que no ha encontrado el artículo
        return false;
    }
    
    
}