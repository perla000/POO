//DEFINICION DE CLASE MICROBUS (VEHICULO PASAJEROS)
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIV_Vehiculo;

public class VP_Microbus extends VehiculoPasajero{

    //CONSTRUCTORES
    public VP_Microbus() {
        super();
    }
    public VP_Microbus(int plazas, String matricula, boolean rentado) {
        super(plazas, matricula, rentado);
    }
    public VP_Microbus(Vehiculo v, int plazas) {
        super(v, plazas);
    }
    
    //SOBREESCRITURA METODO ABSTRACTO
    @Override
    public double precioAlquiler(int dias) {
        return (Vehiculo.getPRECIO_DIA()+(VehiculoPasajero.getPRECIO_PLAZA_DIA()+this.plazas))*
                dias+VehiculoPasajero.getPRECIO_PLAZA_DIA()*this.plazas;
    }
}