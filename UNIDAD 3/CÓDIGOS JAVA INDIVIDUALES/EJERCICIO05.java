//EJERCICIO 5.1

//Programa que imprima en pantalla
//las tablas de multiplicar del 1 al 20.
//Hacerlo con los 3 tipos de
//estructuras iterativas.

package ejercicio.pkg05;

public class EJERCICIO05 {

    public static void main(String[] args) {
        int numerodetabla,contador,mult;
        
        numerodetabla=1;
        
        while(numerodetabla<=20)
            
        {
            
            System.out.println("\nEs la tabla del \n"+(numerodetabla));
            mult=0;
            contador=1;
            while(contador<=10)
            {
                
                mult=numerodetabla*contador;
                System.out.printf("%d X %d=%d\n",numerodetabla,contador,mult);
               
               contador++;  
            }
            numerodetabla++;
        }
    }
    
}
