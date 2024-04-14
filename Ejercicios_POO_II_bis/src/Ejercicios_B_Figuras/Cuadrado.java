
package Ejercicios_B_Figuras;

class Cuadrado extends Figura {
    
    protected double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double area(){
        return Math.pow(lado, 2);
    }
    
}
