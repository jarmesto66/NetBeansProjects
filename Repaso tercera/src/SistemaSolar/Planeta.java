package SistemaSolar;

import java.util.ArrayList;

public class Planeta extends Astro {
    
    private double distanciaSol;
    private ArrayList<Satelite> satelites;

    public Planeta(double distanciaSol, ArrayList<Satelite> satelites, String nombre, double masa, int tempMedia) {
        super(nombre, masa, tempMedia);
        this.distanciaSol = distanciaSol;
        this.satelites = new ArrayList<>();
    }

    public ArrayList<Satelite> getSatelites() {
        return satelites;
    }

    public Satelite getSatelite(int posicion){
        return satelites.get(posicion);
    }
    
    public void agregarSatelite (Satelite satelite){
        satelites.add(satelite);
    }
    
    public void eliminarSatelite (int posicion){
        satelites.remove(posicion);
    }
    
    public void mostrarSatelites(){
        System.out.println("Satélites orbitando el planeta " + nombre + ":");
        for (Satelite satelite : satelites) {
            System.out.println(satelite);
        }
    }

    @Override
    public String toString() {
        return "Planeta: " + super.toString() + ", Distancia al Sol: " + distanciaSol + " UA";
    }
    
}
