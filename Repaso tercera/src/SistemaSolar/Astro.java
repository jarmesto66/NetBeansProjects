package SistemaSolar;

public abstract class Astro {
    
    protected String nombre;
    protected double masa;
    protected int tempMedia;

    public Astro(String nombre, double masa, int tempMedia) {
        this.nombre = nombre;
        this.masa = masa;
        this.tempMedia = tempMedia;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Masa: " + masa + " kg, Temperatura Media: " + tempMedia + " ºC";
    }
    
    
}
