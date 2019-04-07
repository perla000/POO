//DEFINICION DE CLASE CUENTA BANCARIA
//MARTINEZ ESTRADA JOSHUA
//18111962

package UII_CuentaBancaria;

public class CuentaBancaria {
    
    //ATRIBUOS DE LA CLASE
    private int noCuenta;
    private double saldo;
    private static int num=1000;
    
    //CONSTRUCTOR POR OMISION
    public CuentaBancaria(){
        num++;
        this.noCuenta=num;
        this.saldo=0.0;
    }
    
    //CONSTRUCTOR POR DEFINICION
    public CuentaBancaria(double saldo){
        num++;
        this.noCuenta=num;
        this.saldo=(saldo>0)?saldo:0;
    }
    
    @Override
    public String toString(){
        return "\nNo.Cuenta: "+this.noCuenta+"\nSaldo: "+this.saldo+"\n";
    }
    
    //SETTERS DE LA CLASE
    public void setNoCuenta(int noCuenta) {
        this.noCuenta = noCuenta;
    }
    public void setSaldo(double saldo) {
        this.saldo=(saldo>0)?saldo:0;
    }
    
    //GETTERS DE LA CLASE
    public int getNoCuenta() {
        return noCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public static int getNum() {
        return num;
    }
    
    
    //METODOS DE LA CLASE
    public double depositar(double deposito){
        double cantidad=(deposito>0)?deposito:0;
        this.saldo+=cantidad;
        return this.saldo;
    }
    public void retirar(double ret){
        double cantidad=(ret<=this.saldo)?ret:0;
        System.out.printf("La cantidad a retirar es %.4f",cantidad);
        this.saldo-=cantidad;
        System.out.println("\nEl retiro se ha realizado");
    }
}
