//DEFINICION DE CLASE PUBLICACIONES
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIV_Bilioteca;

public abstract class Publicaciones implements Prestable{
    
    //ATRIBUTOS
    protected String titulo;
    protected String editorial;
    protected int aPub;
    protected String codigo;
    
    //CONSTRUCTORES
    public Publicaciones() {
        this.titulo = "N/D";
        this.editorial = "N/D";
        this.aPub = 2000;
        this.codigo = "ABC12D";
    }
    public Publicaciones(String titulo, String editorial, int aPub, String codigo) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.aPub = aPub;
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Publicaciones{" + "titulo=" + titulo + ", editorial=" + editorial + ", aPub=" + aPub + ", codigo=" + codigo + '}';
    }

    //SETTERS
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public void setaPub(int aPub) {
        this.aPub = aPub;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    //GETTERS
    public String getTitulo() {
        return titulo;
    }
    public String getEditorial() {
        return editorial;
    }
    public int getaPub() {
        return aPub;
    }
    public String getCodigo() {
        return codigo;
    }
}
