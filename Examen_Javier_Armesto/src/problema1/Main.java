/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        // Crear una tienda
        Tienda miTienda = new Tienda("Mi Tienda");

        // Añadir algunos artículos a la tienda
        miTienda.añadir(new Articulo("Zapatillas", 30.50, 30));
        miTienda.añadir(new Articulo("Camiseta", 15.99, 20));
        miTienda.añadir(new Articulo("Pantalón", 25.75, 15));

        // Mostrar los artículos de la tienda
        System.out.println("Artículos en la tienda:");
        System.out.println(miTienda);

        // Vender algunas unidades de un artículo
        System.out.println("Vendiendo 5 unidades de Zapatillas...");
        if (miTienda.getArticulos().get(0).vender(5)) {
            System.out.println("Venta realizada con éxito.");
        } else {
            System.out.println("No hay suficiente stock para realizar la venta.");
        }

        // Mostrar los artículos de la tienda después de la venta
        System.out.println("Artículos en la tienda después de la venta:");
        System.out.println(miTienda);

        // Aumentar el stock de un artículo
        System.out.println("Aumentando el stock de Camiseta en 10 unidades...");
        miTienda.getArticulos().get(1).aumentarStock(10);

        // Mostrar los artículos de la tienda después de aumentar el stock
        System.out.println("Artículos en la tienda después de aumentar el stock:");
        System.out.println(miTienda);

        // Eliminar un artículo por nombre
        System.out.println("Eliminando el artículo 'Pantalón'...");
        if (miTienda.eliminar("Pantalón")) {
            System.out.println("Artículo 'Pantalón' eliminado correctamente.");
        } else {
            System.out.println("No se encontró ningún artículo con el nombre 'Pantalón'.");
        }

        // Mostrar los artículos de la tienda después de eliminar un artículo
        System.out.println("Artículos en la tienda después de eliminar un artículo:");
        System.out.println(miTienda);
    }
}