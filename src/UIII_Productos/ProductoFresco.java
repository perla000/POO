//DEFINICION DE CLASE PRODUCTOS FRESCO
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIII_Productos;

public class ProductoFresco extends Producto{
    
    //ATRIBUTOS
    private Fecha fechaEnv;
    private String pais;
    
    //CONSTRUCTORES
    public ProductoFresco() {
        super();
        this.fechaEnv=new Fecha();
        this.pais="N/D";
    }
    public ProductoFresco(Fecha fechaEnv, String pais) {
        this.fechaEnv = fechaEnv;
        this.pais = pais;
    }
    public ProductoFresco(Fecha fechaEnv, String pais, Fecha fechaCad, int numLote) {
        super(fechaCad, numLote);
        this.fechaEnv = fechaEnv;
        this.pais = pais;
    }
    public ProductoFresco(Fecha fechaEnv, String pais, int dia, int mes, int anio, int numLote) {
        super(dia, mes, anio, numLote);
        this.fechaEnv = fechaEnv;
        this.pais = pais;
    }
    public ProductoFresco(Fecha fechaCad, int numLote) {
        super(fechaCad, numLote);
    }
    public ProductoFresco(int dia, int mes, int anio, int numLote) {
        super(dia, mes, anio, numLote);
    }

    @Override
    public String toString() {
        return "Producto Fresco con " +super.toString()+ " Fecha de Envase: " + this.fechaEnv 
                +" Pais: "+this.pais+"\n";
    }
    
    //SETTERS
    public void setFechaEnv(Fecha fechaEnv) {
        this.fechaEnv = fechaEnv;
    }
    public void setFechaEnv(int dia, int mes, int anio){
        this.fechaEnv=new Fecha(dia,mes,anio);
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    
    //GETTERS
    public Fecha getFechaEnv() {
        return fechaEnv;
    }
    public String getPais() {
        return pais;
    }
}
