package Mascotas;

public class Gato extends Mascota {
    
    protected String color;

    public Gato(String color, String nombre, int edad) {
        super(nombre, edad);
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + nombre + " " + edad + " " + color;
    }
    
    @Override
    public void habla(){
        System.out.println("Miau miau ");
    }
}
