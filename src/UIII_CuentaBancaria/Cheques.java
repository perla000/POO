//DEFINICION DE CLASE CUENTA DE CHEQUES
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIII_CuentaBancaria;

public class Cheques extends CuentaBancaria{
    
    //ATRIBUTOS
    private final static double minReq=3000;
    private final static double comision=300;
    private final static double multa=800;

    //ATRIBUTOS
    public Cheques() {
        super();
    }
    public Cheques(double saldo) {
        super(saldo);
    }

    @Override
    public String toString(){
        return "Saldo Cuenta: "+this.getSaldo();
    }
    
    //GETTERS
    public static double getMinReq() {
        return minReq;
    }
    public static double getComision() {
        return comision;
    }
    public static double getMulta() {
        return multa;
    }
    
    //METODOS
    public void cambiarCheque(double cantidadCheque){
        if(cantidadCheque>this.getSaldo()){
            System.out.println("FONDOS INSUFICIENTES, SE APLICARA MULTA DE 800");
            this.setSaldo(this.getSaldo()-800);
        }else{
            System.out.println("RETIRO EXITOSO");
            this.setSaldo(this.getSaldo()-cantidadCheque);
        }
    }
    public void finMes(){
        if(this.getSaldo()<Cheques.minReq){
            this.setSaldo(this.getSaldo()-(300+(300*0.08)));
        }
    }
}