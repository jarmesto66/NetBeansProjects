package Enunciado;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Equipo {
    
    private static final Map<Posicion, Integer> MAX_FUTBOLISTAS_POSICION = new HashMap<>();
    static {
        MAX_FUTBOLISTAS_POSICION.put(Posicion.PORTERO, 2);
        MAX_FUTBOLISTAS_POSICION.put(Posicion.DEFENSA, 5);
        MAX_FUTBOLISTAS_POSICION.put(Posicion.CENTROCAMPISTA, 5);
        MAX_FUTBOLISTAS_POSICION.put(Posicion.DELANTERO, 4);
    }
    
    private String nombre;
    private List<Futbolista> futbolistas;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.futbolistas = new ArrayList<>();
    }
    
    private int obtenerJugadoresPosicion(Posicion posicion){
        int contador = 0;
        for (Futbolista futbolista : futbolistas) {
            if (futbolista.getPosicion() == posicion) {
                contador++;
            }
        }
        return contador;
    }
    
    public void agregarFutbolista(Futbolista futbolista){
        try {
            //Obtenemos la cantidad de jugadores en la posición del que queremos añadir
            int futbolistasPosicion = obtenerJugadoresPosicion(futbolista.getPosicion());
            
            //Si se ha llegado al máximo
            if (futbolistasPosicion == MAX_FUTBOLISTAS_POSICION.get(futbolista.getPosicion())) {
                throw new RegistroFutbolistaException(futbolista);
            }
            
            //Añadimos futbolista al equipo
            futbolistas.add(futbolista);
            futbolista.agregarEquipo(this.nombre);
            
        } catch (RegistroFutbolistaException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void listarFormacionEquipo(){
        
        //Ordenamos por posición
        futbolistas.sort(new Comparator<Futbolista>(){
            
            public int compare(Futbolista o1, Futbolista o2){
                return Integer.compare(prioridadPosicion(o1.getPosicion()),prioridadPosicion(o2.getPosicion()));
            }
            
            public int prioridadPosicion(Posicion posicion){
                switch (posicion) {
                    case PORTERO:
                        return 1;
                    case DEFENSA:
                        return 2;
                    case CENTROCAMPISTA:
                        return 3;
                    case DELANTERO:
                        return 4;
                }
                return 0;
            }
        });
        
        //Los mostramos ordenados
        Iterator<Futbolista> iteratorEquipo = futbolistas.iterator();
        while (iteratorEquipo.hasNext()){
            System.out.println(iteratorEquipo.next());
        }
    }
}
