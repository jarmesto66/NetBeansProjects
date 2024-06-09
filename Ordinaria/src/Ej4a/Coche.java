/*
Escribe una clase Coche de la que van a heredar CocheCambioManual y CocheCambioAutomatico.
Los atributos de los coches son la matrícula, la velocidad y la marcha. Para este ejercicio
no se permite la marcha atrás, por tanto no se permiten ni velocidad negativa, ni marcha negativa.
En el constructor se recibe el valor de la matrícula por parámetro y se inicializa el valor
de la velocidad y la marcha a 0.
 */
package Ej4a;

public class Coche {
    
    private String matricula;
    private int velocidad, marcha;

    public Coche(String matricula) {
        this.matricula = matricula;
        this.velocidad = 0;
        this.marcha = 0;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }
    
    @Override
    public String toString() {
        return "Matrícula: " + matricula + ", Velocidad: " + velocidad + " km/h, Marcha: " + marcha;
    }
    
    public void acelerar(int aceleron){
        velocidad += aceleron;
    }
    
    public void frenar(int decremento){
        if (decremento > 0) {
            velocidad -= decremento;
            if (velocidad < 0) {
                velocidad = 0;
            }
        }
    }
    
    protected void cambiaMarcha(int nuevaMarcha){
        if (nuevaMarcha>=0) marcha=nuevaMarcha;
    }
}
