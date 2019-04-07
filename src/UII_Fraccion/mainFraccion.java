//EJECUTABLE DE LA CLASE FRACCION
//MARTINEZ ESTRADA JOSHUA
//18111962

package UII_Fraccion;

import java.util.Scanner;

public class mainFraccion {
    
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        System.out.println("*CREANDO OBJETOS 1,2,3,4*");
        Fraccion f1=new Fraccion(2,2);
        Fraccion f2=new Fraccion(1,2);
        Fraccion f3=new Fraccion(3,4);
        Fraccion f4=new Fraccion(10,5);
        Fraccion f5=new Fraccion();
        try{
        System.out.print("*DATOS DEL OBJETO 5*\nIntroduce NUMERADOR: ");
        f5.setNum(in.nextInt());
        System.out.print("Introduce DENOMINARADOR: ");
        f5.setDen(in.nextInt());
        System.out.print("\nEn total se crearon "+Fraccion.cont+" Objetos:\n1."
                +f1+"2."+f2+"3."+f3+"4."+f4+"5."+f5);
        }catch(Exception e){
            System.out.println("ERROR, CARACTER NO VALIDO");
        }
    }
}


