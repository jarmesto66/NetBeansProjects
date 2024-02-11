/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Articulo;

/**
 *
 * @author jarmesto
 */
public class Main {
    
    public static void main(String[] args) {
        
        Articulo a1 = new Articulo("Pijama", 10.0,-25);
        
        System.out.println(a1.nombre+" - Precio: "+a1.precio+"€ - IVA:21% - PVP: "+a1.precio*1.21+"€");
        System.out.println("Tenemos: "+a1.cuantosQuedan+" en existencias.");
        
    }
    
}
