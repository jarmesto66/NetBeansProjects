/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author USER
 */
public class UD2_Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int imposicion;
        double interesAnual , intereses , hacienda;
        interesAnual = 2.75;
        imposicion = 2000;
        intereses = imposicion*(2.75/100)/2;
        hacienda = intereses - (intereses*18/100);
        System.out.println("Los intereses pagados son: " + hacienda);
    }
    
}
