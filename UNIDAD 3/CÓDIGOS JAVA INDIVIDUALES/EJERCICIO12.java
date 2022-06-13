//EJERCICIO 12

//Pedir una cadena de números
//al usuario, como String,
//asegurarse que no tenga
//espacios y luego convertirla a
//Integer e imprimirla en
//pantalla.

package ejercicio.pkg12;
import java.util.Scanner;
public class EJERCICIO12 {

    public static void main(String[] args) {
         Scanner leer=new Scanner(System.in);
     
    System.out.println("Ingresa el numero a convertir:");
     
         String numeroS=leer.nextLine();
         String snespacio=numeroS.replaceAll("\\s+","");
     
//Para que se eliminen los espacios
     int numeroI=Integer.parseInt(snespacio);
       
     
    System.out.printf("El numero es %d\n",numeroI);


    }
    
}
