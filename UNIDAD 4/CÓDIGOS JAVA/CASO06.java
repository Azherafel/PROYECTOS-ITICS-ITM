//Un maestro necesita calcular de sus 3
//grupos los promedios finales por alumno,
//por grupo y de los 3 grupos. Cada grupo
//tiene 5 alumnos, cada alumno 3
//calificaciones.
//Es necesario pedir las calificaciones por
//alumno, por grupo, luego imprimir en
//pantalla el promedio por alumno, por
//grupo y de los 3. HACER LA IMPRESIÓN EN
//UNA FUNCION A PARTE.
package caso.pkg06;
import java.util.Scanner;
public class CASO06 {

    public static void main(String[] args) {
         Scanner reader = new Scanner(System.in); 
        int Matriz[][][]= new int [3][5][3];
        String mat1, mat2, mat3, alum1, alum2, alum3, alum4, alum5;
        System.out.printf("Escribe la materia 1: ");
        mat1 = reader.next(); 
        System.out.printf("Escribe la materia 2: ");
        mat2 = reader.next();
        System.out.printf("Escribe la materia 3: ");
        mat3 = reader.next();
        System.out.printf("Escribe el nombre del alumno 1: ");
        alum1 = reader.next();
        System.out.printf("Escribe el nombre del alumno 2: ");
        alum2 = reader.next();
        System.out.printf("Escribe el nombre del alumno 3: ");
        alum3 = reader.next();
        System.out.printf("Escribe el nombre del alumno 4: ");
        alum4 = reader.next();
        System.out.printf("Escribe el nombre del alumno 5: ");
        alum5 = reader.next();
        
//leer calficaciones
        for (int mat=0;mat<2;mat++)
        {
                System.out.printf("\n");
                if (mat==0)
                        System.out.printf("%s", mat1);
                else
                        System.out.printf("%s", mat2);
                
                for (int al=0;al<3;al++)
                {
                            System.out.printf("\n");
                            if (al==0)
                                    System.out.printf("%s", alum1);
                            else if (al==1)
                                    System.out.printf("%s", alum2);
                            else
                                    System.out.printf("%s", alum3);
                            for (int cal=0;cal<2;cal++)
                            {
                                    System.out.printf("\nTeclea la calificación: ");
                                    Matriz[mat][al][cal]=reader.nextInt();
                            }
                }
        }
        
        //escribir calificaciones contenidas en el arreglo
        for (int mat=0;mat<2;mat++)
        {
                System.out.printf("\n");
                if (mat==0)
                        System.out.printf("%s", mat1);
                else
                        System.out.printf("%s", mat2);
                for (int al=0;al<3;al++)
                {
                            System.out.printf("\n");
                            if (al==0)
                                    System.out.printf("%s", alum1);
                            else if (al==1)
                                    System.out.printf("%s", alum2);
                            else
                                    System.out.printf("%s", alum3);
                            for (int cal=0;cal<2;cal++)
                                System.out.printf("\tCalificación: %d",Matriz[mat][al][cal]);
                }
        }
    }
}
    