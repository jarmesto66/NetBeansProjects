/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DGT;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author María
 */
public class Matricula {
    
    private String placa;
    ArrayList<Coche> coches = new ArrayList<>();
    HashMap<String, Coche> registro = new HashMap<>();
    
    //Constructor
    public Matricula(String placa, HashMap registro) {
        this.placa = placa;
        this.registro = new HashMap<>();
    }

    //Setters
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setRegistro(HashMap<String, Coche> registro) {
        this.registro = registro;
    }
    
    //Getters
    public String getPlaca() {
        return placa;
    }

    public HashMap<String, Coche> getRegistro() {
        return registro;
    }

    public boolean añadir_coche(String placa, HashMap coche){
        if (!registro.containsKey(placa)){
            registro.put(placa, coche);
            return true;
        }
        return false;
    }
    
}
