//EJEMPLO DE CLASE ABSTRACTA ALUMNO
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIV_Alumnos;

import java.util.ArrayList;

public abstract class Alumno extends Persona{
    
    //ATRIBUTOS
    protected int noControl;
    protected String nivelAcademico;
    protected ArrayList<String> listaAsig;

    //CONSTRUCTORES
    public Alumno() {
        super();
        this.noControl=18110000;
        this.nivelAcademico="N/D";
        this.listaAsig=null;
    }
    public Alumno(int noControl, String nivelAcademico, ArrayList<String> listaAsig, String n, 
            String ap, String am, int e, String g, Fecha nac, Direccion dom) {
        super(n, ap, am, e, g, nac, dom);
        this.noControl = (noControl>=18110000)?noControl:18110000;
        this.nivelAcademico = nivelAcademico;
        this.listaAsig = listaAsig;
    }
    public Alumno(int noControl, String nivelAcademico, ArrayList<String> listaAsig, String n, 
            String ap, String am, int e, String g, int dia, int mes, int anio, String calle, 
            int num, String col, int cp, String cd, String estado) {
        super(n, ap, am, e, g, dia, mes, anio, calle, num, col, cp, cd, estado);
        this.noControl = (noControl>=18110000)?noControl:18110000;
        this.nivelAcademico = nivelAcademico;
        this.listaAsig = listaAsig;
    }

    @Override
    public String toString() {
        return "Alumno: noControl=" + this.noControl + ", nivelAcademico=" + this.nivelAcademico;
    }
    
    //SETTER
    public void setNoControl(int noControl) {
        this.noControl = (noControl>=18110000)?noControl:18110000;
    }
    public void setNivelAcademico(String nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }
    public void setListaAsig(ArrayList<String> listaAsig) {
        this.listaAsig = listaAsig;
    }
    
    //GETTER
    public int getNoControl() {
        return noControl;
    }
    public String getNivelAcademico() {
        return nivelAcademico;
    }
    public ArrayList<String> getListaAsig() {
        return listaAsig;
    }

    
    //METODOS ABSTRACTOS
    public abstract double pagoMensual();
    public abstract String mostrarAsignaturas();
    public abstract void pedirAsignaturas();
}