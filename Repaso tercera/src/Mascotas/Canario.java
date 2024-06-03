/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mascotas;

/**
 *
 * @author María
 */
public class Canario extends Mascota {
    
    boolean volando;

    public Canario(boolean volando, String nombre, int edad) {
        super(nombre, edad);
        this.volando = volando;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + nombre + " " + edad + " Volando: " + volando;
    }
    
    @Override
    public void habla(){
        System.out.println("Pio pio ");
    }
    
    @Override
    public void cumpleaños(){
        edad+=2;
    }
    
}
