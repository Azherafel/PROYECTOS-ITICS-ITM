//EJERCICIO 14

//Realizar de nuevo el
//ejercicio 10, utilizando
//métodos o funciones.

package ejercicio.pkg14;
import java.util.Scanner;
import java.lang.Math;
public class EJERCICIO14 {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int potencia = 0, division = 0, j = 0, i=0, x=0;
        double raiz = 0.0;
        String des;

        System.out.println("Bienvenido a la calculadora.");
        System.out.println("¿Que deseas hacer");
        System.out.println("A.División");
        System.out.println("B.Potencia.");
        System.out.println("C.Raiz cuadrada.");
        System.out.println("D.Salir.");
        des=n.next();

        while(des!="D"){
            if (des.equalsIgnoreCase("a")){
                System.out.println("Dame un numero: ");
                j=n.nextInt();
                System.out.println("Dame otro numero: ");
                i=n.nextInt();
                if(j==0 && i==0){
                    System.out.println("No se puede dividir 0 entre 0");
                } else {
                    division = div(j,i);
                    System.out.println("La division es: "+ division);
                }
            } else if (des.equalsIgnoreCase("b")){
                System.out.println("Dame un numero: ");
                j=n.nextInt();
                System.out.println("Dame una potencia: ");
                i=n.nextInt();
                potencia=pot(j,i);
                System.out.println("La division es: "+ potencia);
            } else if (des.equalsIgnoreCase("r")){
                System.out.println("Dame un numero: ");
                j=n.nextInt();
                raiz=rCuadrada(j);
                System.out.println("La raiz cuadrada del numero es: "+ raiz);
            } else if (des.equalsIgnoreCase("d")){
                salir();
            } else{
                System.out.println("Esa opcion no es valida");
            }
            System.out.println("\nSelecciona otra opcion: ");
            System.out.println("Las opciones son ");
            System.out.println("A.División");
            System.out.println("B.Potencia.");
            System.out.println("C.Raiz cuadrada.");
            System.out.println("D.Salir.");
            des=n.next();
        }
    }

    public static int div(int var1, int var2){
        return var1/var2;
    }
    public static int pot(int var1, int var2){
        return (int) Math.pow(var1,var2);
    }
    public static int rCuadrada(int var){
        return (int) Math.sqrt(var);
    }
    public static int salir(){
        System.out.println("Gracias por usar este menu.");
        System.exit(1);

        return 0;
    }
    
}
