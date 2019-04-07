//DEFINICION DE CLASE EJECUTABLE ALBUM CD
//MARTINEZ ESTRADA JOSHUA
//18111962

package UII_Album;

import java.util.Scanner;

public class mainAlbumCD {
    
    public static void menu(){
        System.out.println("\nINGRESA LA OPCION DESEADA:\n"
                + "1. Total de canciones en el album\n"
                + "2. Mostrar canciones del album\n"
                + "3. Agregar cancion\n"
                + "4. Grabar cancion\n"
                + "5. Eliminar cancion\n"
                + "6. Cambiar titutlo\n"
                + "7. Salir \n");
        System.out.print("OPCION: ");
    }
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        boolean opc=true;
        String tit,aut;
        int op,num;
        Cancion[] lista=new Cancion[15];
        lista[0]=new Cancion("Light My Fire","The Doors");
        lista[1]=new Cancion("The End","The Doors");
        lista[2]=new Cancion("Break On Through","The Doors");
        lista[3]=new Cancion("Soul Kitchen","The Doors");
        lista[4]=new Cancion("The Crystal Ship","The Doors");
        lista[5]=new Cancion("Back Door Man","The Doors");
        lista[6]=new Cancion("I Looked At You","The Doors");
        lista[7]=new Cancion("Take It As It Comes","The Doors");
        lista[8]=new Cancion("People Are Strange","The Doors");
        lista[9]=new Cancion("L.A. Woman","The Doors");
        lista[10]=new Cancion("Love Her Madley","The Doors");
        AlbumCD alb=new AlbumCD(lista,11);
        do {
            menu();
            op=in.nextInt();
            switch (op) {
                case 1:
                    System.out.println("El album tiene "+(alb.getContador())+
                            " Canciones");
                    break;
                case 2:
                    System.out.println("Listado de canciones:\n");
                    System.out.println(alb);
                    break;
                case 3:
                    alb.agregarCancion();
                    break;
                case 4:
                    alb.grabarCancion();
                    break;
                case 5:
                    alb.eliminarCancion();
                    break;
                case 6:
                    System.out.println("Numero de Cancion: ");
                    num=in.nextInt();
                    System.out.println("Nuevo titulo de cancion: ");
                    tit=in.nextLine();
                    tit=in.nextLine();
                    alb.CambiarTitulo(num, tit);
                    break;
                case 7:
                    System.out.println("Adios.");
                    opc=false;
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
            }
        } while (opc);
    }  
}