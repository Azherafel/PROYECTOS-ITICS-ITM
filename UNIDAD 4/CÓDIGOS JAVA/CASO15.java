//Cambio de posicion de una matriz
package caso.pkg15;
import java.util.Scanner;
public class CASO15 {
 
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Llenado de matriz");
        int matriz[][]=new int[3][3];
        int[][] matrizT = new int[matriz[0].length][matriz.length];
        
        //llenamos matriz
        for (int i = 0; i < matriz.length; i++) 
        {
            for (int j = 0; j < matriz.length; j++) 
            {
                matriz[i][j]=leer.nextInt();
            }
        }
        
        //imprimimos 
        System.out.println("Matriz");
        
        for (int i = 0; i < matriz.length; i++) 
        {
              
            for (int j = 0; j < matriz.length; j++) 
            {
                System.out.print(matriz[i][j]+"\t");

            }
              System.out.println("");
           
        }
          
        //intercambiamos lugares de la matriz original con la matriz nueva
	for (int i= 0; i< matriz.length; i++)
	{
            for (int j = 0; j< matriz[i].length; j++)
            {
				matrizT[i][j] = matriz[j][i];
            }
	}
        //imprimimos la matriz transpuesta
		System.out.println("Matriz Traspuesta" + "\n");
		
	for(int i = 0; i <matriz.length; i++)
	{
		for(int j = 0; j < matriz[i].length; j++)
		{
				System.out.print(matrizT[i][j] + "\t" );
		}
			System.out.println();
	}     
    }
    
}
  
