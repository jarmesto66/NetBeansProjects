
package problema3;

public class NueveEnRaya {

    public static int ganador(int[][] tablero) {
        // Verificar filas y columnas
        for (int i = 0; i < 9; i++) {
            if (tablero[i][0] != 0 && tablero[i][0] == tablero[i][1] && tablero[i][0] == tablero[i][2] &&
                tablero[i][0] == tablero[i][3] && tablero[i][0] == tablero[i][4] && tablero[i][0] == tablero[i][5] &&
                tablero[i][0] == tablero[i][6] && tablero[i][0] == tablero[i][7] && tablero[i][0] == tablero[i][8]) {
                return tablero[i][0];
            }
            if (tablero[0][i] != 0 && tablero[0][i] == tablero[1][i] && tablero[0][i] == tablero[2][i] &&
                tablero[0][i] == tablero[3][i] && tablero[0][i] == tablero[4][i] && tablero[0][i] == tablero[5][i] &&
                tablero[0][i] == tablero[6][i] && tablero[0][i] == tablero[7][i] && tablero[0][i] == tablero[8][i]) {
                return tablero[0][i];
            }
        }

        // Verificar diagonales
        if (tablero[0][0] != 0 && tablero[0][0] == tablero[1][1] && tablero[0][0] == tablero[2][2] &&
            tablero[0][0] == tablero[3][3] && tablero[0][0] == tablero[4][4] && tablero[0][0] == tablero[5][5] &&
            tablero[0][0] == tablero[6][6] && tablero[0][0] == tablero[7][7] && tablero[0][0] == tablero[8][8]) {
            return tablero[0][0];
        }
        if (tablero[0][8] != 0 && tablero[0][8] == tablero[1][7] && tablero[0][8] == tablero[2][6] &&
            tablero[0][8] == tablero[3][5] && tablero[0][8] == tablero[4][4] && tablero[0][8] == tablero[5][3] &&
            tablero[0][8] == tablero[6][2] && tablero[0][8] == tablero[7][1] && tablero[0][8] == tablero[8][0]) {
            return tablero[0][8];
        }

        // Si no hay ganador, verificar si hay empate
        boolean hayVacio = false;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (tablero[i][j] == 0) {
                    hayVacio = true;
                    break;
                }
            }
            if (hayVacio) break;
        }
        if (!hayVacio) {
            return 0; // Empate
        }

        // Si no hay ganador ni empate, devolver -1
        return -1;
    }

    public static boolean sonEspejo(int[][] tableroA, int[][] tableroB) {
        // Verificar si los tableros son espejo
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                // Verificar si las casillas de jugador 1 de A son iguales a las de jugador 2 de B
                if (tableroA[i][j] == 1 && tableroB[i][j] != 2) {
                    return false;
                }
                // Verificar si las casillas de jugador 2 de A son iguales a las de jugador 1 de B
                if (tableroA[i][j] == 2 && tableroB[i][j] != 1) {
                    return false;
                }
            }
        }
        return true;
    }
}

