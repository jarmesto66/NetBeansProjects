/*
Crea un programa que muestre la sume (en binario) de dos números
binarios que introduaca el usuario. El usuario indicará primero cuántas
cifras tendrán los binarios a introducir. Es obligatorio el uso de arrays.
*/
package ud4;

import java.util.Scanner;

/**
 *
 * @jarmesto66 JAVIER ARMESTO BARTOLOME
 */
public class UD4_TareaVoluntariaEj2 {
    
        public static void main(String[] args) {
        
        // Creamos una variable para pedir el número de cifras
        int cifras;
        boolean acarreo = false;
        //El acarreo inicial de la suma de binarios es cero
        
        //Llamamos a Scanner para leer datos
        Scanner scr = new Scanner(System.in);
        
        // Pedimos al usuario el tamaño del número binario
        System.out.println("Voy a sumar dos números binarios");
        System.out.print("Dime cuántas cifras: ");
        cifras = scr.nextInt();
        
        // Ahora que sabemos el tamaño, declaramos los arrays
        char [] A = new char [cifras];
        char [] B = new char [cifras];
        char [] SUMA = new char [cifras];
        
        // Pedimos al usuario que introduzca los números en binario
        System.out.print("Dime el binario A: ");
        String binario1 = scr.next();
                                      
        System.out.print("Dime el binario B: ");
        String binario2 = scr.next();
        
        // Convertimos los Strings en Arrays
        
        A = binario1.toCharArray();
        B = binario2.toCharArray();
                
        
        // Para sumarlos hay que recorrerlos de final a principio [(lenght-1) a 0]
        
        for (int i = A.length - 1; i >= 0; i--) {
            
            if (!acarreo) {
                
                if ((A[i]=='0')&&(B[i]=='0')) {

                    SUMA [i] = '0';
                    acarreo = false;

                    }

                if (((A[i] == '0') && (B[i] == '1'))||((A[i] == '1') && (B[i] == '0'))) {

                    SUMA [i] = '1';
                    acarreo = false;

                }

                if ((A[i]=='1')&&(B[i]=='1')) {

                    SUMA [i] = '0';
                    acarreo = true;


                }
            
            }
            
            else {
                
                if ((A[i]=='0')&&(B[i]=='0')) {

                    SUMA [i] = '1';
                    acarreo = false;

                    }

                if (((A[i] == '0') && (B[i] == '1'))||((A[i] == '1') && (B[i] == '0'))) {

                    SUMA [i] = '0';
                    acarreo = true;

                }

                if ((A[i]=='1')&&(B[i]=='1')) {

                    SUMA [i] = '1';
                    acarreo = true;


                }
                
            }
       
        }
        
        if (acarreo) {
            
            //Overflow
            System.out.print("1");
            
        }
        for (int i = 0; i < SUMA.length; i++) {
            System.out.print(SUMA[i]);
        }
        
        System.out.println(""); //Para que el final en pantalla no quede 'amontonado'
    
    }
    
}
