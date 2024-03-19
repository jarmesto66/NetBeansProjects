/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_D4;

/**
 *
 * @author María
 */
public class Main {
    
    public static void main(String[] args) {
        
        Articulo a1 = new Articulo("Pijama", 23.99, 1);
        //Articulo a2 = new Articulo();
        
//        a1.nombre = "Pijama";
//        a1.precio = 23.99;
//        a1.cuantosQuedan = 10;
        
        System.out.println(a1.getNombre() + " - Precio: " + a1.getPrecio() + " - IVA: " + a1.getIva() + "% - PVP: " + (a1.getPrecio() + ((a1.getPrecio()*a1.getIva())/100)));
        
        System.out.println("Precio PVP: " + a1.getPVP());
        System.out.println("PVP con descuento del 50% " + a1.getPVPDescuento(50));
        
        a1.almacenar(100);
        a1.imprimir();
        
        a1.vender(50);
        a1.imprimir();
        
    }
    
}