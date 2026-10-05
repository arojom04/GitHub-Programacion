package ejercicios;
import java.util.Scanner;
/**
 *
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 05/10/2026
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int multiplicador = 0;
        System.out.print("Introduzca un numero para calcular su tabla de multiplicar: ");
        int numero = entrada.nextInt();
        
        do{
            System.out.println(numero+ " X " +multiplicador+ " = " +numero*multiplicador);
            multiplicador++;
        }while(multiplicador<11);
        
    }
    
}
