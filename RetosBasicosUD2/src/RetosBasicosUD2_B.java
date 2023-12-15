/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class RetosBasicosUD2_B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double radio;
        double area;
        final double pi=3.1415926;
        Scanner lector = new Scanner (System.in);
        System.out.print("Introduce el radio y pulsa <intro>: ");
        radio = lector.nextDouble();
        area = pi*(radio*radio);
        System.out.print("El área de un círculo de radio "+radio+" es: "+area);
        
        
    }
    
}
