//DEFINICION DE CLASE ANIMAL
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIV_Animales;

public class Animal {
    
    //ATRIBUTOS
    protected int energia;
    protected Posicion posicion;
    protected String nombre;

    //CONSTRUCTORRES
    public Animal() {
        this.energia = 1;
        this.posicion = new Posicion();
        this.nombre = "N/D";
    }
    public Animal(int energia, Posicion posicion, String nombre) {
        this.energia = (energia>0)?energia:1;
        this.posicion = posicion;
        this.nombre = nombre;
    }
    public Animal(int energia, int x, int y, String nombre) {
        this.energia = (energia>0)?energia:1;
        this.posicion = new Posicion(x,y);
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "ANIMAL; NOMBRE: "+this.nombre+" ENERGIA: "+this.energia+" POSICION "+this.posicion;
    }

    //SETTERS
    public void setEnergia(int energia) {
        this.energia = (energia>0)?energia:1;
    }
    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }
    public void setPosicion(int x, int y) {
        this.posicion = new Posicion(x,y);
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //GETTERS
    public int getEnergia() {
        return energia;
    }
    public Posicion getPosicion() {
        return posicion;
    }
    public String getNombre() {
        return nombre;
    }
    
    //METODOS
    public void moverse(int x, int y){
        this.posicion.setX(x);
        this.posicion.setY(y);
    }
}