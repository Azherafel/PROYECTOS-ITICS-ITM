package ejercicio3.pkg1;
import java.util.Scanner;
public class EJERCICIO31 {

    public static void main(String[] args) {
        int n1, n2, n3;
      Scanner leer=new Scanner(System.in);
      //Leemos los numeros que deseamos sumar
      System.out.print("Introduce dos números: ");
      n1=leer.nextInt();
      n2=leer.nextInt();
      n3 =n1+n2;
      //Se arroja el resultado correcto
      System.out.print("La suma es: " + n3);
    }
    
}
