//DEFINICION DE CLASE HIJA TRIANGULO (FIGURA)
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIV_Figuras;


public class TrianguloEquilatero extends Figura{
    
    //ATRIBUTOS
    private double lado;
    
    //CONSTRUCTORES
    public TrianguloEquilatero(){
        super();
        this.lado=1;
    }
    public TrianguloEquilatero(double lado, Punto origen, String tipo, String color) {
        super(origen, tipo, color);
        this.lado = (lado>0)?lado:1;
    }
    public TrianguloEquilatero(double lado, int x, int y, String tipo, String color) {
        super(x, y, tipo, color);
        this.lado = (lado>0)?lado:1;
    }
    
    @Override
    public String toString() {
        return super.toString()+"\t\tL: "+this.lado;
    }
    
    //SETTERS
    public void setLado(double lado) {
        this.lado = (lado>0)?lado:1;
    }
    
    //GETTERS
    public double getLado() {
        return this.lado;
    }
    
    //METODOS
    @Override
    public double area(){
        return ((Math.sqrt(3)/4)*(Math.pow(this.lado, 2)));
    }
    @Override
    public double perimetro(){
        return (this.lado*3);
    }
    @Override
    public void dibujar(){
        int l=Integer.parseInt(String.valueOf(StrictMath.round(this.lado)));
        String c="";
        System.out.println("Para dibujar la figura se redondearon los valores al entero proximo "
                + "o anterior\n");
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < (l-1)-i; j++) {
                c+=" ";
            }
            for (int j = -1; j <= i-1; j++) {
                c+="* ";
            }
            c+="\n";
        }
        System.out.println(c);
    }
}