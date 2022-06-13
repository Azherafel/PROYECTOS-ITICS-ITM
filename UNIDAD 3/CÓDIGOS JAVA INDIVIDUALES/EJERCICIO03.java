//EJERCICIO 3

//Diseñe un programa que lea la temperatura
//en centígrados del día e imprima el tipo de
//clima de acuerdo a la siguiente tabla:

package ejercicio.pkg03;
import java.util.Scanner;
public class EJERCICIO03 {

    public static void main(String[] args) {
          //Declaración de variables
            float temperatura=0f;
            
            //Declaración de escáner para leer
            Scanner leer = new Scanner(System.in);
            
            //Pedir al usuario la temperatura
            System.out.printf("Capturar la temperatura:  \n");
            temperatura = leer.nextFloat();
            
            //imprimir el clima según la temperatura capturada
            if (temperatura <= 10)
                System.out.printf("Clima frío  \n");
            else if (temperatura > 10 && temperatura <= 20 )
                System.out.printf("Clima templado  \n");
            else if (temperatura > 20 && temperatura <= 30 )
                System.out.printf("Clima caluroso  \n");
            else if (temperatura > 30)
                System.out.printf("Clima tropical  \n");
    }
}
