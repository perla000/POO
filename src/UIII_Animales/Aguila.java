//DEFINICION DE CLASE HIJA AGUILA
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIII_Animales;

public class Aguila extends Animal{
    
    //ATRIBUTOS
    private int alas;

    public Aguila(String habitad, String tipo, int alas) {
        super(habitad,tipo);
        this.alas=(alas==2)?alas:2;
    }  
    public Aguila(int alas){
        super();
        this.alas=(alas==2)?alas:2;
    }
    public Aguila(){
        super();
        this.alas=2;
    }
    public Aguila(Animal a, int alas){
        super(a);
        this.alas=(alas==2)?alas:2;
    }

    @Override
    public String toString() {
        return "Aguila es un "+super.toString() + " con "+alas+" alas";
    }

    //SETTERS
    public void setAlas(int alas) {
        this.alas=(alas==2)?alas:2;
    }

    //GETTERS
    public int getAlas() {
        return alas;
    }
    
    //METODOS
    public void volar(){
        System.out.println("Este Animal vuela");
    }
}
