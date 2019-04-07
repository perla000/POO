//DEFINICION DE CLASE CLIENTE
//MARTINEZ ESTRADA JOSHUA
//18111962

package UII_Cliente;

public class Cliente {
    private String rfc;
    private Direccion dom;
    private String tel;
    private String razonS;
    
    //COSNTRUCTOR POR OMISION
    public Cliente(){
        this.rfc="N/D";
        this.dom=new Direccion();
        this.tel="N/D";
        this.razonS="N/D";
    }
    
    //CONSTRUCTORES CON ARGUMENTOS
    public Cliente(String calle,int num,String col,int cp,String cd,String e,
            String rfc,String tel,String razon){
        this.rfc=rfc;
        this.dom=new Direccion(calle,num,col,cp,cd,e);
        this.tel=tel;
        this.razonS=razon;
    }
    public Cliente(Direccion dom,String rfc,String tel,String razon){
        this.rfc=rfc;
        this.dom=dom;
        this.tel=tel;
        this.razonS=razon;
    }
    
    @Override
    public String toString(){
        return "\nCliente:\n  RFC: "+this.rfc+"\n  Domicilio: "+this.dom+"\n  "
                + "Telefono: "+this.tel+"\n  Razon Social: "+this.razonS;
    }
    
    //SETTERS
    public void setRfc(String rfc){
        this.rfc=rfc;
    }
    public void setDom(Direccion d){
        this.dom=d;
    }
    public void setDom(String calle,int num,String col,int cp,String cd,
            String e){
        this.dom=new Direccion(calle,num,col,cp,cd,e);
    }
    public void setTel(String tel){
        this.tel=tel;
    }
    public void setRazon(String razon){
        this.razonS=razon;
    }
    
    //GETTERS
    public String getRfc(){
        return this.rfc;
    }
    public Direccion getDireccion(){
        return this.dom;
    }
    public String getTel(){
        return this.tel;
    }
    public String getRazon(){
        return this.razonS;
    }
}


