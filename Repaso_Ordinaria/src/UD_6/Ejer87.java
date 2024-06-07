
package UD_6;

import java.util.ArrayList;

public class Ejer87 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> valores = new ArrayList<>();
        
        //Cantidad aleatoria de números entre 10 y 20
        int cantidad = (int) (Math.random()*(20-10+1)+10);
        
        int suma;
        int maximo = 0;
        int minimo = 100;
        double media;
        int sumatorio =0;
        
        for (int i = 0; i < cantidad; i++) {
            valores.add((int) (Math.random()*100)+1);
        }
        
        for (Integer v : valores) {
            
            //Comprobamos si es mínimo
            if (v.intValue()<minimo) {minimo=v.intValue();}
            
            //Comprobamos si es el máximo
            if (v.intValue()>maximo) {maximo=v.intValue();}
            
            sumatorio+=v.intValue();
    }
        
        for (Integer v : valores) {
            
            System.out.println(v);
            
        }
                
        
        media = sumatorio/cantidad;
        System.out.println("El MAX es: " + maximo);
        System.out.println("El MIN es: " + minimo);
        System.out.println("La media es: " + media);
    
    }
}
