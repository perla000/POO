//DEFINICION DE CLASE EJECUTABLE CLIENTE
//MARTINEZ ESTRADA JOSHUA
//18111962

package UII_Cliente;

import java.util.Scanner;

public class mainCliente {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        Direccion d=new Direccion("Oasis de Qatar",9818,"Fracc. Praderas de los Oasis",32674,"Ciudad Juarez","Chihuahua");
        Cliente c1=new Cliente();
        Cliente c2=new Cliente(d,"MAEJ001126266","6562222184","Joshua Martinez");
        Cliente c3=new Cliente("Oasis de Qatar",9818,"Fracc. Praderas de los Oasis",32674,"Ciudad Juarez","Chihuahua","MAEJ001126266","6562222184","Joshua Martinez");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println("Trabajando con Cliente 1: \nIntroduce el nuevo RFC: ");
        c1.setRfc("FEQA001188471");
        System.out.println("Introduce el nuevo Telefono: ");
        c1.setTel("6564718704");
        System.out.println("Introduce Razon Social: ");
        c1.setRazon("FENIX QUIROGA ANTONIO");
        c1.setDom(d);
        System.out.println(c1);
    }
}
