//CLASE LIBROS
//MARTINEZ ESTRADA JOSHUA
//18111962

package UII_Libros;

public class Libros {
    
    //ATRIBUTOS DE LA CLASE
    private String titulo;
    private String autor;
    private double precio;
    private String editorial;
    private int NoHojas;
    
    //CONSTRUCTOR POR OMISION
    public Libros(){
        this.titulo="N/A";
        this.autor="N/A";
        this.editorial="N/A";
        this.precio=0;
        this.NoHojas=0;
    }
    
    //CONSTRUCTOR POR DEFINICION
    public Libros(String t, String a,String e, int p, int h){
        this.titulo=t;
        this.autor=a;
        this.editorial=e;
        this.precio=(p>=0)?p:0;
        this.NoHojas=(h>0)?h:1;
    }
    
    @Override
    public String toString(){
        return "\nFicha Tecnica:\nNombre: "+this.getTitulo()+"\nAutor: "+this.getAutor()+"\nEditorial: "+this.getEditorial()+"\nNo. Hojas: "+this.getHojas()+"\nPrecio: "+this.getPrecio();
    }
    
    //SETTERS DE LA CLASE
    public void setTitulo(String t){
        this.titulo=t;
    }
    public void setAutor(String a){
        this.autor=a;
    }
    public void setEditorial(String e){
        this.editorial=e;
    }
    public void setPrecio(double p){
        this.precio=(p>=0)?p:0;
    }
    public void setHojas(int h){
        this.NoHojas=(h>0)?h:1;
    }
    
    //GETTERS DE LA CLASE
    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public String getEditorial(){
        return this.editorial;
    }
    public double getPrecio(){
        return this.precio;
    }
    public int getHojas(){
        return this.NoHojas;
    }
}
