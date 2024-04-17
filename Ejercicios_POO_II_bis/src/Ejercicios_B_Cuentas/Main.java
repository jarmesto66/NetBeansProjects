
package Ejercicios_B_Cuentas;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<CuentaCorriente> banco = new ArrayList();
        
        CuentaCorriente c1 = new CuentaCorriente("Javier Armesto", 150.0);
        CuentaCorriente c2 = new CuentaCorriente("Javier Momparler", 2000.0);
        CuentaCorriente c3 = new CuentaCorriente("Lionel Messi", 0.0);
        Ahorro a1 = new Ahorro("María Martínez", 1000.00);
        Ahorro a2 = new Ahorro("Elena LLuch", 320.00);
        Ahorro a3 = new Ahorro("Lourdes García", 0.00);
        Pro p1 = new Pro ("Jose Parada", 256.74);
        Pro p2 = new Pro ("Andrés Pajares", 56.74);
        Pro p3 = new Pro ("Fernando Esteso", 255);
        

        
        a1.ingresar(1000);
        System.out.println("El saldo de la cuenta " + a1.toString() + " es: " + a1.getSaldo());
        a3.retirar(100);
        System.out.println("El saldo de la cuenta " + a3.toString() + " es: " + a3.getSaldo());
        
        System.out.println("");
        
        banco.add(c1);
        banco.add(c2);
        banco.add(c3);
        banco.add(a1);
        banco.add(a2);
        banco.add(a3);
        banco.add(p1);
        banco.add(p2);
        banco.add(p3);
        
        System.out.println("El saldo de la cuenta " + a1.toString() + " es: " + a1.getSaldo());
        a1.actualizarMensualidad();
        System.out.println("El saldo de la cuenta " + a1.toString() + " es: " + a1.getSaldo());
        System.out.println("El saldo de la cuenta " + p1.toString() + " es: " + p1.getSaldo());
        p1.actualizarMensualidad();
        System.out.println("El saldo de la cuenta " + p1.toString() + " es: " + p1.getSaldo());
        
        System.out.println("");
        
        for (CuentaCorriente b : banco) {
            
            System.out.println(b.toString());
            
        }
    }
    
    
    
}
