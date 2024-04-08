/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD8_Excepciones;

/**
 *
 * @author María
 */
public class Ejercicio_B3 {
    
    public static void main(String [] args) throws Exception{
        double [] v = new double [15];
        acceso (v, 16);
    }
    public static double acceso (double [] v, int j) throws Exception {
        try{
            if ((0 <= j) && (j < v.length))
                return v[j];
            else
                throw new Exception ("El indice " + j + " no existe en el vector");
        }
        catch (Exception exc){
            throw exc;
        }
    }
    
}
