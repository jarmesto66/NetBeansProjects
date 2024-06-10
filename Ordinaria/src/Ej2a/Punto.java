package Ej2a;

public class Punto {
    
    private double x,y;
    
    public Punto() {
        this.x = 0;
        this.y = 0;
    }    

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double distancia(Punto otro){
        //Fórmula de distancia euclidiana entre dos puntos
        return Math.sqrt(Math.pow(otro.x-this.x,2)+Math.pow(otro.y-this.y, 2));
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
    
    
    
}
