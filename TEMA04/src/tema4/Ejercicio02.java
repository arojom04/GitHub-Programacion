package tema4;

import java.util.Scanner;

/**
 *
 * @author Alejandro Rojo Martín
 * @since 19/10/2026
 * @version 1
 */
public class Ejercicio02 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor, introduzca un numero: ");
        int num1 = entrada.nextInt();
        System.out.println("Ahora, introduzca un segundo numero: ");
        int num2 = entrada.nextInt();
        
        if(num1>10){
            int resultado = Ejercicio02Operaciones.multiplicar(num1,num2);
            System.out.println("La operación que se realizó es producto y el resultado es " + resultado);
        }else{
            int resultado = Ejercicio02Operaciones.sumar(num1,num2);
            System.out.println("La operación que se realizó es suma y el resultado es " + resultado);
        }
    }
    
}
