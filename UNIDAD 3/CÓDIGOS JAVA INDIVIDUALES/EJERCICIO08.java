//EJERCICIO 8

//Pedir al usuario una
//palabra, como dato de
//salida decir si la palabra
//tiene la vocal“a” o “A”

package ejercicio.pkg08;
import java.util.Scanner;
public class EJERCICIO08 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int limite,contador=0;
        String palabra;
        
        System.out.println("Ingresa una palabra");
        palabra=leer.nextLine();
        
             limite=palabra.length();
         
                while(contador<palabra.length()){   
                    if(palabra.charAt(contador)=='A' ||(palabra.charAt(contador)=='a')){
             
                     System.out.println("Si existe la letra a o A");
                    }
                         
             contador++;    
             
                }
    }
}
