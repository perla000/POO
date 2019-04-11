//DEFINICION DE INTERFAZ PRESTABLE
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIV_Bilioteca;

public interface Prestable {
    
    //METODOS ABSTRACTOS
    public abstract void prestar();
    public abstract void devolver();
    public abstract void multa(int dias);
    public abstract void prestado();
}