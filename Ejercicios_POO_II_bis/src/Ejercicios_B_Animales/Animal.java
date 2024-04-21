package Ejercicios_B_Animales;

public class Animal {
    
    protected void cantar() {
        System.out.print(this.getClass().getSimpleName() + " ");
    }
}
