/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej4a;

public class CocheCambioManual extends Coche{

    public CocheCambioManual(String matricula) {
        super(matricula);
    }
   
    public void cambiaMarcha(int nuevaMarcha){
        if (nuevaMarcha>=0) super.cambiaMarcha(nuevaMarcha);
    }
}
