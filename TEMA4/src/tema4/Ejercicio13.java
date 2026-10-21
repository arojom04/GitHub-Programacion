package tema4;

import java.util.Scanner;

/**
 *
 * @author Alejandro Rojo Martín
 * @since 19/10/2026
 * @version 1
 */
public class Ejercicio13 {
    
    public static int pedirNumero (int numero){
        Scanner entrada = new Scanner (System.in);
        numero = entrada.nextInt();
        return numero;
    }
    
    public static boolean comprobacion (int numero, int numeroMinimo){
        return numero > numeroMinimo;
    }
    

    public static void resultado(int numeroMinimo, int numero, boolean correcto) {
        correcto = false;

        while (!correcto) {
            System.out.println("Introduzca el número: ");
            numero = pedirNumero(numero);

            correcto = comprobacion(numero, numeroMinimo);

            if (!correcto) {
                System.out.println("Por favor, introduzca un número mayor que 1.");

            }
        }
            do{
            if (correcto) {
                System.out.println(numeroMinimo++);
            }
            }while(numeroMinimo<numero);
    }

            
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero=0;
        int numeroMinimo = 1;
        boolean correcto = false;
        
        resultado(numeroMinimo, numero, correcto);        
        
    }
    
}
