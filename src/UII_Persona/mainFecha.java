//CLASE EJECUTABLE MAIN CORRESPONDIENTE A LA CLASE Fecha
//MARTINEZ ESTRADA JOSHUA
//18111962

package UII_Persona;

import UII_Persona.Fecha;
import java.util.Scanner;

public class mainFecha {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        Fecha t1 = new Fecha();
        System.out.print("INGRESA LOS SIGUEINTES DATOS\nCARACTERES NO VALIDOS SE TOMARAN COMO 1\n\nAÑO: ");
        t1.setAnio(in.nextInt());
        System.out.print("NUMERO del MES: ");
        t1.setMes(in.nextInt());
        System.out.print("DIA: ");
        t1.setDia(in.nextInt());
        System.out.print("\n"+t1.toString());
    }
}