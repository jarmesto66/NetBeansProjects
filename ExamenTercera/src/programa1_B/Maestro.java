package programa1_B;

public class Maestro {
        
   protected String nombre;
   protected int vida;

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
    
    public void ataca(Maestro m){
        //TODO en clases que heredan
    }
}