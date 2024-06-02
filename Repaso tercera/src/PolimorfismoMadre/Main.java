/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PolimorfismoMadre;

/**
 *
 * @author María
 */
public class Main {
    
    public static void main(String[] args) {
        
        //Creamos un onjeto de cada clase
        Madre madre = new Madre();
        Hija1 h1 = new Hija1();
        Hija2 h2 = new Hija2();
        
        //Declaramos otra variable de tipo Madre
        Madre madre2;
        
        //Asignamos a madre2 el objeto madre (Madre)
        madre2 = madre;
        madre2.llamame();
        
        //Asignamos a madre2 el objeto h1 (Hija1)
        madre2 = h1;
        madre2.llamame();
        
        //Asignamos a madre2 el objeto h2 (Hija2)
        madre2 = h2;
        madre2.llamame();

    }
    
}
