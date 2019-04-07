//DEFINICION DE CLASE ABSTRACTA VEHICULO DE CARGA
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIV_Vehiculo;

public abstract class VehiculoCarga extends Vehiculo{
    
    //ATRIBUTOS
    private static double PRECIO_TONELADA=200;
    protected double pma;
    
    //CONSTRUCOTES
    public VehiculoCarga() {
        super();
        this.pma=0;
    }
    public VehiculoCarga(double PMA, String matricula, boolean rentado) {
        super(matricula, rentado);
        this.pma = PMA;
    }
    public VehiculoCarga(Vehiculo v, double pma){
        super(v.getMatricula(),v.rentado);
        this.pma=pma;
    }

    @Override
    public String toString() {
        return super.toString()+"PRECIO TONELADA: " + PRECIO_TONELADA + "; PMA=" + pma;
    }

    //SETTERS
    public static void setPRECIO_TONELADA(double PRECIO_TONELADA) {
        VehiculoCarga.PRECIO_TONELADA = PRECIO_TONELADA;
    }
    public void setPma(double pma) {
        this.pma = pma;
    }

    //GETTERS
    public static double getPRECIO_TONELADA() {
        return VehiculoCarga.PRECIO_TONELADA;
    }
    public double getPma() {
        return pma;
    }
}