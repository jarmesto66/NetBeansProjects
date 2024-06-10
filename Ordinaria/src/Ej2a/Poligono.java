package Ej2a;

import java.util.Arrays;

public class Poligono {
    
    private Punto[] puntos;

    public Poligono(Punto[] puntos) {
        this.puntos = Arrays.copyOf(puntos, puntos.length);
    }

    public void setPuntos(Punto[] puntos) {
        this.puntos = puntos;
    }

    public Punto[] getPuntos() {
        return puntos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Punto p : puntos) {
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }
    
    public void trasladar(double dx, double dy){
        for (Punto p : puntos) {
            p.setX(p.getX()+dx);
            p.setY(p.getY()+dy);
        }
    }
        
    public void escalar(double factorX, double factorY){
        for (Punto p : puntos) {
            p.setX(p.getX()*factorX);
            p.setY(p.getY()*factorY);
        }
    }
    
    public int numVertices(){
        return puntos.length;
    }
    
    public double perimetro(){
        double perimetro = 0;
        for (int i = 0; i < puntos.length; i++) {
            Punto p1 = puntos[i];
            Punto p2 = puntos[(i+1)%puntos.length];
            perimetro += p1.distancia(p2);
            
        }
        return perimetro;
    }
}
   
