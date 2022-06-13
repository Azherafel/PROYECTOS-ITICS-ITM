//Aplicar el caso 11 para un
//arreglo de cadenas, las
//cuales deberán estar
//ordenadas en el arreglo
//alfabéticamente.

package caso.pkg13;
import java.util.Scanner;
public class CASO13 {

    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);

        //decimos de cuantos espacios sera nuestro arreglo
        //aqui mete tu arreglo,son 20 espacios
        String arreglo[] = {"A  A A B B C C C C E F G G G G  H I K M N Q L O Z"};
        String aux="";

        
        for (int i = 0; i <arreglo.length - 1; i++) { 
            for (int j = 0; j < arreglo.length- 1; j++) {
                if (arreglo[j].compareTo(arreglo[j + 1]) > 0) { 
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux; 
                }
            }
        }
        
        System.out.println("\nEl arreglo ordenado alfabeticamente : ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println( arreglo[i]);
        }


    }
    
}
  
