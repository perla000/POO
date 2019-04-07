//DEFINICION DE CLASE HIJA TRIANGULO (FIGURA)
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIII_Figuras;

public class TrianguloEquilatero extends Figura{
    
    //ATRIBUTOS
    private double lado;
    
    //CONSTRUCTORES
    public TrianguloEquilatero(){
        super();
        this.lado=1;
    }
    public TrianguloEquilatero(double lado, Punto punto, String tipo, String color) {
        super(punto, tipo, color);
        this.lado = lado;
    }
    public TrianguloEquilatero(double lado) {
        super();
        this.lado = lado;
    }
    public TrianguloEquilatero(double lado, int x, int y, String tipo, String color) {
        super(x, y, tipo, color);
        this.lado = lado;
    }
    public TrianguloEquilatero(double lado, Figura f) {
        super(f);
        this.lado = lado;
    }
    public TrianguloEquilatero(double lado, String tipo) {
        super(tipo);
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "TRIANGULO EQUILATERO es una "+super.toString()+"con lados de "+this.lado +" cm\n";
    }
    
    //SETTERS
    public void setLado(double lado) {
        this.lado = lado;
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
    public void dibuja(){
        int l=Integer.parseInt(String.valueOf(StrictMath.round(this.lado)));
        String c="";
        System.out.println("Para dibujar la figura se redondearon los valores al entero proximo o anterior\n");
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
