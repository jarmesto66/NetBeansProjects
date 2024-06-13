package pregunta3;

import java.util.ArrayList;

public class GestionTrabajadores {
    
    ArrayList<Trabajador> plantilla = new ArrayList();
    
    
    public void agregarTrabajador(Trabajador trabajador){
        plantilla.add(trabajador);
    }
    
    public void eliminarTrabajador(String nombre){
        for (Trabajador trabajador : plantilla) {
            if (trabajador.getNombre().equals(nombre)) {
                plantilla.remove(trabajador);
                break;
            }
        }
    }
    
    public void trabajar(int horas){
        for (Trabajador trabajador : plantilla) {
            trabajador.trabajar(horas);
        }
    }
    
    
            

    

    @Override
    public String toString() {
        return "GestionTrabajadores{" + '}';
    }
    
    public static void main(String[] args) {
        
    
        ArrayList<Trabajador> plantilla = new ArrayList();
    
    
    Trabajador t1 = new Trabajador("Javier");
    Trabajador t2 = new Trabajador("Luis");
    Trabajador t3 = new Trabajador("Andrés");
    Trabajador t4 = new Trabajador("Pepe");
    
    plantilla.add(t1);
    plantilla.add(t2);
    plantilla.add(t3);
    plantilla.add(t4);
    
    
    
    
}
    

    
    
    
    
}
