//EJEMPLO DE CLASE EMPLEADO POR HORA
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIV_Empleados;

public class PorHora extends Empleado{
    
    //ATRIBUTOS
    private int horasT;
    private double sueldoPH;
    
    //CONSTRUCTORES
    public PorHora(){
        super();
        this.horasT = 0;
        this.sueldoPH=0;
    }
    public PorHora(int horasT, double sueldoPH) {
        super();
        this.horasT = (horasT>0)?horasT:0;
        this.sueldoPH = (sueldoPH)>0?sueldoPH:0;
    }
    public PorHora(int horasT, double sueldoPH, int NoReloj) {
        super(NoReloj);
        this.horasT = (horasT>0)?horasT:0;
        this.sueldoPH = (sueldoPH)>0?sueldoPH:0;
    }
    public PorHora(int horasT, double sueldoPH, int NoReloj, String n, String ap, String am,
            int e, String g, Fecha nac, Direccion dom) {
        super(NoReloj, n, ap, am, e, g, nac, dom);
        this.horasT = (horasT>0)?horasT:0;
        this.sueldoPH = (sueldoPH)>0?sueldoPH:0;
    }
    public PorHora(int horasT, double sueldoPH, int NoReloj, String n, String ap, String am, 
            int e, String g, int dia, int mes, int anio, String calle, int num, String col, 
            int cp, String cd, String estado) {
        super(NoReloj, n, ap, am, e, g, dia, mes, anio, calle, num, col, cp, cd, estado);
        this.horasT = (horasT>0)?horasT:0;
        this.sueldoPH = (sueldoPH)>0?sueldoPH:0;
    }

    @Override
    public String toString() {
        return "PorHora{" + "horasT=" + horasT + ", sueldoPH=" + sueldoPH + '}';
    }
    
    //SETTERS
    public void setHorasT(int horasT) {
        this.horasT = (horasT>0)?horasT:0;
    }
    public void setSueldoPH(int sueldoPH) {
        this.sueldoPH = (sueldoPH)>0?sueldoPH:0;
    }
    
    //GETTERS
    public int getHorasT() {
        return horasT;
    }
    public double getSueldoPH() {
        return sueldoPH;
    }
    
    //METODOS
    @Override
    public double salario(double horasT){
        return (horasT*this.sueldoPH)+this.sueldoBase;
    }
}