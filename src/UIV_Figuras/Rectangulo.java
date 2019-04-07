//DEFINICION DE CLASE HIJA RECTANGULO (FIGURA)
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIV_Figuras;

public class Rectangulo extends Figura{
    
    //ATRIBUTOS DE LA CLASE
    private double base;
    private double altura;
    
    //CONSTRUCTORES
    public Rectangulo(){
        super();
        this.base=2;
        this.altura=1;
    }
    public Rectangulo(double base, double altura, Punto origen, String tipo, String color) {
        super(origen, tipo, color);
        this.base = (base>0)?base:1;
        this.altura = (altura>0)?altura:1;
    }
    public Rectangulo(double base, double altura, int x, int y, String tipo, String color) {
        super(x, y, tipo, color);
        this.base = (base>0)?base:1;
        this.altura = (altura>0)?altura:1;
    }
    
    
    @Override
    public String toString(){
        return super.toString()+"\t\tB: "+this.base+"; H: "+this.altura;
    }
    
    //SETTERS DE LA CLASE
    public void setBase(double base) {
        this.base = (base>0)?base:1;
    }
    public void setAltura(double altura) {
        this.altura = (altura>0)?altura:1;
    }
    
    //GETTERS DE LA CLASE
    public double getBase(){
        return this.base;
    }
    public double getAltura(){
        return this.altura;
    }
    
    //METODOS DE LA CLASE
    @Override
    public double area(){
        return (this.base*this.altura);
    }
    @Override
    public double perimetro(){
        return 2*this.base+2*this.altura;
    }
    @Override
    public void dibujar(){
        System.out.println("Para dibujar la figura se redondearon los valores al entero proximo "
                + "o anterior\n");
        int altura=Integer.parseInt(String.valueOf(Math.round(this.altura)));
        int base=Integer.parseInt(String.valueOf(Math.round(this.base)));
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}