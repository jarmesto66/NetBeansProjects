/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class RetosBasicosUD2_D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int horas;
        int dias;
        int semanas;
        Scanner lector = new Scanner(System.in);
        System.out.print("Dame el número de horas: ");
        horas = lector.nextInt();
        dias = horas/24;
        semanas = dias/7;
        System.out.println(horas + " son " + dias + " días y también " + semanas + " semanas");
        
    }
    
}
