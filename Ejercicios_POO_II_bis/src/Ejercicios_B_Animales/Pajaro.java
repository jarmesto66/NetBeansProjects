package Ejercicios_B_Animales;

public class Pajaro extends Animal {

    @Override
    protected void cantar() {
        super.cantar();
        System.out.print("pio pio ");
    }
}
