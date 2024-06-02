package SistemaSolar;

public class Satelite extends Astro {
    
    float distanciaPlaneta;

    public Satelite(float distanciaPlaneta, String nombre, double masa, int tempMedia) {
        super(nombre, masa, tempMedia);
        this.distanciaPlaneta = distanciaPlaneta;
    }

    @Override
    public String toString() {
        return "Satélite: " + super.toString() + ", Distancia al Planeta: " + distanciaPlaneta + " km";
    }

    
    
}
