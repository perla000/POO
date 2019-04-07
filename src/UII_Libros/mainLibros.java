//EJECUTABLE DE LA CLASE LIBROS
//MARTINEZ ESTRADA JOSHUA
//18111962

package UII_Libros;
import java.util.Scanner;
public class mainLibros {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        Libros libro1=new Libros();
        System.out.println("OBJETO CREADO, FAVOR DE LLENAR DATOS SOLICITADOS:\nNombre: ");
        libro1.setTitulo(in.nextLine());
        System.out.println("Autor: ");
        libro1.setAutor(in.nextLine());
        System.out.println("Editorial: ");
        libro1.setEditorial(in.nextLine());
        System.out.println("Precio: ");
        libro1.setPrecio(in.nextDouble());
        System.out.println("No. Hojas: ");
        libro1.setHojas(in.nextInt());
        System.out.println(libro1);
    }
}

