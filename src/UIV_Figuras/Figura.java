//DEFINICION DE CLASE PADRE FIGURA
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIV_Figuras;

public abstract class Figura {
    
    //ATRIBUTOS DE CLASE
    protected Punto origen;
    protected String tipo;
    protected String color;
    
    //CONSTRUCTORES
    public Figura(){
        this.origen=new Punto();
        this.tipo="N/D";
        this.color="N/D";
    }
    public Figura(Punto origen, String tipo, String color) {
        this.origen = origen;
        this.tipo = tipo;
        this.color = color;
    }
    public Figura(int x,int y, String tipo, String color) {
        this.origen = new Punto(x,y);
        this.tipo = tipo;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.tipo+"\t\t"+this.color+"\t\t"+this.origen;
    }
    
    //SETTERS
    public void setPunto(Punto punto) {
        this.origen = punto;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setOrigen(Punto origen) {
        this.origen = origen;
    }
    
    //GETTERS
    public Punto getOrigen() {
        return origen;
    }
    public String getTipo() {
        return tipo;
    }
    public String getColor() {
        return color;
    }
    
    //METODOS ABSTRACTOS
    public abstract double area();
    public abstract double perimetro();
    public abstract void dibujar();
}