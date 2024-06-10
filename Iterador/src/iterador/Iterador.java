package iterador;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterador {

    public static void main(String[] args) {
      
        ArrayList<String> ciudades = new ArrayList<String>();
        
        ciudades.add("New York");
        ciudades.add("Tokyo");
        ciudades.add("París");
        
        System.out.println("Ciudades: ");
        
        Iterator<String> it = ciudades.iterator();
        it.next();
        it.remove();
        while (it.hasNext()){
            System.out.print(it.next()+ " ");
        }
        
        System.out.println("");
        
        ArrayList<String> clientes = new ArrayList<>();
        clientes.add("Pepe García");
        clientes.add("Toni Pérez");
        clientes.add("Marta Gómez");
        clientes.add("Sara Martínez");
        
        Iterator<String> clienteIterador = clientes.iterator();
        while (clienteIterador.hasNext()){
            String cliente = clienteIterador.next();
            if (cliente.equals("Toni Pérez")) clienteIterador.remove();
            System.out.println(cliente);
        }
        System.out.println("-----------------------------");
        Iterator<String> cli = clientes.iterator();
        while (cli.hasNext()){
            String cliente = cli.next();
            System.out.println(cliente);
        }
        
    }
    
}
