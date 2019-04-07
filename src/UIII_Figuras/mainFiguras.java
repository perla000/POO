//DEFINICION DE CLASE EJECUTABLE FIGURAS
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIII_Figuras;

import java.text.DecimalFormat;
import java.util.Scanner;

public class mainFiguras {
    
    public static void menu(){
        System.out.println("CALCULO DE AREAS Y PERIMETRO\n"
                + "Introduce el numero de la figura a calcular:\n"
                + "1. Rectangulo\n"
                + "2. Cuadrado\n"
                + "3. Circulo\n"
                + "4. Triangulo Equilatero\n"
                + "5. Cilindro\n"
                + "6. Salir\n");
        System.out.print("OPCION: ");
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat(".##");
        boolean salir=false;
        do{
            double base=0,altura=0;
            int x=0,y=0;
            String color="";

                menu();
                int op=in.nextInt();
                switch (op) {
                    case 1:
                        System.out.println("Seleccionaste RECTANGULO");
                        System.out.print("Introduce BASE: ");
                        base=in.nextDouble();
                        System.out.print("Introduce ALTURA: ");
                        altura=in.nextDouble();
                        System.out.print("[ORIGEN]\nX: ");
                        x=in.nextInt();
                        System.out.print("Y: ");
                        y=in.nextInt();
                        System.out.print("Introduce COLOR: ");
                        color=in.next();
                        Rectangulo r=new Rectangulo(x,y,base,altura,"CUADRILATERO",color);
                        System.out.println("\nSu AREA es: "+df.format(r.area())+"\nSu PERIMETRO es: "+df.format(r.perimetro())+"\n[DIBUJO]\n");
                        r.dibuja();
                        System.out.println("\n");
                        break;
                    case 2:
                        System.out.println("Seleccionaste CUADRADO");
                        System.out.print("Introduce LADO: ");
                        base=in.nextDouble();
                        System.out.print("[ORIGEN]\nX: ");
                        x=in.nextInt();
                        System.out.print("Y: ");
                        y=in.nextInt();
                        System.out.print("Introduce COLOR: ");
                        color=in.next();
                        Cuadrado c=new Cuadrado(x,y,base,"CUADRILATERO",color);
                        System.out.println("\nSu AREA es: "+df.format(c.area())+"\nSu PERIMETRO es: "+df.format(c.perimetro())+"\n[DIBUJO]\n");
                        c.dibuja();
                        System.out.println("\n");
                        break;
                    case 3:
                        System.out.println("Seleccionaste CIRCULO");
                        System.out.print("Introduce RADIO: ");
                        base=in.nextDouble();
                        System.out.print("[ORIGEN]\nX: ");
                        x=in.nextInt();
                        System.out.print("Y: ");
                        y=in.nextInt();
                        System.out.print("Introduce COLOR: ");
                        color=in.next();
                        Circulo ci=new Circulo(x,y,"CUADRILATERO",color,base);
                        System.out.println("\nSu AREA es: "+df.format(ci.area())+"\nSu PERIMETRO es: "+df.format(ci.perimetro())+"\n");
                        break;
                    case 4:
                        System.out.println("Seleccionaste TRIANGULO EQUILATERO");
                        System.out.print("Introduce LADO: ");
                        base=in.nextDouble();
                        System.out.print("[ORIGEN]\nX: ");
                        x=in.nextInt();
                        System.out.print("Y: ");
                        y=in.nextInt();
                        System.out.print("Introduce COLOR: ");
                        color=in.next();
                        TrianguloEquilatero te=new TrianguloEquilatero(base,x,y,"TRIANGULO",color);
                        System.out.print("\nSu AREA es: "+df.format(te.area())+"\nSu PERIMETRO es: "+df.format(te.perimetro())+"\n[DIBUJO]\n");
                        te.dibuja();
                        break;
                    case 5:
                        System.out.println("Seleccionaste CILINDRO");
                        System.out.print("Introduce RADIO de la BASE: ");
                        base=in.nextDouble();
                        System.out.print("Introduce ALTURA: ");
                        altura=in.nextDouble();
                        System.out.print("[ORIGEN]\nX: ");
                        x=in.nextInt();
                        System.out.println("Y: ");
                        y=in.nextInt();
                        System.out.println("Introduce COLOR: ");
                        color=in.next();
                        Cilindro cil=new Cilindro(altura,x,y,base,"CUERPO CON VOLUMEN",color);
                        System.out.println("\nSu VOLUMEN es: "+df.format(cil.area())+"\nSu AREA TOTAL es: "+df.format(cil.perimetro())+"\n");
                        break;
                    case 6:
                        salir=true;
                        break;
                    default:
                        System.out.println("ERROR, OPCION NO VALIDA\n");
                }
        }while(salir==false);
    }
}