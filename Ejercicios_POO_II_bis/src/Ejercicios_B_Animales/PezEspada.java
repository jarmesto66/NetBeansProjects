package Ejercicios_B_Animales;

public class PezEspada extends Pez {

    @Override
    protected void cantar() {
        super.cantar();
        System.out.print("ríndete ");
    }
}
