/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Ej13_Expresiones {
    
    public static void main (String[] args) {
        
        boolean resultado ;
        
        resultado = (25>20&&13>5) ;
        System.out.println("25>20&&13>5 es " + resultado);
        
        resultado = (10+4<15-3||2*5+1>14-2*2) ;
        System.out.println("10+4<15-3||2*5+1>14-2*2 es " + resultado);
        
        resultado = (4*2<=8||2*2<5&&4>3+1) ;
        System.out.println("4*2<=8||2*2<5&&4>3+1 es " + resultado);
        
        resultado = (10<=2*5&&3<4||!(8>7)&&3*2<=4*2-1) ;
        System.out.println("10<=2*5&&3<4||!(8>7)&&3*2<=4*2-1 es " + resultado);
    }}

    
