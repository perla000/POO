//DEFINICION DE CLASE HIJA PERRO
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIII_Animales;

public class Perro extends Animal{
    
    //ATRIBUTOS
    private String nombre;
    
    //CONSTRUCTORES
    public Perro(){
        super();
        this.nombre="N/D";
    }
    public Perro(String habitad, String tipo,String nombre) {
        super(habitad, tipo);
        this.nombre = nombre;
    }
    public Perro(String nombre) {
        super();
        this.nombre = nombre;
    }
    public Perro(String nombre, Animal a) {
        super(a);
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Perro es un "+super.toString() + " y su nombre es: " + this.nombre;
    }
    
    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //GETTERS
    public String getNombre() {
        return nombre;
    }
    
    //METODOS
    @Override
    public void comer(String comida) {
        System.out.println("Este Animal puede comer un poco de TODO y ahora come: "+comida);
    }
    
}
