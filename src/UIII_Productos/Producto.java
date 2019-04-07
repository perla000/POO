//DEFINICION DE CLASE PADRE PRODUCTOS
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIII_Productos;

public class Producto {
    
    //ATRIBUTOS
    protected Fecha fechaCad;
    protected int numLote;
    
    //CONSTRUCTORES
    public Producto(){
        this.fechaCad=new Fecha();
        this.numLote=100000;
    }
    public Producto(Fecha fechaCad, int numLote) {
        this.fechaCad = fechaCad;
        this.numLote = (numLote>100000)?numLote:100000;
    }
    public Producto(int dia,int mes, int anio, int numLote){
        this.fechaCad=new Fecha(dia,mes,anio);
        this.numLote = (numLote>100000)?numLote:100000;
    }

    @Override
    public String toString() {
        return "Fecha Caducidad: " + this.fechaCad + " Lote: " + this.numLote+"\n";
    }

    //SETTERS
    public void setFechaCad(Fecha fechaCad) {
        this.fechaCad = fechaCad;
    }
    public void setFechaCad(int dia,int mes, int anio){
        this.fechaCad=new Fecha(dia,mes,anio);
    }
    public void setNumLote(int numLote) {
        this.numLote = (numLote>100000)?numLote:100000;
    }

    //GETTERS
    public Fecha getFechaCad() {
        return fechaCad;
    }
    public int getNumLote() {
        return numLote;
    }
}
