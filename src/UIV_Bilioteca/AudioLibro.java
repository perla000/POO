//DEFINICION DE LA CLASE AUDIO LIBRO (PUBLICACIONES)
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIV_Bilioteca;

public class AudioLibro extends Publicaciones{
    
    //ATRIBUTOS
    private int capacidad;
    private int duracion;

    //CONSTRUCTORES
    public AudioLibro() {
        super();
        this.capacidad = 0;
        this.duracion = 0;
    }
    public AudioLibro(int capacidad, int duracion, String titulo, String editorial, int aPub, String codigo) {
        super(titulo, editorial, aPub, codigo);
        this.capacidad = capacidad;
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "AudioLibro{" + "capacidad=" + capacidad + ", duracion=" + duracion + '}';
    }

    //SETTERS
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    //GETTERS
    public int getCapacidad() {
        return capacidad;
    }
    public int getDuracion() {
        return duracion;
    }
    
    //IMPLEMENTACION DE METODOS ABSTRACTOS
    @Override
    public void prestar() {
        
    }
    @Override
    public void devolver() {
        
    }
    @Override
    public void multa(int dias) {
        
    }
    @Override
    public void prestado() {
        
    }
}