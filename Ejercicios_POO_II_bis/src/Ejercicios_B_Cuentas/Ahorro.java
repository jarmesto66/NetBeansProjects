// Solo permite hacer 3 operaciones (ingresar o retirar) al mes.
// Al actualizar mensualidad da el 10% de intereses y no cobra mantenimiento.

package Ejercicios_B_Cuentas;

class Ahorro extends CuentaCorriente {
    
    protected final int MAX_OPERACIONES = 3;
    protected int contadorOperaciones;
    protected final double interesMensual = 10;

    public Ahorro(String titular, double saldo) {
        super(titular, saldo);
        this.contadorOperaciones = MAX_OPERACIONES;
    }

    public int getContadorOperaciones() {
        return contadorOperaciones;
    }

    public void setContadorOperaciones(int contadorOperaciones) {
        this.contadorOperaciones = contadorOperaciones;
    }

    @Override
    public String toString() {
        return "Ahorro{" + "MAX_OPERACIONES=" + MAX_OPERACIONES + ", contadorOperaciones=" + contadorOperaciones + ", interesMensual=" + interesMensual + '}';
    }
    
    
    
    @Override
    public boolean ingresar(double cantidad){
        if ((cantidad>=0)||(contadorOperaciones<4)) {
            setSaldo(super.saldo+=cantidad);
            this.contadorOperaciones--;
            return true;
        }
        else return false;
    }
    
    @Override
    public boolean retirar(double cantidad){
        double sal = getSaldo();
        if ((cantidad>=0)&&(sal>=cantidad)&&(contadorOperaciones>0)){
            this.saldo = sal - cantidad;
            contadorOperaciones--;
            return true;
        }
        else return false;
    }
    
    @Override
    public void actualizarMensualidad(){
        double sal = getSaldo();
        sal = sal + ((sal * interesMensual) / 100);
        this.saldo = sal;
        this.saldo -= comisionMensual; //La comisión se carga aunque deje el saldo negativo
        this.contadorOperaciones = 3;
    }
    
}
