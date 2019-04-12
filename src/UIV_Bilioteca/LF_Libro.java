//DEFINICION DE CLASE LIBRO (LIBRO FISICO)
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIV_Bilioteca;

public class LF_Libro extends LibroFisico{

    //ATRIBUTOS
    private String tipo;
    private String autor;

    //CONSTRUCTORES
    public LF_Libro() {
        super();
        this.tipo = "N/D";
        this.autor = "N/D";
    }
    public LF_Libro(String tipo, String autor, int numPag, Fecha fechaPub, boolean prestaso, String titulo, String editorial, int aPub, String codigo) {
        super(numPag, fechaPub, prestaso, titulo, editorial, aPub, codigo);
        this.tipo = tipo;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "LF_Libro{" + "tipo=" + tipo + ", autor=" + autor + '}';
    }

    //SETTERS
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    //GETTERS
    public String getTipo() {
        return tipo;
    }
    public String getAutor() {
        return autor;
    }
    
    //SOBRESCRITURA DE METODOS ABTRACTOS
    @Override
    public void prestar() {
        
    }
    @Override
    public void devolver() {
        
    }
    @Override
    public void multa(int dias) {
        
    }
    @Override
    public void prestado() {
        
    }
}