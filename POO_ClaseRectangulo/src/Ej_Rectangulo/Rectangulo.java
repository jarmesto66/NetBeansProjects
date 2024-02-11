/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej_Rectangulo;

/**
 *
 * @author María
 */
public class Rectangulo {
  
  
    //Atributos de clase
    private static int numRectangulos;
    public static final String nombreFigura = "Rectángulo";
    public static final double PI = 3.1415926; //Constante PI
    
    //Atributos de objeto
    public double x1, y1; //Vértice inferior izquierdo
    public double x2, y2; //Vértice superior derecho
    
    public String obtenerNombre(){
        return nombreFigura;
    }
    
    public void establecerNombre(String nom){
        nombre = nom;
    }
    
    public double calcularSuperficie(){
        double area, base, altura; //Variables locales
        //Cálculo de la base
        base = x2 - x1;
        //Cálculo de la altura
        altura = y2 - y1;
        //Cálculo del área
        area = base * altura;
        //Devuelve valor
        return area;
    }
    
    public double calcularPerimetro(){
        double perimetro, base, altura; //Variables locales
        //Cálculo de la base
        base = x2 - x1;
        //Cálculo de la altura
        altura = y2 - y1;
        //Cálculo del área
        perimetro = 2 * base + 2 * altura;
        //Devuelve valor
        return perimetro;
    }
    
    public void desplazar (double x, double y){
        //Desplazamiento en el eje x
        x1 = x1 + x;
        x2 = x2 + x;
        //Desplazamiento en el eje y
        y1 = y1 + y;
        y2 = y2 + y;
    }
    
    public static int obtenerNumRectangulos(){
        return numRectangulos;
    }

    //Constructor 1
    public Rectangulo() {
        x1 = 0.0;
        y1 = 0.0;
        x2 = 1.0;
        y2 = 1.0;
    }
    
    //Constructor 2
    public Rectangulo(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    //Constructor 3
    public Rectangulo(double base, double altura){
        this.x1 = 0.0;
        this.y1 = 0.0;
        this.y1 = base;
        this.y2 = altura;
    }
    
    //Constructor copia
    public Rectangulo(Rectangulo r){
        this.x1 = r.x1;
        this.x2 = r.x2;
        this.y1 = r.y1;
        this.y2 = r.y2;
    }    
    
}
