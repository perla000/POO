//DEFINICION DE CLASE EJECUTABLE FACTURA
//MARTINEZ ESTRADA JOSHUA
//18111962

package UII_Facturas;

import UII_Cliente.Cliente;
import java.util.Scanner;
import java.text.DecimalFormat;

public class mainFactura {
    
    public static void menu(){
        System.out.println("SELECCIONA LA OPCION DESEADA:\n"
                + "1. Mostrar Productos de Almacen\n"
                + "2. Registrar factura\n"
                + "3. Cancelar Factura\n"
                + "4. Agregar Productos Almacen\n"
                + "5. Corte de Caja\n"
                + "6. Salir\n");
        System.out.print("OPCION: ");
    }
    
    public static void main(String[] args) {
        int op,control=1,cod,auxFac=0,auxArreFac=0;
        Scanner in=new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        Cliente c=new Cliente("Oasis de Qatar",9818,"Fracc. Praderas de los Oasis",32674,"Ciudad Juarez","Chihuahua","MAEJ001126266","6562222184","Joshua Martinez");
        Producto[] almacen=new Producto[30];
        almacen[0]=new Producto(10478,"LAPIZ NO 2 DIXON","PIEZA",100,5.5);
        almacen[1]=new Producto(14752,"PAQ. HOJAS COLOR 500","PAQUETE",21,150.30);
        almacen[2]=new Producto(10784,"PAQ. HOJAS BLANCA 500","PAQUETE",18,70.67);
        almacen[3]=new Producto(97841,"CALCULADORA BASICA","PIEZA",5,50.0);
        almacen[4]=new Producto(17484,"CALCULADORA CIENTIFICA","PIEZA",5,280.61);
        almacen[5]=new Producto(36547,"CUADERNO RAYA PROF","PIEZA",10,15.98);
        almacen[6]=new Producto(10214,"CUADERNO CUADRO PROF","PIEZA",10,14.99);
        almacen[7]=new Producto(98744,"JUEGO GEOMERTRIA","PIEZA",10,90.5);
        almacen[8]=new Producto(30145,"CINTA ADHESIVA GRANDE","PIEZA",30,30.4);
        almacen[9]=new Producto(98741,"POST IT VARIOS PAQUETE","PAQUETE",35,20.3);
        Producto[] listaFactura=new Producto[30];
        double totalFactura[]=new double[30];
        do {
            menu();
            op=in.nextInt();
            switch (op) {
                case 1:
                    mostrarAlmacen(almacen);
                    break;
                case 2:
                    int continuar,auxLF=0,cantA=0;
                    do{
                        int valor=0;
                        boolean existe=false;
                        System.out.println("Introduzca Codigo de Productos a Facturar: ");
                        System.out.print("Codigo: ");
                        cod=in.nextInt();
                        for (int i = 0; i < 30; i++) {
                            if((almacen[i]!=null)&&(cod==almacen[i].getCodigo())){
                                valor=i;
                                existe=true;
                            }
                        }
                        if(existe==true){
                            System.out.print("Cantidad de Articulos: ");
                            cantA=in.nextInt();
                            listaFactura[auxLF]=new Producto(almacen[valor].getCodigo(),almacen[valor].getDescripcion(),almacen[valor].getUnidadMedida(),cantA,almacen[valor].getPrecioUnitario());
                            auxLF++;
                            System.out.println("PRODUCTO AÑADIDO\n");
                        }else{
                            System.out.println("ERROR, PRODUCTO NO EXISTENTE\n");
                        }
                        System.out.println("Desea añadir otro producto?\n1. Si \n2. No");
                        continuar=in.nextInt();
                    }while(continuar==1);
                    if(listaFactura[0]!=null){
                        Factura factura=new Factura(c,listaFactura,auxLF);
                        for (int i = 0; i < 30; i++) {
                            if(listaFactura[i]!=null){
                                totalFactura[auxArreFac]+=((listaFactura[i].getCantidad()*listaFactura[i].getPrecioUnitario())+(((listaFactura[i].getCantidad()*listaFactura[i].getPrecioUnitario()))*0.08));
                            }
                        }
                        System.out.println("Factura Registrada\n"+factura);
                        auxFac++;
                        auxArreFac++;
                        limparArreglo(listaFactura);
                    }else{
                        System.out.println("OPERACION CANCELADA\n");
                    }
                    break;
                case 3:
                    System.out.print("Ingresa el numero de factura a Cancelar: ");
                    int numE=in.nextInt();
                    if(numE<=auxFac && numE>0){
                        totalFactura[numE-1]=0;
                        auxFac--;
                        System.out.println("FACTURA ELIMINADA\n");
                    }else{
                        System.out.println("ERROR, FACTURA INEXISTENTE\n");
                    }
                    break;
                case 4:
                    agregarAlmacen(almacen);
                    break;
                case 5:
                    double corteCaja=0;
                    for (int i = 0; i < 30; i++) {
                        corteCaja+=totalFactura[i];
                    }
                    System.out.println("Se realizo un total de "+(auxFac)+" Facturas\nDinero en caja: "+df.format(corteCaja)+"\n");
                    break;
                case 6:
                    control=0;
                    System.out.println("CERRANDO SISTEMA\n");
                    break;
                default:
                    System.out.println("ERROR, SELECCIONA UN OPCION VALIDA\n");
            }
        } while (control==1);
    }
    
