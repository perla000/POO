//DEFINICION DE CLASE FECHA
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIII_Empleados;

public class Fecha {
    
    //ATRIBUTOS DE LA CLASE
    private int dia;
    private int mes;
    private int anio;
    
    //CONSTRUCTOR POR OMISION
    public Fecha(){
        this.anio=2000;
        this.mes=1;
        this.dia=1;
    }
    
    //CONSTRUCTOR POR DEFINICION
    public Fecha(int d, int m, int a){
        this.anio=(a>0)?a:2000;
        this.mes=(m>0&&m<=12)?m:1;
        this.dia=checaDia(d);
    }
    
    @Override
    public String toString(){
        String[] diasMes={"","Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto",
            "Septiembre","Octubre","Noviembre","Diciembre"};
        //return "Hoy es "+this.getDia()+" de "+diasMes[this.getMes()]+" del "+this.getAnio()+"\n";
        return this.getDia()+"/"+diasMes[this.getMes()]+"/"+this.getAnio();
    }
    
    //SETTERS DE LA CLASE
    public void setDia(int d) {
        this.dia = checaDia(d);
    }
    public void setMes(int m) {
        this.mes = (m>0&&m<=12)?m:0;
    }
    public void setAnio(int a) {
        this.anio = (a>1900&&a<=2100)?a:2000;
    }
    
    //GETTERS DE LA CLASE
    public int getDia() {
        return this.dia;
    }
    public int getMes() {
        return this.mes;
    }
    public int getAnio() {
        return this.anio;
    }
    
    //METODOS DE UTILERIA
    private int checaDia(int prueba){
        int[] diasMes={0,31,28,31,30,31,30,31,31,30,31,30,31};
        if(this.mes!=2){
            if(prueba>0 && prueba<diasMes[this.mes])
                return prueba;
        }else{
            int days = (this.anio%400==0 ||(this.anio%4==0 && this.anio%100!=0)?29:28);
            if(prueba >0 && prueba <=days)
                return prueba;
        }
        System.out.println("Dia INVALIDO");
        return 1; //SIEMPRE QUE DEVUELVA 1 SIGNIFICA QUE INGRESARON UN VALOR NO VALIDO
    }
}