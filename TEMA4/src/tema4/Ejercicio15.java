package tema4;
import java.util.Scanner;

/**
 *
 * @author Alejandro Rojo Martín
 * @since 19/10/2026
 * @version 1
 */
public class Ejercicio15 {
    
    /**
     * 
     * @return numero que escribe el usuario
     */
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);        
        return entrada.nextInt();
    }
    
    /**
     * 
     */
    public static void menu() {
        System.out.println("\n- MENU -");
        System.out.println("1. Sumar los números.");
        System.out.println("2. Restar los números.");
        System.out.println("3. Multiplicar los números.");
        System.out.println("4. Dividir los números.");
        System.out.println("5. Salir del programa.");
        System.out.print("Elija una opción: ");
    }
    
    /**
     * 
     * @param numero1
     * @param numero2
     * @return resultado de sumar ambos números
     */
    public static int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    /**
     * 
     * @param numero1
     * @param numero2
     * @return resultado de restar ambos números
     */
    public static int restar(int numero1, int numero2) {
        return numero1 - numero2;
    }

    /**
     * 
     * @param numero1
     * @param numero2
     * @return resultado de multiplicar ambos números
     */
    public static int multiplicar(int numero1, int numero2) {
        return numero1 * numero2;
    }
    
    /**
     * 
     * @param numero1
     * @param numero2 
     */
    public static void dividir(int numero1, int numero2) {
        try {
            System.out.println("Resultado: " + (numero1 / numero2));
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre 0.");
        }
    }

    /**
     * 
     * @param opc
     * @param numero1
     * @param numero2 
     */
    public static void ejecutarOpcion(int opc, int numero1, int numero2) {
        switch (opc) {
            case 1 ->
                System.out.println("Resultado: " + sumar(numero1, numero2));

            case 2 ->
                System.out.println("Resultado: " + restar(numero1, numero2));

            case 3 ->
                System.out.println("Resultado: " + multiplicar(numero1, numero2));

            case 4 ->
                dividir(numero1, numero2);

            case 5 ->
                System.out.println("Gracias por usar nuestro programa.");

            default ->
                System.out.println("Opción no válida.");
        }
    }

    public static void main(String[] args) {
      int opc;

        System.out.println("Introduzca el primer número:");
        int numero1 = pedirNumero();

        System.out.println("Introduzca el segundo número:");
        int numero2 = pedirNumero();
        
        do {
            menu();
            opc = pedirNumero();
            ejecutarOpcion  (opc, numero1, numero2);

        } while (opc != 5);

    }
}
