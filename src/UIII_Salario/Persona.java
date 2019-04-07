//EJEMPLO DE CLASE PERSONA
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIII_Salario;

public class Persona {
    protected String nombre;
    protected String apPat;
    protected String apMat;
    protected int edad;
    protected String genero;
    protected Fecha nac;
    protected Direccion domicilio;
   
    //CONSTRUCTORES
    public Persona(){
        this.nombre="N/A";
        this.apPat="N/A";
        this.apMat="N/A";
        this.edad=0;
        this.genero="N/A";
        this.nac=new Fecha();
        this.domicilio=new Direccion();
    }
    public Persona(String n,String ap,String am,int e,String g,Fecha nac,Direccion dom){
        this.nombre=n;
        this.apPat=ap;
        this.apMat=am;
        this.edad=e>0&&e<120?e:18;
        this.genero=g;
        this.nac=nac;
        this.domicilio=dom;
    }
    public Persona(String n,String ap,String am,int e,String g,int dia,int mes,int anio,
            String calle,int num,String col, int cp,String cd,String estado){
        this.nombre=n;
        this.apMat=am;
        this.apPat=ap;
        this.edad=e>0&&e<120?e:18;
        this.genero=g;
        this.nac=new Fecha(dia,mes,anio);
        this.domicilio=new Direccion(calle,num,col,cp,cd,estado);
    }
    public Persona(String nombre, String apPat, String apMat, int edad, String genero) {
        this.nombre = nombre;
        this.apPat = apPat;
        this.apMat = apMat;
        this.edad = edad;
        this.genero = genero;
        this.nac=new Fecha();
        this.domicilio=new Direccion();
    }
    
    @Override
    public String toString(){
        return "Nombre: "+this.nombre+" "+this.apPat+" "+this.apMat+"\nEdad: "+this.edad+
                "\nGenero: "+this.genero+"\n"; 
    }
    
    //SEETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApPat(String apPat) {
        this.apPat = apPat;
    }
    public void setApMat(String apMat) {
        this.apMat = apMat;
    }
    public void setEdad(int edad) {
        this.edad = (edad>0&&edad<120)?edad:18;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setNac(Fecha nac){
        this.nac=nac;
    }
    public void setNac(int dia, int mes, int anio){
        this.nac=new Fecha(dia,mes,anio);
    }
    public void setDom(Direccion dom){
        this.domicilio=dom;
    }
    public void setDom(String calle,int num,String col, int cp,String cd,String estado){
        this.domicilio=new Direccion(calle,num,col,cp,cd,estado);
    }
    
    //GETTERS 
    public String getNombre() {
        return nombre;
    }
    public String getApPat() {
        return apPat;
    }
    public String getApMat() {
        return apMat;
    }
    public int getEdad() {
        return edad;
    }
    public String getGenero() {
        return genero;
    }   
    public Fecha getNac(){
        return this.nac;
    }
    public Direccion getDom(){
        return this.domicilio;
    }
}