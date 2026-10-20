package ejercicios;
import java.util.Scanner;

/**
 *
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 07/10/2026
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero2; //DECLARAMOS VARIABLES
        int contador=0; //DECLARAMOS UN CONTADOR QUE NOS AYUDARA A CONTAR LOS NÚMEROS MOSTRADOS
        Scanner entrada= new Scanner (System.in);
        do{
            System.out.print("Introduzca el numero que desees: "); 
            numero2 = entrada.nextInt();
            
            if(numero2<=0){ //Ponemos esto para que el usuario pueda volver a introducir el número si es menor que 0
                System.out.println("Introduce un numero mayor que 0");
            }
        }while(numero2<=0);
        
        System.out.println("Los números múltiplos de 3 que existen entre el número 1 y " + numero2 + " son:");        
        
        for (int numero1 = 1; numero1 <= numero2; numero1++) { //Con esto nos ayudamos a saber cuales son los números múltiplos.
            if (numero1 % 3 == 0) {
                System.out.print(numero1 + " - ");
                contador++;
            }
        }    
        System.out.println("");
        System.out.println("Total de números mostrados: " + contador);
    }
    
}
