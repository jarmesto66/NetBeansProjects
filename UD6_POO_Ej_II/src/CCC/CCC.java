/*
Escribe una clase para representar una cuenta corriente de un banco:
• Atributos: número de cuenta y saldo (dinero, double).
• Constructor con parámetros. Métodos getters y setters.
• Métodos void ingresar(…) para ingresar una cantidad (aumenta el saldo).
• Método boolean retirar(…) para retirar una cantidad en la cuenta (reduce el saldo).
Devuelve true si se ha podido realizar la operación, false en caso contrario.
• No se permiten cuentas con un saldo negativo. Tampoco se permite ingresar ni retirar
cantidades negativas. Deberás incluir las comprobaciones pertinentes y mostrar por
pantalla un mensaje de error avisando cuando se intente hacer algo no permitido.
Escribe otra clase con método main y haz varias pruebas para comprobar que los
métodos de la clase funcionan correctamente.
 */
package CCC;

/**
 *
 * @author USER
 */
public class CCC {
    
    //Atributos
    private String numCCC;
    private double saldo;
    
    
    //Constructor
    public CCC(String numCCC, double saldo) {
        this.numCCC = numCCC;
        this.saldo = saldo;
    }

    //Getters

    public String getNumCCC() {
        return numCCC;
    }

    public double getSaldo() {
        return saldo;
    }
    
    //Setters

    public void setNumCCC(String numCCC) {
        this.numCCC = numCCC;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void ingresar (double ingreso){
        if (ingreso>=0) {
        this.saldo = this.saldo+ingreso;
        }
        else System.err.println("ERROR: SE HA INTENTADO INGRESAR UNA CANTIDAD NEGATIVA");
            
    }
    
    public boolean retirar (double retirada){
        if ((this.saldo>=retirada)&&(retirada>0)) {
            this.saldo = this.saldo-retirada;
            return true;
        }
        else {
            if (retirada<0) System.err.println("ERROR: SE INTENTA RETIRAR UNA CANTIDAD NEGATIVA");
            else System.err.println("ERROR: SE HA INTENTADO RETIRAR MÁS DINERO QUE SALDO EXISTENTE");
            return false;
        }
    }
}
