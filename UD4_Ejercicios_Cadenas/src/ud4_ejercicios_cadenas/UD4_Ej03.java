/*
 * Crea un programa que pida dos cadenas de texto y luego las muestre en orden
 * alfabético (sin diferenciar entre mayúsculas y minúsculas)
 */
package ud4_ejercicios_cadenas;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class UD4_Ej03 {
    
    public static void main(String[] args) {
        
         //Declara variables
        String s1,s2;
        char c1,c2;
        boolean igual=true;
        int i=0;
        
        //Crea Scanner
        Scanner in = new Scanner(System.in);
        
        //Pide las cadenas
        System.out.print("Dame una cadena de texto:  ");
        s1 = in.nextLine();
        System.out.print("Dame otra cadena de texto: ");
        s2 = in.nextLine();
        
        while ((igual)&&(i<(s1.length()))) {
            
            c1=s1.toLowerCase().charAt(i);
            c2=s2.toLowerCase().charAt(i);
            if (c1==c2) {
                
                if (i==(s1.length()-1)) {
                    
                    System.out.println(s1+" es igual que "+s2);
                    igual=false;
                
                }
                i++;
            }
            
            else {
                
                igual=false;
                if (c1<c2) {
                    
                    System.out.println(s1+" es menor que "+s2);
                    
                }
                else {
                    
                    if (c1>c2) {
                    
                    System.out.println(s2+" es menor que "+s1);
                    
                    }
                    
             
                }
            }
            
        }
    }
    
}
