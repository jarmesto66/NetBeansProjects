package Ej3a;

public class ListaMultimedia {
    
    private Multimedia[] lista;
    private int contador;

    
    //Constructor que recibe el número máximo de objetos
    public ListaMultimedia(int max){
        lista = new Multimedia[max];
        contador = 0;
    }

    public int size() {
        return contador;    
    }
    
    public boolean add(Multimedia m){
        if (contador>=lista.length){
            return false; //Lista llena
        }
        lista[contador++] = m;
        return true;
    }
    
    public Multimedia get(int posicion){
        if (posicion<0 || posicion>=contador){ //posicion fuera de rango
            return null;
        }
        return lista[posicion];
    }
    
    public int indexOf(Multimedia m){
        for (int i = 0; i < contador; i++) {
            if (lista[i].equals(m)){
                return i;
            }
        }
        return -1; //No encontrado
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < contador; i++) {
            sb.append(lista[i].toString());
            if (i<contador-1){
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}

