//DEFINICION DE CLASE FRACCION
//MARTINEZ ESTRADA JOSHUA
//18111962

package UII_Fraccion;

public class Fraccion {
    
    //ATRINUTOS DE LA CLASE
    private int num;
    private int den;
    public static int cont=0;
    
    //CONSTRUCTOR POR OMISION
    public Fraccion(){
        cont++;
        this.num=1;
        this.den=1;
    }
    
    //CONSTRUCTOR POR DEFINICION
    public Fraccion(int n, int d){
        cont++;
        this.num=n;
        this.den=(d!=0)?d:1;
    }
    
    @Override
    public String toString(){
        return this.num+"/"+this.den+"\n";
    }
    
    //SETTERS DE LA CLASE
    public void setNum(int num) {
        this.num = num;
    }
    public void setDen(int den) {
        this.den=(den!=0)?den:1;
    }
    
    //GETTERS DE LA CLASE
    public int getNum(){
        return this.num;
    }
    public int getDen(){
        return this.den;
    }
    
    //OPERACIONES CON FRACCIONES
    public int suma(){
        return 0;
    }
    public int resta(){
        return 0;
    }
    public int division(){
        return 0;
    }
    public int multiplicacion(){
        return 0;
    }
}