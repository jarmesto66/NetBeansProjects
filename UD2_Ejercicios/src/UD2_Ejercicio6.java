/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class UD2_Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int precio;
        int precioRebajado;
    Scanner lector = new Scanner(System.in);
    System.out.print("Dime el precio original: ");
    precio = lector.nextInt();
    precioRebajado = precio - (precio*15)/100;
    System.out.println("El precio rebajado es: " + precioRebajado);
    }
    
}
