//DEFINICION DE CLASE CANCION
//MARTINEZ ESTRADA JOSHUA
//18111962

package UII_Album;

public class Cancion {
    
    //ATRIBUTOS
    private String titulo;
    private String autor;
    
    //CONSTRUCTOR POR OMISION
    public Cancion(){
        this.titulo="N/D";
        this.autor="N/D";
    }
    
    //CONSTRUCTOR POR DEFINICION
    public Cancion(String t, String a){
        this.titulo=t;
        this.autor=a;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+this.titulo+"\nAutor: "+this.autor;
    }
    
    //SETTERS
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    //GETTERS
    public String getTitulo() {
        return this.titulo;
    }
    public String getAutor() {
        return this.autor;
    }
}