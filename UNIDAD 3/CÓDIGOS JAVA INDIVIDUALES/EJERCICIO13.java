//EJERCICIO 13

//Leer 3 palabras.
//Ordenarlas
//alfabéticamente y
//mostrarlas en pantalla.

package ejercicio.pkg13;
import java.util.Scanner;
public class EJERCICIO13 {

    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        String palabra1, palabra2, palabra3;
        char palab1, palab2, palab3;
        int plb1, plb2, plb3;

        System.out.println("Escribe la primera palabra:");
        palabra1=n.next();
        System.out.println("Escribe la segunda palabra:");
        palabra2=n.next();
        System.out.println("Escribe la tercera palabra:");
        palabra3=n.next();

        palab1=palabra1.charAt(0);
        palab2=palabra2.charAt(0);
        palab3=palabra3.charAt(0);

        plb1=(int)palab1;
        plb2=(int)palab3;
        plb3=(int)palab3;

        if(plb1<plb2&&plb1<plb3){
            if(plb2<plb3){
                System.out.println("Las palabras en orden es:"+ palabra1 + palabra2 + palabra3);
            } else{
                System.out.println("Las palabras en orden es:"+ palabra1 + palabra3 + palabra2);
            }
        } else if(plb2<plb1&&plb2<plb3){
            if(plb1<plb3){
                System.out.println("Las palabras en orden es:"+ palabra2 + palabra1 + palabra3);
            } else{
                System.out.println("Las palabras en orden es:"+ palabra2 + palabra3 + palabra1);
            }
        } else if(plb3<plb1&&plb3<plb2){
            if(plb1<plb2){
                System.out.println("Las palabras en orden es:"+ palabra3 + palabra1 + palabra2);
            } else{
                System.out.println("Las palabras en orden es:"+ palabra3 + palabra2 + palabra1);
            }
        }else{
            System.out.println("No se puede ordenar las palabras");
        }
    }
    
}
