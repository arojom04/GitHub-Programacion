package tema4;
import java.util.Scanner;


/**
 *
 * @author Alejandro Rojo Martín
 * @since 26/10/2026 
 */
public class Ejercicio17 {

    public static char generarLetra() {
        return (char) (Math.random() * 26 + 97);
    }

    public static char pedirLetra() {
        Scanner entrada = new Scanner (System.in);
        System.out.print("Introduce una letra minuscula: ");
        char letra = entrada.nextLine().charAt(0);
        return letra;
    }

    public static void jugar(char letraSecreta) {
        int intentos = 0;
        char letra;

        do {
            letra = pedirLetra();
            intentos++;
                if (letra < letraSecreta) {
                    System.out.println("La letra secreta va despues.");
                } else if (letra > letraSecreta) {
                    System.out.println("La letra secreta va antes.");
                } else {
                    System.out.println("¡Correcto! Has adivinado la letra.");
                    System.out.println("Numero de intentos: " + intentos);
                }
        } while (letra != letraSecreta);
    }

    public static void main(String[] args) {

        char letraSecreta = generarLetra();

        jugar(letraSecreta);

    }
}