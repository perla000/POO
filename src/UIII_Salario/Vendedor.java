//EJEMPLO DE CLASE EMPLEADO VENDEDOR
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIII_Salario;

public class Vendedor extends Empleado{
    
    //ATRIBUTOS
    private double ventas;
    private final double comisionV=0.05;
    
    //CONSTRUCTORES
    public Vendedor(){
        super();
        this.ventas=0;
    }
    public Vendedor(double ventas) {
        super();
        this.ventas = (ventas>0)?ventas:0;
    }
    public Vendedor(double ventas, int NoReloj) {
        super(NoReloj);
        this.ventas = (ventas>0)?ventas:0;
    }
    public Vendedor(double ventas, int NoReloj, String n, String ap, String am, int e, String g, 
            Fecha nac, Direccion dom) {
        super(NoReloj, n, ap, am, e, g, nac, dom);
        this.ventas = (ventas>0)?ventas:0;
    }
    public Vendedor(double ventas, int NoReloj, String n, String ap, String am, int e, String g, 
            int dia, int mes, int anio, String calle, int num, String col, int cp, String cd, 
            String estado) {
        super(NoReloj, n, ap, am, e, g, dia, mes, anio, calle, num, col, cp, cd, estado);
        this.ventas = (ventas>0)?ventas:0;
    }
    
    @Override
    public String toString() {
        return "Vendedor{" + "ventas=" + ventas + ", comisionV=" + comisionV + '}';
    }
    
    //SETTERS
    public void setVentas(double ventas) {
        this.ventas = (ventas>0)?ventas:0;
    }
    
    //GETTERS
    public double getVentas() {
        return ventas;
    }
    public double getComisionV() {
        return comisionV;
    }
    
    //METODOS
    public double salario(double ventas){
        System.out.println("COMISION DE: "+(ventas*this.comisionV));
        return this.sueldoBase+(ventas*this.comisionV);
    }
}
