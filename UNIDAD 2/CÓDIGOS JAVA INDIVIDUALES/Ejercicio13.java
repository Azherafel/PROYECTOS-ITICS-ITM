package ejercicio13;

public class Ejercicio13 {

    public static void main(String[] args) {
        int lado1, lado2, lado3;
        
System.out.println("Ingresa el lado 1: ");
lado1 = entrada.nextInt();
System.out.println("Ingresa el lado 2: ");
lado2 = entrada.nextInt();
System.out.println("Ingresa el lado 3: ");
lado3 = entrada.nextInt();

if(lado1 == lado2  && lado2 == lado3 )
    System.out.print("Los lados son de un triangulo equilatero");
else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3 )
    System.out.print("Los lados son de un triangulo isoceles");
else
    System.out.print("Los lados son de un triangulo escaleo");
    }
 
}
    
    

