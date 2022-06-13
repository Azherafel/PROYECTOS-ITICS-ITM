//EJERCICIO 9

//Pedir al usuario una oración
//o frase de al menos 2
//palabras. Contar cuantas
//palabras hay y cuantas
//letras.

package ejercicio.pkg09;
import java.util.Scanner;
public class EJERCICIO09 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int contador=0;
        int cpalabras=1;
        
            System.out.println("Ingresa una oracion");
            String oracion=leer.nextLine();
        
       
        //Se reemplaza el espacion por la letra i
            String neworacion=oracion.replace(' ','i');
                int cletras=neworacion.length();

        
        //Para que no se cuente el espacion de letras como palabra
        while(contador<neworacion.length())
            {
           
                if(neworacion.charAt(contador)=='i'){        
                        cletras--;
                        cpalabras++;
                }

                contador++;
            }
            System.out.println("hay "+cpalabras+" palabras");
            System.out.println("Total de letras "+cletras);
    }
    
}
