//DEFINICION DE CLASE IMPRESION COLOR
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIV_Impresion;

public class ImpresionColor implements Impresion2{
    @Override
    public void imprimirAzul() {
        System.out.println("Imiprimiendo en tinta azul desde Impresion Color");
    }
    @Override
    public void imprimirRojo() {
        System.out.println("Imiprimiendo en tinta Roja desde Impresion Color");
    }
    @Override
    public void imprimirVerde() {
        System.out.println("Imiprimiendo en tinta Verde desde Impresion Color");
    }
}
