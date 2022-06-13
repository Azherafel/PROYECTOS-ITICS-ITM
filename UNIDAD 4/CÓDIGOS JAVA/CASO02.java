//Calcular la media de las estaturas
//de una clase considerando un
//número x de alumnos definidos
//por teclado.
//Deducir cuantos son más altos
//que la media y cuantos son más
//bajos que la media.
package caso.pkg02;
import java.util.Scanner;
public class CASO02 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numalumnos, alum=1, may=0, men=0;
        float arreglo[];
        float sumesta=0, media=0;
        System.out.println("Número de alumnos:");
        numalumnos=leer.nextInt();
        arreglo=new float [numalumnos];
        for (int cont=0; cont<numalumnos; cont++){
            System.out.printf("Estatura en centimetros " + alum + ":");
            alum++;
            arreglo[cont]=leer.nextFloat();
            sumesta+=arreglo[cont];
        }
        media=sumesta/numalumnos;
        System.out.printf("Media: %.2f", media);
        for(int cont=0; cont<numalumnos; cont++){
         if(arreglo[cont]>media){
          may++;
         }if(arreglo[cont]<media){
          men++;
         }
        }
        System.out.printf("\nAltos arriba de la media: %d", may);
        System.out.printf("\nBajos arriba de la media: %d", men);

    }
    
}
