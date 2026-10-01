package ejercicios;
import java.util.Scanner;
/**
 *
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 30/09/2026
 */
public class Ejercicio9 {
    public static void main(String[] args) {
            Scanner entrada = new Scanner (System.in);
            
        System.out.println("Por favor, introduzca el primer numero: ");
        int numero1 = entrada.nextInt();
        System.out.println("Ahora, introduzca un segundo numero: ");
        int numero2 = entrada.nextInt();
        System.out.println("Introduzca el tercer numero: ");
        int numero3 = entrada.nextInt();
        System.out.println("Por último, introduzca un cuarto numero: ");
        int numero4 = entrada.nextInt();        

        int menor = numero1;
        int medio1 = numero2;
        int medio2 = numero3;
        int mayor = numero4;

        int temporal;

        if (menor > medio1) {
            temporal = menor; menor = medio1; medio1 = temporal;
        }
        if (medio1 > medio2) {
            temporal = medio1; medio1 = medio2; medio2 = temporal;
        }
        if (medio2 > mayor) {
            temporal = medio2; medio2 = mayor; mayor = temporal;
        }
        if (menor > medio1) {
            temporal = menor; menor = medio1; medio1 = temporal;
        }
        if (medio1 > medio2) {
            temporal = medio1; medio1 = medio2; medio2 = temporal;
        }
        if (menor > medio1) {
            temporal = menor; menor = medio1; medio1 = temporal;
        }
        System.out.println("El orden de los números introducidos es el " + menor + " - " + medio1 + " - " + medio2 + " - " + mayor);
    }
}
