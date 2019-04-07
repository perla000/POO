//DEFINICION CLASE GRUPO
//MARTINEZ ESTRADA JOSHUA
//18111962

package UII_Persona;

import java.util.Scanner;

public class Grupo {
    
    Scanner in=new Scanner(System.in);
    
    //ATRIBUTOS DE LA CLASE
    private String nombre;
    private Persona [] integrantes;
    private int cont;
    
    //CONSTRUCTOR POR DEFININCION
    public Grupo(String nombre,Persona[] integ,int cont){
        this.nombre=nombre;
        this.integrantes=integ;
        this.cont=(cont>0)?cont:0;
    }
    public Grupo(Persona[] integ,int cont){
        this.nombre="N/D";
        this.integrantes=integ;
        this.cont=(cont>0)?cont:0;
    }
    
    @Override
    public String toString(){
        String integ="";
        for (int i = 0; i < this.cont; i++) {
            integ+=integrantes[i]+"\n";
        }
        return "Nombre: "+this.nombre+"\nIntegrantes:\n"+integ+"\nTotal de Integrantes: "+this.cont;
    }
    
    //SETTERS
    public void setNombre(String n){
        this.nombre=n;
    }
    public void setIntegrantes(Persona[] integ){
        this.integrantes=integ;  
    }
    public void setCont(int c){
        this.cont=(c>0)?c:0;
    }
    
    //GETTERS
    public String getNombre(){
        return this.nombre;
    }
    public Persona[] getIntegrantes(){
        return this.integrantes;
    }
    public int getCont(){
        return this.cont;
    }
    
    //METODOS
    public void agregarIntegrante(){
        String n,ap,am,genero;
        int edad,dia,mes,anio;
        if(this.cont<30){
            System.out.print("Ingresa los siguientes datos:\nNombre: ");
            n=in.next();
            System.out.print("Apellido Paterno: ");
            ap=in.next();
            System.out.print("Apellido Materno: ");
            am=in.next();
            System.out.print("Edad: ");
            edad=in.nextInt();
            System.out.print("Genero (HOMBRE-MUJER): ");
            genero=in.next();
            System.out.print("------Fecha Nacimiento-------\nDia: ");
            dia=in.nextInt();
            System.out.print("Mes: ");
            mes=in.nextInt();
            System.out.print("Año: ");
            anio=in.nextInt();
            integrantes[cont]=new Persona(n,ap,am,edad,genero,new Fecha(dia,mes,anio));
            cont++;
        }else{
            System.out.println("GRUPO LLENO");
        }
    }
    
    public void eliminarIntegrante(){
        System.out.print("Numero de Integrante a eliminar: ");
        int eliminar=in.nextInt();
        if(eliminar>0 && eliminar <=cont){
            this.ajustar(eliminar);
            cont--;
            System.out.println("PERSONA ELIMINADA DEL GRUPO");
        }else{
            System.out.println("ERROR, PERSONA NO EXISTENTE");
        }
    }
    
    public void ajustar(int n){
        for (int i = n-1; i < this.cont; i++) {
            if(i==29){
                this.integrantes[i]=null;
            }else{
                this.integrantes[i]=this.integrantes[i+1];
            }
        }
    }
    
    public void buscar(){
        int persona;
        System.out.print("Introduce el numero le persona a buscar: ");
        persona=in.nextInt();
        if(persona>0 && persona <=cont){
            System.out.println(this.integrantes[persona]);
        }else{
            System.out.println("ERROR, PERSONA NO EXISTENTE");
        }
    }
}
