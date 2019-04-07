//DEFINICION DE CLASE TIEMPO
//MARTINEZ ESTRADA JOSHUA
//18111962

package UII_Tiempo;

public class Tiempo {
    
    //ATRIBUTOS DE LA CLASE
    private int hora;
    private int min;
    private int seg;
    
    //CONSTRUCTOR POR OMISION
    public Tiempo(){
        this.hora=0;
        this.min=0;
        this.seg=0;
    }
    
    //CONSTRUCTOR POR DEFINICION
    public Tiempo(int h,int m,int s){
        this.hora=(h>=0&&h<=23)?h:0;
        this.min=(m>=0&&m<=59)?m:0;
        this.seg=(s>=0&&s<=59)?s:0;
    }
    
    @Override
    public String toString(){
        int h=this.hora%12;
        String x = (h==0?12:h)+":"+(this.min<10?"0":"")+this.min+":"+(this.seg<10?"0":"")+this.seg+(this.hora<12?" AM":" PM");
        return x;
    }
    
    //SETTERS DE LA CLASE
    public void setHora(int h) {
        this.hora=(h>=0&&h<=23)?h:0;
    }
    public void setMin(int m) {
        this.min=(m>=0&&m<=59)?m:0;
    }
    public void setSeg(int s) {
        this.seg=(s>=0&&s<=59)?s:0;
    }
    
    //GETTERS DE LA CLASE
    public int getHora() {
        return hora;
    }
    public int getMin() {
        return min;
    }
    public int getSeg() {
        return seg;
    }
}