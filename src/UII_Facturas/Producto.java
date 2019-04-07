//DEFINICION DE CLASE PRODUCTO
//MARTINEZ ESTRADA JOSHUA
//18111962

package UII_Facturas;

public class Producto {
    
    //ATRIBUTOS DE LA CLASE
    private int codigo;
    private String descripcion;
    private String unidadMedida;
    private int cantidad;
    private double precioUnitario;
    
    //CONSTRUCTORES
    public Producto(){
        this.codigo=11111;
        this.descripcion="N/D";
        this.unidadMedida="N/D";
        this.cantidad=1;
        this.precioUnitario=1.00;
    }
    public Producto(int c,String d,String um,int cant,double p){
        this.codigo=(c>10000)?c:10000;
        this.descripcion=d;
        this.unidadMedida=um;
        this.cantidad=(cant>0)?cant:1;
        this.precioUnitario=(p>0)?p:1.00;
    }
    
    @Override
    public String toString(){
        return this.codigo+"\t\t"+this.descripcion
                +"\t\t\t"+this.unidadMedida+"\t\t"
                +this.cantidad+"\t\t"+this.precioUnitario;
    }
    
    //SETTERS
    public void setCodigo(int c){
        this.codigo=(c>10000)?c:10000;
    }
    public void setDescripcion(String d){
        this.descripcion=d;
    }
    public void setUnidadMedida(String um){
        this.unidadMedida=um;
    }
    public void setCantidad(int cant){
        this.cantidad=(cant>0)?cant:1;
    }
    public void setPrecioUnitario(double pu){
        this.precioUnitario=(pu>0)?pu:1.00;
    }
    
    //GETTERS
    public int getCodigo(){
        return this.codigo;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public String getUnidadMedida(){
        return this.unidadMedida;
    }
    public int getCantidad(){
        return this.cantidad;
    }
    public double getPrecioUnitario(){
        return this.precioUnitario;
    }
}