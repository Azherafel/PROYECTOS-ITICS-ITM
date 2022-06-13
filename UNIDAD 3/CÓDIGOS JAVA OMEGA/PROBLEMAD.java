//PROBLEMA D
//Dieguito vio en su clase de biología las etapas de la vida, 
//pero aún no las distingue muy bien. Tu tarea es ayudar a Dieguito 
//haciendo un programa el cual, dado un número de entrada , el cual 
//representa una edad, te diga si dicha edad corresponde a un bebé, niño, 
//joven, adulto o adulto de la tercera edad. Para lograr lo anterior, 
//considera la siguiente clasificación:
    //Bebé: De 0 a 3 años, inclusive.
    //Niño: De 4 a 14 años, inclusive.
    //Joven: De 15 a 18 años, inclusive.
    //Adulto: de 19 a 65 años, inclusive.
    //Adulto de la tercera edad: de 65 años en adelante.
package problema.d;
import java.util.Scanner;
public class PROBLEMAD {

    public static void main(String[] args) {
        //Declaración de variables
            float edad=0f;
            
            //Declaración de escáner para leer
            Scanner leer = new Scanner(System.in);
            
            //Pedir al usuario la edad 
            System.out.printf("Ingresa la edad:  \n");
            edad = leer.nextFloat();
            
            //imprimir edad capturada y mostrar en pantalla al grupo que
            //pertenece
            if (edad <= 0)
                System.out.printf("Edad  \n");
            
            else if (edad > 0 && edad <= 3 )
                System.out.printf("Es un bebe  \n");
            
            else if (edad > 4 && edad <= 14 )
                System.out.printf("Es un niño  \n");
            
            else if (edad > 15 && edad <= 18 )
                System.out.printf("Es un joven  \n");
            
            else if (edad > 19 && edad <= 64 )
                System.out.printf("Es un adulto  \n");
            
            else if (edad > 65 && edad <= 100 )
                System.out.printf("Es un adulto de la tercera edad  \n");
    }
    
}
