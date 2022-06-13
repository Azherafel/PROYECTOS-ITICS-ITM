package proyecto.integrador.pkgfinal;
import java.util.Scanner;
public class PROYECTOINTEGRADORFINAL {

    public static void main(String[] args) {
        int opcion1,opcion2;
        try (Scanner leer = new Scanner (System.in)) {
            int numx1=20;
            int varx=0;
            int mas,menos;
            String nombreporelusuario;
            String []nombredelproducto=new String [numx1];
            String []marcadelproducto=new String [numx1];
            int costo[]=new int[numx1];
            String []unidadproducto=new String [numx1];
            int []inventario=new int [numx1];
            String situacion[]=new String[numx1];
            boolean si=false;
            do {
            System.out.println("FERRETERIA  \n");
            System.out.println("----------MENU PRINCIPAL---------------------------------------------------------------------------------------------------");
            System.out.println("  1)  ALTAS");
            System.out.println("  2)  BAJAS");
            System.out.println("  3)  MODIFIACIONES");
            System.out.println("  4)  CONSULTAS");
            System.out.println("  5)  SALIR");
            System.out.print("PRESIONA EL NUMERO CORRESPONDIENTE A LA OPCION: ");opcion1=leer.nextInt();
                //Altas de producto y regresar.
                if (opcion1==1){
                    System.out.println("----------Altas---------------------------------------------------------------------------------------------------");
                    do {
                System.out.println("  1)   PRODUCTO");
                System.out.println("  2)   REGRESAR");
                System.out.print("PRESIONA EL NUMERO CORRESPONDIENTE A LA OPCION: ");opcion1=leer.nextInt();
                        if (opcion1==1){
                System.out.println("ESCRIBE EL NOMBRE DEL PRODUCTO: ");
                            nombredelproducto[varx]=leer.next();
                System.out.println("ESCRIBE EL NOMBRE DEL PRODUCTO: ");
                            marcadelproducto[varx]=leer.next();
                System.out.println("ESCRIBE EL TIPO DE UNIDAD: ");
                            unidadproducto[varx]=leer.next();
                            costo[varx]=0;
                System.out.println("ESCRIBE EL NUMERO DE INVENTARIO: ");
                            inventario[varx]=leer.nextInt();
                            situacion[varx]="ACTIVO";
                System.out.println("¡PRODUCTO REGISTRADO CON EXITO!");
                            varx++;
                    }else{
                 System.out.println("LA OPCION NO ES VALIDA, INTENTA DE NUEVO");
                        }
                    }while(opcion1!=2);
                }else
                //Menu de bajas para los productos y regresar.
                if (opcion1==2){
                    do {
                System.out.println("----------BAJAS--------------------------------------------------------------------------------------------------------");
                
                System.out.println("  1)   PRODUCTO");
                System.out.println("  2)   REGRESAR");
                System.out.println("PRESIONA EL NUMERO CORRESPONDIENTE A LA OPCION: ");opcion1=leer.nextInt();
                        if (opcion1==1){
                System.out.println("\nESCRIBE EL NOMBRE EXACTO DEL PRODUCTO:");
                            nombreporelusuario=leer.next();
                            for(int n=nombredelproducto.length;n!=0;n--){
                                if (nombreporelusuario.equals(nombredelproducto[n])){
                                        si=true;
                                        situacion[n]="EL PRODUCTO ESTA INACTIVO";
                System.out.println("\n EL PRODUCTO HA SIDO DADO DE BAJA");
                                        break;
                                    } else
                                     si=false;
                            }
                        }else
                System.out.println("\n LA OPCION NO ES VALIDA, INTENTA DE NUEVO.");
                        if(si){
                        } else 
                System.out.println("\n EL PRODUCTO NO EXISTE.");
                        
                    }while (opcion1!=2);
                    si=false;
                    
               //Menu de modificaciones, producto, costo, entrada de inventario, salida de inventario y salir.
                }else if(opcion1==3){
                    do {
                System.out.println("----------MODIFICACIONES---------------------------------------------------------------------------------------------");
                
                System.out.println("  1)   MODIFICAR UN PRODUCTO");
                System.out.println("  2)   AGREGAR UN COSTO");
                System.out.println("  3)   ENTRAR AL INVENTARIO");
                System.out.println("  4)   SALIR DEL INVENTARIO");
                System.out.println("  5)   Para Salir");
                System.out.println("PRESIONA EL NUMERO CORRESPONDIENTE A LA OPCION: ");opcion2=leer.nextInt();
                         if (opcion2==1){
                System.out.println("\n Producto");
                System.out.println("\n Escribe el nombre exacto del producto");
                            nombreporelusuario=leer.next();
                    for(int n=0;n!=varx;n++){
                        if (nombreporelusuario.equals(nombredelproducto[n])){
                System.out.println("\n Escribe el nuevo nombre para el producto");
                        nombredelproducto[n]=leer.next();
                            si=true;
                System.out.println("\n ¡El nombre ha sido cambiado!");
                        break;
                           } else
                        si=false; 
                   }
                    if (si){
                                    
                    } else
                System.out.println("\n El producto no existe");
                        //Modificaciones del producto en costos
                               } else if (opcion2==2){
                System.out.println("\n Costos");
                System.out.println("\n Escribe el nombre exacto del producto");
                            nombreporelusuario=leer.next();
                                for(int n=0;n!=varx;n++){
                                if (nombreporelusuario.equals(nombredelproducto[n])){
                                        si=true;
                System.out.println("\n Escribe el precio que tendrá el producto:");
                                        costo[n]=leer.nextInt();
                System.out.println("\n ¡Costo modificado con éxito!");
                           break;
                      } else
                  si=false; 
                          if (si){ 
                                } else
                System.out.println("\n El producto no existe.");
                            }
                        //Modificaciones entrada al inventario.
                        } else if(opcion2==3){
                System.out.println("\n Entrada al inventario:");
                System.out.println("\n Escribe el nombre exacto del producto:");
                            nombreporelusuario=leer.next();
                                for(int n=0;n!=varx;n++){
                                if (nombreporelusuario.equals(nombredelproducto[n])){
                                        si=true;
                System.out.println("\n Escribe cuantos articulos vas agregar al inventario:");
                                     mas=leer.nextInt();
                                        inventario[n]=inventario[n]+mas;
                System.out.println("\n ¡Inventario modificado con éxito!");
                             break;
                         } else
                    si=false; 
                 if (si){         
                        } else
                 System.out.println("\n El producto no existe.");
                   }
              }
                //Modificaciones de salida del inventario.
                     else if(opcion2==4){
                System.out.println("\n Salida del inventario");
                System.out.println("\n Escribe el nombre exacto del producto:");
                            nombreporelusuario=leer.next();
                             for(int n=0;n!=varx;n++){
                             if (nombreporelusuario.equals(nombredelproducto[n])){
                                        si=true;
                System.out.println("\n Escribe cuantos articulos vas a quitar del inventario:");
                                    menos=leer.nextInt();
                                    inventario[n]=inventario[n]-menos;
                System.out.println("\n ¡Inventario modificado con éxito!");
                                break;
                          } else
                              si=false; 
                       if (si){
                    } else
                System.out.println("\n El producto no existe.");
                   }
               } else if (opcion2==5){
                System.out.println("\n Salir");
                        }else
                System.out.println("\n Opción no disponible.");   
                } while(opcion2!=5);
                    si=false;
                    //Menu de consultas. Productos, productos activos, productos inactivos, productos por clasificación y salir.
                } else if (opcion1==4){
                    do {
                    System.out.println("----------Consultas---------------------------------------------------------------------------------------------");
                    
                    System.out.println("  1) PRODUCTO");
                    System.out.println("  2) VER TODO");
                    System.out.println("  3) PRODUCTOS ACTIVOS");
                    System.out.println("  4) PRODUCTOS INACTIVOS");
                    System.out.println("  5) CLASIFICACIONES");
                    System.out.println("  6) SALIR");
                    System.out.println("PRESIONA EL NUMERO CORRESPONDIENTE A LA OPCION: ");opcion1=leer.nextInt();
                    //Consultas de producto.
                    if (opcion1==1){
                        System.out.println("\n Producto");
                        System.out.println("\n Escribe el nombre exacto del producto:");
                        nombreporelusuario=leer.next();
                        for(int n=0;n!=varx;n++){
                          if (nombreporelusuario.equals(nombredelproducto[n])){
                            si=true;
                    System.out.printf("\n Producto: %8S",nombredelproducto[n]);
                    System.out.printf("\n Marca: %8S",marcadelproducto[n]);
                    System.out.printf("\n Tipo de unidad: %8S",unidadproducto[n]);
                    System.out.printf("\n Costo: %8d",costo[n]);
                    System.out.printf("\n Inventario: %8d",inventario[n]);
                    System.out.printf("\n Situación: %8S",situacion[n]);
                         break;
                      } else
                            si=false; 
                        if (si){ 
                   } else
                    System.out.println("\n El producto no existe.");    
                            }
                        //Menu de consultas de todos los productos.
                    } else if (opcion1==2){
                        for(int n=0;n!=varx;n++){
                    System.out.printf("\n Producto: %8S",nombredelproducto[n]);
                    System.out.printf("\n Marca: %8S",marcadelproducto[n]);
                    System.out.printf("\n Tipo de unidad: %8S",unidadproducto[n]);
                    System.out.printf("\n Costo: %8d",costo[n]);
                    System.out.printf("\n Inventario: %8d",inventario[n]);
                    System.out.printf("\n Situación: %8S",situacion[n]);
                    System.out.println("\n");
                        }
                    //Menu de consultas por productos activos.
                    } else if(opcion1==3){
                        for(int n=0;n!=varx;n++){
                            if (situacion[n]=="Activo"){
                    System.out.printf("\n Producto: %8S",nombredelproducto[n]);
                    System.out.printf("\n Marca: %8S",marcadelproducto[n]);
                    System.out.printf("\n Tipo de unidad: %8S",unidadproducto[n]);
                    System.out.printf("\n Costo: %8d",costo[n]);
                    System.out.printf("\n Inventario: %8d",inventario[n]);
                    System.out.printf("\n Situaci}ón: %8S",situacion[n]);
                            }
                        }
                        System.out.println("\n No hay mas productos activos.");
                        //Menu de consulta por productos inactivos.
                    } else if(opcion1==4){
                        for(int n=0;n!=varx;n++){
                            if (situacion[n]=="Inactivo"){
            System.out.printf("\n Producto: %8S",nombredelproducto[n]);
            System.out.printf("\n Marca: %8S",marcadelproducto[n]);
            System.out.printf("\n Tipo de unidad: %8S",unidadproducto[n]);
            System.out.printf("\n Costo: %8d",costo[n]);
            System.out.printf("\n Inventario: %8d",inventario[n]);
            System.out.printf("\n Situación: %8S",situacion[n]);
                            }
                        }
            System.out.println("\n No hay mas productos Inactivos");
                        //Menu de consulta por categoría
                    } else if (opcion1==5) {
            System.out.println("\n Escribe el nombre exacto de la categoría");
                        String cate=leer.next();
                        for(int n=0;n!=varx;n++){
                            if (cate.equals(unidadproducto[n])){
            System.out.printf("\n Producto: %8S",nombredelproducto[n]);
            System.out.printf("\n Marca: %8S",marcadelproducto[n]);
            System.out.printf("\n Tipo de unidad: %8S",unidadproducto[n]);
            System.out.printf("\n Costo: %8d",costo[n]);
            System.out.printf("\n Inventario: %8d",inventario[n]);
            System.out.printf("\n Situación: %8S",situacion[n]);
                            }
                        }
                    }
                    } while (opcion1!=6);
                }
            } while (opcion1!=5);
        }
 
    }
    
}
