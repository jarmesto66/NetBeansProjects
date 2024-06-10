package programa1_B;
        
public class Jedi extends Maestro {

    protected int luz;

    public Jedi(String nombre, int vida, int luz) {
        super(nombre, vida);
        this.luz = luz;
    }

    public int getLuz() {
        return luz;
    }

    public void setLuz(int luz) {
        this.luz = luz;
    }

    @Override
    public void ataca(Maestro m) {
        if (m instanceof Sith) {
            if (this.getVida()<10){ m.setVida(m.getVida() - 3*this.luz);} //Si vida <10 ataque triple
            else { m.setVida(m.getVida() - this.luz);} // Si el atacado es un Sith, reducir su vida por la cantidad de "luz"
        } else if (m instanceof Jedi) {

           if (this.getVida()<10){ m.setVida(m.getVida() - 3*this.luz);} //Si vida <10 ataque triple
           else { m.setVida(m.getVida() - this.luz);} // Si el atacado es un Jedi, reducir su vida por la cantidad de "luz"
        }
        System.out.println(this.nombre + " atacó a " + m.getNombre() + " y ahora " + m.getNombre() + " tiene " + m.getVida() + " de vida.");
    }

    
    @Override
    public String toString() {
        return "Jedi: " + super.nombre + ". Vida: " + super.vida + ". Fuerza Luz: " + luz;
    }
}
