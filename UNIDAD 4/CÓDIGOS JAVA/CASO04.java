//Multiplicacion de matrices
package caso.pkg04;
import java.util.Scanner;
public class CASO04 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
                int max_x, max_y;  //máximo renglón y columna m1 
                int max_r, max_c;  //máximo renglón y columna m2
                int renglonM1, columnaM1; //renglones y columnas de m1
                int renglonM2, columnaM2; //renglones y columnas de m2
                int acum=0;
                int reng_resp=0, col_resp=0;
                
                System.out.printf("\nMULTIPLICACIÓN DE MATRICES");
                
                //Leer limites de la matriz 1
                System.out.printf("\nNúmero de renglones de matriz 1: ");
                max_x=leer.nextInt();
                System.out.printf("\nNúmero de columnas de matriz 1: ");
                max_y=leer.nextInt();
                int m1[][]=new int [max_x][max_y];
                
                //Leer matriz 1
                for (renglonM1=0; renglonM1 < max_x; renglonM1++)
                {
                        System.out.printf("\nRenglon %d ",renglonM1);
                        for (columnaM1=0; columnaM1 < max_y; columnaM1++)
                        {
                                System.out.printf("\n\tValor columna %d = ",columnaM1);
                                m1[renglonM1][columnaM1]=leer.nextInt();
                        }
                }
                          
                //Leer limites de la matriz 2
                System.out.printf("\nNúmero de renglones de matriz 2: ");
                max_r=leer.nextInt();
                System.out.printf("\nNúmero de columnas de matriz 2: ");
                max_c=leer.nextInt();
                int m2[][]=new int [max_r][max_c];
                
                //Leer matriz 2
                for (renglonM2=0; renglonM2 < max_r; renglonM2++)
                {
                        System.out.printf("\nRenglon %d ",renglonM2);
                        for (columnaM2=0; columnaM2 < max_c; columnaM2++)
                        {
                                System.out.printf("\n\tValor columna %d = ", columnaM2);
                                m2[renglonM2][columnaM2]=leer.nextInt();
                        }
                }
                
                //Crear matriz 3 para guardar resultado de la multiplicacion de ambas
                int m3[][]=new int [max_x][max_c];
                
                //cambiar de renglón en la matriz 1
                for (renglonM1=0;   renglonM1 < max_x;   renglonM1++)
                {
                        columnaM1 = 0;
                        columnaM2 = 0;
                        col_resp = 0;
                        
                                //cambiar de columna en la matriz 1
                                while (columnaM1   <   max_y)
                                {               
                                            renglonM2 = 0;
                                            acum = 0;
                                            while (renglonM2   <   max_r)
                                            {
                                                    acum = acum + (m1[renglonM1][columnaM1]*m2[renglonM2][columnaM2]);
                                                    columnaM1 ++;
                                                    renglonM2 ++;
                                            }
                                            m3[reng_resp][col_resp] = acum;
                                            columnaM2 ++;
                                            col_resp ++;
                                            if (columnaM2   <   max_c)
                                                    columnaM1 = 0;    //si cambio de columna reinicio y para volver a
                                                    //comenzar en la columna 0 de matriz 1
                                }                                 
                                reng_resp++;
                }
                
                //Imprimir la matriz 3
                System.out.printf("\n");
                for (reng_resp=0;   reng_resp < max_x;   reng_resp++)
                {
                        System.out.printf("\n");
                        for (col_resp=0; col_resp < max_c; col_resp++)
                                System.out.printf("%10d",m3[reng_resp][col_resp]);
                }
                System.out.printf("\n\n");
    }
}
