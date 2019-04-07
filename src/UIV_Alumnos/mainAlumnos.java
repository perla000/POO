//EJEMPLO DE CLASE EJECUTABLE ALUMNO
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIV_Alumnos;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class mainAlumnos {
    private static void menu(){
        System.out.println("SELECCIONA LA OPCION DESEADA\n"
                + "1. Ver TODOS los Alumnos\n"
                + "2. Dar de ALTA un Alumno\n"
                + "3. Buscar Alumno\n"
                + "4. Eliminar Alumno\n"
                + "5. Cambiar/Asignar CARGA ACADEMICA a Alumno\n"
                + "6. Salir");
        System.out.print("OPCION: ");
    }
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Alumno> alumnos=new ArrayList<>();
        System.out.println("SISTEMA DE GESTION DE ALUMNOS\n");
        String op,aux;
        do {
            menu();
            op=in.next();
            switch (op) {
                case "1":
                    mostrarA(alumnos);
                    break;
                case "2":
                    agregarA(alumnos);
                    break;
                case "3":
                    System.out.print("\nNUMERO CONTROL: ");
                    aux=in.next();
                    buscarA(alumnos,aux);
                    break;
                case "4":
                    System.out.print("\nNUMERO CONTROL: ");
                    aux=in.next();
                    eliminarA(alumnos,aux);
                    break;
                case "5":
                    System.out.print("\nNUMERO CONTROL: ");
                    aux=in.next();
                    cambCargaA(alumnos,aux);
                    break;
                case "6":
                    System.out.println("CERRANDO SISTEMA\n");
                    break;
                case "26112000":
                    cargaA(alumnos);
                    break;
                default:
                    if(!op.equals("26112000")){
                        System.out.println("ERROR, CARACTER NO VALIDO\n");
                    }
            }
        } while (!op.equals("6"));
    }

    private static void mostrarA(ArrayList<Alumno> alumnos) {
        String nom,nomFinal="";
        System.out.println("\n-----------------------------------------------------------------"
                + "------\n"
                + "NO.CONTROL\tNOMBRE\t\t\t\tTIPO DE ALUMNO\n"
                + "-----------------------------------------------------------------------");
        if(alumnos.isEmpty()){
            System.out.println("SIN ALUMNOS REGISTRADOS");
        }else{
            for (int i = 0; i < alumnos.size(); i++) {
                nom=alumnos.get(i).nombre+" "+alumnos.get(i).apPat+" "+alumnos.get(i).apMat;
                char[] l=nom.toCharArray();
                int restante=30-l.length;
                if(l.length<30){
                    for (int a = 0; a < l.length; a++) {
                        nomFinal+= l[a];
                    }
                    for (int b = 0; b < restante; b++) {
                        nomFinal+=" ";
                    }
                }else{
                    for (int c = 0; c < 30; c++) {
                        nomFinal+= l[c];
                    }
                }
                System.out.println(alumnos.get(i).noControl+"\t"+nomFinal+"\t"+tipoA(alumnos,i));
                nomFinal="";
            }
        }
        
        System.out.println("-------------------------------------------------------------------"
                + "----\n");
    }
    
    private static String tipoA(ArrayList<Alumno> alumnos, int indice) {
        String tipo="";
        if(alumnos.get(indice) instanceof AlumnoLibre){
            tipo="LIBRE";
        }else{
            tipo="PRESCENCIAL";
        }
        return tipo;
    }

    private static void agregarA(ArrayList<Alumno> alumnos) {
        Scanner in=new Scanner(System.in);
        String n,am,ap,gen,calle,col,cd,estado,tipoA;
        int edad=0,dia,mes,anio,num,cp,control,horasD,sem,prom;
        double precioH;
        ArrayList<String> materias=new ArrayList<>();
        System.out.print("\n\t\t[DATOS PERSONALES]\nNOMBRE: ");
        n=in.next();
        System.out.print("APELLIDO PATERNO: ");
        ap=in.next();
        System.out.print("APELLIDO MATERNO: ");
        am=in.next();
        System.out.print("GENERO: ");
        gen=in.next();
        System.out.print("\t\t[FECHA NACIMIENTO]\n"
                + "DIA: ");
        dia=in.nextInt();
        System.out.print("MES: ");
        mes=in.nextInt();
        System.out.print("AÑO: ");
        anio=in.nextInt();
        System.out.print("\t\t[DIRECCION]\n"
                + "CALLE: ");
        in.nextLine();
        calle=in.nextLine();
        System.out.print("NUMERO: ");
        num=in.nextInt();
        System.out.print("COLONIA: ");
        in.nextLine();
        col=in.nextLine();
        System.out.print("CODIGO POSTAL: ");
        cp=in.nextInt();
        System.out.print("CIUDAD: ");
        in.nextLine();
        cd=in.nextLine();
        System.out.print("ESTADO: ");
        estado=in.nextLine();
        System.out.print("\t\t[TIPO DE ALUMNO]\n"
                + "1. LIBRE\t2. PRESCENCIAL \nOPCION: ");
        tipoA=in.next();
        Fecha f=new Fecha(dia,mes,anio);
        Direccion d=new Direccion(calle,num,col,cp,cd,estado);
        control=generarControl(alumnos);
        switch (tipoA) {
            case "1":
                System.out.print("\t\t[ALUMNO LIBRE]\n"
                        + "PRECIO POR HORA: ");
                precioH=in.nextDouble();
                System.out.print("HORAS DIARIAS: ");
                horasD=in.nextInt();
                try{
                    alumnos.add(new AlumnoLibre(precioH,horasD,control,"UNIVERSITARIO",materias,
                            n,ap,am,edad,gen,f,d));
                    System.out.println("ALUMNO REGISTRADO\n\n");
                }catch(Exception e){
                    System.out.println("ERROR, ALGO FUE MAL: "+e+"\n");
                }
                break;
            case "2":
                System.out.print("\t\t[ALUMNO PRESCENCIAL]\n"
                        + "PRECIO POR MES: ");
                precioH=in.nextDouble();
                System.out.print("SEMESTRE: ");
                sem=in.nextInt();
                System.out.print("PROMEDIO: ");
                prom=in.nextInt();
                try{
                    alumnos.add(new AlumnoPrescencial(precioH,sem,prom,control,"UNIVERSITARIO",
                            materias,n,ap,am,edad,gen,f,d));
                    System.out.println("ALUMNO REGISTRADO\n\n");
                }catch(Exception e){
                    System.out.println("ERROR, ALGO FUE MAL: "+e+"\n");
                }
                break;
            default:
                System.out.println("ERROR, CARACTER NO VALIDO\nOPERACION CANCELADA\n");
        }
    }

    private static void buscarA(ArrayList<Alumno> alumnos,String control) {
        boolean existe=false;
        for (int i = 0; i < alumnos.size(); i++) {
            if(control.equals(String.valueOf(alumnos.get(i).noControl))){
                existe=true;
                System.out.print("\n\t\t[DATOS PERSONALES]\n"
                        + "NOMBRE: "+alumnos.get(i).nombre+" "+alumnos.get(i).apPat+" "+
                        alumnos.get(i).apMat+"\n"
                        + "FECHA NACIMIENTO: "+alumnos.get(i).nac+"\n"
                        + "DIRECCION: "+alumnos.get(i).domicilio+"\n\n"
                        + "\t\t[DATOS ESCOLARES]\n"
                        + "MODALIDAD: ");
                if("LIBRE".equals(tipoA(alumnos,i))){
                    AlumnoLibre al=(AlumnoLibre) alumnos.get(i);
                    System.out.print("LIBRE\nPRECIO POR HORA: "+al.getPrecioHora()+"\n"
                            + "HORAS DIARIAS: "+al.getHorasDiarias()+"\n"
                            + "PAGO MENSUAL: "+al.pagoMensual()+"\n");
                }else{
                    AlumnoPrescencial ap=(AlumnoPrescencial) alumnos.get(i);
                    System.out.print("PRESCENCIAL\nCOSTO MENSUAL: "+ap.getCostoMensual()+"\n"
                            + "SEMESTRE: "+ap.getSemestre()+"\n"
                            + "PROMEDIO: "+ap.getPromedio()+"\n"
                            + "PAGO MENSUAL: "+ap.pagoMensual()+"\n");
                }
                System.out.print("\t\t[MATERIAS CURSANDO]\n");
                if("".equals(alumnos.get(i).mostrarAsignaturas())){
                    System.out.print("SIN MATERIAS ASIGNADAS\n\n");
                }else{
                    System.out.print(alumnos.get(i).mostrarAsignaturas()+"\n");
                }
            }
        }
        if(existe==false){
            System.out.println("ALUMNO NO ENCONTRADO\n");
        }
    }

    private static void eliminarA(ArrayList<Alumno> alumnos,String control) {
        boolean existe=false;
        for (int i = 0; i < alumnos.size(); i++) {
            if(control.equals(String.valueOf(alumnos.get(i).noControl))){
                existe=true;
                alumnos.remove(i);
                System.out.println("ALUMNO ELIMINADO\n");
            }
        }
        if(existe==false){
            System.out.println("ALUMNO NO ENCONTRADO\n");
        }
    }
    
    private static void cambCargaA(ArrayList<Alumno> alumnos, String control) {
        boolean existe=false;
        int hrs;
        Scanner in=new Scanner(System.in);
        for (int i = 0; i < alumnos.size(); i++) {
            if(control.equals(String.valueOf(alumnos.get(i).noControl))){
                existe=true;
                if(alumnos.get(i) instanceof AlumnoLibre){
                    System.out.print("NUMERO DE HORAS: ");
                    hrs=in.nextInt();
                    if(hrs>0){
                        alumnos.get(i).listaAsig.clear();
                        AlumnoLibre al=(AlumnoLibre) alumnos.get(i);
                        al.setHorasDiarias(hrs);
                        alumnos.get(i).pedirAsignaturas();
                        System.out.println("CAMBIO REALIZADO CON EXITO\n");
                    }else{
                        System.out.println("ERROR, HORAS NO VALIDAS\n");
                    }
                }else{
                    alumnos.get(i).pedirAsignaturas();
                }
            }
        }
        if(existe==false){
            System.out.println("ALUMNO NO ENCONTRADO\n");
        }
    }

    //METODO QUE CARGA ALUMNOS POR DEFAULT EN EL ARRAYLIST (DESARROLLADOR)
    private static void cargaA(ArrayList<Alumno> alumnos) {
        Fecha f=new Fecha(1,1,2000);
        Direccion d=new Direccion("OASIS QATAR",9818,"PRADERAS",32674,"JUAREZ","CHIHUAHUA");
        ArrayList<String> materias=new ArrayList<>();
        materias.add("PROGRAMACION ORIENTADA A OBJETOS");
        materias.add("QUIMICA");
        materias.add("CONTABILIDAD FINANCIERA");
        materias.add("ALGEBRA LINEAL");
        materias.add("CALCULO INTEGRAL");
        alumnos.add(new AlumnoLibre(20,5,18111962,"UNIVERSITARIO",materias,"JOSHUA","MARTINEZ",
                "ESTRADA",18,"HOMBRE",f,d));
        alumnos.add(new AlumnoPrescencial(350,2,79,18111795,"UNIVERSITARIO",materias,"ALEJANDRA",
                "GALLARDO","CERECEREZ",18,"MUJER",f,d));
        alumnos.add(new AlumnoLibre(15,5,18111883,"UNIVERSITARIO",materias,"EDUARDO","CORNEJO",
                "DURAN",18,"HOMBRE",f,d));
        alumnos.add(new AlumnoPrescencial(200,2,93,18113645,"UNIVERSITARIO",materias,"PERLA",
                "NUÑEZ","SANTELLANES",18,"MUJER",f,d));
        alumnos.add(new AlumnoLibre(30,5,18111963,"UNIVAERSITARIO",materias,"CESAR","ROMERO",
                "HERNANDEZ",18,"HOMBRE",f,d));
        System.out.println("CODIGO DEBUG APLICADO, PRESET DE DATOS LISTO\n");
    }
    
    //METODO QUE GENERA UN NUMERO DE CONTROL ALEATORIO UNICO
    private static int generarControl(ArrayList<Alumno> alumnos){
        Random random = new Random();
        int limiteInferior = 18110000,limiteSuperior = 18119999, limiteSuperiorAbierto = 
                limiteSuperior + 1, numero;
        boolean existe=false;
        do{
            numero = limiteInferior + random.nextInt(limiteSuperiorAbierto - limiteInferior);
            for(int i=0;i<alumnos.size();i++){
                if(numero==alumnos.get(i).noControl){
                    existe=true;
                }
            }
        }while(existe==true);
        return numero;
    }
}