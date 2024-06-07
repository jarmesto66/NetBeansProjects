/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa1_A;
        
public class Jedi extends Maestro {

    protected int luz;

    public Jedi(String nombre, int vida, int luz) {
        super(nombre, vida);
        this.luz = luz;
    }

    public int getLuz() {
        return luz;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getVida() {
        return vida;
    }

    public void setLuz(int luz) {
        this.luz = luz;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }

    
    @Override
    public String toString() {
        return "Jedi: " + super.nombre + ". Vida: " + super.vida + ". Fuerza Luz: " + luz;
    }
}
