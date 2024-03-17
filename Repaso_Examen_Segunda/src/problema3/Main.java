/* El juego del Nueve en raya es como el Tres en raya(*) pero con un tablero de 9x9 casillas,
y gana el jugador que consigue marcar 9 casillas en línea (horizontal, vertical o diagonal). El
tablero del juego se representa como una matriz (array bidimensional) int[9][9] cuyas posiciones
pueden contener tres posibles valores: un 0 representa una casilla vacía, y un 1 o un 2
representan una casilla marcada por el jugador 1 o 2.
Crea la clase NueveEnRaya y programa estas dos funciones estáticas (public static):
1. public static ... ganador(…) => Recibe como argumento un tablero del Nueve en raya y
devuelve un 1 o 2 indicando qué jugador ha ganado. Si hay empate devuelve 0.
2. public static … sonEspejo(…) => Función que recibe como argumentos dos tableros A y
B del Nueve en raya y devuelve true si son espejo. En caso contrario devuelve false. Dos
tableros A y B se consideran espejo si el jugador 1 de A ha marcado las mismas casillas
que el jugador 2 de B, y además el jugador 2 de A ha marcado las mismas casillas que el
jugador 1 de B.
No es necesario comprobar los datos pasados como argumento. Supondremos que
siempre son tableros válidos con datos correctos.
El Tres en Raya es un juego de mesa para 2 personas con un tablero de 3x3 casillas. Los
jugadores colocan por turnos una marca sobre una casilla del tablero, pudiendo colocar solo una
marca por turno y siempre en una posición vacía. Gana el primer jugador en colocar tres marcas
en línea (horizontal, vertical o diagonal). Si el tablero se llena de marcas sin que ningún jugador
haya ganado, se considera un empate.*/

package problema3;

/**
 *
 * @author María
 */
public class Main {
    
}
