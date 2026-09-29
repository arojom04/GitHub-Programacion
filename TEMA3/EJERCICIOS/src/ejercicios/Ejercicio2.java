package ejercicios;
import java.util.Scanner;

/**
 *
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 29/09/2026
 */
public class Ejercicio2 {
    
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    int resultado;
    String operacion;
    System.out.println("Por favor, introduzca un número:");
    int numero1 = entrada.nextInt();  
    System.out.println("Ahora, introduzca un segundo numero:");
    int numero2 = entrada.nextInt();
    if (numero1>10){
        resultado = numero1 * numero2;
        operacion = "producto";
    }else{
        resultado = numero1 + numero2;
        operacion = "suma";
    }
    System.out.println("La operación que se realizó es " + operacion + " y el resultado es "+ resultado);
    }

}
