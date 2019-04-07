

//EJEMPLO DE CLASE EJECUTABLE SALARIOS
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIII_Empleados;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class mainSalario {
    public static void menu(){
        System.out.println("SISTEMA DE SALARIOS\n"
                + "1. Mostrar Empleados\n"
                + "2. Buscar Empleado\n"
                + "3. Registrar Empleado\n"
                + "4. Eliminar Empleado\n"
                + "5. Calcular Salario de Empleado\n"
                + "6. Salir");
        System.out.print("OPCION: ");
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Empleado> empleados=new ArrayList<>();
        ArrayList<Integer> tipo=new ArrayList<>();
        empleados.add(new Vendedor(0,18111962,"RICARDO","MARTINEZ","ESTRADA",20,"HOMBRE",30,1,
                1999,"OASIS QATAR",9818,"PRADERAS OASIS",32674,"CD. JUAREZ","CHIHUAHUA"));
        empleados.add(new PorHora(0,20.47,18111964,"JUAN","PEREZ","CAMPO",31,"HOMBRE",05,04,
                1988,"OASIS DE DUBAI",9748,"PRADERAS OASIS",32689,"CD. JUAREZ","CHIHUAHUA"));
        empleados.add(new PorPieza(0,35.24,18111883,"AMERICA","RIOS","CANO",18,"MUJER",4,8,
                2000,"BYERS LANE",4959,"ST JUDE",47894,"ORLANDO","CALIFORNIA"));
        empleados.add(new General(0,25,18111970,"ALBERTO","RIOS","DE OCA",47,"HOMBRE",30,3,
                1972,"VALLEY STREET",7945,"VALLEY",78489,"CADMEN","NEW JERSEY"));
        tipo.add(1);
        tipo.add(2);
        tipo.add(3);
        tipo.add(4);
        String op,auxE;
        String[] tipos=new String[]{"VENDEDOR","POR HORA","POR PIEZA","GENERAL"};
        DecimalFormat df=new DecimalFormat("#.00");
        do {
            auxE=null;
            menu();
            op=in.next();
            switch (op) {
                case "1":
                    mostrarEmpleados(empleados,tipo,tipos);
                    break;
                case "2":
                    System.out.print("\nNUMERO RELOJ: ");
                    auxE=in.next();
                    mostrarEmpleado(empleados,tipo,auxE,tipos);
                    break;
                case "3":
                    registrarEmpleado(empleados,tipo,tipos);
                    break;
                case "4":
                    System.out.print("\nNUMERO RELOJ: ");
                    auxE=in.next();
                    eliminarEmpleado(empleados,tipo,auxE);
                    break;
                case "5":
                    System.out.print("NUMERO RELOJ: ");
                    auxE=in.next();
                    System.out.println("El salario del empleado es: "+df.format(salarios(empleados,
                            tipo,auxE))+"\n");
                    break;
                case "6":
                    System.out.println("CERRANDO SISTEMA\n");
                    break;
                default:
                    System.out.println("ERROR, CARACTER INVALIDO\n");
            }
        } while (!"6".equals(op));
        
    }
    public static void mostrarEmpleados(ArrayList<Empleado> empleado, ArrayList<Integer> tipo,
            String[] tipos){
        System.out.print("------------------------------------------------------------\n"
                + "NUMERO RELOJ\tNOMBRE\t\t\t\tTIPO DE PAGA\n"
                + "------------------------------------------------------------\n");
        for (int i = 0; i < empleado.size(); i++) {
            System.out.println(empleado.get(i).NoReloj+"\t"+empleado.get(i).nombre+" "+
                    empleado.get(i).apPat+" "+empleado.get(i).apMat+"\t"+tipos[tipo.get(i)-1]);
        }
        System.out.println("------------------------------------------------------------\n");
    }
    public static void mostrarEmpleado(ArrayList<Empleado> empleado, ArrayList<Integer> tipo,
            String reloj,String[] tipos){
            boolean existe=false;
            for (int i = 0; i < empleado.size(); i++) {
                if(reloj.equals(String.valueOf(empleado.get(i).NoReloj))){
                    existe=true;
                    System.out.print("\n\t\t[DATOS PERSONALES]\n"
                            + "NOMBRE: "+empleado.get(i).nombre+" "+empleado.get(i).apPat+" "+
                            empleado.get(i).apMat+"\n"
                            + "FECHA NACIMIENTO: "+empleado.get(i).nac+"\n"
                            + "DIRECCION: "+empleado.get(i).domicilio+"\n\n"
                            + "\t\t[DATOS SALARIALES]\n"
                            + "SUELDO BASE: ");
                    if(tipo.get(i)==4){
                        System.out.print("Sin sueldo Base\n");
                    }else{
                        System.out.print(empleado.get(i).sueldoBase+"\n");
                    }
                    System.out.println("TIPO DE PAGA: "+tipos[tipo.get(i)-1]+"\n");
                }
            }
            if(existe==false){
                System.out.println("EMPLEADO NO ENCONTRADO\n");
            }
    }
    public static void registrarEmpleado(ArrayList<Empleado> empleado, ArrayList<Integer> tipo,
            String[] tipos){
        String n,am,ap,gen,calle,col,cd,estado,op;
        Scanner in=new Scanner(System.in);
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
        tiposE();
        op=in.next();
        edad=2019-anio;
        switch (op) {
            case "1":
                reloj=generarReloj(empleado);
                tipo.add(1);
                empleado.add(new Vendedor(0,reloj,n,ap,am,edad,gen,dia,mes,anio,calle,num,col,cp,
                        cd,estado));
                System.out.println("EMPLEADO REGISTRADO\nNUMERO RELOJ ASIGNADO: "+reloj);
                break;
            case "2":
                reloj=generarReloj(empleado);
                System.out.print("PAGO POR HORA: ");
                pagoU=in.nextDouble();
                tipo.add(2);
                empleado.add(new PorHora(0,pagoU,reloj,n,ap,am,edad,gen,dia,mes,anio,calle,num,col,
                        cp,cd,estado));
                System.out.println("EMPLEADO REGISTRADO\nNUMERO RELOJ ASIGNADO: "+reloj);
                break;
            case "3":
                reloj=generarReloj(empleado);
                System.out.print("PAGO POR PIEZA: ");
                pagoU=in.nextDouble();
                tipo.add(3);
                empleado.add(new PorPieza(0,pagoU,reloj,n,ap,am,edad,gen,dia,mes,anio,calle,num,col
                        ,cp,cd,estado));
                System.out.println("EMPLEADO REGISTRADO\nNUMERO RELOJ ASIGNADO: "+reloj);
                break;
            case "4":
                reloj=generarReloj(empleado);
                System.out.print("PAGO POR HORA:");
                pagoU=in.nextDouble();
                tipo.add(4);
                empleado.add(new General(0,pagoU,reloj,n,ap,am,edad,gen,dia,mes,anio,calle,num,col,
                        cp,cd,estado));
                System.out.println("EMPLEADO REGISTRADO\nNUMERO RELOJ ASIGNADO: "+reloj+"\n");
                break;
            default:
                System.out.println("ERROR, OPCION NO VALIDA");
        }
    }
    public static void tiposE(){
        System.out.println("\n\t\t[DATOS SALARIALES]\nTipo de Paga: \n"
                + "1. Vendedor\n"
                + "2. Por Hora\n"
                + "3. Por Pieza\n"
                + "4. General");
        System.out.print("OPCION: ");
    }
    public static int generarReloj(ArrayList<Empleado> empleado){
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

    private static void eliminarEmpleado(ArrayList<Empleado> empleado, ArrayList<Integer> tipo, 
            String auxE) {
        boolean existe=true;
        for(int i=0;i<empleado.size();i++){
            if(auxE.equals(String.valueOf(empleado.get(i).NoReloj))){
                empleado.remove(i);
                tipo.remove(i);
                System.out.println("EMPLEADO ELIMINADO\n");
                existe=false;
            }
        }
        if(existe){
            System.out.println("ERROR, EMPLEADO NO ENCONTRADO\n");
        }
    }

    private static double salarios(ArrayList<Empleado> empleado, ArrayList<Integer> tipo, 
            String auxE) {
        int indice=0,aux;
        double ventas,total=0;
        Scanner in=new Scanner(System.in);
        for(int i=0;i<empleado.size();i++){
            if(auxE.equals(String.valueOf(empleado.get(i).NoReloj))){
                indice=i;
            }
        }
        switch (tipo.get(indice)) {
            case 1:
                System.out.println("ESQUEMA DE SALARIO: VENDEDOR");
                System.out.print("TOTAL DE VENTAS: ");
                ventas=in.nextDouble();
                Vendedor v=(Vendedor) empleado.get(indice);
                total=v.salario(ventas);
                break;
            case 2:
                System.out.println("ESQUEMA DE SALARIO: POR HORA");
                System.out.print("HORAS: ");
                aux=in.nextInt();
                PorHora ph=(PorHora) empleado.get(indice);
                total=ph.salario(aux);
                break;
            case 3:
                System.out.println("ESQUEMA DE SALARIO: POR PIEZA");
                System.out.print("PIEZAS: ");
                aux=in.nextInt();
                PorPieza pp=(PorPieza) empleado.get(indice);
                total=pp.salario(aux);
                break;
            case 4:
                System.out.println("ESQUEMA DE SALARIO: GENERAL");
                System.out.print("HORAS: ");
                aux=in.nextInt();
                General g=(General) empleado.get(indice);
                total=g.salario(aux);
                break;
        }
        return total;
    }
}