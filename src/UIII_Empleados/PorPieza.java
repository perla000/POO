//EJEMPLO DE CLASE EMPLEADO POR PIEZA
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIII_Empleados;

public class PorPieza extends Empleado{
    
    //ATRIBUTOS
    private int piezas;
    private double pagoPieza;
    
    //CONSTRUCTORES
    public PorPieza(){
        super();
        piezas=0;
        pagoPieza=0;
    }
    public PorPieza(int piezas, double pagoPieza) {
        super();
        this.piezas = (piezas>0)?piezas:0;
        this.pagoPieza = (pagoPieza>0)?pagoPieza:0;
    }
    public PorPieza(int piezas, double pagoPieza, int NoReloj) {
        super(NoReloj);
        this.piezas = (piezas>0)?piezas:0;
        this.pagoPieza = (pagoPieza>0)?pagoPieza:0;
    }
    public PorPieza(int piezas, double pagoPieza, int NoReloj, String n, String ap, String am, 
            int e, String g, Fecha nac, Direccion dom) {
        super(NoReloj, n, ap, am, e, g, nac, dom);
        this.piezas = (piezas>0)?piezas:0;
        this.pagoPieza = (pagoPieza>0)?pagoPieza:0;
    }
    public PorPieza(int piezas, double pagoPieza, int NoReloj, String n, String ap, String am, 
            int e, String g, int dia, int mes, int anio, String calle, int num, String col, 
            int cp, String cd, String estado) {
        super(NoReloj, n, ap, am, e, g, dia, mes, anio, calle, num, col, cp, cd, estado);
        this.piezas = (piezas>0)?piezas:0;
        this.pagoPieza = (pagoPieza>0)?pagoPieza:0;
    }

    @Override
    public String toString() {
        return "PorPieza{" + "piezas=" + piezas + ", pagoPieza=" + pagoPieza + '}';
    }
    
    //SETTERS
    public void setPiezas(int piezas) {
        this.piezas = (piezas>0)?piezas:0;
    }
    public void setPagoPieza(double pagoPieza) {
        this.pagoPieza = (pagoPieza>0)?pagoPieza:0;
    }
    
    //GETTERS
    public int getPiezas() {
        return this.piezas;
    }
    public double getPagoPieza() {
        return this.pagoPieza;
    }
    
    //METODOS
    @Override
    public double salario(int piezas){
        return (piezas*this.pagoPieza)+this.sueldoBase;
    }
}
