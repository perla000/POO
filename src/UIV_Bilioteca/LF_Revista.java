//DEFINICION DE CLASE REVISTA (LIBRO FISICO)
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIV_Bilioteca;

public class LF_Revista extends LibroFisico{

    //CONSTRUCTORES
    public LF_Revista() {
        super();
    }
    public LF_Revista(int numPag, Fecha fechaPub, boolean prestaso, String titulo, String editorial, int aPub, String codigo) {
        super(numPag, fechaPub, prestaso, titulo, editorial, aPub, codigo);
    }

    @Override
    public String toString() {
        return "LF_Revista{" + '}';
    }
    
    //SOBRESCRITURA DE METODOS ABSTRACTOS
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