//DEFINICION DE CLASE FURGONETA (VEHICULO CARGA)
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIV_Vehiculo;

public class VC_Furgoneta extends VehiculoCarga{
    
    //CONSTRUCTORES
    public VC_Furgoneta() {
        super();
    }
    public VC_Furgoneta(double PMA, String matricula, boolean rentado) {
        super(PMA, matricula, rentado);
    }
    public VC_Furgoneta(Vehiculo v, double pma) {    
        super(v, pma);
    }

    //SOBREESCRITURA DEL METODO ABSTRACTO
    @Override
    public double precioAlquiler(int dias) {
        return (Vehiculo.getPRECIO_DIA()+(VehiculoCarga.getPRECIO_TONELADA()*this.pma))*dias;
    }
}

