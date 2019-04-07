//DEFINICION DE CLASE EJECUTABLE DE CLASE CUENTA BANCARIA
//MARTINEZ ESTRADA JOSHUA
//18111962

package UII_CuentaBancaria;

import java.util.Scanner;

public class mainCuentaBancaria {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        int op,aux=0;
        CuentaBancaria c1=new CuentaBancaria();
        CuentaBancaria c2=new CuentaBancaria(200.00);
        CuentaBancaria c3=new CuentaBancaria(4030.42);
        System.out.print("*Trabajando con Cuenta UNO (C1)*\nIngresa el Saldo: ");
        c1.setSaldo(in.nextDouble());
        System.out.print("\nImprimiendo datos de Cuenta UNO"+c1+"\nImprimiendo datos de Cuenta DOS"+c2+"\nImprimiendo datos de Cuenta TRES"+c3);
        do{
            System.out.print("\n*Trabajando con Cuenta UNO (C1)*\nMENU:\n1.Realizar DEPOSITO\n2.Realizar RETIRO\n3.Mostrar Saldo\n4. Salir\n");
            op=in.nextInt();
            switch(op){
                case 1:
                    System.out.print("\nNumeros NO validos se tomara como 0\nIngresa la cantidad a depositar: ");
                    System.out.println("El nuevo saldo de la cuenta es "+c1.depositar(in.nextDouble()));
                    break;
                case 2:
                    System.out.print("\nNumeros NO validos se tomara como 0\nIngresa la cantidad a retirar: ");
                    c1.retirar(in.nextDouble());
                    break;
                case 3:
                    System.out.println("El saldo de la cuenta es "+c1.getSaldo());
                    break;
                case 4:
                    System.out.println("Selecciono Salir");
                    aux=1;
                    break;
                default:
                    System.out.println("ERROR, Porfavor seleccione una opcion valida");
            }  
        }while(aux==0);
    }
}