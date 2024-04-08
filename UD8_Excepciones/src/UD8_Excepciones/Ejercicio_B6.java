/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD8_Excepciones;

/**
 *
 * @author María
 */
public class Ejercicio_B6 {
    
    public static void main (String [] args) {
        try {
            System.out.println (metodo( ));
        }
        catch (Exception e) {
            System.out.println ("Excepcion en metodo ( ) ");
            e.printStackTrace ( );
        }
    }
    private static int metodo ( ) {
        int valor =0;
        try {
            valor = valor +1;
            valor = valor + Integer.parseInt("W");
            valor = valor + 1;
            System.out.println ("Valor al final del try : " + valor) ;
        }
        catch (NumberFormatException e ) {
            valor = valor + Integer.parseInt("42");
            System.out.println ("Valor al final del catch :" + valor);
        }
        finally {
            valor = valor + 1;
            System.out.println("Valor al final de finally :" + valor) ;
        }
        valor = valor + 1;
        System.out.println ("Valor antes del return : " + valor);
        return valor;
    } 
}
