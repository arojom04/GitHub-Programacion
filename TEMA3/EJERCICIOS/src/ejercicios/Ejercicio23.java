package ejercicios;
import java.util.Scanner;

/**
 *
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 07/10/2026
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int numero2;   
            Scanner entrada = new Scanner (System.in);
                            
        do{
            System.out.print("Introduzca el número que desees: ");
            numero2 = entrada.nextInt();
            if (numero2 <= 1) {
                System.out.println("El número introducido no es válido. Inténtalo de nuevo.");
            }    
        }while(numero2<1);
        
        for(int numero1=1;numero1<=numero2;numero1++){
            System.out.print(numero1);
            System.out.print(" - ");
        
    }

                
    }
    
}
