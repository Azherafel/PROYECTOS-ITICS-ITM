//PROBLEMA B
//Mientras Iris buscaba información en internet encontró información sobre el 
//código ASCII al leer esa información a ella le interesó esto, y su intención 
//de ella es aprenderlo por lo tanto le comento a su amigo Francisco para que 
//la ayudará a estudiar y practicar el código ASCII, así que Iris ahora le 
//escribe a Francisco sus mensajes en código ASCII, pero desafortunadamente él 
//no le entiende a este código por lo tanto él te contacto a ti como buen 
//programador para que lo ayudes a construir un traductor de cadenas recibidas 
//en ASCII para que él le pueda entender.

//Entrada
//N números ASCII

//Salida
//El significado de la palabra
package problema.b;
import java.util.Scanner;
public class PROBLEMAB {

    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
            int ascii, longitud, x;

        System.out.println("Escribe el numero de palabras de la frase sin contar los espacios: ");    
        longitud=n.nextInt();    
        char valor[]=new char[longitud];    
        for(x=0; x<longitud; x++) {
      
            System.out.println("Valor en ASCII: ");    
            ascii = n.nextInt();      
            valor[x]=(char)ascii;     
        }
    
        for (x=0; x<longitud; x++){      
            System.out.print(valor[x]);
    
        }
    
    }
    
}
