package programa1_B;

public class Sith extends Maestro {
    
    protected int oscura;

    public Sith(String nombre, int vida, int oscura) {
        super(nombre, vida);
        this.oscura = oscura;
    }

    public int getOscura() {
        return oscura;
    }

    public void setOscura(int oscura) {
        this.oscura = oscura;
    }

    @Override
    public void ataca(Maestro m){
        
        if (m instanceof Sith){
            //Si el atacado es un Sith
            m.setVida(m.getVida() - this.oscura);
        } else if (m instanceof Jedi){
            //Si el atacado es un Jedi
            m.setVida(m.getVida() - this.oscura);
            System.out.println(this.nombre + " atacó a " + m.getNombre() + " y ahora " + m.getNombre() + " tiene " + m.getVida() + " de vida.");
        }
        
    }
    
    @Override
    public String toString() {
        return "Jedi: " + super.nombre + ". Vida: " + super.vida + ". Fuerza Oscura: " + oscura;
    }
}
