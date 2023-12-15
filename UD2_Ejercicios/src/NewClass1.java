/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class NewClass1 {
        public static void main(String[] args) {
    
    int nota1 = 10 ;
    int nota2 = 5 ;
    double media1, media2, media3 ;
    
    /* Cuidado con las operaciones porque pueden heredar */
        
    media1 = (double) (nota1 + nota2) / 2 ;
    media2 = (double) ((nota1 + nota2) / 2) ;
    media3 = (nota1 + nota2) / 2.0 ;
    System.out.println(media1) ;
    System.out.println(media2) ;        
    System.out.println(media3) ;        }
}
