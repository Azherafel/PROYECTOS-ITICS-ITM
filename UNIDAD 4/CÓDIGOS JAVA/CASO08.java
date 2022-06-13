//En 1 arreglo de 2 dimensiones,
//permutar los valores de 1 fila
//hacia la otra y viceversa.
    //1 función para la lectura.
    //1 función para el cálculo.
    //1 función para la impresión
package caso.pkg08;
import java.util.Scanner;
public class CASO08 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int val1, val2;
        System.out.println("valores de la fila num #1");
        val1=leer.nextInt();
        int dime1[]=new int [val1];
        for(int i=0; i<val1; i++){
            System.out.println("valor:");
            dime1[i]=leer.nextInt();
        }
        System.out.println("valores de la fila num #2");
        val2=leer.nextInt();
        int dime2[]=new int [val2];
        for(int i=0; i<val2; i++){
            System.out.println("valor:");
            dime2[i]=leer.nextInt();
        }
        System.out.println("");
        for(int i=0; i<val1; i++){
            System.out.print(dime1[i]+" ");
        }
        System.out.println("");
        for(int i=0; i<val2; i++){
            System.out.print(dime2[i]+" ");
        }
        System.out.println("");
        for(int i=0; i<val2; i++){
            System.out.print(dime2[i]+" ");
        }
        System.out.println("");
        for(int i=0; i<val1; i++){
            System.out.print(dime1[i]+" ");
        }
 }
}

    