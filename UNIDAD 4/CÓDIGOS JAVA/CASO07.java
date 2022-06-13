//Crear un arreglo de 3 dimensiones que represente los
//lugares ocupados de los 5 vuelos que ofrece VOLARIS.
    //Lugar ocupado=1, libre=0.
    //Leer datos de 3 vuelos.
    //Imprimir lugares ocupados y libres LLAMANDO A UNA FUNCION
package caso.pkg07;
import java.util.Scanner;
public class CASO07 {

    public static void main(String[] args) {
        int r=2, v=1;
  do{
  int fil, col, letra=65, num=1;
  int vul1 [][];
  Scanner leer = new Scanner(System.in);
  System.out.println("VUELO "+v);
  System.out.println("Num de filas");
  fil=leer.nextInt();
  System.out.println("Num de col");
  col=leer.nextInt();
  vul1= new int [fil][col];
  System.out.println("\nOCUPADO=1   LIBRE=0");
  for (int i=0; i<fil; i++){
   for (int j=0; j<col; j++){
    System.out.print("Asiento "+num+""+(char)letra+" ");
    vul1[i][j]=leer.nextInt();
    letra++;
   }
   num++;
   letra=65;
  }
  System.out.println("\nOCUPADO=1   LIBRE=0");
  for (int i=0; i<col+1; i++){
   System.out.print((char)(64+i)+" ");
  }
  System.out.println("");
  for (int j=0; j<fil; j++){
   System.out.print(j+1+" ");
   for(int i=0; i<col; i++){
    System.out.print(vul1[j][i]+" ");
    num++;
   }
   System.out.println("");
  }
  v++;
  System.out.println("\n1=Agregar otro vuelo 2=Salir");
  r=leer.nextInt();
  System.out.println("");
  }while(r==1);

    }
    
}
