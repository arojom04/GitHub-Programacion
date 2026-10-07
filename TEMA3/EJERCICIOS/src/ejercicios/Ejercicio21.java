package ejercicios;
import java.util.Scanner;


/**
 *
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 07/10/2026
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Scanner entrada = new Scanner (System.in);
            System.out.println("Introduzca el dividendo: ");
            int dividendo = entrada.nextInt();
            System.out.println("Introduzca el divisor: ");
            int divisor = entrada.nextInt();    
            System.out.println("El resultado de la división es " +(dividendo/divisor));
        }catch(ArithmeticException e){
            System.out.println("No se puede usar el numero 0 como divisor.");
        }

        
    }
    
}
