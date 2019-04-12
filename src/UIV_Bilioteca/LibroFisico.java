//DEFINICION DE CLASE LIBRO FISICO (PUBLICACION)
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIV_Bilioteca;

public abstract class LibroFisico extends Publicaciones{
    
    //ATRIBUTOS
    protected int numPag;
    protected Fecha fechaPub;
    protected boolean prestado;

    //CONSTRUCTORES
    public LibroFisico() {
        super();
        this.numPag = 0;
        this.fechaPub = new Fecha();
        this.prestado = false;
    }
    public LibroFisico(int numPag, Fecha fechaPub, boolean prestaso, String titulo, String editorial, int aPub, String codigo) {
        super(titulo, editorial, aPub, codigo);
        this.numPag = numPag;
        this.fechaPub = fechaPub;
        this.prestado = prestaso;
    }

    @Override
    public String toString() {
        return "LibroFisico{" + "numPag=" + numPag + ", fechaPub=" + fechaPub + ", prestaso=" + prestado + '}';
    }

    //SETTERS
    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }
    public void setFechaPub(Fecha fechaPub) {
        this.fechaPub = fechaPub;
    }
    public void setPrestaso(boolean prestado) {
        this.prestado = prestado;
    }

    //GETTERS
    public int getNumPag() {
        return numPag;
    }
    public Fecha getFechaPub() {
        return fechaPub;
    }
    public boolean isPrestado() {
        return prestado;
    }
}