/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej4a;

/**
 *
 * @author María
 */
public class CocheCambioAutomatico extends Coche {

    public CocheCambioAutomatico(String matricula) {
        super(matricula);
    }
    
    @Override
    public void acelerar(int incremento){
        super.acelerar(incremento);
        autoAjusteMarcha();
    }

private void autoAjusteMarcha() {
        int velocidad = getVelocidad();
        if (velocidad < 20) {
            super.cambiaMarcha(1);
        } else if (velocidad < 40) {
            super.cambiaMarcha(2);
        } else if (velocidad < 60) {
            super.cambiaMarcha(3);
        } else if (velocidad < 80) {
            super.cambiaMarcha(4);
        } else {
            super.cambiaMarcha(5);
        }
    }
}
