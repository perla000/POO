//DEFINICION DE CLASE ABSTRACTA VEHICULO DE PASAJEROS
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIV_Vehiculo;

public abstract class VehiculoPasajero extends Vehiculo{
    
    //ATRIBUTOS
    private static double PRECIO_PLAZA_DIA=15;
    protected int plazas;

    //CONSTRUCTORES
    public VehiculoPasajero() {
        super();
        this.plazas=0;
    }
    public VehiculoPasajero(int plazas, String matricula,boolean rentado) {
        super(matricula,rentado);
        this.plazas = (plazas>0)?plazas:4;
    }
    public VehiculoPasajero(Vehiculo v,int plazas) {
        super(v.getMatricula(),v.rentado);
        this.plazas = (plazas>0)?plazas:4;
    }

    @Override
    public String toString() {
        return super.toString()+ "Lugares: " + this.plazas;
    }

    //SETTERS
    public void setPlazas(int plazas) {
        this.plazas = (plazas>0)?plazas:4;
    }
    public static void setPRECIO_PLAZA_DIA(double PRECIO_PLAZA_DIA) {
        VehiculoPasajero.PRECIO_PLAZA_DIA = (PRECIO_PLAZA_DIA>0)?PRECIO_PLAZA_DIA:15;
    }
    
    //GETTERS
    public int getPlazas() {
        return plazas;
    }
    public static double getPRECIO_PLAZA_DIA() {
        return PRECIO_PLAZA_DIA;
    }
}