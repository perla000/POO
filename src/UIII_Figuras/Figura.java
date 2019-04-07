//DEFINICION DE CLASE PADRE FIGURA
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIII_Figuras;

public class Figura {
    
    //ATRIBUTOS DE CLASE
    protected Punto origen;
    protected String tipo;
    protected String color;
    
    //CONSTRUCTORES
    public Figura(Punto punto, String tipo, String color) {
        this.origen = punto;
        this.tipo = tipo;
        this.color = color;
    }
    public Figura(){
        this.origen=new Punto();
        this.tipo="N/D";
        this.color="N/D";
    }
    public Figura(int x,int y,String tipo,String color){
        this.origen=new Punto(x,y);
        this.tipo=tipo;
        this.color=color;
    }
    public Figura(Figura f){
        this.origen=f.getOrigen();
        this.color=f.getColor();
        this.tipo=f.getTipo();
    }
    public Figura(String tipo){
        this.origen=new Punto();
        this.color="N/D";
        this.tipo=tipo;
    }
    public Figura(Punto p){
        this.origen=p;
        this.tipo="N/D";
        this.color="N/D";
    }
    public Figura(int x,int y){
        this.origen=new Punto(x,y);
        this.tipo="N/D";
        this.color="N/D";
    }
    public Figura(String color,String tipo){
        this.origen=new Punto();
        this.color=color;
        this.tipo=tipo;
    }

    @Override
    public String toString() {
        return "Figura con PUNTO en "+this.origen+", de tipo " +this.tipo+" y color "+this.color+" ";
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
    
    //METODOS
    public double area(){
        return 0;
    }
    public double perimetro(){
        return 0;
    }
}