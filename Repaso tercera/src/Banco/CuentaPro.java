package Banco;

public class CuentaPro extends CuentaCorriente {

    public CuentaPro(String titular, double saldo) {
        super(titular, saldo);
        this.comisionOperacion = 0;
        this.comisionMensual = 100;
        this.interesesMensual = 0;
    }
    
    @Override
    public boolean ingresar (double dinero){
        if (dinero>=0) {
            this.saldo+=dinero;
            return true;
        } else {return false;
          }
    }
    
    @Override
    public boolean retirar (double dinero){
        if (this.saldo >= dinero){
            this.saldo-=dinero;
            return true;
        } else { return false;
          }
    }
    
    @Override
    public void actualizarMensualidad(){
        this.saldo+= (this.saldo*this.getComisionMensual()/100);
        this.saldo-= this.comisionMensual;
    }
    
}
