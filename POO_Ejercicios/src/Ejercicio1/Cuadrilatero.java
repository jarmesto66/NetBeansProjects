/*
Construir un programa que calcule el área y el perimetro de un cuadrilátero dada
la longitud de sus dos lados. Los valores de la longitud deberán introducirse por
línea de órdenes. Si es un cuadrado, solo se proporcionará la longitud de uno de
los lados al constructor.


DIAGRAMA DE CLASES
Cuadrilatero
- lado1 : float
- lado2 : float
-------------------------------
Cuadrilatero(float lado1, float lado2)
Cuadrilatero(float lado1)
getPerimetro(): float
getArea(): float
*/






package Ejercicio1;

/**
 *
 * @author jarmesto
 */
public class Cuadrilatero {
    //Atributos
    private float lado1;
    private float lado2;
    
    //Métodos

    //Método constructor 1
    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    //Método constructor 2
    public Cuadrilatero(float lado1) {
        this.lado1 = this.lado2 = lado1;
    }
    
    public float getPerimetro(){
        float perimetro = 2 * (lado1+lado2);
        return perimetro;
    }
    
    public float getArea(){
        float area = lado1*lado2;
        return area;
    }
    
}
