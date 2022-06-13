//EJERCICIO 15

//Porcentaje de palabras en una oración que tienen
//menos de ó 3 caracteres. El usuario ingresa una
//oración, el resultado debe indicar el porcentaje de
//palabras que tiene menos de 3 caracteres o 3
//caracteres.

package ejercicio.pkg15;
import java.util.Scanner;
public class EJERCICIO15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String oracion1;
        int posicion = 0;
        int cont_Palabras = 1;
        int longitudPalabra = 0;
        int cont_Palabras_de_3 = 0;
        int cont_letras=0;
        float porcentaje = 0f;
        
        System.out.printf("Teclea una oración: \n");
        oracion1=leer.nextLine();
        
        System.out.printf("\nLa oración es:  %s\n",oracion1);
        
        //vamos a recorrer la oracion desde la posición cero
        while (posicion++ < oracion1.length())
        {
             cont_letras ++;
            //si me encuentro con un espacio
            if (oracion1.charAt(posicion)==' ')
            {
                   //le sumamos uno al contador de palabras
                    cont_Palabras ++;

                    //calculamos la longitud de la palabra que acabamos de leer
                    //se resta la posicion actual menos la posicion inicial de la
                    //palabra que acabamos de leer
                    longitudPalabra = cont_letras - 1;

                    //si la longitud nos da 3 o menos le sumamos uno al
                    //contador de palabras de 3 caracteres
                    if (longitudPalabra <= 3)
                        cont_Palabras_de_3 ++;
                    
                    cont_letras = 0;
            }
            else if (posicion == oracion1.length()-1)
            {
                   //calculamos la longitud de la palabra que acabamos de leer
                    //se resta la posicion actual menos la posicion inicial de la
                    //palabra que acabamos de leer
                    longitudPalabra = cont_letras;
                    
                    //si la longitud nos da 3 o menos le sumamos uno al
                    //contador de palabras de 3 caracteres
                    if (longitudPalabra <= 3)
                        cont_Palabras_de_3 ++;
                    
                    cont_letras = 0;
                    
            }
            
            //sumamos 1 a la posicion actual para leer el siguiente caracter
            //de la oracion1
            posicion ++;
        }
        
        //calculamos la regla de 3 para saber el porcentaje de
        //palabras de 3 caracteres o menos
        porcentaje = (cont_Palabras_de_3 * 100) / cont_Palabras;
        
        System.out.printf("\nNúmero de palabras:  %d\n",cont_Palabras);
        System.out.printf("\nPalabras de 3 caracteres o menos:  %d\n",cont_Palabras_de_3);
        System.out.printf("\nPorcentaje de palabras de 3 caracteres o menos:  %.1f\n",porcentaje);
    }
    
}
