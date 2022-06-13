//EJERCICIO 16

//Suponiendo que el sistema monetario de un país está
//formado por monedas de valores, v1, v2, …, vn; el
//problema del cambio de dinero consiste en
//descomponer cualquier cantidad dada de M en
//monedas de ese país utilizando el menor número de
//monedas posible.

//Objetivo: Realice un programa que resuelva el
//problema del cambio de dinero para monedas del país
//con denominación V = {1, 2, 5, 10, 20}.

package ejercicio.pkg16;
import java.util.Scanner;
public class EJERCICIO16 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.printf("Ingresa el cambio que quieres devolver en monedas: \n");
        int cantidad=leer.nextInt();

        
        
       
                int monedas20=Math.floorDiv(cantidad,20);
                cantidad-=monedas20*20;
                 if(cantidad<0)
                 {
                    monedas20=0;
                 }      

                  int monedas10=Math.floorDiv(cantidad,10);
                 cantidad-=monedas10*10;
                 if(cantidad<=0)
                 {
                    monedas10=0;
                 }      


                int monedas5=Math.floorDiv(cantidad,5);
                 cantidad-=monedas5*5;
                 if(cantidad<0)
                 {
                    monedas5=0;
                 }      

                 int monedas2=Math.floorDiv(cantidad,2);
                 cantidad-=monedas2*2;
                 if(cantidad<0)
                 {
                 monedas2=0;
                 }      


                 int monedas1=Math.floorDiv(cantidad,1);
                 cantidad-=monedas1*1;

                  if(cantidad<0)
                  {
                        monedas1=0;
                  } 
            
         System.out.printf("Ocupamos:\n-%d de $20\n-%d de $10\n-%d de $5\n-%d de $2\n-%d de $1\n",monedas20,monedas10,monedas5,monedas2,monedas1);


        

    }
    
}
