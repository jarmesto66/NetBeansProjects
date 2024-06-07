package programa1_A;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {

        ArrayList<Object> maestros = new ArrayList<>();

        maestros.add(new Jedi ("Yoda", 50, 10));
        maestros.add(new Jedi ("Obi-Wan", 80, 7));
        maestros.add(new Sith ("Vader", 100, 9));
        maestros.add(new Sith ("Dooku", 70, 7));

        for (Object m : maestros) { //El compilador me da error al poner la clase Maestro ¿¿?¿?

            System.out.println(m);
        }
    }
}
