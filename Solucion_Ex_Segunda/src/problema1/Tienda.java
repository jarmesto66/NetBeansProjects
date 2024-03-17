package problema1;

import java.util.ArrayList;

public class Tienda {
    
    // atributos
    private String nombre;
    private ArrayList<Articulo> articulos;

    // constructores (es aconsejable crear estos dos, aunque no obligatorio, con hacer uno está bien)
    public Tienda(String nombre, ArrayList<Articulo> articulos) {
        this.nombre = nombre;
        this.articulos = articulos;
    }
    
    public Tienda(String nombre) {
        this.nombre = nombre;
        this.articulos = new ArrayList<>();
    }

    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }
    
    // devuelve el objeto como un String
    @Override
    public String toString(){
        String str = ("TIENDA: " + nombre);
        for(Articulo a : articulos){
            str += (a + "\n");
        }
        return str;
    }
    
    // añade un nuevo artículo a la tienda
    public void añadir(String nombre, double precio, int stock){
        Articulo a = new Articulo(nombre, precio, stock);
        articulos.add(a);
    }
    
    // elimina el artículo en la posición 'posicion', devuelve true/false si fué posible
    public boolean eliminar(int posicion) {
        return (articulos.remove(posicion) != null);
    }
    
    // elimina el primer artículo llamado 'nombre', devuelve true/false si fué posible
    public boolean eliminar(String nombre) {
        // recorremos todos los artículos
        for(int i = 0; i < articulos.size(); i++){
            // si encuentra uno llamado nombre, se elimina y 'return true' para el bucle.
            if (articulos.get(i).getNombre().equalsIgnoreCase(nombre)){
                eliminar(i);
                return true;
            }
        }
        // si llega aquí es porque no existe un artículo llamado 'nombre'
        return false;
    }
    
}
