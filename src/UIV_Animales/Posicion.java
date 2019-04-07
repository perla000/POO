//DEFINICION DE CLASE POSICION
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIV_Animales;

public class Posicion {
    
    //ATRIBUTOS DE LA CLASE
    private int x;
    private int y;
    
    //CONSTRUCTORES
    public Posicion(){
        this.x=0;
        this.y=0;
    }
    public Posicion(int x, int y){
        this.x = (x>=0)?x:0;
        this.y = (y>=0)?y:0;
    }
    
    @Override
    public String toString(){
        return "["+this.x+","+this.y+"]";
    }
    
    //SETTERS
    public void setX(int x) {
        this.x = (x>=0)?x:0;
    }
    public void setY(int y) {
        this.y = (y>=0)?y:0;
    }
    
    //GETTERS
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}