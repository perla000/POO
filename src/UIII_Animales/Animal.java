//DEFINICION DE CLASE PADRE ANIMAL
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIII_Animales;

public class Animal {
    
    //ATRIBUTOS DE LA CLASE
    protected String habitad;
    protected String tipo;
    
    //CONTRUCTURES
    public Animal(String habitad, String tipo) {
        this.habitad = habitad;
        this.tipo = tipo;
    }
    public Animal(){
        this.habitad="N/D";
        this.tipo="N/D";
    }
    public Animal(Animal a){
        this.habitad=a.getHabitad();
        this.tipo=a.getTipo();
    }

    @Override
    public String toString() {
        return "Animal con habitad en " + habitad + ", y de tipo " + tipo;
    }
    
    //SETTERS
    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    //GETTERS
    public String getHabitad() {
        return habitad;
    }
    public String getTipo() {
        return tipo;
    }
    
    //METODOS
    public void comer(String comida){
        System.out.println("Come: "+comida);
    }
}
