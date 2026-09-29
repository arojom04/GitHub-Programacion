package ejercicios;
import java.util.Scanner;
/**
 *
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 29/09/2026
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, introduzca el primer numero: ");
        int numero1 = entrada.nextInt();
        System.out.println("Ahora, introduzca un segundo numero: ");
        int numero2 = entrada.nextInt();
        System.out.println("Por último, introduzca un tercer numero: ");
        int numero3 = entrada.nextInt();
        
        if (numero1>numero2 && numero1>numero3){
            System.out.println("El número mayor de los introducidos es el " + numero1 );
        }else if (numero2>numero1 && numero2>numero3){
            System.out.println("El número mayor de los introducidos es el " + numero2 );            
        }else if (numero3>numero1 && numero3>numero2){
            System.out.println("El número mayor de los introducidos es el " + numero3 );
        }    
    }
    
}
