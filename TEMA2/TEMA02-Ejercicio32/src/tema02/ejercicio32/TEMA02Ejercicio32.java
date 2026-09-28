package tema02.ejercicio32;
import java.util.Scanner;
/**
 *
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 23/09/2026
 */
public class TEMA02Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, indique una cantidad de dinero: ");
        int dinero = entrada.nextInt();
        int billetesCincuenta = dinero / 50;
        int resto = dinero % 50;
        int billetesVeinte = resto / 20;
        resto = resto % 20;
        int billetesDiez = resto / 10;
        resto = resto % 10;
        int billetesCinco = resto / 5 ;
        resto = resto % 5;
        int monedasDos = resto / 2;
        int monedasUno = resto % 2;
System.out.println(dinero + " Euros se descomponen en " + billetesCincuenta + " billetes de 50, " + billetesVeinte + " billetes de 20, " + billetesDiez + " billetes de\n" +
"10, " + billetesCinco + " billetes de 5, " + monedasDos + " monedas de 2 euros y " + monedasUno + " monedas de 1 euro.");
    }
    
}
