//Declarar un arreglo de 20 enteros.
//Leer 20 números en el orden que
//sea.
//Recorrer el arreglo y acomodarlo
//de tal manera que los elementos
//queden ordenados del menor al
//mayor.
//Imprimirlo en pantalla.
package caso.pkg11;
import java.util.Arrays;
import java.util.Scanner;
public class CASO11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // Definición de arreglos
 int arreglo[] = new int[20];
 for(int i=0; i<20; i++)
        {
            // Lectura de datos con ciclo y array
      System.out.println("Inserta el número "+(i+1));
      arreglo[i]=leer.nextInt();
 }
            // Aquí se imprimen los numeros en orden
      System.out.println("\nEl orden de los números de menor a mayor es"
                     + ":");
             // Sort para ordenar
      Arrays.sort(arreglo);
      for(int i=0; i<20; i++){
  System.out.println(arreglo[i]);
 }
    }
    
}

