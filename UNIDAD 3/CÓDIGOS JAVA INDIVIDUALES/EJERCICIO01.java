//EJERCICIO 1 AÑO BISISESTO

//Para determinar si un año es bisiesto, siga estos pasos:
//1. Si el año es divisible por 4, vaya al paso 2. De lo contrario,
//vaya al paso 5.
//2. Si el año es divisible por 100, vaya al paso 3. De lo
//contrario, vaya al paso 4.
//3. Si el año es divisible por 400, vaya al paso 4. De lo
//contrario, vaya al paso 5.
//4. El año es un año bisiesto (tiene 366 días).
//5. El año no es un año bisiesto (tiene 365 días).

package ejercicio.pkg01;
import java.util.Scanner;
public class EJERCICIO01 {

    public static void main(String[] args) {
            //Declaración de variables
            int annio;
            //Declaración de escáner para leer
            Scanner leer = new Scanner(System.in);
            
            //Pedimos al usuario que teclee un año
            System.out.println("Teclea un año: ");
            annio=leer.nextInt();
            
            //Si es divisible entre 4 pasamos a la siguiente validación
            if ( annio % 4 == 0 ) 
            {
                        //si es divisible entre 100 pasamos a la tercera validación
                        if ( annio % 100 == 0 ) 
                        {
                                    //si es divisible entre 400 es bisiesto entonces
                                    if ( annio % 400 == 0 ) 
                                                System.out.println("Es bisiesto"); 
                                    else 
                                                System.out.println("No es bisiesto");
                        } 
                        else  
                                    System.out.println("No es bisiesto");
            }  
            else
                        System.out.println("No es bisiesto");
    }
    
}
