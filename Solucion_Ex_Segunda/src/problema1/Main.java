/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;
import java.util.ArrayList;
/**
 *
 * @author María
 */
public class Main {
    
    public static void main(String[] args) {
        
        Tienda miTienda = new Tienda("Botica de Lionel");

        for (int i = 0; i < 25; i++) {
            miTienda.añadir("Articulo " + i, 10.5 + i, 100 + i);
        }
        
        miTienda.eliminar("Articulo 1");
        miTienda.añadir("Zapatillas", 113.5, 15);
        miTienda.eliminar("Articulo 10");

        
        
        System.out.println("Información de la tienda: ");
        System.out.println(miTienda);
    }
    
}
