package ejercicio12;
import java.util.Scanner;
public class Ejercicio12 {

    public static void main(String[] args) {
          //para leer las variables
               Scanner leer=new Scanner (System.in);
               //declaracion de variables
               int contador=0,frecuencia=50,tope=8,menor=0,etapa=0;
               String etapa1="Inicial",etapa2="Colocar paracaidas",etapa3="Subida al avion",etapa4="Despegue",etapa5="Salto";
               String etapa6="Apertura de paracaidas",etapa7="Aterrizaje",etapa8="Recuperacion";
               //meter bandera para que persista si no esta en el rango de los numeros 50 y 219
               int entrar=0;
               System.out.println("Calcularemos en cual etapa presento una frecuencia cardiaca menor");
                //solicitar frecuencias
               while(contador<tope)
               {
                    System.out.printf("Dame la frecuencia %d\n",contador+1);
                    frecuencia=leer.nextInt();
                    if(50<=frecuencia && frecuencia<220)
                        {
                            entrar=1;
                            System.out.println("\n");
                        }
                    else
                        {
                            //para cuando las precuencias no son entre rango x
                            System.out.println("Digita un numero entre 50 y 219");
                        }
                        //para que entre si la frecuencia es =1
                            while(entrar==1)
                            {
                                    if(contador==0)
                                    {
                                        etapa=contador+1;
                                        menor=frecuencia;
                                    }

                                    if(frecuencia<menor)
                                     {
                                        menor=frecuencia;
                                        etapa=contador+1;
                                     }
                                contador++;
                                entrar=0;
                            }
               }
                        System.out.println("Etapa donde presento una frecuencia cardiaca menor:\n");
                       switch(etapa)
                       {
                           case 1:
                               System.out.printf("\tEtapa: %s.\n\tFrecuencia: %d\n",etapa1,menor);       
                               break;
                           case 2:
                               System.out.printf("\tEtapa: %s.\n\tFrecuencia: %d\n",etapa2,menor);
                               break;
                           case 3:
                               System.out.printf("\tEtapa: %s.\n\tFrecuencia: %d\n",etapa3,menor);
                               break;
                           case 4:
                               System.out.printf("\tEtapa: %s.\n\tFrecuencia: %d\n",etapa4,menor);
                               break;
                           case 5:
                               System.out.printf("\tEtapa: %s.\n\tFrecuencia: %d\n",etapa5,menor);
                               break;
                           case 6:
                               System.out.printf("\tEtapa: %s.\n\tFrecuencia: %d\n",etapa6,menor);
                               break;
                           case 7:
                               System.out.printf("\tEtapa: %s.\n\tFrecuencia: %d\n",etapa7,menor);
                               break;
                           case 8:
                               System.out.printf("\tEtapa: %s.\n\tFrecuencia: %d\n",etapa8,menor);
                               break;
                       }
        }
}

    
