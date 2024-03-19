/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DGT;

/**
 *
 * @author María
 */
public class Coche {

    //Atributos
    private String marca, modelo, bastidor;
    
    //Constructor
    public Coche(String marca, String modelo, String bastidor) {
        this.marca = marca;
        this.modelo = modelo;
        this.bastidor = bastidor;
    }
    
    //Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }
    
    //Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getBastidor() {
        return bastidor;
    }
    
    
    
    
    
}
