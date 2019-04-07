//DEFINICION DE CLASE FACTURA
//MARTINEZ ESTRADA JOSHUA
//18111962
    
package UII_Facturas;

import UII_Cliente.Cliente;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Factura {
    
    //ARTRBUTOS
    private int noFactura;
    private Cliente cliente;
    private Producto[] producto;
    private int cantArt;
    private static int cont=0;
    
    //CONSTRUCTORES
    public Factura(){
        this.cont++;
        this.noFactura=cont;
        this.cliente=new Cliente();
        this.producto=null;
        this.cantArt=1;
    }
    public Factura(Cliente c, Producto[] producto, int cant){
        this.cont++;
        this.noFactura=cont;
        this.cliente=c;
        this.producto=producto;
        this.cantArt=(cant>0)?cant:1;
    }
    
    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("#.00");
        String base,prod="",pie;
        base="\nPapeleria SA de CV\t\t\t\t\t\t\t\t\t\t\tNo.Factura: "+this.noFactura+
                "\n---------------------------------------------------------------------------------------------------------------------\n"
                + "RFC Cliente: "+this.cliente.getRfc()+"\t\t\t\t\t\t\t\tRazon Social: "+this.cliente.getRazon()+"\n"
                + "Direccion: "+this.cliente.getDireccion().getCalle()+" "+this.cliente.getDireccion().getNum()+", "+this.cliente.getDireccion().getCd()+" "+this.cliente.getDireccion().getEstado()+"\n"
                + "Telefono: "+this.cliente.getTel()+"\t\t\t\t\t\t\t\t\t\tFecha: "+this.obtenerFecha()+"\n"
                + "---------------------------------------------------------------------------------------------------------------------\n"
                + "CODIGO\t\tNOMBRE\t\t\t\t\tUNIDAD\t\tCANTIDAD\tPRECIO UNITARIO\t\tTOTAL\n"
                + "---------------------------------------------------------------------------------------------------------------------\n";
        for (int i = 0; i < this.producto.length; i++) {
            if(this.producto[i]!=null){
                prod+=this.producto[i]+"\t\t\t"+df.format(producto[i].getCantidad()*producto[i].getPrecioUnitario())+"\n";
            }
        }
        pie="---------------------------------------------------------------------------------------------------------------------\n"
                + "\t\t\t\t\t\t\t\t\t\t\tSubtotal: "+df.format(this.obtenerTotales(1))
                + "\n\t\t\t\t\t\t\t\t\t\t\tImpuesto (8%): "+df.format(this.obtenerTotales(2))
                + "\n\t\t\t\t\t\t\t\t\t\t\tTotal: "+df.format(this.obtenerTotales(3));
        return (base+prod+pie);
    }
    
    //SETTER
    public void setCliente(Cliente c){
        this.cliente=c;
    }
    public void setProdcutos(Producto[] prod){
        this.producto=prod;
        
    }
    public void setCantArt(int cant){
        this.cantArt=(cant>0)?cant:1;
    }
    
    //GETTERS
    public int getNoFact(){
        return this.noFactura;
    }
    public Cliente getCliente(){
        return this.cliente;
    }
    public Producto[] getProducto(){
        return this.producto;
    }
    public int getCantArt(){
        return this.cantArt;
    }
    public int getCont(){
        return Factura.cont;
    }
    
    //METODOS
    public void agregarProductoFact(){
        if(cantArt<30 && cantArt>0){
            Scanner in=new Scanner(System.in);
            int codigo,cantidad;
            String descripcion,unidadMedida;
            double precioUnitario;
            System.out.println("Ingresa los datos del producto:\n");
            System.out.print("Codigo: ");
            codigo=in.nextInt();
            System.out.print("Descripcion: ");
            descripcion=in.next();
            System.out.print("Unidad de Medida: ");
            unidadMedida=in.next();
            System.out.print("Cantidad: ");
            cantidad=in.nextInt();
            System.out.print("Precio Unitario: ");
            precioUnitario=in.nextDouble();
            this.producto[cantArt+1]=new Producto(codigo,descripcion,
                    unidadMedida,cantidad,precioUnitario);
            cantArt++;
        }else{
            System.out.println("ERROR, NO HAY ESPACIO PARA FACTURAR "
                    + "OTRO PRODUCTO");
        }
    }
    
    //METODOS UTILERIA
    private String obtenerFecha(){
        Calendar fecha = new GregorianCalendar();
        int anio = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        return (dia+"/"+(mes+1)+"/"+anio);
    }
    private double obtenerTotales(int op){
        double suma=0.0;
        for (int i = 0; i < this.producto.length; i++) {
            if(this.producto[i]!=null){
                suma+=(producto[i].getCantidad())*(producto[i].getPrecioUnitario());
            }
        }
        switch (op) {
            case 1:
                return suma;
            case 2:
                return (suma*0.08);
            case 3:
                return (suma+(suma*0.08));
        }
        return 0;
    }
}
