//DEFINICION DE CLASE RECTANGULO
//MARTINEZ ESTRADA JOSHUA
//18111962

package UII_Figuras;

public class Rectangulo {
    
    //ATRIBUTOS DE LA CLASSE
    private Punto origen;
    public int base;
    public int altura;
    
    //CONSTRUCTOR POR OMISION
    public Rectangulo(){
        this.origen=new Punto();
    }
    
    //CONSTRUCTORES POR DEFINICION
    public Rectangulo(int x, int y, int base, int altura){
        this.origen=new Punto(x,y);
        this.base=(base>=0)?base:2;
        this.altura=(altura>=0)?altura:1;
    }
    public Rectangulo(Punto p, int base, int altura){
        this.origen=p;
        this.base=(base>=0)?base:2;
        this.altura=(altura>=0)?altura:1;
    }
    public Rectangulo(Punto p){
        this.origen=p;
        this.base=2;
        this.altura=1;
    }
    public Rectangulo(int base, int altura){
        this.origen=new Punto();
        this.base=(base>=0)?base:2;
        this.altura=(altura>=0)?altura:1;
    }
    
    @Override
    public String toString(){
        return "RECTANGULO "+this.origen+" con BASE "+this.base+" ALTURA "+this.altura;
    }
    
    //SETTERS DE LA CLASE
    public void setOrigen(int x, int y){
        this.origen = new Punto(x,y);
    }
    public void setOrigen(Punto p){
        this.origen=p;
    }
    public void setBase(int base){
        this.base=(base>=0)?base:2;
    }
    public void setAltura(int altura){
        this.altura=(altura>=0)?altura:1;
    }
    
    //GETTERS DE LA CLASE
    public Punto getOrigen(){
        return origen;
    }
    public int getBase(){
        return this.base;
    }
    public int getAltura(){
        return this.altura;
    }
    
    //METODOS DE LA CLASE
    public int area(){
        return (this.base*this.altura);
    }
    public void dibuja(){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.println("* ");
            }
            System.out.println("");
        }
    }
}
