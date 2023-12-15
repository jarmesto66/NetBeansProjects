/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Ej15_b_Calificaciones {
    
    public enum Calificacion { suspenso, suficiente, bien, notable, sobresaliente}
    
    public static void main (String[] args) {
    
        Calificacion cate = Calificacion.suspenso ;
        Calificacion sufi = Calificacion.suficiente ;
        Calificacion bien = Calificacion.bien ;
        Calificacion nota = Calificacion.notable ;
        Calificacion sobre = Calificacion.sobresaliente ;
        System.out.println("Si no te cae un " + cate + " te ha podido caer un " + sufi + ", un " + bien + ", un " + nota + " o un " + sobre);
        
            
        
        } ;
    
}
