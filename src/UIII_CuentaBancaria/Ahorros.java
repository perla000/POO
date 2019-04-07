//DEFINICION DE CLASE CUENTA DE AHORROS
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIII_CuentaBancaria;

public class Ahorros extends CuentaBancaria{
    
    //ATRIBUTOS
    private static final double interes=0.02;

    //ATRIBUTOS
    public Ahorros() {
        super();
    }
    public Ahorros(double saldo) {
        super(saldo);
    }
    
    @Override
    public String toString(){
        return "Saldo Cuenta: "+this.getSaldo();
    }
    
    //GETTERS
    public static double getInteres() {
        return interes;
    }
    
    //METODOS
    public void calcularInteres(){
        this.setSaldo((this.getSaldo()*Ahorros.interes)+this.getSaldo());
    }
    public void retiro(double cantidad){
        if(cantidad>this.getSaldo()){
            System.out.println("FONDOS INSUFICIENTES");
        }else{
            System.out.println("RETIRO EXITOSO");
            this.setSaldo(this.getSaldo()-cantidad);
        }
    }
}