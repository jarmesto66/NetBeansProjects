package Banco;

public class CuentaAhorro extends CuentaCorriente {
    
    private int MAX_OPERACIONES;
    private int contadorOperaciones;

    public CuentaAhorro(String titular, double saldo) {
        super(titular, saldo);
        this.comisionMensual = 0;
        this.interesesMensual = 10;
        this.MAX_OPERACIONES = 3;
        this.contadorOperaciones = 0;
    }
    
    @Override
        public boolean ingresar (double dinero){
        if ((dinero>=0)&&(this.MAX_OPERACIONES>0)) {
            this.saldo+=dinero;
            this.MAX_OPERACIONES-=1;
            return true;
        } else {return false;
          }
    }
    
    @Override
    public boolean retirar (double dinero){
        if ((this.saldo >= dinero)&&(this.MAX_OPERACIONES>0)){
            this.saldo-=dinero;
            this.MAX_OPERACIONES-=1;
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
