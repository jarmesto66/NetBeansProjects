package Banco;

public class CuentaCorriente {
    
    String titular;
    double saldo;
    double comisionOperacion;
    double comisionMensual;
    double interesesMensual;

    public CuentaCorriente(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
        this.comisionOperacion = 1;
        this.comisionMensual = 5;
        this.interesesMensual = 1;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getComisionOperacion() {
        return comisionOperacion;
    }

    public double getComisionMensual() {
        return comisionMensual;
    }

    public double getInteresesMensual() {
        return interesesMensual;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public boolean ingresar (double dinero){
        if (dinero>=0) {
            this.saldo+=dinero;
            return true;
        } else {return false;
          }
    }
    
    public boolean retirar (double dinero){
        if (this.saldo >= dinero){
            this.saldo-=dinero;
            return true;
        } else { return false;
          }
    }
    
    public void actualizarMensualidad(){
        this.saldo+= (this.saldo*this.getComisionMensual()/100);
        this.saldo-= this.comisionMensual;
    }
    
}
