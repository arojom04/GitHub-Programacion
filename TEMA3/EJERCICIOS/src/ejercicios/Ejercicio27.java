package ejercicios;
import java.util.Scanner;

/**
 *
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 07/10/2026
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc = 0;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduzca el primer número");
            int numero1= entrada.nextInt();
        System.out.println("Introduzca el segundo número");
            int numero2= entrada.nextInt();  
            
        do {          
            
            // MOSTRAMOS EL MENÚ AL USUARIO
            System.out.println("- MENU -");
            System.out.println("1. Sumar los número");
            System.out.println("2. Restar los números.");
            System.out.println("3. Multiplicar los números.");
            System.out.println("4. Dividir los números.");
            System.out.println("5. Salir del programa.");            
            
            //PEDIR OPCIÓN
            System.out.print("Elija una opción: ");
            opc = entrada.nextInt(); 
            
            //EJECUTAR LA OPCIÓN ELEGIDA POR EL USUARIO.
            switch(opc){
                case 1->System.out.println("Has eligido sumar los números. Resultado: " +(numero1+numero2));
                case 2->System.out.println("Has eligido restar los números. Resultado: " +(numero1-numero2)); 
                case 3->System.out.println("Has eligido multiplicar los números. Resultado: " +(numero1*numero2));     
                case 4->{
                    try{
                    System.out.println("Has eligido dividir los números. Resultado: " +(numero1/numero2));
                }catch(ArithmeticException e){
                        System.out.println("No se puede dividir entre 0");
                }
            }
                case 5->System.out.println("Gracias por usar nuestro programa.");                
            }    
        } while(opc !=5);
    }
    
}
