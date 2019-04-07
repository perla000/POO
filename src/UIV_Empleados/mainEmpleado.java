//EJEMPLO DE CLASE EJECUTABLE SALARIOS
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIV_Empleados;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class mainEmpleado {
    private static void menu(){
        System.out.println("SISTEMA DE SALARIOS\n"
                + "1. Mostrar Empleados\n"
                + "2. Mostar Empleados por Tipo\n"
                + "3. Buscar Empleado\n"
                + "4. Registrar Empleado\n"
                + "5. Eliminar Empleado\n"
                + "6. Calcular Salario de Empleado\n"
                + "7. Salir");
        System.out.print("OPCION: ");
    }
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Empleado> empleados=new ArrayList<>();
        String op,reloj;
        do {
            reloj=null;
            menu();
            op=in.next();
            switch (op) {
                case "1":
                    mostrarEmpleados(empleados);
                    break;
                case "2":
                    mostrarEmpleadosSeccion(empleados);
                    break;
                case "3":
                    System.out.print("\nNUMERO RELOJ: ");
                    reloj=in.next();
                    mostrarEmpleado(empleados,reloj);
                    break;
                case "4":
                    registrarEmpleado(empleados);
                    break;
                case "5":
                    System.out.print("\nNUMERO RELOJ: ");
                    reloj=in.next();
                    eliminarEmpleado(empleados,reloj);
                    break;
                case "6":
                    System.out.print("\nNUMERO RELOJ: ");
                    reloj=in.next();
                    salarios(empleados,reloj);
                    break;
                case "7":
                    System.out.println("CERRANDO SISTEMA\n");
                    break;
                case "2611":
                    demo(empleados);
                    System.out.println("CODIGO DEPURACION APLICADO, PRESET DE DATOS CARGADO\n");
                    break;
                default:
                    System.out.println("ERROR, CARACTER INVALIDO\n");
            }
        } while (!"7".equals(op));
        
    }
    
    //FUNCION QUE RETORNA EL TIPO DE EMPLEADO (STRING)
    private static String tipoEmpleado(ArrayList<Empleado> empleados, int indice){
        String tipo="";
        if(empleados.get(indice) instanceof General){
            tipo="GENERAL";
        }else if(empleados.get(indice) instanceof PorHora){
            tipo="POR HORA";
        }else if(empleados.get(indice) instanceof PorPieza){
            tipo="POR PIEZA";
        }else{
            tipo="VENDEDOR";
        }
        return tipo;
    }
    
    //FUNCION QUE MUESTRA TODOS LOS EMPLEADOS
    private static void mostrarEmpleados(ArrayList<Empleado> empleados){
        String nom,nomFinal="";
        System.out.print("------------------------------------------------------------\n"
                + "NUMERO RELOJ\tNOMBRE\t\t\t\tTIPO DE PAGA\n"
                + "------------------------------------------------------------\n");
        if(empleados.isEmpty()){
            System.out.println("SIN EMPLEADOS REGISTRADOS");
        }else{
            for (int i = 0; i < empleados.size(); i++) {
                nom=empleados.get(i).nombre+" "+empleados.get(i).apPat+" "+empleados.get(i).apMat;
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
                System.out.println(empleados.get(i).NoReloj+"\t"+nomFinal+"\t"+tipoEmpleado
        (empleados,i));
                nomFinal="";
            }
        }
        System.out.println("------------------------------------------------------------\n");
    }
    
    //FUNCION QUE BUSCA UN EMPLEADO E IMPRIME SUS DATOS PERSONALES
    private static void mostrarEmpleado(ArrayList<Empleado> empleados,String reloj){
            boolean existe=false;
            for (int i = 0; i < empleados.size(); i++) {
                if(reloj.equals(String.valueOf(empleados.get(i).NoReloj))){
                    existe=true;
                    System.out.print("\n\t\t[DATOS PERSONALES]\n"
                            + "NOMBRE: "+empleados.get(i).nombre+" "+empleados.get(i).apPat+" "+
                            empleados.get(i).apMat+"\n"
                            + "FECHA NACIMIENTO: "+empleados.get(i).nac+"\n"
                            + "DIRECCION: "+empleados.get(i).domicilio+"\n\n"
                            + "\t\t[DATOS SALARIALES]\n"
                            + "SUELDO BASE: ");
                    if(tipoEmpleado(empleados,i).equals("GENERAL")){
                        System.out.print("Sin sueldo Base\n");
                    }else{
                        System.out.print(empleados.get(i).sueldoBase+"\n");
                    }
                    System.out.println("TIPO DE PAGA: "+tipoEmpleado(empleados,i)+"\n");
                }
            }
            if(existe==false){
                System.out.println("EMPLEADO NO ENCONTRADO\n");
            }
    }
    
    //FUNCION QUE REGISTRA UN EMPLEADO EN EL ARRAYLIST 
    private static void registrarEmpleado(ArrayList<Empleado> empleados){
        Scanner in=new Scanner(System.in);
        String n,am,ap,gen,calle,col,cd,estado,op;
        int edad,dia,mes,anio,num,cp,reloj;
        double pagoU;
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
        System.out.print("\n\t\t[DATOS SALARIALES]\nTipo de Paga: \n"
                + "1. Vendedor\n"
                + "2. Por Hora\n"
                + "3. Por Pieza\n"
                + "4. General\n"
                + "OPCION:");
        op=in.next();
        edad=2019-anio;
        reloj=generarReloj(empleados);
        switch (op) {
            case "1":
                empleados.add(new Vendedor(0,reloj,n,ap,am,edad,gen,dia,mes,anio,calle,num,col,cp,
                        cd,estado));
                System.out.println("EMPLEADO REGISTRADO\nNUMERO RELOJ ASIGNADO: "+reloj+"\n");
                break;
            case "2":
                System.out.print("PAGO POR HORA: ");
                pagoU=in.nextDouble();
                empleados.add(new PorHora(0,pagoU,reloj,n,ap,am,edad,gen,dia,mes,anio,calle,num,col,
                        cp,cd,estado));
                System.out.println("EMPLEADO REGISTRADO\nNUMERO RELOJ ASIGNADO: "+reloj+"\n");
                break;
            case "3":
                System.out.print("PAGO POR PIEZA: ");
                pagoU=in.nextDouble();
                empleados.add(new PorPieza(0,pagoU,reloj,n,ap,am,edad,gen,dia,mes,anio,calle,num,col
                        ,cp,cd,estado));
                System.out.println("EMPLEADO REGISTRADO\nNUMERO RELOJ ASIGNADO: "+reloj+"\n");
                break;
            case "4":
                System.out.print("PAGO POR HORA:");
                pagoU=in.nextDouble();
                empleados.add(new General(0,pagoU,reloj,n,ap,am,edad,gen,dia,mes,anio,calle,num,col,
                        cp,cd,estado));
                System.out.println("EMPLEADO REGISTRADO\nNUMERO RELOJ ASIGNADO: "+reloj+"\n");
                break;
            default:
                System.out.println("ERROR, OPCION NO VALIDA\nOPERACION CANCELADA\n");
        }
    }
    
    //FUNCION QUE GENERA UN NUMERO DE RELOJ ALEATORIO
    private static int generarReloj(ArrayList<Empleado> empleado){
        Random random = new Random();
        int limiteInferior = 10000000,limiteSuperior = 10009999, limiteSuperiorAbierto = 
                limiteSuperior + 1, numero;
        boolean existe=false;
        do{
            numero = limiteInferior + random.nextInt(limiteSuperiorAbierto - limiteInferior);
            for(int i=0;i<empleado.size();i++){
                if(numero==empleado.get(i).NoReloj){
                    existe=true;
                }
            }
        }while(existe==true);
        return numero;
    }

    //FUNCION QUE ELIMINA UN EMPLEADO EN BASE A SU NUMERO DE RELOJ
    private static void eliminarEmpleado(ArrayList<Empleado> empleados, String reloj) {
        boolean existe=true;
        for(int i=0;i<empleados.size();i++){
            if(reloj.equals(String.valueOf(empleados.get(i).NoReloj))){
                empleados.remove(i);
                System.out.println("EMPLEADO ELIMINADO\n");
                existe=false;
            }
        }
        if(existe){
            System.out.println("ERROR, EMPLEADO NO ENCONTRADO\n");
        }
    }

    //FUNCION ENCARGADA DE CALCULAR EL SALARIO
    private static void salarios(ArrayList<Empleado> empleados, String reloj) {
        Scanner in=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("#.00");
        int indice=0,aux;
        double ventas,total=0;
        if(empleados.isEmpty()){
            System.out.println("EMPLEADO NO ENCONTRADO\n");
        }else{
            for(int i=0;i<empleados.size();i++){
                if(reloj.equals(String.valueOf(empleados.get(i).NoReloj))){
                    indice=i;
                }
            }
            switch (tipoEmpleado(empleados,indice)) {
                case "VENDEDOR":
                    System.out.println("ESQUEMA DE SALARIO: VENDEDOR");
                    System.out.print("TOTAL DE VENTAS: ");
                    ventas=in.nextDouble();
                    total=empleados.get(indice).salario(ventas);
                    break;
                case "POR HORA":
                    System.out.println("ESQUEMA DE SALARIO: POR HORA");
                    System.out.print("HORAS: ");
                    aux=in.nextInt();
                    total=empleados.get(indice).salario(aux);
                    break;
                case "POR PIEZA":
                    System.out.println("ESQUEMA DE SALARIO: POR PIEZA");
                    System.out.print("PIEZAS: ");
                    aux=in.nextInt();
                    total=empleados.get(indice).salario(aux);
                    break;
                case "GENERAL":
                    System.out.println("ESQUEMA DE SALARIO: GENERAL");
                    System.out.print("HORAS: ");
                    aux=in.nextInt();
                    total=empleados.get(indice).salario(aux);
                    break;
            }
            System.out.println("El salario del empleado es: "+df.format(total)+"\n");
        }
    }
    
    //FUNCION QUE MUESTRA TODOS LOS EMPLEADOS PERO AGRUPADOS POR SECCION
    private static void mostrarEmpleadosSeccion(ArrayList<Empleado> empleados) {
        String[] tipos=new String[]{"VENDEDOR","POR PIEZA","POR HORA","GENERAL"};
        String nom,nomFinal="";
        System.out.print("------------------------------------------------------------\n"
                + "NUMERO RELOJ\tNOMBRE\t\t\t\tTIPO DE PAGA\n"
                + "------------------------------------------------------------\n");
        if(empleados.isEmpty()){
            System.out.println("SIN EMPLEADOS REGISTRADOS");
        }else{
            for (int j = 0; j < 4; j++) {
                for (int i = 0; i < empleados.size(); i++) {
                    if(tipoEmpleado(empleados,i).equals(tipos[j])){
                        nom=empleados.get(i).nombre+" "+empleados.get(i).apPat+" "+empleados.get(i)
                                .apMat;
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
                        System.out.println(empleados.get(i).NoReloj+"\t"+nomFinal+"\t"+tipoEmpleado
        (empleados,i));
                        nomFinal="";
                    }
                }
            }
        }
        System.out.println("------------------------------------------------------------\n");
    }
    
    //FUNCION QUE LLENA EL ARRAYLIST CON DATOS DE EJEMPLO
    private static void demo(ArrayList<Empleado> empleados){
        empleados.add(new Vendedor(0,18111962,"RICARDO","MARTINEZ","ESTRADA",20,"HOMBRE",30,1,
                1999,"OASIS QATAR",9818,"PRADERAS OASIS",32674,"CD. JUAREZ","CHIHUAHUA"));
        empleados.add(new PorHora(0,20.47,18111964,"JUAN","PEREZ","CAMPO",31,"HOMBRE",05,04,
                1988,"OASIS DE DUBAI",9748,"PRADERAS OASIS",32689,"CD. JUAREZ","CHIHUAHUA"));
        empleados.add(new PorPieza(0,35.24,18111883,"AMERICA","RIOS","CANO",18,"MUJER",4,8,
                2000,"BYERS LANE",4959,"ST JUDE",47894,"ORLANDO","CALIFORNIA"));
        empleados.add(new General(0,25,18111970,"ALBERTO","RIOS","DE OCA",47,"HOMBRE",30,3,
                1972,"VALLEY STREET",7945,"VALLEY",78489,"CADMEN","NEW JERSEY"));
    }
}