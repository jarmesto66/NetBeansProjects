/*
Para practicar el uso de la estructura dinámica ArrayList, vamos a crear una lista dinámica con
información de grupos musicales y que se gestionará mediante el siguiente menú:

-GRUPOS MUSICALES-
1-Agregar grupos al final de la lista
2-Agregar grupos en una posición concreta
3-Recuperar grupo de una posición determinada
4-Modificar grupo en una posición determinada
5-Posición del grupo en la lista
6-Imprimir lista
7-Salir del programa
Intriduzca opción:

Las opciones tendrán la siguiente funcionalidad:
Opción1: Agregar grupos al final de la lista
Utiliza el método add(nombre_grupo) para ir añadiendo grupos al final del ArrayList
Opción2: Agregar grupos en una posición concreta
Valida que la posición esté dentro del array y luego inserta el nuevo grupo en la posición introducida,
desplazando el resto de elementos mediante el método add(posición,nombre_grupo).
Opción3: Recuperar grupo en una posición determinada
Valida que la posición esté dentro del array y luego recupera el grupo a partir de get(posición).
Opción4: Modificar grupo en una posición determinada
Valida que la posición esté dentro del ArrayList, informa del valor antiguo y luego modifica el valor
informando el nuevo valor mediante el método set(posición, nuevo_grupo).
Opción5: Posición del grupo en la lista
Valida que la posición esté dentro del ArrayList y recupera el nombre del grupo con get(posición).
Opción6: Imprimir lista
Mediante un bucle, recorremos todo el ArrayList y extraemos el nombre de cada posición con
get(posición) hasta llegar al final del mismo, marcado por size().
Opción7: Salir del programa
Se imprime una mensaje de despedida y sale del programa.
 */
package ud6_estdinamicas;

/**
 *
 * @author María
 */
public class Ej_91 {
    
}
