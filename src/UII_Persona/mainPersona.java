package UII_Persona;

import java.util.*;

public class mainPersona {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        Persona p1 = new Persona();
        Fecha f1=new Fecha(26,11,2000);
        System.out.println(p1);
        Persona p = new Persona("Joshua","Martinez","Estrada",5584,"Hombre",f1);
        System.out.println(p+"\nEscribe el nuevo nombre para P1: ");
        p1.setNombre(s.next());
        System.out.println(p1.getNombre());
    }
}