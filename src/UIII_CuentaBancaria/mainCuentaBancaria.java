
//DEFINICION DE CLASE EJECUTABLE CUENTA BANCARIA
//MARTINEZ ESTRADA JOSHUA
//18111962

package UIII_CuentaBancaria;

import java.text.DecimalFormat;
import java.util.Scanner;

public class mainCuentaBancaria {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Ahorros ca=new Ahorros(1254.37);
        DecimalFormat df=new DecimalFormat("#.00");
        Cheques cc=new Cheques(3500.48);
        System.out.print("Selecciones Cuenta: \n"
                + "1. Ahorros\n"
                + "2. Cheques\nOPCION: ");
        String op=in.next();
        double cant;
        switch (op) {
            case "1":
                System.out.println("Cuenta de AHORROS\nSALDO: "+df.format(ca.getSaldo()));
                ca.calcularInteres();
                System.out.print("Intereses del 2% aplicados\nSALDO: "+df.format(ca.getSaldo())+
                        "\nINGRESE CANTIDAD A RETIRAR: ");
                cant=in.nextDouble();
                ca.retiro(cant);
                break;
            case "2":
                System.out.println("Cuenta de CHEQUES\nSALDO: "+df.format(cc.getSaldo()));
                cc.finMes();
                System.out.print("Corte del mes Aplicado\nSALDO: "+df.format(cc.getSaldo())+
                        "\nINGRESE CANTIDAD DE CHEQUE A COBRAR: ");
                cant=in.nextDouble();
                cc.cambiarCheque(cant);
                break;
            default:
                System.out.println("ERROR, CARACTER NO VALIDO");
                break;
        }
    }
}