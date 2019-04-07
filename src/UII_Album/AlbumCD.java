//DEFINICION DE CLASE ALBUM CD
//MARTINEZ ESTRADA JOSHUA
//18111962

package UII_Album;

import java.util.Scanner;

public class AlbumCD {
    
    Scanner in=new Scanner (System.in);
    
    //ATRIBUTOS DE CLASE
    private Cancion [] cancion;
    private int contador;
    
    //CONSTRUCTORES
    public AlbumCD(Cancion[] canciones, int cont){
        this.cancion=canciones;
        this.contador=cont;
    }
    
    @Override
    public String toString(){
        String c="";
        for (int i = 0; i < this.contador; i++) {
            c+=cancion[i]+"\n";
        }
        return "Canciones del album:\n" + c;
    }

    //SETTERS
    public void setContador(int cont){
        this.contador=cont;
    }
    public void setCanciones(Cancion[] canciones){
        this.cancion=canciones;
    }
    
    //GETTERS
    public int getContador(){
        return this.contador;
    }
    public Cancion[] getCanciones(){
        return this.cancion;
    }
    
    //METODOS
    public void grabarCancion(){
        String tit,aut;
        int num;
        System.out.print("Numero de la cancion: ");
        num=in.nextInt();
        System.out.println("Titulo de la cancion: ");
        tit=in.nextLine();
        System.out.println("Autor de la cancion: ");
        aut=in.nextLine();
        Cancion c= new Cancion(tit,aut);
        this.cancion[num-1]=c;
    }
    
    public void agregarCancion(){
        String tit,aut;
        System.out.println("Titulo de la cancion: ");
        tit=in.nextLine();
        System.out.println("Autor de la cancion: ");
        aut=in.nextLine();
        Cancion c=new Cancion(tit,aut);
        if(contador<=15){
            this.cancion[this.contador]=c;
            this.contador++;
        }else{
            System.out.println("El album esta lleno.");
        }
    }
    public void eliminarCancion(){
        System.out.println("Numero de cancion: ");
        int num=in.nextInt();
        this.cancion[num-1]=null;
        System.out.println("Cancion eliminada.");
    }
    public void CambiarTitulo(int cont,String tit){
        if(cont >=1 && cont <=15){
            this.cancion[cont].setTitulo(tit);
        }
    }
}
