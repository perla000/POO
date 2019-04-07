

//DEFINCIION DE CLASE EJECUTABLE ANIMALES
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIV_Animales;

public class mainAnimales {
    public static void main(String[] args) {
        Posicion p=new Posicion(2,2);
        Gato g =new Gato(5,p,"Copito");
        Perro pe =new Perro(5,p,"Pelusa");
        Raton r =new Raton(5,p,"Pinki");
        System.out.println(g);
        g.Cazar(r);
        g.Comer(r);
        g.Huir(pe);
        System.out.println(pe);
        pe.Cazar(g);
        pe.Comer(g);
        System.out.println(r);
        r.Huir(pe);
        r.Huir(g);
    }
}