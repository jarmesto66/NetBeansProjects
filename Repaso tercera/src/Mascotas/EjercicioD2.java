/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mascotas;

import java.util.ArrayList;

/**
 *
 * @author María
 */
public class EjercicioD2 {
    
    public static void main(String[] args) {
        // 1. Intentar crear un objeto Mascota (no debería ser posible)
        // Mascota mascota = new Mascota("Nombre", 3); // Esto debería generar un error
        
        // 2. Crear un ArrayList con dos perros, dos gatos y dos canarios
        ArrayList<Mascota> mascotas = new ArrayList<>();
        mascotas.add(new Perro(true, "Rex", 5));
        mascotas.add(new Perro(false, "Triski", 3));
        mascotas.add(new Gato("negro", "Luna", 1));
        mascotas.add(new Gato("blanco", "Pecas", 2));
        mascotas.add(new Canario(false, "Pepa", 5));
        mascotas.add(new Canario(true, "Pepe", 4));
        
        // 3. Mostrar por pantalla la información de todas las mascotas
        System.out.println("Información de todas las mascotas:");
        for (Mascota mascota : mascotas) {
            System.out.println(mascota);
        }
        
        // 4. Hacer que todas las mascotas cumplan años 5 veces
        for (int i = 0; i < 5; i++) {
            for (Mascota mascota : mascotas) {
                mascota.cumpleaños();
            }
        }
        
        // 5. Mostrar de nuevo la información de todas las mascotas
        System.out.println("\nInformación de todas las mascotas después de 5 años:");
        for (Mascota mascota : mascotas) {
            System.out.println(mascota);
        }
        
        // 6. Hacer que todas las mascotas hablen
        System.out.println("\nSonidos de todas las mascotas:");
        for (Mascota mascota : mascotas) {
            mascota.habla();
        }
    }
    
}
