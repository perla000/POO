//EJEMPLO DE CLASE PERSONA
//MARTINEZ ESTRADA JOSHUA
//18111962

package UII_Persona;

public class Persona {
    private String nombre;
    private String apPat;
    private String apMat;
    private int edad;
    private String genero;
    private Fecha nac;
    public static int contPersonas;
   
    //CONSTRUCTOR POR OMISION (DEFAULT)
    public Persona(){
        this.nombre="N/A";
        this.apPat="N/A";
        this.apMat="N/A";
        this.edad=0;
        this.genero="N/A";
        this.nac=new Fecha();
        contPersonas++;
    }
    
    //CONSTRUCTORES POR DEFINICION
    public Persona(String n,String ap,String am,int e,String g,Fecha nac){
        this.nombre=n;
        this.apPat=ap;
        this.apMat=am;
        this.edad=e>0&&e<120?e:18;
        this.genero=g;
        this.nac=nac;
        contPersonas++;
    }
    public Persona(String n,String ap,String am,int e,String g,int dia,int mes,int anio){
        this.nombre=n;
        this.apMat=am;
        this.apPat=ap;
        this.edad=e>0&&e<120?e:18;
        this.genero=g;
        this.nac=new Fecha(dia,mes,anio);
        contPersonas++;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+this.nombre+" "+this.apPat+" "+this.apMat+"\nEdad: "+this.edad+"\nGenero: "+this.genero+"\n"; 
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
}
