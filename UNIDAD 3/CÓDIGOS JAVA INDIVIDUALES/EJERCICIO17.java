//EJERCICIO 17

//Algoritmo para encontrar el valor mayor y
//menor de una serie de valores alfabéticos.
//Dada una lista de valores alfabéticos en
//desorden, por ejemplo: f, g, b, a, q el
//algoritmo deberá de encontrar la letra de
//mayor orden y la letra de menor orden en la
//lista. Imprimiendo por ejemplo Mayor = q y
//menor = a.

package ejercicio.pkg17;
import java.util.Scanner;
public class EJERCICIO17 {

    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        char letr, letrM;
        int tLetras=0, x=0;

        System.out.println("Dime cuantas letras vas a ingresar: ");
        tLetras=n.nextInt();
        String letra[]=new String[tLetras];
        int let[]=new int[tLetras], letraM[]=new int[tLetras];

        while (x<tLetras){
            System.out.println("Dime una letra: ");
            letra[x]=n.next();
            letr = letra[x].charAt(0);
            let[x] = (int) letr;
            x++;
        }

        x=0;
        while(x<tLetras){
            if (let[x]>=letraM[x]){
                letraM[x]=let[x];
            }
            x++;
        }
        letrM=(char) letraM[x-1];
        System.out.println("La letra mas grande es: "+letrM);
    }
    
}
