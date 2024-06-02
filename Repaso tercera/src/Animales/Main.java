/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

import java.util.ArrayList;

/**
 *
 * @author María
 */
public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Animal());
        animales.add(new Peces());
        animales.add(new Pajaro());
        animales.add(new Gallos());
        animales.add(new Payaso());
        animales.add(new Espada());
        animales.add(new PajaroCarpintero());

        for (Animal a : animales) {
            a.cantar();
            System.out.println("");
        }

    }
    
}
