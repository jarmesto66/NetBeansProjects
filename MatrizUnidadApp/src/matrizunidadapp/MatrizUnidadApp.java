/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrizunidadapp;

/**
 *
 * @author USER
 */
public class MatrizUnidadApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [][] mUnidad= new int [4][4];
        for (int i = 0; i < mUnidad.length; i++) {
            for (int j = 0; j < mUnidad[i].length; j++) {
                
                if (i == j) {
                    mUnidad [i][j]=1;
                }
                else {
                    mUnidad[i][j]=0;
                }
                
            }
            
        }
        
        for (int i = 0; i < mUnidad.length; i++) {
            for (int j = 0; j < mUnidad[i].length; j++) {
                System.out.print(mUnidad[i][j]+"\t");
                
            }
            System.out.println("");
        }
    }
    
}
