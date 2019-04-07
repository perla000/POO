//EJECUTABLE DE LA CLASE LIBROS
//MARTINEZ ESTRADA JOSHUA
//18111962

package UII_Figuras;
//import java.util.Scanner;
public class mainCirculo {
    public static void main(String []args){
        /*Scanner in =new Scanner(System.in);
        Circulo c = new Circulo(5.8);
        System.out.println(c);
        System.out.printf("El area es: %.2f\n", c.area());
        c.perimetro();

        Circulo c2 = new Circulo();
        System.out.print("\nIngresa el RADIO del circulo: ");
        c2.setRadio(in.nextDouble());
        System.out.printf("El area es: %.2f\n", c2.area());
        c2.perimetro();*/
        
        Punto p1=new Punto(5,3);
        Circulo c1=new Circulo(p1,20);
        Circulo c2=new Circulo(8);
        Circulo c3=new Circulo(p1);
        c2.setOrigen(p1);
        p1=c2.getOrigen();
        System.out.println(p1);
        
    }
}
