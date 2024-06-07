package programa1_A;

public class Maestro {
        
    String nombre;
    int vida;

    public Maestro(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}

