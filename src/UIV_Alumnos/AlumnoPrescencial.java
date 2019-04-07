//EJEMPLO DE CLASE ALUMNO PRESCENCIAL
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIV_Alumnos;

import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoPrescencial extends Alumno{
    
    //ATRIBUTOS
    private double costoMensual;
    private int semestre;
    private double promedio;

    public AlumnoPrescencial() {
        super();
        this.costoMensual=0;
        this.semestre=1;
        this.promedio=0;
    }
    public AlumnoPrescencial(double costoMensual, int semestre, double promedio, int noControl, 
            String nivelAcademico, ArrayList<String> listaAsig, String n, String ap, String am, 
            int e, String g, Fecha nac, Direccion dom) {
        super(noControl, nivelAcademico, listaAsig, n, ap, am, e, g, nac, dom);
        this.costoMensual = (costoMensual>0)?costoMensual:0;
        this.semestre = (semestre>0)?semestre:1;
        this.promedio = (promedio>0)?promedio:0;
    }
    public AlumnoPrescencial(double costoMensual, int semestre, double promedio, int noControl, 
            String nivelAcademico, ArrayList<String> listaAsig, String n, String ap, String am, 
            int e, String g, int dia, int mes, int anio, String calle, int num, String col, 
            int cp, String cd, String estado) {
        super(noControl, nivelAcademico, listaAsig, n, ap, am, e, g, dia, mes, anio, calle, 
                num, col, cp, cd, estado);
        this.costoMensual = (costoMensual>0)?costoMensual:0;
        this.semestre = (semestre>0)?semestre:1;
        this.promedio = (promedio>0)?promedio:0;
    }
    
    @Override
    public String toString() {
        return "AlumnoPrescencial costoMensual=" + this.costoMensual + ", semestre=" + 
                this.semestre + ", promedio=" + this.promedio;
    }
    
    //SETTERS
    public void setCostoMensual(double costoMensual) {
        this.costoMensual = (costoMensual>0)?costoMensual:0;
    }
    public void setSemestre(int semestre) {
        this.semestre = (semestre>0)?semestre:1;
    }
    public void setPromedio(double promedio) {
        this.promedio = (promedio>0)?promedio:0;
    }
    
    //GETTERS
    public double getCostoMensual() {
        return costoMensual;
    }
    public int getSemestre() {
        return semestre;
    }
    public double getPromedio() {
        return promedio;
    }

    //IMPLEMENTACION DE METODOS ABSTRACTOS
    @Override
    public double pagoMensual() {
        double costo,desc;
        costo=this.costoMensual;
        if(this.promedio>90){
            desc=this.costoMensual*0.5;
        }else if(this.promedio>80){
            desc=this.costoMensual*0.2;
        }else{
            desc=0;
        }
        return (costo-desc);
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
    @Override
    public void pedirAsignaturas() {
        Scanner teclado= new Scanner(System.in);
        String asignatura="";
        int hrs;
        System.out.print("NUMERO DE HORAS: ");
        hrs=teclado.nextInt();
        if(hrs>0){
            this.listaAsig.clear();
            System.out.println("\n\t\t[ASIGNACION/CAMBIO DE MATERIAS]");
            System.out.println("ALUMNO: "+this.nombre+" "+this.apPat+" "+this.apMat);
            System.out.print("Horas diarias:"+hrs+"\n");
            for(int i=0; i<hrs; i++){
                System.out.print("MATERIA " + (i+1) + ":");
                if(i==0){asignatura=teclado.nextLine();}
                asignatura=teclado.nextLine();
                this.listaAsig.add(asignatura);
            }
            System.out.println("CAMBIO REALIZADO CON EXITO\n");
        }else{
            System.out.println("ERROR, HORAS NO VALIDAS\n");
        }
    }
}