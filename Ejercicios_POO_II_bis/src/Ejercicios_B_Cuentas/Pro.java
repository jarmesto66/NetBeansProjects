// No se cobra por hacer una operación.
// Al actualizar mensualidad da el 0% de intereses y cobra 100€ de mantenimiento

package Ejercicios_B_Cuentas;

class Pro extends CuentaCorriente {
    
    protected final double comisionMensual = 100;

    public Pro(String titular, double saldo) {
        super(titular, saldo);
    }
    
    @Override
    public boolean ingresar(double cantidad){
        if (cantidad>=0) {
            setSaldo(this.saldo+=cantidad);
            return true;
        }
        else return false;
    }
    
    @Override
    public boolean retirar(double cantidad){
        double sal = getSaldo();
        sal = sal - cantidad;
        if ((cantidad>=0)||(sal>=0)){
            this.saldo = sal;
            return true;
        }
        else return false;
    }

    @Override
    public void actualizarMensualidad(){
        this.saldo -= comisionMensual; //La comisión se carga aunque deje el saldo negativo
    }

    @Override
    public String toString() {
        return "Pro{" + "comisionMensual=" + comisionMensual + '}';
    }

    
}
