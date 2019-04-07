//DEFINICION DE CLASE HIJA DELFIN
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIII_Animales;

public class Delfin extends Animal{
    
    //ATRIBUTOS
    private int numAletas;

    //CONSTRUCTORES
    public Delfin(){
        super();
        this.numAletas=2;
    }
    public Delfin(String habitad, String tipo,int numAletas) {
        super(habitad, tipo);
        this.numAletas = (numAletas==2)?numAletas:2;
    }
    public Delfin(int numAletas) {
        super();
        this.numAletas = (numAletas==2)?numAletas:2;
    }
    public Delfin(Animal a,int numAletas) {
        super(a);
        this.numAletas = (numAletas==2)?numAletas:2;
    }

    @Override
    public String toString() {
        return "Delfin es un "+super.toString() + " con "+this.numAletas+" Aletas";
    }
    
    //SETTERS
    public void setNumAletas(int numAletas) {
        this.numAletas = (numAletas==2)?numAletas:2;
    }
    
    //GETTERS
    public int getNumAletas() {
        return numAletas;
    }
    
    //METODOS
    public void nadar(){
        System.out.println("Este animal esta nadando\n");
    }
}
