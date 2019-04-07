//DEFINICION DE CLASE EJECUTABLE IMPRESIONES 
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIV_Impresion;

public class mainImpresion {
    public static void main(String[] args) {
        Impresion1 impr;
        System.out.println("\nImpresion solo tinta Negra: ");
        impr=new ImpresionSencilla();
        impr.imprimirNegro();;
        impr= new ImpresionMulticolor();
        impr.imprimirNegro(); 
        //SOLO SE VISUALIZA EL METODO DEBIDO A QUE FINAL DE CUENTAS ESTAMOS TRABAJANDO 
        //CON UN ARCHIVO DE IMPRESION SEINCILLA
        System.out.println("\nImpresiones a colores: ");
        Impresion2 imp;
        imp=new ImpresionColor();
        imp.imprimirAzul();
        imp.imprimirRojo();
        imp.imprimirVerde();
        imp= new ImpresionMulticolor();
        imp.imprimirAzul();
        imp.imprimirRojo();
        imp.imprimirVerde();
    }
}
