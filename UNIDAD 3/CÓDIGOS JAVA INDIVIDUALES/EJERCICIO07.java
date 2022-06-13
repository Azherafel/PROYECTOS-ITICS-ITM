//EJERCICIO 7

//Construir un programa que lea
//un número x, e imprima la serie
//de x hasta 0, es decir, en orden
//descendente, uno por cada
//renglón.

package ejercicio.pkg07;
import java.util.Scanner;
public class EJERCICIO07 {

    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        int contador=0;
        
            System.out.println("Ingresa el numero:");
                int numero=leer.nextInt();
                int duplicarn=numero+1;
             
                
                    System.out.print("Los numeros descendentes son\n");
                        
                    while(contador<=numero)
        {
                 duplicarn--;
                 
                 System.out.println(duplicarn);
                          contador++;
        
        }

    }
    
}
