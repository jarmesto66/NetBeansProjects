/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CCC;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Main {
    
    public static void main(String[] args) {
        
        int opcion;
        CCC c1 = new CCC ("1075 2540 1322 4522 5287", 100.50);
        Scanner op = new Scanner(System.in);
        Scanner cantidad = new Scanner(System.in);
        
        while (true){
            
            System.out.println("MENU DE OPERACIONES DE CAJA");
            System.out.println("1. INGRESAR");
            System.out.println("2. RETIRAR");
            switch (op.nextInt()) {
                case 1:
                    System.out.println("Tiene "+c1.getSaldo()+" Euros en cuenta. ¿Cuánto desea ingresar?");
                    c1.ingresar(cantidad.nextDouble());
                    break;
                case 2:
                    System.out.println("Tiene "+c1.getSaldo()+" Euros en cuenta. ¿Cuánto desea retirar?");
                    c1.retirar(cantidad.nextDouble());
                    break;
            }
            
            
        }
        
    }
    
}
