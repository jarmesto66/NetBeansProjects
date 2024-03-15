/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Tienda {
    
    //ATRIBUTOS
    String nombre;
    ArrayList<Articulo> articulos;
    
    //CONSTRUCTORES (no son necesarios los dos, con uno sobra)
    public Tienda(String nombre) {
        this.nombre = nombre;
    }
    
    public Tienda(String nombre, ArrayList<Articulo> articulos) {
        this.nombre = nombre;
        this.articulos = new ArrayList<>();
    }

    
    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    
    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }

    @Override
    public String toString() {
        String str = ("Tienda: " + nombre);
        for (Articulo a : articulos) {
            str += (a + "\n");
        }
        return str;
    }
    
    //Añade un artículo a la tienda
    public void añadir(String nombre, double precio, int stock){
        Articulo a = new Articulo(nombre, precio, stock);
        articulos.add(a);
    }
    
    //Elimina un artículo de la tienda de la posición posición
    public boolean eliminar(int posicion){
        return(articulos.remove(posicion) != null);
    }
    
    public boolean eliminar(String nombre){
        //recorreremos todos los artículos
        for (int i = 0; i < articulos.size(); i++) {
            if (articulos.get(i).getNombre().equals(nombre)){
                eliminar(i);
                return true;
            }
        }
        //si llega aquí es que no ha encontrado el artículo
        return false;
    }
    
    
}
