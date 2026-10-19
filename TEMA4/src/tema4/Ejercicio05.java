package tema4;
import java.util.Scanner;
/**
 *
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 19/10/2026
 */
public class Ejercicio05 {

    /**
     * TRAIGO EL MÉTODO DEL OTRO PAQUETE Y MANDA EL RESULTADO DE SI EL NÚMERO INTRODUCIDO ES PAR O IMPAR
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Introduzca un número: ");
        int num = entrada.nextInt();
        
        Ejercicio05Paquete.Ejercicio05.numero(num);
    }
    
}
