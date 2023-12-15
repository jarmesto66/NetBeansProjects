
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Ej17_equilatero {
        public static void main(String[] args) {
    
    double lado, area, altura;
    
    Scanner lector = new Scanner(System.in) ;
    System.out.print("Dame el lado del triángulo equilatero: ");
    lado = lector.nextDouble();
    System.out.println("El perímetro es : " + 3*lado);
    altura = Math.sqrt(Math.pow(lado,2)-Math.pow(lado/2,2)) ;
    System.out.println("La altura es : " + altura);
    System.out.println("El área es: " + lado*altura/2);
    }
}
