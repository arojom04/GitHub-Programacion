package tema02.ejercicio23;
import java.util.Scanner;

/**
 *
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 23/09/2026
 */
public class TEMA02Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor, introduzca el precio del modelo de ordenador que desea comprar:");
        double precio = entrada.nextDouble();
        System.out.println("¿Cuantas unidades quiere llevarse?");
        int unidades = entrada.nextInt();
        double precioTotal = precio * unidades;
        System.out.println("El precio total de su compra es de: " + precioTotal + " Euros");
    }
    
}
