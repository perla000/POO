//DEFINICION DE CLASE ABSTRACTA VEHICULO
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIV_Vehiculo;

public abstract class Vehiculo {
    
    //ATRIBUTOS
    private static double PRECIO_DIA=700;
    protected String matricula;
    protected boolean rentado;
    
    //CONSTRUCTORES
    public Vehiculo() {
        this.matricula="ABC1A";
        this.rentado=false;
    }
    public Vehiculo(String matricula, boolean rentado) {
        this.matricula = matricula;
        this.rentado = rentado;
    }

    @Override
    public String toString() {
        return "Vehiculo[MATRICULA="+this.matricula + ",ESTATUS="+this.rentado+"]";
    }

    //SETTERS
    public static void setPRECIO_DIA(double PRECIO_DIA) {
        Vehiculo.PRECIO_DIA = PRECIO_DIA;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setRentado(boolean rentado) {
        this.rentado = rentado;
    }
    
    //GETTERS
    public static double getPRECIO_DIA() {
        return PRECIO_DIA;
    }
    public String getMatricula() {
        return matricula;
    }
    public boolean isRentado() {
        return rentado;
    }
    
    //METODOS ABTSRACTOS
    public abstract double precioAlquiler(int dias);
}