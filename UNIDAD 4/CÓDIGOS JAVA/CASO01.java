//Leer las temperaturas mínimas y
//máximas que se dieron en la ciudad
//de Morelia en una semana.
    //Sacar el promedio de lastemperaturas máximas y las mínimas y
    //presentarlas en pantalla.
    //Presentar la temperatura más alta y la más baja.
package caso.pkg01;
import java.util.Scanner;
public class CASO01 {

    public static void main(String[] args) {
        //String dias[]=new String[7]; SIN INICIALIZAR VALORES
            
            //En este renglón se declara e inicializa el arreglo al mismo tiempo
            String dias[]={"Lunes","Martes","Miercoles","Jueves","Viernes","Sábado","Domingo"};
            
            int posicion, acum_max=0, acum_min=0, prom_max=0, prom_min=0; 
            int min_1=0, max_1=0;
            
            //Arreglo para guardar temperaturas máximas de cada día
            int temp_max[]=new int[7];
            //Arreglo para guardar temperaturas mínimas de cada día
            int temp_min[]=new int[7];
            
            //Declaración del scanner para leer datos
            Scanner leer=new Scanner(System.in);
            
            //Leer los valores
            for(posicion=0; posicion < 7; posicion++)
            {
                       //Escribir el día en pantalla
                       System.out.printf("\nDia %s:  ",dias[posicion]);
                       //Escribir el mensaje de temperatura máxima
                       System.out.printf("\nTemperatura máxima: ");
                       //Leer temperatura máxima
                       temp_max[posicion]=leer.nextInt();
                       //Escribir el mensaje de temperatura mínima
                       System.out.printf("\nTemperatura mínima: ");
                       //Leer temperatura mínima
                       temp_min[posicion]=leer.nextInt();
            }
            
            //Escribirlos después
            //Recorrer el arreglo de posicion 0 a 6
            for(posicion=0; posicion < 7; posicion++)
            {
                       System.out.printf("\nDia %s:  ",dias[posicion]);
                       System.out.printf("\nTemperatura máxima: %d",temp_max[posicion]);
                       System.out.printf("\nTemperatura mínima: %d ",temp_min[posicion]);
            }
                                        
            //Promedio temperatura minima
            //Recorrer el arreglo de posicion 0 a 6
            for(posicion=0; posicion < 7; posicion++)
                      //acumular o sumar todas las temperaturas mínimas
                      acum_min = acum_min + temp_min[posicion];
            
            //calcular el promedio
            prom_min = acum_min / 7;
            System.out.printf("\n\nPromedio temperatura mínima: %d ",prom_min);
               
            //Promedio temperatura máxima
            //Recorrer el arreglo de posicion 0 a 6
            for(posicion=0; posicion < 7; posicion++)
                      //acumular o sumar todas las temperaturas máximas
                      acum_max = acum_max + temp_max[posicion];
            
            //calcular el promedio
            prom_max = acum_max / 7;
            System.out.printf("\nPromedio temperatura máxima: %d ",prom_max);
                  
           //Buscar la temperatura más pequeña del arreglo de temperaturas minimas
           
           //En una variable guardamos la primera temperatura
           min_1 = temp_min[0];
           
           //Recorrer el arreglo de posicion 0 a 5
           //porque siempre vamos a comparar con la posicion siguiente
           //no podemos permitir que la variable posicion llegue a 6
           //porque dentro del IF leemos posicion+ 1
           //entonces cuando posicion llega a 5 se lee la posicion 5+1
           //es decir la 6 que es la última del arreglo
           for(posicion=0; posicion < 6 ; posicion++)
                       //si la temperatura de la posicion siguiente es menor a lo que tiene
                      // la variable se debe actualizar la variable
                       if( temp_min[posicion + 1] < min_1)
                           min_1 = temp_min[posicion + 1];
           
           //escribir la temperatura mínima
           System.out.printf("\nTemperatura mínima: %d ",min_1);
           
           //Buscar la temperatura maxima en el arreglo de temperaturas máximas
           
           //En una variable guardamos la primera temperatura
           max_1 = temp_max[0];
           
           //Recorrer el arreglo de posicion 0 a 5
           //porque siempre vamos a comparar con la posicion siguiente
           //no podemos permitir que la variable posicion llegue a 6
           //porque dentro del IF leemos posicion+ 1
           //entonces cuando posicion llega a 5 se lee la posicion 5+1
           //es decir la 6 que es la última del arreglo
           for(posicion=0; posicion < 6; posicion++)
                      //si la temperatura de la posicion siguiente es mayor a lo que tiene
                      // la variable se debe actualizar la variable
                       if( temp_max[posicion+1] > max_1)
                           max_1 = temp_max[posicion + 1];
           
           //escribir la temperatura máxima
           System.out.printf("\nTemperatura máxima: %d ",max_1);     
    }
    
}
