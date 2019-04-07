//DEFINICION DE CLASE CIRCULO
//MARTINEZ ESTRADA JOSHUA
//18111962

package UII_Figuras;

import UII_Figuras.Punto;

public class Circulo {
    
    //ATRIBUTOS DE LA CLASE
    private double radio;
    private Punto origen;
    
    
    //CONSTRUCTOR POR OMISION
    public Circulo(){
        this.radio=1;
        this.origen=new Punto();
    }
    
    //CONSTRUCTOR POR DEFINICION
    public Circulo(double r){
        this.origen=new Punto();
        this.radio=r>0?r:1;
    }
    
    //CONSTRUCTOR COORDENADAS Y RADIO
    public Circulo(int x, int y, double radio){
        this.origen=new Punto(x,y);
        this.radio=radio>0?radio:1;
    }
    
    //CONSTRUCTOR OBJETO PUNTO Y RADIO
    public Circulo(Punto obj,double radio){
        this.origen=obj;
        this.radio=radio>0?radio:1;
    }
    
    //CONSTRUCTOR OBJETO
    public Circulo(Punto obj){
        this.origen=obj;
        this.radio=1;
    }
    
    @Override
    public String toString(){
        return "Circulo\nRadio: "+this.radio;
    }
    //SETTERS DE LA CLASE
    public void setRadio(double r) {
       this.radio=r>0?r:1;
    }
    public void setOrigen(int x,int y){
        this.origen=new Punto(x,y);
    }
    public void setOrigen(Punto p){
        this.origen=p;
    }
    
    //GETTERS DE LA CLASE
    public double getRadio() {
        return radio;
    }
    public Punto getOrigen(){
        return this.origen;
    }
    
    //METODOS
    public double area(){
        double a=3.14159*this.radio*this.radio;
        return a;
    }
    public void perimetro(){
        double p=3.14159*this.radio*2;
        System.out.printf("El perimetro es: %.2f\n",p);
    }
}
