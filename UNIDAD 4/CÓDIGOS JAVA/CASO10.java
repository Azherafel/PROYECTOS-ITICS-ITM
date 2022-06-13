//Una empresa tiene 3 almacenes. Se
//necesita un algoritmo para leer las ventas
//mensuales de los 3 almacenes, es decir,
//la venta de cada dia del mes de cada
//almacén.
//Calcular la media de ventas de cada
//almacén.
//Imprimir las medias de cada uno e
//indicar cual de los 3 almacenes tuvo una
//venta con promedio superior a la media
//de los 3.
//¿Qué funciones utilizarías?
package caso.pkg10;
import java.util.Scanner;
public class CASO10 {

    public static void main(String[] args) {
        Scanner leer =new Scanner (System.in);
        // Definición de arreglos
        int alm1[]=new int [12];
        int alm2[]=new int [12];
        int alm3[]=new int [12];
        // Definición de variables
        int sum1=0, sum2=0, sum3=0;
        double prom1=0, prom2=0, prom3=0,prom;
        // Lectura datos almacen 1
        System.out.println("\nIntroduce los daots del almacen 1");
        for(int i=0; i<12; i++)
        {
            System.out.printf("Introduce las ventas del mes " + (i+1)+": ");
            alm1[i]=leer.nextInt();
            sum1+=alm1[i];
        // Lectura de datos almacen 2    
        }
        System.out.println("\nIntroduce los datos del almacen 2");
        for(int i=0; i<12; i++)
        {
            System.out.printf("Introduce las ventas del mes " + (i+1)+": ");
            alm2[i]=leer.nextInt();
            sum2+=alm2[i];
        }
        // Lectura de datos almacen 3
        System.out.println("\nIntroduce los datos del almacen 3");
        for(int i=0; i<12; i++)
        {
            System.out.printf("Introduce las ventas mes " + (i+1)+": ");
            alm3[i]=leer.nextInt();
            sum3+=alm3[i];
        }
        // Impresión de promedios (media)
        prom1=(sum1/12);
        System.out.println("\nMedia de almacen 1 = " +prom1);
        prom2=(sum2/12);
        System.out.println("\nMedia de almacen 2 = " +prom2);
        prom3=(sum3/12);
        System.out.println("\nMedia de almacen 3 = " +prom3);
        // Se promedia
        prom=(prom1+prom2+prom3)/3;
        //Condicionales en base a la mayor media
        if(prom1>prom)
        {
            System.out.println("\nEl almacen 1 fue la mayor media de los 3 almacenes ");
        }
        if(prom2>prom)
        {
            System.out.println("\nEl almacen 2 fue la mayor media de los 3 almacenes ");
        }
        if(prom3>prom)
        {
            System.out.println("\nEl almacen 3 fue la mayor media de los 3 almacenes ");
        }
        

    }
    
}
