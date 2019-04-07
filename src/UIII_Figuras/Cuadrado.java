//DEFINICION DE CLASE HIJA CUADRADO (FIGURA)
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIII_Figuras;

public class Cuadrado extends Figura{
    
    //ATRIBUTOS
    private double lado;
    
    //CONSTRUCTORES
    public Cuadrado(){
        super();
        this.lado=1;
    }
    public Cuadrado(double lado, Punto punto, String tipo, String color) {
        super(punto, tipo, color);
        this.lado = (lado>0)?lado:1;
    }
    public Cuadrado(double lado) {
        this.lado = (lado>0)?lado:1;
    }
    public Cuadrado(int x, int y,double lado, String tipo, String color) {
        super(x, y, tipo, color);
        this.lado = (lado>0)?lado:1;
    }
    public Cuadrado(double lado, Figura f) {
        super(f);
        this.lado = (lado>0)?lado:1;
    }
    public Cuadrado(double lado, String tipo) {
        super(tipo);
        this.lado = (lado>0)?lado:1;
    }

    @Override
    public String toString() {
        return "Cuadrado es una "+super.toString()+"con lados de "+this.lado+" CM\n";
    }
    
    //SETTERS
    public void setLado(int lado) {
        this.lado = lado;
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
    public void dibuja(){
        System.out.println("Para dibujar la figura se redondearon los valores al entero proximo o anterior\n");
        int lado=Integer.parseInt(String.valueOf(Math.round(this.lado)));
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}