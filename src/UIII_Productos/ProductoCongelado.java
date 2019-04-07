//DEFINICION DE CLASE PRODUCTOS CONGELADOS
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIII_Productos;

public class ProductoCongelado extends Producto{
    
    //ATRUBTOS
    private double tempCon;
    
    //CONSTRUCTORES
    public ProductoCongelado() {
        super();
        this.tempCon=0;
    }
    public ProductoCongelado(Fecha fechaCad, int numLote) {
        super(fechaCad, numLote);
        this.tempCon=0;
    }
    public ProductoCongelado(int dia, int mes, int anio, int numLote) {
        super(dia, mes, anio, numLote);
        this.tempCon=0;
    }
    public ProductoCongelado(double tempCon) {
        this.tempCon = tempCon;
    }
    public ProductoCongelado(double tempCon, Fecha fechaCad, int numLote) {
        super(fechaCad, numLote);
        this.tempCon = tempCon;
    }
    public ProductoCongelado(double tempCon, int dia, int mes, int anio, int numLote) {
        super(dia, mes, anio, numLote);
        this.tempCon = tempCon;
    }

    @Override
    public String toString() {
        return "Producto Congelado con " +super.toString()+ " Temperatura de Congelacion: " 
                + tempCon +"\n";
    }

    //SETTERS
    public void setTempCon(double tempCon) {
        this.tempCon = tempCon;
    }
    
    //GETTERS
    public double getTempCon() {
        return tempCon;
    }
}