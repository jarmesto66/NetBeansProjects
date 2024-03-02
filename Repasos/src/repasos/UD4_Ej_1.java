/* Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del
1 al 25 y luego muestre la matriz por pantalla.*/

package repasos;

/**
 * @author JAVIER ARMESTO
 */
public class UD4_Ej_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [][] matriz = new int [5][5];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (i*5)+(j+1);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("]");
        }
    }
}
