package ejercicios;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 07/10/2026
 */
public class Ejercicio30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int aleatorioEntero = (int) Math.floor(Math.random() * 100) + 1;

        Scanner entrada = new Scanner(System.in);

        int intentos = 0;
        int numero = 0;
        System.out.println("Introduce un número para empezar el juego.");
        do {
            try {
                numero = entrada.nextInt();

                intentos++;

                if (numero > aleatorioEntero) {
                    System.out.println("El número que has introducido es mayor que el número elegido.");
                }

                if (numero < aleatorioEntero) {
                    System.out.println("El número que has introducido es menor que el número elegido.");
                }

            } catch (InputMismatchException e) {
                System.out.println("No has introducido un número, por favor, vuelve a intentarlo.");
                entrada.next();
            }

        } while (numero != aleatorioEntero);

        System.out.println("Has acertado!! El número correcto es " + aleatorioEntero);
        System.out.println("Te ha costado " + intentos + " intentos.");

    }
}