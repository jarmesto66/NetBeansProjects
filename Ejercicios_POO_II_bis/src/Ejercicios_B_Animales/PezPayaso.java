package Ejercicios_B_Animales;

public class PezPayaso extends Pez {

    @Override
    protected void cantar() {
        super.cantar();
        System.out.print("chorprecha ");
    }
}
