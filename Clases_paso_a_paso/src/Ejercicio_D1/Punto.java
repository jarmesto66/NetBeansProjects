
package Ejercicio_D1;

/**
 *
 * @author jarmesto
 */
public class Punto {
    
    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public void imprime(){
        
    }
    
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void desplaza(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }
    
    public double distancia(Punto p){
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }
    
}
