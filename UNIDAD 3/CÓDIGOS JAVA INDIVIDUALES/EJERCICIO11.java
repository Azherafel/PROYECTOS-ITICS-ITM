//EJERCICIO 11

//Pedir una palabra al usuario y decirle si es
//una PALÍNDROMO.
//Palabra o frase que se lee igual en un
//sentido que en otro (por ejemplo; Ana,
//aérea, ala, allá, ama, oro, oso, pop,
//reconocer, solos, Isaac no ronca así, lo sé
//dama de sol , ojo rojo, luz azul).

package ejercicio.pkg11;
import java.util.Scanner;
public class EJERCICIO11 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Palabras palindromas\n");
        System.out.println("Dame la palabra");
        String palabra=leer.nextLine();
        
        String snespacio=palabra.replaceAll("\\s+","");

        StringBuilder invierte=new StringBuilder(snespacio);
        String palabratoinverse=invierte.reverse().toString();
                 String snespacio2=palabratoinverse.replaceAll("\\s+","");
             
                if(snespacio.compareTo(snespacio2)==0){
            System.out.println("La palabra es palindroma");
                   
                }else{
                        System.out.println("La palabra no es palindroma");
        }
    }
    
}
