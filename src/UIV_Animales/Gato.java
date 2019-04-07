//DEFINCION DE CLASE GATO (ANIMAL)
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIV_Animales;

public class Gato extends Animal implements Depredador,Presa{

    //CONSTRUCTORES
    public Gato() {
        super();
    }
    public Gato(int energia, Posicion posicion, String nombre) {
        super(energia, posicion, nombre);
    }
    public Gato(int energia, int x, int y, String nombre) {
        super(energia, x, y, nombre);
    }

    @Override
    public String toString() {
        return "GATO es un  "+super.toString();
    }
    
    @Override
    public void Cazar(Presa presa) {
        if(presa instanceof Raton){
            System.out.println("CAZANDO RATON");
        }else{
            System.out.println("SOLO CAZA RATONES");
        }
    }

    @Override
    public void Comer(Presa presa) {
        if(presa instanceof Raton){
            System.out.println(this.nombre+" ESTA COMINEDO "+ presa);
        }else{
            System.out.println("SOLO COME RATONES");
        }
    }

    @Override
    public void Huir(Depredador depredador) {
        if(depredador instanceof Perro){
            System.out.println(this.nombre+" HUYENDO DE "+ depredador);
        }else{
            System.out.println("NO SE HUYE DE OTRO GATO\n");
        }
    }
}