//DEFINICION DE CLASE CAMION (VEHICULO CARGA)
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIV_Vehiculo;

public class VC_Camion extends VehiculoCarga{
    
    private static final double PRECIO_FIJO=400;
    
    //CONSTRUCTORES
    public VC_Camion() {
        super();
    }
    public VC_Camion(double PMA, String matricula, boolean rentado) {
        super(PMA, matricula, rentado);
    }
    public VC_Camion(Vehiculo v, double pma) {
        super(v, pma);
    }
    
    //GETTERS
    public static double getPRECIO_FIJO() {
        return PRECIO_FIJO;
    }
    
    //SOBRESCRITURA DEL METODO ABSTRACTO
    @Override
    public double precioAlquiler(int dias) {
        return Vehiculo.getPRECIO_DIA()*dias+VC_Camion.PRECIO_FIJO;
    }
}