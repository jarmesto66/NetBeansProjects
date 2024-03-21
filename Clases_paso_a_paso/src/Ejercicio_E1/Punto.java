/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_E1;

import java.util.Random;

/**
 *
 * @author USER
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
        System.out.println("(" + this.x + "," + this.y + ")");
    }
    
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void desplazaXY(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }
    
    public double distancia(Punto p){
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }
    
    
    public static Punto creaPuntoAleatorio() {
        Random r = new Random();
        return new Punto(-100+r.nextInt(200), -100 + r.nextInt(200));
    }
    
    
    
}
