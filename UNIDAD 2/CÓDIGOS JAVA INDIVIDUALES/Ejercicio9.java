package ejercicio9;
import java.util.Scanner;
public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Declaramos variables
        int i, n;
        double capital_a_depositar_en_euros, capital_total_acumulado, duracion_del_deposito_en_semanas, tasa_de_interes;
        //Ingresamos el numero de veces que deseamos hacer el proceso
        System.out.print("Ingresa el valor de n: ");
        n = in.nextInt();
        in.nextLine();
        //Utilizamos un ciclo while
        for (i=1; i<=n; i++) {
            //Numero de proceso
            System.out.print("PROCESO " + i);
            //Solicitamos los datos requeridos para realizar la operacion
            System.out.print("Ingresa el valor de capital a depositar en pesos: ");
            capital_a_depositar_en_euros = in.nextDouble();
            in.nextLine();
            System.out.print("Ingresa el valor de duracion del deposito en semanas: ");
            duracion_del_deposito_en_semanas = in.nextDouble();
            in.nextLine();
            System.out.print("Ingresa el valor de tasa de interes: ");
            tasa_de_interes = in.nextDouble();
            in.nextLine();
            capital_total_acumulado=capital_a_depositar_en_euros*Math.pow(1.0+tasa_de_interes/100/365,duracion_del_deposito_en_semanas*7);
            //Mostramos el resultado
            System.out.println("Valor de capital total acumulado: " + capital_total_acumulado);
            System.out.println();
        }
    }

}
    
