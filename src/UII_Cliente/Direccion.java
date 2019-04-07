//DEFINICION DE CLASE DIRECCION
//MARTINEZ ESTRADA JOSHUA
//18111962

package UII_Cliente;

public class Direccion {
    
    //ATRIBUTOS
    private String calle;
    private int num;
    private String col;
    private int cp;
    private String cd;
    private String estado;
    
    //CONSTRUCTOR POR OMISION
    public Direccion(){
        this.calle="N/D";
        this.num=1;
        this.col="N/D";
        this.cp=11111;
        this.cd="N/D";
        this.estado="N/D";
    }
    
    //CONSTRUCTOR CON PARAMETROS
    public Direccion(String calle,int num,String col,int cp,String cd,
            String estado){
        this.calle=calle;
        this.num=(num>1)?num:1;
        this.col=col;
        this.cp=(cp>11111)?cp:11111;
        this.cd=cd;
        this.estado=estado;
    }
    
    @Override
    public String toString(){
        return "\n    Calle: "+this.calle+"\n    Numero casa: "+this.num+
                "\n    Colonia: "+this.col+"\n    Codigo Postal: "+this.cp+"\n"
                + "    Ciudad: "+this.cd+"\n    Estado: "+this.estado;
    }
    
    //SETTERS
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public void setNum(int num) {
        this.num=(num>1)?num:1;
    }
    public void setCol(String col) {
        this.col = col;
    }
    public void setCp(int cp) {
        this.cp=(cp>11111)?cp:11111;
    }
    public void setCd(String cd) {
        this.cd = cd;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    //GETTERS
    public String getCalle() {
        return calle;
    }
    public int getNum() {
        return num;
    }
    public String getCol() {
        return col;
    }
    public int getCp() {
        return cp;
    }
    public String getCd() {
        return cd;
    }
    public String getEstado() {
        return estado;
    }
}