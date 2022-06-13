//Aplicar el caso 12 para un
//arreglo de cadenas, para
//buscar si existe una cadena
//que comience con la letra
//que indique el usuario y en
//que posición.
package caso.pkg14;
import java.util.Scanner;
public class CASO14 {
public static Scanner leer = new Scanner(System.in);
    
    //funcion para la busqueda binaria
    static int binario(String[] array, String cadena)
    {
        //descomponer el arreglo en la mitad correspondiente
        int min = 0, max= array.length - 1;
        while (min<= max) {
            int centro= (min+max) / 2;
 
            int posicion = cadena.compareTo(array[centro]);
 
            // ver si la cadena esta en la mitad
            if (posicion == 0)
                return centro;
 
            // para tomar la mitad de la derecha
            if (posicion> 0)
                min = centro + 1;
 
            // para tomar la mitad de la derecha
            else
                max = centro - 1;
        }
 
        return -1;
    }
    public static void main(String[] args) {
         
        String[] arr = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m" ,"n", "ñ", "o", "p", "q", "r", "s"};
        System.out.println("Dame la letra a buscar");
        String cadena = leer.nextLine();
        
        //invoca la funcion binario y le pasa 2 paraetros
        int resultado = binario(arr, cadena);
 
        //el valor que se tome resultado,dira que hacer
        if (resultado == -1)
            System.out.println("La letra no existe");
        else
            System.out.println("La letra existe,fue encontrada en la posicion " +(resultado+1));
    }
}
   
