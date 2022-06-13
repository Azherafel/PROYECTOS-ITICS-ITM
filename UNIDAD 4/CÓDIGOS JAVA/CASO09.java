//Calcular la suma de los elementos de
//la diagonal principal de un arreglo
//bidimensional de 5 x 5. La diagonal
//principal inicia en la “esquina”
//superior izquierda y termina en la
//esquina inferior derecha.
//1 función para leer los valores.
//1 función para calcular.
//1 función para imprimir.
package caso.pkg09;
import java.util.Scanner;
public class CASO09 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
  int tab [][]=new int [5][5];
  int c=1;
  for(int i=0; i<5; i++){
  System.out.println("COLUMNA"+(i+1));
  for(int j=0; j<5; j++){
   tab[i][j]=leer.nextInt();
  }
  
  System.out.println("");
  for(int j=0; j<5; j++){
   System.out.println(tab[0][j]+" "+tab[1][j]+" "+tab[2][j]+" "+tab[3][j]+" "+tab[4][j]);
  }
  System.out.println("Los números en diagonal izquierda superior a inferior derecha son:");
  System.out.println(tab[0][0]+"+"+tab[1][1]+"+"+tab[2][2]+"+"+tab[3][3]+"+"+tab[4][4]);
  System.out.println("La suma total de los números es:");
  System.out.println(tab[0][0]+tab[1][1]+tab[2][2]+tab[3][3]+tab[4][4]); 
 }
  
}
}  
    

  
