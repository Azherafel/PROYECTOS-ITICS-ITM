package ejercicio10;
import java.util.Scanner;
public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Ingresamos los datos 
        System.out.println("Ingrese el numero: ");
        int n = leer.nextInt();
        int factorial = 1;
        //Realizamos un ciclo for para realizar operaciones de forma ciclica
        for(int i = 1; i<=n; i++){
            factorial = factorial * i;
        }
        //Mostramos el resultado en pantalla
        System.out.println("El factorial de: "+n+" es: "+factorial);

    }
    }
    
