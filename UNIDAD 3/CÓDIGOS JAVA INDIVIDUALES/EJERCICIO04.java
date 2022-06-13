//EJERCICIO 4

//Hacer un programa que simule un cajero
//automático con un saldo inicial de 1000 dólares,
//con el siguiente menú de opciones:

package ejercicio.pkg04;
import java.util.Scanner;
public class EJERCICIO04 {

    public static void main(String[] args) {
         Scanner leer=new Scanner(System.in);

        int inicial=1000;
        //para entrar al while
        int op=1;
        //para que este haciendo la iteracion siempre que op sea diferente de 3
                do{
                        //Realizacion de operaciones
                        System.out.println("Por favor, seleccione que acción desea realizar");
                        System.out.println("1.Ingresar dinero a la cuenta");
                        System.out.println("2.Retirar dinero de la cuenta");
                        System.out.println("3.Salir");
                    
                    op=leer.nextInt();

                                    switch(op)
                                    {
                                        case 1:
                                            System.out.println("Cuanto dinero deseas depositar?");
                                            int depositar=leer.nextInt();
                                            inicial+=depositar;
                                            System.out.println("Saldo actual: "+inicial);
                                            break;

                                        case 2:
                                            System.out.println("Retirar dinero de la cuenta");
                                            int retiro=leer.nextInt();
                                            inicial-=retiro;
                                            System.out.println("Saldo actual "+inicial);
                                            break;

                                        case 3:
                                            System.out.println("Gracias,vuelva pronto");
                                            break;
                                    }
                    }while(op!=3);

       

    }
    
}
