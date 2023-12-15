package tareaentregableud3;

import java.util.Scanner;

/**
 * Crea un programa que simule que se lanzan X monedas al aire,
 * siendo X un valor que introduce el usuario, que muestre por pantalla
 * el resultado de cada moneda (+ si es cruz y O si es cara), cuantas
 * monedas han salido de cada tipo y si en alguna ocasión han salido 3
 * monedas iguales seguidas.
 * 
 * @author JAVIER ARMESTO BARTOLOMÉ
 */
public class TareaEntregableUD3Ej01 {

    public static void main(String[] args) {

        // Declaración de variables
        
        int cara=0, cruz=0, caratot=0, cruztot=0, tiradas;
        boolean tres=false, carault=false, cruzult=false;
        
        // Declaración Scanner
        
        Scanner lector = new Scanner(System.in);
        
        // Pedir número de tiradas
        
        System.out.print("Dime cuantas monedas lanzar: ");
        tiradas = lector.nextInt();
        
        for (int i=1; i<=tiradas; i++) {
        
            // Hacer las tiradas e ir presentando por pantalla las mismas
        
            int tirada = (int) (Math.floor(Math.random()*(2-1+1)+1));
            
            // Si sale cara
            
            if (tirada==1) { System.out.print("+");
                             carault=true;
                             cruzult=false;
                             caratot++;
            }
            else { System.out.print("O");
                   carault=false;
                   cruzult=true;
                   cruztot++;
            }
            
            // Si ha salido cruz y hay alguna cruz anterior, añado una cruz y compruebo si ya han salido tres
            
            if ((cruzult==true)&&(cruz>0)) { cruz=cruz+1;
                                             if (cruz>=3) tres=true;                
            }
            
            // Si ha salido cara y hay alguna cara anterior, añado una cara y compruebo si ya han salido tres
            
            if ((carault==true)&&(cara>0)) { cara=cara+1;
                                             if (cara>=3) tres=true;                
            }
            
            // Si ha salido cruz y no hay ninguna cruz anterior añado una cruz y marco cero caras (cambio de ciclo)
            
            if ((cruzult==true)&&(cruz==0)) { cruz=cruz+1;
                                             cara=0;
            }
            
            // Si ha salido cara y no hay ninguna cara anterior añado una cara y marco cero cruces (canmbio de ciclo)
            
            if ((carault==true)&&(cara==0)) { cara=cara+1;
                                             cruz=0;
            }
        }
        
        //** Presentamos resultados finales por pantalla
        
        System.out.println("");
        System.out.println("Cara (+): "+caratot);
        System.out.println("Cara (O): "+cruztot);
                
        // La variable tres solo cambia a true si en algún momento llega tres tiradas consecutivas
        
        if (tres ==true) System.out.println("Sí han salido 3 monedas iguales consecutivas");
        else System.out.println("No han salido 3 monedas iguales consecutivas");

    }
}