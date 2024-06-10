/*
Se va a implementar un simulador de Vehículos. Existen dos tipos de Vehículo: Coche y Camión.
a) Sus características comunes son la matrícula y la velocidad. En el momento de crearlos, la matrícula
se recibe por parámetro y la velocidad se inicializa a 0. El método toString() de los vehículos
devuelve información acerca de la matrícula y la velocidad. Además se pueden acelerar, pasando por
parámetro la cantidad en km/h que se tiene que acelerar.
*/
package Ej6a;

public class Vehiculo {
    
    private String matricula;
    private int velocidad;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
        this.velocidad = 0;
    }

    public int getVelocidad() {
        return velocidad;
    }
    
    

    // Método toString
    @Override
    public String toString() {
        return "Matrícula: " + matricula + ", Velocidad: " + velocidad + " km/h";
    }
    
    public void acelerar(int incremento){
        if (incremento>0) this.velocidad += incremento;
    }
    
    
    
}
