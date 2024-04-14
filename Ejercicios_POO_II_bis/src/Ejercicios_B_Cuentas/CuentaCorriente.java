// Permite tener cualquier saldo positivo (nunca negativo).
// Cada vez que se realiza una operación (ingreso o retirada), cobra 1€ de la cuenta.
// Al actualizar mensualidad da un 1% de intereses y cobra 5€ de mantenimiento.

package Ejercicios_B_Cuentas;

class CuentaCorriente  {
    
    String titular;
    double saldo;
    protected final double comisionOperacion = 1;
    protected final double comisionMensual = 5;
    protected final double interesMensual = 1;

    public CuentaCorriente(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public boolean setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
            return true;
        }
        else return false;
    }
    
    public boolean ingresar(double cantidad){
        if (cantidad>=0) {
            setSaldo(this.saldo+=cantidad);
            setSaldo(this.saldo-=comisionOperacion);
            return true;
        }
        else return false;
    }
    
    public boolean retirar(double cantidad){
        double sal = getSaldo();
        sal = sal - cantidad - comisionOperacion;
        if ((cantidad>=0)||(sal>=0)){
            this.saldo = sal;
            return true;
        }
        else return false;
    }
    
    public void actualizarMensualidad(){
        double sal = getSaldo();
        sal = sal - ((sal * interesMensual) / 100);
        this.saldo = sal;
        this.saldo -= comisionMensual; //La comisión se carga aunque deje el saldo negativo
    }
    

    
}
