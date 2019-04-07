//DEFINICION DE CLASE IMPRESION MULTICOLOR
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIV_Impresion;

public class ImpresionMulticolor implements Impresion1,Impresion2{
    @Override
    public void imprimirNegro() {
        System.out.println("Imprimiendo en tinta Negra desde Impresion Multicolor");
    }
    @Override
    public void imprimirAzul() {
        System.out.println("Imprimiendo en tinta Azul desde Impresion Multicolor");
    }
    @Override
    public void imprimirRojo() {
        System.out.println("Imprimiendo en tinta Roja desde Impresion Multicolor");
    }
    @Override
    public void imprimirVerde() {
        System.out.println("Imprimiendo en tinta Verde desde Impresion Multicolor");
    }
}