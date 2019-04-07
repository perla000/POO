//DEFINICION DE CLASE PRODUCTOS REFRIGERADO
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIII_Productos;

public class ProductoRefrigerado extends Producto{
    
    //ATRIBUTOS
    private int codOrg;
    
    //CONSTRUCTORES
    public ProductoRefrigerado() {
        super();
        this.codOrg=1000;
    }
    public ProductoRefrigerado(Fecha fechaCad, int numLote) {
        super(fechaCad, numLote);
        this.codOrg=1000;
    }
    public ProductoRefrigerado(int dia, int mes, int anio, int numLote) {
        super(dia, mes, anio, numLote);
        this.codOrg=1000;
    }
    public ProductoRefrigerado(int codOrg) {
        this.codOrg = (codOrg>1000)?codOrg:1000;
    }
    public ProductoRefrigerado(int codOrg, Fecha fechaCad, int numLote) {
        super(fechaCad, numLote);
        this.codOrg = (codOrg>1000)?codOrg:1000;
    }
    public ProductoRefrigerado(int codOrg, int dia, int mes, int anio, int numLote) {
        super(dia, mes, anio, numLote);
        this.codOrg = (codOrg>1000)?codOrg:1000;
    }

    @Override
    public String toString() {
        return "Producto Refrigerado con"+super.toString()+ " Codigo de Organizacion Reguladora " +
                this.codOrg + "\n";
    }

    //SETTERS
    public void setCodOrg(int codOrg) {
        this.codOrg = (codOrg>1000)?codOrg:1000;
    }
    
    //GETTERS
    public int getCodOrg() {
        return codOrg;
    }
}
