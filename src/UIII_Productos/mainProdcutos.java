//DEFINICION DE CLASE EJECUTABLE PRODUCTOS
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIII_Productos;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class mainProdcutos {
    private static Scanner in=new Scanner(System.in);
    public static void menu(){
        System.out.println("SISTEMA DE ALMACEN DE PRODUCTOS\n\nSelecciona una opcion:\n"
                + "1. Ver Productos\n"
                + "2. Añadir Producto\n"
                + "3. Buscar Producto\n"
                + "4. Eliminar Producto\n"
                + "5. Salir\n");
        System.out.print("OPCION:");
    }
    public static void main(String[] args) {
        ArrayList<Producto> productos =new ArrayList<>();
        productos.add(new ProductoFresco());
        productos.add(new ProductoCongelado());
        productos.add(new ProductoRefrigerado());
        String op="",auxL="";
        do {
            menu();
            op=in.next();
            switch (op) {
                case "1":
                    verProd(productos);
                    break;
                case "2":
                    agProd(productos);
                    break;
                case "3":
                    System.out.print("\nNUMERO DE LOTE: ");
                    auxL=in.next();
                    buscarProd(productos,auxL);
                    break;
                case "4":
                    System.out.print("\nNUMERO DE LOTE: ");
                    auxL=in.next();
                    eliProd(productos,auxL);
                    break;
                case "5":
                    System.out.println("CERRANDO SISTEMA\n");
                    break;
                default:
                    System.out.println("ERROR, OPCION NO VALIDA\n");
            }
        } while (!"5".equals(op));
    }
    public static void verProd(ArrayList<Producto> productos){
        System.out.print("---------------------------------------------------\n"
                + "NO LOTE\t\tFECHA CADUCIDAD\t\tTIPO\n"
                + "---------------------------------------------------\n");
                for (int i = 0; i < productos.size(); i++) {
                    System.out.println(productos.get(i).numLote+"\t\t"+productos.get(i).fechaCad
                            +"\t\t"+tipoProd(productos,i));
                }
                System.out.println("---------------------------------------------------\n");
    }
    public static String tipoProd(ArrayList<Producto> productos, int indice){
        String tipo="";

        try{
            ProductoCongelado cong=(ProductoCongelado) productos.get(indice);
            tipo="Congelado";
            return tipo;
        }catch(Exception e){
            try{
                ProductoFresco fres=(ProductoFresco) productos.get(indice);
                tipo="Fresco";
                return tipo;
            }catch(Exception a){
            try{
                    ProductoRefrigerado ref=(ProductoRefrigerado) productos.get(indice);
                    tipo="Refrigerado";
                    return tipo;
                }catch(Exception b){}
            }
        }
        return tipo;
    }
    public static void agProd(ArrayList<Producto> productos){
        int lote=generarLote(productos),dia,mes,anio,codOrg;
        double tempC;
        String tipo,pais;
        System.out.println("\nNUMERO DE LOTE GENERADO: "+lote);
        System.out.println("\t\t[FECHA CADUCIDAD]");
        System.out.print("DIA: ");
        dia=in.nextInt();
        System.out.print("MES: ");
        mes=in.nextInt();
        System.out.print("AÑO: ");
        anio=in.nextInt();
        do {
            tipo="";
            tipo();
            tipo=in.next();
            switch (tipo) {
                case "1":
                    System.out.println("PRODUCTO CONGELADO");
                    System.out.print("TEMPERATURA DE CONGELACION: ");
                    tempC=in.nextDouble();
                    try{
                        productos.add(new ProductoCongelado(tempC,dia,mes,anio,lote));
                        System.out.println("PRODUCTO REGITRADO\n");
                    }catch(Exception e){
                        System.out.println("A OCURRIDO UN ERROR: "+e);
                    }
                    break;
                case "2":
                    System.out.println("PRODUCTO FRESCO");
                    System.out.print("PAIS DE ORIGEN: ");
                    pais=in.next();
                    Fecha cad=new Fecha(dia,mes,anio);
                    System.out.println("\t\t[FECHA ENVASADO]");
                    System.out.print("DIA: ");
                    dia=in.nextInt();
                    System.out.print("MES: ");
                    mes=in.nextInt();
                    System.out.print("AÑO: ");
                    anio=in.nextInt();
                    Fecha env=new Fecha(dia,mes,anio);
                    try{
                        productos.add(new ProductoFresco(env,pais,cad,lote));
                        System.out.println("PRODUCTO REGITRADO\n");
                    }catch(Exception e){
                        System.out.println("A OCURRIDO UN ERROR: "+e);
                    }
                    break;
                case "3":
                    System.out.println("PRODUCTO REFRIGERADO");
                    System.out.println("CODIGO DE ORGANIZACION: ");
                    codOrg=in.nextInt();
                    try{
                        productos.add(new ProductoRefrigerado(codOrg,dia,mes,anio,lote));
                        System.out.println("PRODUCTO REGITRADO\n");
                    }catch(Exception e){
                        System.out.println("A OCURRIDO UN ERROR: "+e);
                    }
                    break;
                default:
                    System.out.println("ERROR, OPCION NO VALIDA");
            }
        } while (!tipo.equals("1")&&!tipo.equals("2")&&!tipo.equals("3"));
    }
    public static void tipo(){
        System.out.println("\nTipo de Producto:\n"
                + "1. Congelado\n"
                + "2. Fresco\n"
                + "3. Refrigerado\n");
        System.out.print("OPCION:");
    }
    public static int generarLote(ArrayList<Producto> productos){
        Random random = new Random();
        int limiteInferior = 100000,limiteSuperior = 109999, limiteSuperiorAbierto = 
                limiteSuperior + 1, numero;
        boolean existe=false;
        do{
            numero = limiteInferior + random.nextInt(limiteSuperiorAbierto - limiteInferior);
            for(int i=0;i<productos.size();i++){
                if(numero==productos.get(i).numLote){
                    existe=true;
                }
            }
        }while(existe==true);
        return numero;
    }
    public static void buscarProd(ArrayList<Producto> productos,String lote){
        boolean existe=false;
        for (int i = 0; i < productos.size(); i++) {
            if(lote.equals(String.valueOf(productos.get(i).numLote))){
                existe=true;
                System.out.print("["+tipoProd(productos,i).toUpperCase()+"]\n"
                        + "FECHA CADUCIDAD: "+productos.get(i).fechaCad+"\n"
                        + "NO LOTE: "+productos.get(i).numLote+"\n");
            }
        }
        if(existe==false){
            System.out.println("PRODUCTO NO ENCONTRADO\n");
        }
    }
    public static void eliProd(ArrayList<Producto> productos,String lote){
        boolean existe=false;
        for (int i = 0; i < productos.size(); i++) {
            if(lote.equals(String.valueOf(productos.get(i).numLote))){
                existe=true;
                productos.remove(i);
                System.out.println("PRODUCTO ELIMINADO\n");
            }
        }
        if(existe==false){
            System.out.println("PRODUCTO NO ENCONTRADO\n");
        }
    }
}