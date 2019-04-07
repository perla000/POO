//DEFINICION DE CLASE EJECUTABLE FIGURAS
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIV_Figuras;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class mainFiguras {
    
    public static void menu(){
        System.out.println("CALCULO DE AREAS Y PERIMETROS\n"
                + "Introduce la opcion deseada:\n"
                + "1. Crear Figura\n"
                + "2. Mostrar TODAS las figuras\n"
                + "3. Total de Figuras\n"
                + "4. Mostrar AREA de TODAS las figuras\n"
                + "5. Mostrar PERIMETRO de TODAS las figuras\n"
                + "6. Dibujar figuras\n"
                + "7. Salir");
        System.out.print("OPCION: ");
    }
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Figura> figuras=new ArrayList<>();
        String op="";
        do {
            menu();
            op=in.next();
            switch (op) {
                case "1":
                    crearF(figuras);
                    break;
                case "2":
                    mostrarTF(figuras);
                    break;
                case "3":
                    totalF(figuras);
                    break;
                case "4":
                    areasF(figuras);
                    break;
                case "5":
                    perimetrosF(figuras);
                    break;
                case "6":
                    dibujarF(figuras);
                    break;
                case "7":
                    break;
                case "26112000":
                    System.out.println("CODIGO DEBUG APLICADO, PRESET DE DATOS CARGADO\n");
                    demo(figuras);
                    break;
                default:
                    System.out.println("ERROR, CARCTER NO VALIDO\n");
            }
        } while (!op.equals("7"));
    }
    
    //FUNCION QUE CREA OBJETO Y AÑADE A ARRAYLIST
    private static void crearF(ArrayList<Figura> figuras) {
        Scanner in=new Scanner(System.in);
        int x,y;
        double aux1,aux2;
        String tipo,color,opF;
        System.out.print("\t\t[DATOS DE ORIGEN]\n"
                + "X: ");
        x=in.nextInt();
        System.out.print("Y: ");
        y=in.nextInt();
        System.out.print("\t\t[OTROS DATOS]\n");
        System.out.print("COLOR: ");
        color=in.next();
        System.out.print("\nSelecciona el tipo de figura:\n"
            + "1. Circulo\n"
            + "2. Cilindro\n"
            + "3. Cuadrado\n"
            + "4. Rectangulo\n"
            + "5. Triangulo Equilatero\n"
            + "OPCION: ");
        opF=in.next();
        switch (opF) {
            case "1":
                System.out.print("\t\t[CIRCULO]\n"
                        + "RADIO: ");
                aux1=in.nextDouble();
                tipo="CIRCULO";
                try{
                    figuras.add(new Circulo(aux1,x,y,tipo,color));
                    System.out.println("FIGURA AÑADIDA CORRECTAMENTE\n");
                }catch(Exception e){
                    System.out.println("ALGO SALIO MAL: "+e+" \n");
                }
                break;
            case "2":
                tipo="CILIN";
                System.out.print("\t\t[CLINDRO]\n"
                        + "RADIO: ");
                aux1=in.nextDouble();
                System.out.print("ALTURA: ");
                aux2=in.nextDouble();
                try{
                    figuras.add(new Cilindro(aux2,aux1,x,y,tipo,color));
                    System.out.println("FIGURA AÑADIDA CORRECTAMENTE\n");
                }catch(Exception e){
                    System.out.println("ALGO SALIO MAL: "+e+" \n");
                }
                break;
            case "3":
                tipo="CUAD";
                System.out.print("\t\t[CUADRADO]\n"
                        + "LADO: ");
                aux1=in.nextDouble();
                try{
                    figuras.add(new Cuadrado(aux1,x,y,tipo,color));
                    System.out.println("FIGURA AÑADIDA CORRECTAMENTE\n");
                }catch(Exception e){
                    System.out.println("ALGO SALIO MAL: "+e+" \n");
                }
                break;
            case "4":
                tipo="RECT";
                System.out.print("\t\t[RECTANGULO]\n"
                        + "BASE: ");
                aux1=in.nextDouble();
                System.out.print("ALTURA: ");
                aux2=in.nextDouble();
                try{
                    figuras.add(new Rectangulo(aux2,aux1,x,y,tipo,color));
                    System.out.println("FIGURA AÑADIDA CORRECTAMENTE\n");
                }catch(Exception e){
                    System.out.println("ALGO SALIO MAL: "+e+" \n");
                }
                break;
            case "5":
                tipo="TRIAN";
                System.out.print("\t\t[TRIANGULO EQUILATERO]\n"
                        + "LADO: ");
                aux1=in.nextDouble();
                try{
                    figuras.add(new TrianguloEquilatero(aux1,x,y,tipo,color));
                    System.out.println("FIGURA AÑADIDA CORRECTAMENTE\n");
                }catch(Exception e){
                    System.out.println("ALGO SALIO MAL: "+e+" \n");
                }
                break;
            default:
                System.out.println("ERROR, OPCION NO VALIDA; OPERACION CANCELADA\n");
        }
    }

    //FUNCION QUE MUESTRA LOS ELEMENTOS DE ARRAYLIST
    private static void mostrarTF(ArrayList<Figura> figuras) {
        System.out.println("\n-----------------------------------------------------------------"
                + "------\n"
                + "TIPO\t\tCOLOR\t\tORIGEN\t\tMEDIDAS\n"
                + "-----------------------------------------------------------------------");
        if(figuras.isEmpty()){
            System.out.println("SIN FIGURAS GUARDADAS");
        }else{
            for (int i = 0; i < figuras.size(); i++) {
                System.out.println(figuras.get(i));
            }
        }
        System.out.println("-------------------------------------------------------------------"
                + "----\n");
    }

    //FUNCION QUE IMPRIME EL TOTAL DE ELEMNTOS DE ARRAYLIST
    private static void totalF(ArrayList<Figura> figuras) {
        System.out.println("EXISTEN "+figuras.size()+" FIGURAS\n");
    }

    //FUNCION QUE IMPRIME LOS DATOS DE CADA FIGURA JUNTO CON SU AREA
    private static void areasF(ArrayList<Figura> figuras) {
        DecimalFormat df=new DecimalFormat("#.00");
        System.out.println("\n------------------------------------------------------------------"
                + "-----\n"
                + "TIPO\t\tCOLOR\t\tORIGEN\t\tMEDIDAS\t\tAREA\n"
                + "-----------------------------------------------------------------------");
        if(figuras.isEmpty()){
            System.out.println("SIN FIGURAS GUARDADAS");
        }else{
            for (int i = 0; i < figuras.size(); i++) {
                System.out.println(figuras.get(i)+"\t\t"+df.format(figuras.get(i).area()));
            }
        }
        System.out.println("-------------------------------------------------------------------"
                + "----\n");
    }

    //FUNCION QUE IMPRIME LOS DATOS DE CADA FIGURA JUNTO CON SU PERIMETRO
    private static void perimetrosF(ArrayList<Figura> figuras) {
        DecimalFormat df=new DecimalFormat("#.00");
        System.out.println("\n------------------------------------------------------------------"
                + "-----\n"
                + "TIPO\t\tCOLOR\t\tORIGEN\t\tMEDIDAS\tPERIMETRO\n"
                + "-----------------------------------------------------------------------");
        if(figuras.isEmpty()){
            System.out.println("SIN FIGURAS GUARDADAS");
        }else{
            for (int i = 0; i < figuras.size(); i++) {
                System.out.println(figuras.get(i)+"\t\t"+df.format(figuras.get(i).perimetro()));
            }
        }
        System.out.println("---------------------------------------------------------------------"
                + "--\n");
    }

    //FUNCION QUE DIBUJA TODAS LAS FIGURAS
    private static void dibujarF(ArrayList<Figura> figuras) {
        for (int i = 0; i < figuras.size(); i++) {
            System.out.println("DIBUJANDO "+figuras.get(i).tipo);
            figuras.get(i).dibujar();
            System.out.println("\n");
        }
    }
    
    //FUNCION QUE AÑADE 4 OBJETOS AL ARRAYLIST
    private static void demo(ArrayList<Figura> figuras){
        figuras.add(new Circulo(2,5,3,"CIRCULO","NEGRO"));
        figuras.add(new Cuadrado(3,5,3,"CUAD.","AZUL"));
        figuras.add(new Rectangulo(10,5,5,3,"RECT.","VERDE"));
        figuras.add(new TrianguloEquilatero(6,5,3,"TRIAN.","MORADO"));
    }
}