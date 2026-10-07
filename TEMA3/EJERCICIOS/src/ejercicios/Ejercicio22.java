package ejercicios;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 07/10/2026
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Scanner entrada = new Scanner (System.in);
            System.out.print("Introduzca el primer numero a sumar: ");
            int numero1 = entrada.nextInt();
            System.out.println("");
            System.out.print("Introduzca el segundo numero a sumar: ");
            int numero2 = entrada.nextInt();    
            System.out.println("El resultado de la suma es " +(numero1 + numero2));
        }catch(InputMismatchException e){
            System.out.println("Introduzca solo números enteros.");
        }
    }
    
}