    private static void agregarAlmacen(Producto[] almacen){
        int aux=0,codigo,cant,sig=0;
        double pu;
        String d,dFinal="",um;
        Scanner in=new Scanner(System.in);
        for (int i = 0; i < almacen.length; i++) {
            if(almacen[i]==null){
                aux=1;
                sig=i;
            }
        }
        if(aux==1){
            System.out.println("NOTA: En el campo NOMBRE solo se aceptan maximo 23 caracteres\n");
            do {
                System.out.print("Codigo (5 DIGITOS): ");
                codigo=in.nextInt();
                if(codigo<10000)System.out.println("CODIGO INVALIDO, PORFAVOR INGRESA UNO VALIDO\n");
            } while ((codigo<10000)||(codigo>99999));
            System.out.print("Descripcion: ");
            in.nextLine();
            d=in.nextLine();
            char[] l=d.toCharArray();
            int restante=23-l.length;
            if(l.length<23){
                for (int i = 0; i < l.length; i++) {
                    dFinal+= l[i];
                }
                for (int i = 0; i < restante; i++) {
                    dFinal+=" ";
                }
            }else{
                for (int i = 0; i < 23; i++) {
                    dFinal+= l[i];
                }
            }
            System.out.print("Unidad Medida: ");
            um=in.nextLine();
            System.out.print("Cantidad: ");
            cant=in.nextInt();
            System.out.print("Precio Unitario: ");
            pu=in.nextDouble();
            almacen[sig]=new Producto(codigo,dFinal,um,cant,pu);
            System.out.println("PRODUCTO AGREGADO CORRECTAMENTE\n");
        }else{
            System.out.println("ERROR, ALMACEN LLENO\n");
        }
    }
    
    private static void mostrarAlmacen(Producto[] almacen){
        System.out.print("-------------------------------------------------------------------------------------------------------\n"
                + "CODIGO\t\tNOMBRE\t\t\t\t\tUNIDAD\t\tCANTIDAD\tPRECIO UNITARIO\n"
                + "-------------------------------------------------------------------------------------------------------\n");
                    for (int i = 0; i < almacen.length; i++) {
                        if(almacen[i]!=null){
                            System.out.println(almacen[i].getCodigo()+"\t\t"+almacen[i].getDescripcion()+"\t\t\t"+almacen[i].getUnidadMedida()+"\t\t"+almacen[i].getCantidad()+"\t\t"+almacen[i].getPrecioUnitario());
                        }
                    }
                    System.out.println("-------------------------------------------------------------------------------------------------------\n");
    }

    private static void limparArreglo(Producto[] listaFactura) {
        for (int i = 0; i < 30; i++) {
            listaFactura[i]=null;
        }
    }
}