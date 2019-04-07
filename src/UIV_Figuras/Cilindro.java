//DEFINICION DE CLASE HIJA CILINDRO (CIRCULO)
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIV_Figuras;

public class Cilindro extends Circulo{
    
    //ATRIBUTOS
    private double altura;
    
    //CONSTRUCTORES
    public Cilindro(){
        super();
        this.altura=1;
    }
    public Cilindro(double altura) {
        super();
        this.altura = (altura>0)?altura:1;
    }
    public Cilindro(double altura, double radio, Punto origen, String tipo, String color) {
        super(radio, origen, tipo, color);
        this.altura = (altura>0)?altura:1;
    }
    public Cilindro(double altura, double radio, int x, int y, String tipo, String color) {
        super(radio, x, y, tipo, color);
        this.altura = (altura>0)?altura:1;
    }

    @Override
    public String toString() {
        return super.toString()+"; H: "+this.altura;
    }
    
    //SETTERS
    public void setAltura(double altura) {
        this.altura = (altura>0)?altura:1;
    }
    
    //GETTERS
    public double getAltura() {
        return altura;
    }
    
    //METODOS
    @Override
    public double perimetro(){
        System.out.println("Calculando area total del cilindro");
        double areaLateral=3.14159*this.radio*2*this.altura;
        double areaTotal=areaLateral+(2*(3.14159*this.radio*this.radio));
        return areaTotal;
    }
    @Override
    public double area(){
        System.out.println("Calculando VOLUMEN");
        return (3.14159*this.radio*this.radio)*this.altura;
    }
    @Override
    public void dibujar() {
        System.out.println("CILINDRO SIN DINUJO DISPOMIBLE\n");
    }
}