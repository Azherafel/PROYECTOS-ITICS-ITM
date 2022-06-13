//EJERCICIO 6

//Construir un programa que
//calcule el factorial de un
//valor numérico tecleado por
//el usuario

package ejercicio.pkg06;
import java.util.Scanner;
public class EJERCICIO06 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int factorial=1;
        int contador=1;
        
            System.out.println("Ingresa el numero del cual quieres saber su factorial:");
                int numero=leer.nextInt();
                
                while(contador<=numero)
                 {           factorial*=contador;
            
                             contador++;
                 }

        System.out.println("Su numero factorial es\n:"+factorial); 
    }
    
}
