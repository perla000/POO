//DEFINICION DE CLASE EJECUTABLE ANIMAL
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIII_Animales;

public class mainAnimal {
    public static void main(String[] args) {
        Animal a=new Animal("MAR","ACUATICO");
        Animal b=new Animal("DESIERTO","TERRESRTRE");
        System.out.println(a+"\n"+b);
        a.comer("CUALQUIER COSA");
        Aguila ag1=new Aguila();
        Aguila ag2=new Aguila("BOSQUES","AVE",2);
        Aguila ag3=new Aguila (a,4);
        System.out.println(ag1);
        System.out.println(ag2);
        System.out.println(ag3);
        ag2.volar();
        ag2.comer("COMIDA");
        Perro p1=new Perro("CIUDAD","DOMESTICO","FIRULAIS");
        p1.comer("POLLO");
        System.out.println(p1);
        Delfin d=new Delfin(a,2);
        System.out.println(d);
    }
}