//DEFINICION CLASE RATON (ANIMAL)
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIV_Animales;

public class Raton extends Animal implements Presa{

    //CONSTRUCTORES
    public Raton() {
        super();
    }
    public Raton(int energia, Posicion posicion, String nombre) {
        super(energia, posicion, nombre);
    }
    public Raton(int energia, int x, int y, String nombre) {
        super(energia, x, y, nombre);
    }

    @Override
    public String toString() {
        return "RATON es un: "+super.toString();
    }
    
    @Override
    public void Huir(Depredador depredador) {
        System.out.println(this.nombre+" HUYENDO DE "+ depredador);
    }
}