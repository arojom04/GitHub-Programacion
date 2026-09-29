package ejercicios;
import java.util.Scanner;
/**
 *
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 29/09/2026
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int nota;
        System.out.println("Introduzca la nota del alumno");
        nota = entrada.nextInt();
        switch(nota){
            case 0 -> System.out.println("Suspenso");            
            case 1 -> System.out.println("Suspenso");
            case 2 -> System.out.println("Suspenso");
            case 3 -> System.out.println("Suspenso");
            case 4 -> System.out.println("Suspenso");
            case 5 -> System.out.println("Bien");
            case 6 -> System.out.println("Bien");
            case 7 -> System.out.println("Notable");
            case 8 -> System.out.println("Notable");
            case 9 -> System.out.println("Sobresaliente");
            case 10 -> System.out.println("Sobresaliente");
            default -> System.out.println("No existe ese número, por favor, introduzca un número del 0 al 10");    
            }
    }
    
}
