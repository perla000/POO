//EJEMPLO DE CLASE ALUMNO LIBRE
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIV_Alumnos;

import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoLibre extends Alumno{
    
    //ATRIBUTOS
    private double precioHora;
    private int horasDiarias;

    //CONSTRUCTORES
    public AlumnoLibre() {
        super();
        this.precioHora=0;
        this.horasDiarias=0;
    }
    public AlumnoLibre(double precioHora, int horasDiarias, int noControl, String nivelAcademico, 
            ArrayList<String> listaAsig, String n, String ap, String am, int e, String g, 
            Fecha nac, Direccion dom) {
        super(noControl, nivelAcademico, listaAsig, n, ap, am, e, g, nac, dom);
        this.precioHora = (precioHora>0)?precioHora:0;
        this.horasDiarias = (horasDiarias>0)?horasDiarias:0;
    }
    public AlumnoLibre(double precioHora, int horasDiarias, int noControl, String nivelAcademico, 
            ArrayList<String> listaAsig, String n, String ap, String am, int e, String g, 
            int dia, int mes, int anio, String calle, int num, String col, int cp, String cd, 
            String estado) {
        super(noControl, nivelAcademico, listaAsig, n, ap, am, e, g, dia, mes, anio, calle, 
                num, col, cp, cd, estado);
        this.precioHora = (precioHora>0)?precioHora:0;
        this.horasDiarias = (horasDiarias>0)?horasDiarias:0;
    }
    
    @Override
    public String toString() {
        return "AlumnoLibre precioHora=" + this.precioHora + ", horasDiarias=" + this.horasDiarias;
    }
    
    //SETTERS
    public void setPrecioHora(double precioHora) {
        this.precioHora = (precioHora>0)?precioHora:0;
    }
    public void setHorasDiarias(int horasDiarias) {
        this.horasDiarias = (horasDiarias>0)?horasDiarias:0;
    }
    
    //GETTERS
    public double getPrecioHora() {
        return precioHora;
    }
    public int getHorasDiarias() {
        return horasDiarias;
    }
    
    //IMPLEMENTACION DE METODOS ABSTRACTOS
    @Override
    public double pagoMensual() {
        return (this.precioHora*this.horasDiarias*30);
    }
    @Override
    public String mostrarAsignaturas() {
        String asignaturas="";
        for (String asig1 : this.listaAsig) {
            if (asig1 != null) {
                asignaturas += asig1 + "\n";
            }
        }
        return asignaturas;
    }
    
    //METODOS
    @Override
    public void pedirAsignaturas(){
        Scanner teclado= new Scanner(System.in);
        String asignatura="";
        System.out.println("\t\t[ASIGNACION/CAMBIO DE MATERIAS]");
        System.out.println("ALUMNO: "+this.nombre+" "+this.apPat+" "+this.apMat);
        System.out.println("Horas diarias:"+this.horasDiarias);
        for(int i=0; i<this.horasDiarias; i++){
            System.out.print("MATERIA " + (i+1) + ":");
            asignatura=teclado.nextLine();
            this.listaAsig.add(asignatura);
        }
    }
}