

//DEFINICION DE CLASE EJECUTABLE VEHICULO
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIV_Vehiculo;

import java.util.ArrayList;
import java.util.Scanner;

public class mainVehiculo {
    private static void menu(){
        System.out.print("SISTEMA DE GESTION VEHICULOS [RENTA]\n"
                + "1. Añadir Vehiculo\n"
                + "2. Eliminar Vehiculo\n"
                + "3. Buscar Vehiculo\n"
                + "4. Rentar Vehiculo\n"
                + "5. Ver Alquileres Activos\n"
                + "6. Liberar Alquiler\n"
                + "7. Ver Todos los Vehiculos\n"
                + "8. Salir\n"
                + "OPCION: ");
    }
    
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        ArrayList<Vehiculo> vehiculos=new ArrayList<>();
        String op,matricula;
        do{
            menu();
            op=in.next();
            switch (op) {
                case "1":
                    anadirV(vehiculos);
                    break;
                case "2":
                    System.out.println("\nMATRICULA: ");
                    matricula=in.next();
                    eliminarV(vehiculos,matricula);
                    break;
                case "3":
                    System.out.println("\nMATRICULA: ");
                    matricula=in.next();
                    buscarV(vehiculos,matricula);
                    break;
                case "4":
                    System.out.println("\nMATRICULA: ");
                    matricula=in.next();
                    rentarV(vehiculos,matricula);
                    break;
                case "5":
                    verAlquiler(vehiculos);
                    break;
                case "6":
                    System.out.println("\nMATRICULA: ");
                    matricula=in.next();
                    libAlquilr(vehiculos,matricula);
                    break;
                case "7":
                    verAll(vehiculos);
                    break;
                case "8":
                    System.out.println("CERRANDO SISTEMA\n");
                    break;
                case "2611":
                    demo(vehiculos);
                    break;
                default:
                    System.out.println("ERROR, OPCION NO VALIDA\n");
            }
        }while(!op.equals("8"));
    }
    
    //FUNCION CARGA PRE SET DE DATOS
    private static void demo(ArrayList<Vehiculo> vehiculos) {
        vehiculos.add(new VP_Coche(4,"ABC12D",false));
        vehiculos.add(new VP_Microbus(4,"EFG34H",false));
        vehiculos.add(new VC_Camion(1.5,"IJK56L",false));
        vehiculos.add(new VC_Furgoneta(1.5,"MNO78P",false));
        System.out.println("CODIGO DEPURACION ACTIVADO\n");
    }

    //FUNCION QUE REGISTRA UN VEHICULO EN EL ARRAYLIST
    private static void anadirV(ArrayList<Vehiculo> vehiculos) {
        Scanner in=new Scanner(System.in);
        String op,mat;
        int plazas;
        double pma;
        mat=generarMatricula(vehiculos);
        System.out.print("\t\t[TIPO DE VEHICULO]\n"
                + "1. Coche\n"
                + "2. Microbus\n"
                + "3. Camion\n"
                + "4. Furgoneta\n"
                + "OPCION: ");
        op=in.next();
        switch (op) {
            case "1":
                System.out.print("\nPLAZAS: ");
                plazas=in.nextInt();
                vehiculos.add(new VP_Coche(plazas,mat,false));
                System.out.println("VEHICULO REGISTRADO\n");
                break;
            case "2":
                System.out.print("\nPLAZAS: ");
                plazas=in.nextInt();
                vehiculos.add(new VP_Microbus(plazas,mat,false));
                System.out.println("VEHICULO REGISTRADO\n");
                break;
            case "3":
                System.out.print("\nPESO MAXIMO AUTORIZDO: ");
                pma=in.nextInt();
                vehiculos.add(new VC_Camion(pma,mat,false));
                System.out.println("VEHICULO REGISTRADO\n");
                break;
            case "4":
                System.out.print("\nPESO MAXIMO AUTORIZDO: ");
                pma=in.nextInt();
                vehiculos.add(new VC_Furgoneta(pma,mat,false));
                System.out.println("VEHICULO REGISTRADO\n");
                break;
            default:
                System.out.println("ERROR, CARACTER NO VALIDO; OPERACION CANCELADA\n");
        }
    }
    
    private static String generarMatricula(ArrayList<Vehiculo> vehiculos){
        String[] letras=new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O",
            "P","Q","R","S","T","U","V","W","X","Y","Z"};
        String mat="";
        boolean existe=false;
        do {
            for (int i = 0; i < 3; i++) {
                mat+=letras[(int) Math.floor(Math.random()*(25-0+1)+0)];
            }
            for (int i = 0; i < 2; i++) {
                mat+=String.valueOf((int) Math.floor(Math.random()*(9-0+1)+0));
            }
            mat+=letras[(int) Math.floor(Math.random()*(25-0+1)+0)];
            for (int i = 0; i < vehiculos.size(); i++) {
                if(mat.equals(vehiculos.get(i).matricula)){
                    existe=true;
                }
            }
        } while(existe);
        return mat;
    }

    //FUNCION QUE ELIMINA UN VEHICULO DEL ARRAY
    private static void eliminarV(ArrayList<Vehiculo> vehiculos, String matricula) {
        int indice=0;
        boolean rentado=false,existe=false;
        for (int i = 0; i < vehiculos.size(); i++) {
            if(vehiculos.get(i).getMatricula().equals(matricula)){
                rentado=vehiculos.get(i).rentado;
                indice=i;
                existe=true;
            }
        }
        if(existe){
            if(rentado){
                System.out.println("NO SE PUEDE ELIMINAR UN VEHICULO RENTADO,\n"
                    + "POR FAVOR DALO DE BAJA\n");
            }else{
                vehiculos.remove(indice);
            }
        }else{
            System.out.println("VEHICULO NO ENCONTRADO\n");
        }
    }

    //FUNCION QUE BUSCA UN AUTO POR MATRICULA
    private static void buscarV(ArrayList<Vehiculo> vehiculos, String matricula) {
        int indice=0;
        boolean existe=false;
        for (int i = 0; i < vehiculos.size(); i++) {
            if(vehiculos.get(i).getMatricula().equals(matricula)){
                existe=true;
                indice=i;
            }
        }
        if(existe){
            System.out.println("\t\t["+tipoV(vehiculos,indice)+"]\n");
            System.out.println("MATRICULA: "+vehiculos.get(indice).getMatricula()+"\n"
                    + "ESTATUS: ");
                    if(vehiculos.get(indice).isRentado()){
                        System.out.println("RENTADO\n");
                    }else{
                        System.out.println("DISPONIBLE\n");
                    }
            switch (tipoV(vehiculos,indice)) {
                case "COCHE":
                    VP_Coche c=(VP_Coche) vehiculos.get(indice);
                    System.out.println("NUMERO PLAZAS: "+c.getPlazas());
                    break;
                case "MICROBUS":
                    VP_Microbus m=(VP_Microbus) vehiculos.get(indice);
                    System.out.println("NUMERO PLAZAS: "+m.getPlazas());
                    break;
                case "CAMION":
                    VC_Camion cam=(VC_Camion) vehiculos.get(indice);
                    System.out.println("PESO MAXIMO AUTORIZADO: "+cam.getPma());
                    break;
                case "FURGONETA":
                    VC_Furgoneta f=(VC_Furgoneta) vehiculos.get(indice);
                    System.out.println("PESO MAXIMO AUTORIZADO: "+f.getPma());
                    break;
            }
        }else{
            System.out.println("VEHICULO NO ENCONTRADO\n");
        }
    }
    
    //FUNCION QUE DEVUELVE EL TIPO DE VEHICULO
    private static String tipoV(ArrayList<Vehiculo> vehiculos,int indice){
        String tipo="";
        if(vehiculos.get(indice) instanceof VP_Coche){
            tipo="COCHE    ";
        }else if(vehiculos.get(indice) instanceof VP_Microbus){
            tipo="MICROBUS";
        }else if(vehiculos.get(indice) instanceof VC_Camion){
            tipo="CAMION   ";
        }else{
            tipo="FURGONETA";
        }
        return tipo;
    }

    //FUNCION QUE CAMBIA EL ESTATUS DE VEHICULO A RENTADO
    private static void rentarV(ArrayList<Vehiculo> vehiculos,String matricula) {
        Scanner in=new Scanner(System.in);
        int indice=0,dias=0,op;
        boolean rentado=false,existe=false;
        for (int i = 0; i < vehiculos.size(); i++) {
            if(vehiculos.get(i).getMatricula().equals(matricula)){
                rentado=vehiculos.get(i).rentado;
                indice=i;
                existe=true;
            }
        }
        if(existe){
            if(rentado){
                System.out.println("VEHICULO YA RENTADO\n");
            }else{
                System.out.print("DIAS: ");
                dias=in.nextInt();
                System.out.print("EL PRECIO DE RENTA ES: "+vehiculos.get(indice).precioAlquiler
        (dias)+"\nCONFIRMAR?\n 1. SI     2. NO\nOPCION:");
                op=in.nextInt();
                if(op==1){
                    vehiculos.get(indice).setRentado(true);
                    System.out.println("VEHICULO RENTADO CORRECTAMENTE\n");
                }else{
                    System.out.println("OPERACION CANCELADA\n");
                }
            }
        }else{
            System.out.println("VEHICULO NO ENCONTRADO\n");
        }
    }

    //FUNCION QUE MUESTRA UNA LISTA DE LOS VEHICULOS ALQUILADOS
    private static void verAlquiler(ArrayList<Vehiculo> vehiculos) {
        boolean tiene=false;
        System.out.print("--------------------------------------------------\n"
                + "MATRICULA\tTIPO\tESTATUS\n"
                + "--------------------------------------------------\n");
        for (int i = 0; i < vehiculos.size(); i++) {
            if(vehiculos.get(i).isRentado()){
                tiene=true;
                System.out.println(vehiculos.get(i).getMatricula()+"\t"+tipoV(vehiculos,i)
                        +"\tRENTADO");
            }
        }
        if(!tiene){
            System.out.println("SIN ALQUILERES");
        }
        System.out.print("--------------------------------------------------\n");
    }

    //FUNCION QUE LIBERA EL ALQUILER
    private static void libAlquilr(ArrayList<Vehiculo> vehiculos,String matricula) {
        int indice=0;
        boolean rentado=false,existe=false;
        for (int i = 0; i < vehiculos.size(); i++) {
            if(vehiculos.get(i).getMatricula().equals(matricula)){
                rentado=vehiculos.get(i).rentado;
                indice=i;
                existe=true;
            }
        }
        if(existe){
            if(rentado){
                vehiculos.get(indice).setRentado(false);
                System.out.println("VEHICULO LIBERADO\n\n");
            }else{
                System.out.println("VEHICULO NO RENTADO\n");
            }
        }else{
            System.out.println("VEHICULO NO ENCONTRADO\n");
        }
    }

    //FUNCION QUE IMPRIME TODO LOS VEHICULOS DISPONIBLE EN EL ARRAYLIST
    private static void verAll(ArrayList<Vehiculo> vehiculos) {
        String aux="";
        System.out.print("--------------------------------------------------\n"
                + "MATRICULA\tTIPO\tESTATUS\n"
                + "--------------------------------------------------\n");
        for (int i = 0; i < vehiculos.size(); i++) {
            if(vehiculos.get(i).isRentado()){
                aux="RENTADO";
            }else{
                aux="DISPONIBLE";
            }
            System.out.println(vehiculos.get(i).getMatricula()+"\t"+tipoV(vehiculos,i)+"\t"+aux);
        }
        System.out.print("--------------------------------------------------\n\n");
    }
}