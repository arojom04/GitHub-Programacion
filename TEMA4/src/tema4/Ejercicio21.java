package tema4;

import java.util.Scanner;

/**
 *
 * @author Alejandro Rojo Martín
 * @since 28/10/2026 
 */
public class Ejercicio21 {

    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);        
        return entrada.nextInt();
    }
    
    public static int comprobacion(int numero1, int numero2){
        do {
            System.out.println("Por favor, introduzca un número mayor que el primero.");
            numero2 = pedirNumero();
        }while (numero1>numero2);
        return numero2;    
    }
    
    public static void suma (int numero1, int numero2){
        int resultado = 0;
        for (int i = numero1; i <= numero2; i++){
            if (i % 2 == 0){
                resultado += i;
            }
        }
        
        System.out.println("La suma entre los números pares de " + numero1 + " y " +numero2+ " es de " + resultado);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1;
        int numero2;
        
        System.out.println("Introduzca un número");
        numero1 = pedirNumero();
        System.out.println("Introduzca un segundo número");
        numero2 = pedirNumero();
        
        numero2 = comprobacion(numero1, numero2);
        
        suma(numero1, numero2);
    }
    
}
