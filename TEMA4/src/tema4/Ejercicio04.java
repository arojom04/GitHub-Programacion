package tema4;

import java.util.Scanner;

/**
 *
 * @author Alejandro Rojo Martín
 * @since 19/10/2026
 * @version 1
 */
public class Ejercicio04 {

    /**
     * CON EL RESULTADO DEL MÉTODO DENTRO DEL METODO MAIN, SE ENSEÑA CUAL ES EL NÚMERO MENOR.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor, introduzca el primer numero: ");
        int num1 = entrada.nextInt();
        System.out.println("Ahora, introduzca un segundo numero: ");
        int num2= entrada.nextInt();
        System.out.println("Por último, introduzca un tercer numero: ");
        int num3 = entrada.nextInt();
        
        Ejercicio04Paquete.Ejercicio04.imprimir(num1, num2, num3);
    }
    
}
