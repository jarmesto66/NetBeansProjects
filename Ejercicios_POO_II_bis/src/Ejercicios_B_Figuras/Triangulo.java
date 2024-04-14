
package Ejercicios_B_Figuras;

class Triangulo extends Figura {
    
    protected double base, altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area(){
        return (base * altura) / 2;
    }
    
}
