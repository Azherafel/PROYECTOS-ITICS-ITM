package ejercicio.pkg2;
import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {
         //Declaracion del scanner
        Scanner leer = new Scanner(System.in);
        
       //Se mostrara en pantalla lo que se le pide al usuario
        System.out.println("Dame elnumero a convertir a hexa");
        
        //se declara la variable 
        int numerotoexa=leer.nextInt();
        
        //Se muestra en pantalla el numero escrito y su resultado en hexadecimal, si es que este tiene
        System.out.printf("el numero %1$d en exa es %1$x\n",numerotoexa);
    }
    
}
