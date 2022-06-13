//Teniendo un arreglo de 20
//elementos.
//Pedir un número al usuario.
//Desarrollar el algoritmo de
//búsqueda binaria para buscar el
//número que dio el usuario e imprimir
//en pantalla si se encuentra o no y
//en que posición del arreglo.

package caso.pkg12;
import java.util.Scanner;
public class CASO12 {
public static Scanner leer = new Scanner(System.in);
    public static int array[] = {1,2,3,4,5,6,7,8,9,10,12,13,14,15,16,17,18,19,20}; 
    public static int numero;
    public static void main(String[] args) {
        lectura();
        busqueda();
    }
    public static void lectura() 
    {
        System.out.printf("Digite el valor que desea encontrar en el arreglo: ");
        CASO12.numero = leer.nextInt();
        System.out.printf("\n OK");
    }
    
    public static int busqueda() 
    {
            int min = 0, max = array.length;
            int pos = -1;
            while(min <= max) {
                    int centro = (min+max)/2;
                    if(numero == array[centro]) {
                            pos = centro;
                    } else if(numero < array[centro]){
                            max = centro - 1;
                    } else if(numero > array[centro]) {
                            min = centro + 1;
                    }
            }
            System.out.printf("\n%d", pos);
            return pos;
    }
    
}
