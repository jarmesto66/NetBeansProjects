package programa1_A;

public class Sith extends Maestro {
    
    protected int oscura;

    public Sith(String nombre, int vida, int oscura) {
        super(nombre, vida);
        this.oscura = oscura;
    }

    public int getOscura() {
        return oscura;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getVida() {
        return vida;
    }

    public void setOscura(int oscura) {
        this.oscura = oscura;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }
    
    @Override
    public String toString() {
        return "Jedi: " + super.nombre + ". Vida: " + super.vida + ". Fuerza Oscura: " + oscura;
    }
}
