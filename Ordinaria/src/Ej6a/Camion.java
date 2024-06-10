/*
Los camiones tienen un atributo de tipo Remolque que inicializa a null (para indicar que no
tiene remolque). Además tiene un método ponRemolque(), que recibe el Remolque por parámetro,
y otro quitaRemolque(). Cuando se muestre la información de un camión que lleve remolque, además
de la matrícula y velocidad del camión, debe aparecer la información del remolque
 */
package Ej6a;

public class Camion extends Vehiculo{
    
    private Remolque remolque;

    public Camion(String matricula) {
        super(matricula);
        this.remolque = null;
    }
    
    public void ponRemolque(Remolque remolque){
        this.remolque = remolque;
    }
    
    public void quitaRemolque(){
        this.remolque = null;
    }

    @Override
    public String toString() {
        if (remolque != null) {
            return super.toString() + ", " + remolque.toString();
        }
        return super.toString();
    }
    
    public void acelerar(int incremento){
        if ((remolque!= null) && (getVelocidad() + incremento) > 100){
            throw new DemasiadoRapidoException("El camión no puede superar los 100 km/h con remolque.");
        }
        super.acelerar(incremento);
    }


    
    
    
}
