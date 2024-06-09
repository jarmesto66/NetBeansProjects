/*
Los coches tienen además un atributo para el número de puertas, que se recibe también por parámetro
en el momento de crearlo. Tiene además un método que devuelve el número de puertas.
 */
package Ej6a;

public class Coche extends Vehiculo{
    
    private int puertas;

    public Coche(String matricula, int puertas) {
        super(matricula);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Número de puertas: " + puertas;
    }
    
}
