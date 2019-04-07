//DEFINICION DE CLASE EJECUTABLE GRUPO
//MARTINEZ ESTRADA JOSHUA
//18111962

package UII_Persona;

import java.util.Scanner;


public class mainGrupo {
    public static void menu(){
        System.out.println("\nSelecciona una Opcion:\n"
                + "1. Mostrar Integrantes del Grupo\n"
                + "2. Agregar Integrantes\n"
                + "3. Eliminar Integrantes\n"
                + "4. Mostrar Numero de Integrantes\n"
                + "5. Buscar Integrante\n"
                + "6. Salir");
        System.out.print("OPCION: ");
    }
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Persona[] integrantes=new Persona[30];
        integrantes[0] =new Persona("Luis","Gardea","Puente",38,"Hombre",new Fecha(5,8,1981));
        integrantes[1] =new Persona("Laura","Torres","Aldo",20,"Mujer",new Fecha(15,10,1999));
        integrantes[2] =new Persona("Ricardo","Martinez","Estrada",11,"Hombre",new Fecha(30,1,2008));
        integrantes[3] =new Persona("Daniela","Martinez","Acosta",18,"Mujer",new Fecha(5,6,2000));
        Grupo grupo=new Grupo("Equipo 3",integrantes,Persona.contPersonas);
        boolean ciclo=true;
        do {
            menu();
            switch (in.nextInt()) {
                case 1:
                    System.out.println(grupo);
                    break;
                case 2:
                    grupo.agregarIntegrante();
                    break;
                case 3:
                    grupo.eliminarIntegrante();
                    break;
                case 4:
                    System.out.println("En el grupo hay un total de "+grupo.getCont()+" Integrantes");
                    break;
                case 5:
                    grupo.buscar();
                    break;
                case 6:
                    ciclo=false;
                    break;
                default:
            }
        } while (ciclo);
    }
}
