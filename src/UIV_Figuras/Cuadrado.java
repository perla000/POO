//DEFINICION DE CLASE HIJA CUADRADO (FIGURA)
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIV_Figuras;

public class Cuadrado extends Figura{
    
    //ATRIBUTOS
    private double lado;
    
    //CONSTRUCTORES
    public Cuadrado(){
        super();
        this.lado=1;
    }
    public Cuadrado(double lado, Punto origen, String tipo, String color) {
        super(origen, tipo, color);
        this.lado = (lado>0)?lado:1;
    }
    public Cuadrado(double lado, int x, int y, String tipo, String color) {
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
        return lado;
    }
    
    //METODOS
    @Override
    public double area(){
        return this.lado*this.lado;
    }
    @Override
    public double perimetro(){
        return this.lado*4;
    }
    @Override
    public void dibujar(){
        System.out.println("Para dibujar la figura se redondearon los valores al entero proximo "
                + "o anterior\n");
        int lado=Integer.parseInt(String.valueOf(Math.round(this.lado)));
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}