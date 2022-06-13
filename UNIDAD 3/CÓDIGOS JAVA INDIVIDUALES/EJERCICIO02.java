//EJERCICIO 2

//Una farmacia desea un programa para
//ingresar el valor de compra y calcular lo
//siguiente: si el pago se efectúa al “contado”,
//calcular un descuento del 5%; pero si el pago
//es con “tarjeta” se incrementa un recargo del
//3% al valor de compra.
//Calcular y visualizar el descuento o recargo
//según sea el caso y el total a pagar de la
//compra.

package ejercicio.pkg02;
import java.util.Scanner;
public class EJERCICIO02 {

    public static void main(String[] args) {
         //Declaración de variables
            float monto, descuento, cargo;
            String medioPago;
            char respuesta;
            boolean opcion=false;
            
            //Declaración de escáner para leer
            Scanner leer = new Scanner(System.in);
            
            System.out.printf("FARMACIAS DEL AHORRO \n");
            
            //Pedir al usuario el monto a pagar del producto
            System.out.printf("Capturar el monto a pagar:  \n");
            monto = leer.nextFloat();
            
            
            while (opcion==false)
            {
            
                    //Preguntar si va a pagar en efectivo o con tarjeta
                    System.out.printf("¿Pago en efectivo o con tarjeta? (E/T):  \n");
                    medioPago = leer.next();
                    respuesta = medioPago.charAt(0);
            
                    //si es en efectivo
                    if ( (respuesta=='E') || (respuesta=='e') )
                    {
                        System.out.printf("Se aplicará un descuento del 5 por ciento  \n");
                        descuento = (monto * 5)/ 100;
                        monto = monto - descuento;
                        System.out.printf("Total a pagar:  %.2f  \n", monto);
                        opcion=true;
                    }
                    else if ((respuesta=='T') || (respuesta=='t') )
                    {
                        System.out.printf("Se aplicará un cargo del 3 por ciento  \n");
                        cargo = (monto * 3) / 100;
                        monto = monto + cargo;
                        System.out.printf("Total a pagar:  %.2f  \n", monto);
                        opcion=true;
                    }
                    else
                    {
                        System.out.printf("Tecleó una opción no válida \n");
                        opcion=false;
                    }
            }
    
    } //fin de la clase principal main
}//fin del proyecto
    
