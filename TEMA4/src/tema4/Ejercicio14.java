package tema4;

import java.util.Scanner;

/**
 *
 * @author Alejandro Rojo Martín
 * @since 19/10/2026
 * @version 1
 */
public class Ejercicio14 {
    
    /**
     * 
     * @param numero
     * @return numero que escribe el usuario.
     */
    public static int pedirNumero (int numero){
        Scanner entrada = new Scanner (System.in);
        numero = entrada.nextInt();
        return numero;
    }
    
    /**
     * 
     * @param numero
     * @param numeroMinimo
     * @return si el resultado es correcto o no
     */
    public static boolean comprobacion (int numero, int numeroMinimo){
        return numero > numeroMinimo;
    }
    
    /**
     * 
     * @param numeroMinimo
     * @param numero
     * @param correcto
     * @param multiplicador 
     */
    public static void resultado(int numeroMinimo, int numero, boolean correcto, int multiplicador) {
        correcto = false;

        while (!correcto) {
            System.out.println("Introduzca el número: ");
            numero = pedirNumero(numero);

            correcto = comprobacion(numero, numeroMinimo);

            if (!correcto) {
                System.out.println("Por favor, introduzca un número mayor que 0.");

            }
        }
            do{
            if (correcto) {
                System.out.println(multiplicador+ " * " +numeroMinimo+ " = " +multiplicador * numeroMinimo);
                numeroMinimo++;
            }
            }while(numeroMinimo<numero);
    }

            
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero=0;
        int multiplicador = 3;
        int numeroMinimo = 0;
        boolean correcto = false;
        
        resultado(numeroMinimo, numero, correcto, multiplicador);        
        
    }
    
}
