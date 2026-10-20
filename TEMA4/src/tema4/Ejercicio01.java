package tema4;

import java.util.Scanner;

/**
 *
 * @author Alejandro Rojo Martín
 * @since 19/10/2026
 * @version 1
 */
public class Ejercicio01 {

    public static void numeroEntero(int num){ //DECLARO EL MÉTODO Y CON ELLO CONSIGO VER QUÉ ES EL NÚMERO.
        if(num<0){
            System.out.println("El número introducido es negativo");
        }else if(num>0){
            System.out.println("El número introducido es positivo.");
        }else{
            System.out.println("El número introducido es neutro");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor, introduzca un numero: ");
        int num = entrada.nextInt();
        
        numeroEntero(num); //TRAIGO LA VARIABLE PARA QUE SE DIGA EL RESULTADO
    }
    
}
