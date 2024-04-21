package Ejercicios_B_Animales;

import java.util.ArrayList;

public class EjercicioB2 {

    public static void main(String[] args) {
        
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Animal());
        animales.add(new Pez());
        animales.add(new Pajaro());
        animales.add(new Gallo());
        animales.add(new PezPayaso());
        animales.add(new PezEspada());
        animales.add(new PajaroCarpintero());

        for (Animal a : animales) {
            a.cantar();
            System.out.println("");
        }
    }
}
