//DEFINICION DE CLASE HIJA CIRCULO (FIGURA)
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIV_Figuras;

public class Circulo extends Figura{
    
    //ATRIBUTOS
    protected double radio;
    
    //CONSTRUCTORES
    public Circulo(){
        super();
        this.radio=1;
    }
    public Circulo(double radio, Punto origen, String tipo, String color) {
        super(origen, tipo, color);
        this.radio=radio>0?radio:1;
    }
    public Circulo(double radio, int x, int y, String tipo, String color) {
        super(x, y, tipo, color);
        this.radio=radio>0?radio:1;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\t\tR: "+this.radio;
    }
    
    //SETTERS
    public void setRadio(double r) {
       this.radio=r>0?r:1;
    }
    
    //GETTERS
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
    @Override
    public void dibujar() {
        System.out.println("CIRCULO SIN DIBUJO DISPOMIBLE\n");
    }
}