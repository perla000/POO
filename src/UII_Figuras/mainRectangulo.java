//DEFINICION DE CLASE CIRCULO
//MARTINEZ ESTRADA JOSHUA
//18111962

package UII_Figuras;

import java.util.Scanner;

public class mainRectangulo {
    public static void menu() {
        System.out.println("\n\nSELECCIONE LA OPCION DESEADA\n"
                + "1. Mostrar datos del rec1tangulo\n"
                + "2. Introducir datos del rectangulo\n"
                + "3. Cambiar Origen\n"
                + "4. Cambiar Base\n"
                + "5. Cambiar Altura\n"
                + "6. Calcular Area\n"
                + "7. Dibujar Rectangulo\n"
                + "8. Salir\n"
                + "OPCION: ");
    }
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x,y,b,a,opc;
        Punto p=new Punto();
        Rectangulo r1=new Rectangulo(15,20);
        Rectangulo r2=new Rectangulo(p);
        Rectangulo r3=new Rectangulo();
        Rectangulo r4=new Rectangulo(5,5,10,15);
        System.out.println(r1);
        do {
            menu();
            opc=in.nextInt();
            switch (opc) {
                case 1:
                    System.out.println(r3);
                    break;
                case 2:
                    System.out.println("Introduce Origen\nX= ");
                    x=in.nextInt();
                    System.out.println("Y= ");
                    y=in.nextInt();
                    System.out.println("Base: ");
                    b=in.nextInt();
                    System.out.println("Altura: ");
                    a=in.nextInt();
                    r3.setOrigen(x, y);
                    r3.setBase(b);
                    r3.setAltura(a);
                    break;
                case 3:
                    System.out.println("Introduce Origen\n X= ");
                    x=in.nextInt();
                    System.out.println("Y= ");
                    y=in.nextInt();
                    r3.setOrigen(x, y);
                    break;
                case 4:
                    System.out.println("Base: ");
                    b=in.nextInt();
                    r3.setBase(b);
                    break;
                case 5:
                    System.out.println("Altura: ");
                    a=in.nextInt();
                    r3.setAltura(a);
                    break;
                case 6:
                    System.out.printf("Area = %.2f",r3.area());
                    break;
                case 7:
                    r3.dibuja();
                    break;
                case 8:
                    System.out.println("A D I O S");
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
            }
        } while (opc!=8);
    }
}