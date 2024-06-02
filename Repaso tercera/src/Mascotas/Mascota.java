package Mascotas;

public abstract class Mascota {
    
    String nombre;
    int edad;

    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public abstract void habla();
    
    public void cumpleaños(){
        edad++;
    }

    @Override
    public abstract String toString();
    
}
