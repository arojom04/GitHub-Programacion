package ejercicios;
import java.util.Scanner;

/**
 *
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 29/09/2026
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor, introduzca un numero:");
        num1 = entrada.nextInt();        
                // IF ELSE
        if(num1>0){
            System.out.println("El número es positivo.");
        }else if(num1<0){
            System.out.println("El número es negativo.");
        }else{
            System.out.println("El número introducido es 0.");
        }
    }
    
}
