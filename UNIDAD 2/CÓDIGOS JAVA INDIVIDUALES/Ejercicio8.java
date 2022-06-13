package ejercicio8;
import java.util.Scanner;
public class Ejercicio8 {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        //Ingresamos los datos a utilizar
        System.out.print("Por favor ingrese los numeros: ");
        int n = teclado.nextInt();
        int numeros [] = new int [n];
       //Utilizamos un ciclo while para poder repetir las operaciones
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese dato "+(i+1)+": ");
            numeros [i] = teclado.nextInt();
        }
       
        int mayor, menor;
        mayor = menor = numeros [0];
       //Utilizamos un ciclo while para poder saber que numero es mayor
        for (int i = 0; i < numeros.length; i++) {
            if(numeros [i] > mayor) {
                mayor = numeros[i];
            }
            if(numeros[i]<menor) {
                menor = numeros[i];
            }
        }
        //Mostramos el numero mayor y menor en pantalla
        System.out.println("El mayor valor es: "+mayor);
        System.out.println("El menor valor es: "+menor);
        Scanner in = new Scanner(System.in);
  int x;
  int i;
  int suma=0;
  System.out.println("Digite la cantidad de numeros a sumar"); 
  x = Integer.parseInt(in.next());
  //Utilizamos un ciclo while para poder hacer la suma de varios numeros
  for(i = 0;i < x;i++){ 
   System.out.println("Digite un numero");
   suma = suma + Integer.parseInt(in.next());
  }
  //Mostramos la suma de los numeros en pantalla
  System.out.println("La suma de los numeros es: "+suma);
}
} 
