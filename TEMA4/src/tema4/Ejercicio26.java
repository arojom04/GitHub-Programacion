package tema4;

import java.util.Scanner;
//**

public class Ejercicio26 {

    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);        
        return entrada.nextInt();
    }     
    
    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println("Introduce un número entero:");
        int numero = pedirNumero();

        if (esPrimo(numero)) {
            System.out.println("El número es primo.");
        } else {
            System.out.println("El número no es primo.");
        }

    }
}