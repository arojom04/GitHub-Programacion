package tema02.ejercicio26;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class TEMA02Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, introduzca un número de 4 cifras: ");
        int números;
        números = entrada.nextInt ();
        int número1 = números / 1000;
        int número2 = (números / 100)%10;
        int número3 = (números / 10)%10;
        int número4 = números % 10;
        System.out.println("La primera cifra es: "+número1);
        System.out.println("La segunda cifra es: "+número2);
        System.out.println("La tercera cifra es: "+número3);
        System.out.println("La cuarta cifra es: "+número4);        
    }
    
}
