//DEFINICION CLASE PERRO (ANIMAL)
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIV_Animales;

public class Perro extends Animal implements Depredador{
    
    //CONSTRUCTORES
    public Perro() {
        super();
    }
    public Perro(int energia, Posicion posicion, String nombre) {
        super(energia, posicion, nombre);
    }
    public Perro(int energia, int x, int y, String nombre) {    
        super(energia, x, y, nombre);
    }

    @Override
    public String toString() {
        return "PERRO es un : "+super.toString();
    }
    
    @Override
    public void Cazar(Presa presa) {
        if(presa instanceof Gato){
            System.out.println("CAZANDO GATO");
        }else{
            System.out.println("SOLO CAZA GATOS");
        }
    }

    @Override
    public void Comer(Presa presa) {
        if(presa instanceof Gato){
            System.out.println(this.nombre+" ESTA COMINEDO "+ presa);
        }else{
            System.out.println("SOLO COME GATOS");
        }
    }
}