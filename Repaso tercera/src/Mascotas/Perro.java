package Mascotas;

public class Perro extends Mascota {
    
    protected boolean pulgas;

    public Perro(boolean pulgas, String nombre, int edad) {
        super(nombre, edad);
        this.pulgas = pulgas;
    }
    
    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + nombre + " " + edad + " Pulgas: " + pulgas;
    }
    
    @Override
    public void habla(){
        System.out.println("Guau guau ");
    }
    
}
