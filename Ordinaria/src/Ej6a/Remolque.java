/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej6a;

public class Remolque {
    
    private int peso;

    public Remolque(int peso) {
        this.peso = peso;
    }
    
    @Override
    public String toString() {
        return "Remolque: " + peso + " kg";
    }
}
