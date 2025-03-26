package p1t5_netbeans;
/**
 * <h2>Ejemplo simple de comentarios en Javadoc </h2>
 * @version 1.0
 * @author Javier Armesto Bartolomé <br> <a href="mailto:javarmbar@alu.edu.gva.es">javarmbar@alu.edu.gva.es</a>
 * 
 */
public class Circulo {
    
    private double centroX;
    private double centroY;
    private double radio;

    /**
     * Constructor con 3 parámetros.
     * @param cx Coordenada x del centro.
     * @param cy Coordenada y del centro.
     * @param r Radio del cí­rculo.
     */
    public Circulo(
            double cx, double cy, double r) {
        centroX = cx;
        centroY = cy;
        radio = r;
    }

    /**
     * Método Getter (de cx).
     * @return Coordenada x del centro.
     */
    public double getCentroX() {
        return centroX;
    }

    /**
     * Calcula la longitud de la circunferencia (perí­metro del cí­rculo).
     * @return Circunferencia
     */
    public double getCircunferencia() {
        return 2 * Math.PI * radio;
    }

    /**
     * Desplaza el cí­rculo a otras coordenadas (sumando unas nuevas).
     * @param deltaX Desplazamiento en eje x.
     * @param deltaY Desplazamiento en eje y.
     */
    public void mueve(double deltaX, double deltaY) {
        centroX = centroX + deltaX;
        centroY = centroY + deltaY;
    }

    /**
     * Escala el cí­rculo (cambia su radio).
     * @param s Factor de la escala.
     */
    public void escala(double s) {
        radio = radio * s;
    }
}