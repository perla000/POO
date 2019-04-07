//DEFINICION DE CLASE COHCE (VEHICULO PASAJEROS)
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIV_Vehiculo;

public class VP_Coche extends VehiculoPasajero{

    //CONSTRUCTORES
    public VP_Coche() {
        super();
    }
    public VP_Coche(int plazas, String matricula, boolean rentado) {
        super(plazas, matricula, rentado);
    }
    public VP_Coche(Vehiculo v, int plazas) {
        super(v, plazas);
    }
    
    //SOBRESCRITURA METODO ABSTRACTO
    @Override
    public double precioAlquiler(int dias) {
        return Vehiculo.getPRECIO_DIA()+(VehiculoPasajero.getPRECIO_PLAZA_DIA()*this.plazas)*dias;
    }
}

