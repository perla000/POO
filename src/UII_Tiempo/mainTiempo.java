//CLASE EJECUTABLE MAIN CORRESPONDIENTE A LA CLASE TIEMPO
//MARTINEZ ESTRADA JOSHUA
//18111962

package UII_Tiempo;

import java.util.Scanner;

public class mainTiempo {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        Tiempo t1 = new Tiempo();
        
        System.out.print("INGRESA LOS SIGUEINTES DATOS\nCARACTERES NO VALIDOS SE TOMARAN COMO 0\n\nHora: ");
        t1.setHora(in.nextInt());
        System.out.print("Minutos: ");
        t1.setMin(in.nextInt());
        System.out.print("Segundos: ");
        t1.setSeg(in.nextInt());
        System.out.println("\n"+t1.toString());
    }
}