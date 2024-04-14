
package Ejercicios_B_Figuras;

class Circulo extends Figura {

    protected double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area(){
        return Math.PI * Math.pow(radio, 2);
    }

}
