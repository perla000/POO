//EJEMPLO DE CLASE EMPLEADO
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIII_Empleados;

public class Empleado extends Persona{
    
    //ATRIBUTOS
    protected int NoReloj;
    protected final double sueldoBase=250.31;
    
    //CONSTRUCTORES
    public Empleado(){
        super();
        this.NoReloj=100000;
    }
    public Empleado(int NoReloj) {
        this.NoReloj = (NoReloj>100000)?NoReloj:100000;
    }
    public Empleado(int NoReloj, String n, String ap, String am, int e, String g,
            Fecha nac, Direccion dom) {
        super(n, ap, am, e, g, nac, dom);
        this.NoReloj = (NoReloj>100000)?NoReloj:100000;
    }
    public Empleado(int NoReloj, String n, String ap, String am, int e, String g, int dia,
            int mes, int anio, String calle, int num, String col, int cp, String cd,
            String estado) {
        super(n, ap, am, e, g, dia, mes, anio, calle, num, col, cp, cd, estado);
        this.NoReloj = (NoReloj>100000)?NoReloj:100000;
    }

    @Override
    public String toString() {
        return "Empleado{" + "NoReloj=" + NoReloj + ", sueldoBase=" + sueldoBase + '}';
    }
    
    //SETTERS
    public void setNoReloj(int NoReloj) {
        this.NoReloj = this.NoReloj = (NoReloj>100000)?NoReloj:100000;
    }
    
    //GETTERS
    public int getNoReloj() {
        return NoReloj;
    }
    public double getSueldoBase() {
        return sueldoBase;
    }
    
    //METODOS
    public double salario(int piezas){
        return 0;
    }
}