//EJERCICIO 10

//Hacer un menú de operaciones matemáticas:
//Menú
//A. División (no permitir la división entre cero, se
//debe validad que el divisor no sea cero)
//B. Potencia
//C. Raíz cuadrada.
//D. Salir
//El usuario debe teclear una letra para elegir. Usar la
//función EQUAL Ó EQUALSIGNORECASE. 

package ejercicio.pkg10;
import java.util.Scanner;
public class EJERCICIO10 {

    public static void main(String[] args) {
         Scanner leer=new Scanner(System.in);
            int menu=0;
            int a,b;
            float c;
            double resultado;
            do{
            
                System.out.println("Menú de operaciones matemáticas\n");
                
                System.out.println("A.División");
                System.out.println("B.Potencia");
                System.out.println("C.Raíz cuadrada");
                System.out.println("D.Salir");
                    
                    String op=leer.nextLine();

            //Division 
            if(op.equalsIgnoreCase("a"))
            {
                    System.out.println("Dame el numero 1");
                    a=leer.nextInt();
                    System.out.println("Dame el numero 2");
                    b=leer.nextInt();
                        if(b!=0)
                        {
                        c=(float)a/b;
                            System.out.println("El valor de la división es \n" +c);
                        }
                        else
                        {
                            System.out.println("Lo sentimos,el divisor es 0 y no podemos hacer la operacion\n");
                        }
                        menu=0;
                }
            
            //Potencia
             if(op.equalsIgnoreCase("b"))
             {
                 
                System.out.println("Dame la base");
                a=leer.nextInt();
                System.out.println("Dame la pot");
                b=leer.nextInt();
                System.out.printf("el numero %d a la potencia %d es %.0f\n",a,b,Math.pow(a,b));
                    
                    menu=0;
                 //break;
             }  
                         
            //Raiz
             if(op.equalsIgnoreCase("c"))
             {
                 
                a=leer.nextInt();
                resultado=Math.sqrt(a);
                System.out.printf("la raiz de numero %d es %.2f\n",a,resultado);
                menu=0;
                 //break;
             }   
               
            //caso salir
            if(op.equalsIgnoreCase("d"))
            {
                menu=1;
                break;
             }
                
             System.out.println("");
             }while(menu!=1);   
    }
    
}
