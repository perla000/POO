//DEFINICION DE CLASE HIJA CIRCULO (FIGURA)
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIII_Figuras;

public class Circulo extends Figura{
    
    //ATRIBUTOS DE LA CLASE
    protected double radio;
    
    //CONSTRUCTORES
    public Circulo(){
        super();
        this.radio=1;
    }
    public Circulo(double r){
        super();
        this.radio=r>0?r:1;
    }
    public Circulo(int x, int y, double radio){
        super(x,y);
        this.radio=radio>0?radio:1;
    }
    public Circulo(Punto obj,double radio){
        super(obj);
        this.radio=radio>0?radio:1;
    }
    public Circulo(Punto obj){
        super(obj);
        this.radio=1;
    }
    public Circulo(int x, int y,String tipo, String color,double radio){
        super(x,y,tipo,color);
        this.radio=radio>0?radio:1;
    }
    public Circulo(String tipo,String color){
        super(tipo,color);
        this.radio=1;
    }
    
    @Override
    public String toString(){
        return "CIRCULO es una "+super.toString()+"con radio de "+this.radio+"\n";
    }
    
    //SETTERS DE LA CLASE
    public void setRadio(double r) {
       this.radio=r>0?r:1;
    }
    
    //GETTERS DE LA CLASE
    public double getRadio() {
        return radio;
    }
    
    //METODOS
    @Override
    public double area(){
        double a=3.14159*this.radio*this.radio;
        return a;
    }
    @Override
    public double perimetro(){
        double p=3.14159*(this.radio*2);
        return p;
    }
}