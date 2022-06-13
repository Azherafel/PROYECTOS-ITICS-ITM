package ejercicio.pkg1;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        // declarando el carácter
         char a = 'G';
          
        // El tipo de datos enteros es generalmente
        // utilizado para valores numéricos
        int i=89;
         
        // use byte y short si la memoria es una prioridad
        byte b = 4;
         
        // esto dará error ya que el número es
        // mayor que el rango de bytes
        // byte b1 = 7888888955;
         
        short s = 56;
         
        // esto dará error ya que el número es 
        // más grande que el rango de short
        // short s1 = 87878787878;
         
         
        // por defecto, el valor de la fracción es double 
        double d = 4.355453532;
         
        // para float use 'f' como sufijo
        float f = 4.7333434f;
        
        System.out.println("char: " + a); 
        System.out.println("integer: " + i); 
        System.out.println("byte: " + b); 
        System.out.println("short: " + s); 
        System.out.println("float: " + f); 
        System.out.println("double: " + d); 
    }
    
}
