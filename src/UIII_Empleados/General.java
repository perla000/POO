//EJEMPLO DE CLASE EMPLEADO GENERAL
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIII_Empleados;

public class General extends Empleado{
    
    //ATRIBUTOS
    private int horasT;
    private double sueldoHora;

    
    //CONSTRUCTOR
    public General() {
        super();
        horasT=0;
        this.sueldoHora=0;
    }
    public General(int horasT) {
        this.horasT = (horasT>0)?horasT:0;
    }
    public General(double sueldoHora) {
        this.sueldoHora = (sueldoHora>0)?sueldoHora:0;
    }
    public General(int horasT, double sueldoHora) {
        this.horasT = (horasT>0)?horasT:0;
        this.sueldoHora = (sueldoHora>0)?sueldoHora:0;
    }
    public General(int horasT, double sueldoHora, int NoReloj) {
        super(NoReloj);
        this.horasT = (horasT>0)?horasT:0;
        this.sueldoHora = (sueldoHora>0)?sueldoHora:0;
    }
    public General(int horasT, double sueldoHora, int NoReloj, String n, String ap, String am, 
            int e, String g, Fecha nac, Direccion dom) {
        super(NoReloj, n, ap, am, e, g, nac, dom);
        this.horasT = (horasT>0)?horasT:0;
        this.sueldoHora = (sueldoHora>0)?sueldoHora:0;
    }
    public General(int horasT, double sueldoHora, int NoReloj, String n, String ap, String am, 
            int e, String g, int dia, int mes, int anio, String calle, int num, String col, 
            int cp, String cd, String estado) {
        super(NoReloj, n, ap, am, e, g, dia, mes, anio, calle, num, col, cp, cd, estado);
        this.horasT = (horasT>0)?horasT:0;
        this.sueldoHora = (sueldoHora>0)?sueldoHora:0;
    }

    @Override
    public String toString() {
        return "General{" + "horasT=" + horasT + ", sueldoHora=" + sueldoHora + '}';
    }

    //SETTERS
    public void setHorasT(int horasT) {
        this.horasT = (horasT>0)?horasT:0;
    }
    public void setSueldoHora(double sueldoHora) {
        this.sueldoHora = (sueldoHora>0)?sueldoHora:0;
    }
    
    //GETTERS
    public int getHorasT() {
        return horasT;
    }
    public double getSueldoHora() {
        return sueldoHora;
    }
    
    //METODOS
    @Override
    public double salario(int horasT){
        double salario=0;
        if (horasT <= 48) {
            salario = horasT * this.sueldoHora;
        }else if ((horasT -48)<=8){
            salario = (48 * this.sueldoHora) + ((horasT - 48)*(this.sueldoHora * 2));
        }else {
            salario = (48 * this.sueldoHora) + (8 * (this.sueldoHora * 2)) + ((horasT - 56)*
                    (this.sueldoHora * 3));
        }
        return salario;
    }
}