package Ejercicios_B_Animales;

public class Pez extends Animal {

    @Override
    protected void cantar() {
        super.cantar();
        System.out.print("glu glu ");
    }
}
