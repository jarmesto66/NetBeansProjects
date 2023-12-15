/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class RetosBasicosUD2_C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int horas;
        Scanner lector = new Scanner(System.in);
        // TODO code application logic here
        System.out.print("Dame el número de horas: ");
        horas = lector.nextInt();
        System.out.println(horas + " horas son un total de " + (horas*60) + " segundos");
    }
    
}
