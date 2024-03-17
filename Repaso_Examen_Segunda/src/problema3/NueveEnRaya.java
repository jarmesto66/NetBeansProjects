/*
1. public static ... ganador(…) => Recibe como argumento un tablero del Nueve en raya y
devuelve un 1 o 2 indicando qué jugador ha ganado. Si hay empate devuelve 0.
2. public static … sonEspejo(…) => Función que recibe como argumentos dos tableros A y
B del Nueve en raya y devuelve true si son espejo. En caso contrario devuelve false. Dos
tableros A y B se consideran espejo si el jugador 1 de A ha marcado las mismas casillas
que el jugador 2 de B, y además el jugador 2 de A ha marcado las mismas casillas que el
jugador 1 de B.
No es necesario comprobar los datos pasados como argumento. Supondremos que
siempre son tableros válidos con datos correctos.
 */
package problema3;

/**
 *
 * @author María
 */
public class NueveEnRaya {
    
    //ATRIBUTOS
    private int[][] miArray = new int[9][9];
    

    public static int ganador(int [][] tablero){
        
        String str;
        
        //Comprobemos las filas
        for (int i = 0; i < 9; i++) {
            str="";
            for (int j = 0; j < 9; j++) {
                str += tablero[i][j];
            }
            if (str.equals("111111111")) return 1;
            if (str.equals("222222222")) return 2;
        }
        
        //Comprobamos las columnas
        for (int i = 0; i < 9; i++) {
            str="";
            for (int j = 0; j < 9; j++) {
                    str += tablero[j][i];
            }
            if (str.equals("111111111")) return 1;
            if (str.equals("222222222")) return 2;
                
            }
        
        //Comprobamos una diagonal
        str = "";
        for (int i = 0; i < 9; i++) {
            str += tablero[i][i];
        }
        if (str.equals("111111111")) return 1;
        if (str.equals("222222222")) return 2;
        
    
        //Comprobamos la otra diagonal
        str = "";
        for (int i = 0; i < 9; i++) {
            str += tablero [i][9-1-i];
        }
        if (str.equals("111111111")) return 1;
        if (str.equals("222222222")) return 2;
        
        //Si llega aquí, no hay ganador
        return 0;
    }
}
