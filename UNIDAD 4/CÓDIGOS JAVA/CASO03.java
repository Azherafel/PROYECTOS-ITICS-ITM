//Se tiene un array de 10 espacios que
//contiene desde la posición 0 a la 7
//marcas de coches ya
//establecidos/asignados (es decir 8
//marcas).
    //El arreglo está en orden alfabético.
    //Se desea insertar las 2 faltantes pero
    //en el lugar correspondiente
    //alfabéticamente.
package caso.pkg03;
import java.util.Scanner;
public class CASO03 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
            int pos, inserta_en=0;
            String marca1, marca2;
            String coches []=new String [10];
            //Leer ocho marcas, dejar vacias las posiciones 8 y 9
            System.out.printf("\nINTRODUCIR OCHO MARCAS DE COCHES");
            for (pos=0;pos<(coches.length)-2;pos++)
            {
                    System.out.printf("\nTeclea una marca: ");
                    coches[pos]=leer.next();
            }
            //Leer las dos marcas que faltan pero guardarlas en otras variables
            System.out.printf("\nTeclear dos marcas más, diferentes a las anteriores");
            System.out.printf("\nLa primera: ");
            marca1=leer.next();
            System.out.printf("\nLa segunda: ");
            marca2=leer.next();
            
            //Mostrar las marcas guardadas en el arreglo
            for (pos=0;pos<(coches.length)-2;pos++)
                    System.out.printf("\nPosición %d: %s ",pos,coches[pos] );
            
            //Buscar la posición donde se debe guardar marca1
            for(pos=0;pos<(coches.length)-2;pos++)
                    if (marca1.compareTo(coches[pos])>=0)
                            inserta_en=pos+1;
            System.out.printf("\nMarca1 se debe insertar en la posición %d",inserta_en);
            
            //Mover las cadenas a una posición más adelante e
            //insertar en la posicion identificada la marca1
            for(pos=(coches.length)-2;pos>=inserta_en;pos--)
            {
                    coches[pos]=coches[pos-1];
                    if (pos==inserta_en)
                        coches[pos]=marca1;
            }
            //Vamos a imprimir el arreglo para verificar que se insertó marca1
            for (pos=0;pos<(coches.length)-1;pos++)
                    System.out.printf("\nPosición %d: %s ",pos,coches[pos] );
            
            //Buscar la posición donde se debe guardar marca2
            for(pos=0;pos<(coches.length)-1;pos++)
                    if (marca2.compareTo(coches[pos])>=0)
                            inserta_en=pos+1;
            System.out.printf("\nMarca2 se debe insertar en la posición %d",inserta_en);
            
            //Mover las cadenas a una posición más adelante e
            //insertar en la posicion identificada la marca2
            for(pos=(coches.length)-1;pos>=inserta_en;pos--)
            {
                    coches[pos]=coches[pos-1];
                    if (pos==inserta_en)
                        coches[pos]=marca2;
            }
            //Vamos a imprimir el arreglo para verificar que se insertó marca2
            for (pos=0;pos<(coches.length);pos++)
                    System.out.printf("\nPosición %d: %s ",pos,coches[pos]);
    }
}


    
    

