package tema4;

import java.util.Scanner;
/**
 * 
 * @author alumno
 */
public class Ejercicio25 {

    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);        
        return entrada.nextInt();
    } 
    
    public static double potencia(double a, int b) {
        if (a == 0 && b < 0) {
            System.out.println("Error: la potencia es infinita.");
            return Double.POSITIVE_INFINITY;
        } else {
            return Math.pow(a, b);
        }
    }
    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {

        double a;
        int b;

        System.out.println("Introduzca la base:");
        a = pedirNumero();

        System.out.println("Introduzca el exponente:");
        b = pedirNumero();

        System.out.println("El resultado es: " + potencia(a, b));
    }
}
