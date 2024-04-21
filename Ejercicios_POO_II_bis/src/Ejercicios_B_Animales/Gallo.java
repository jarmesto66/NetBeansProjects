package Ejercicios_B_Animales;

public class Gallo extends Pajaro {

    @Override
    protected void cantar() {
        super.cantar();
        System.out.print("quiquiriqui ");
    }
}
