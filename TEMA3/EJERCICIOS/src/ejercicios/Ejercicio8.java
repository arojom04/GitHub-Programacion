package ejercicios;
import java.util.Scanner;
/**
 *
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 30/09/2026
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Introduce el importe en euros: ");
        int dinero = entrada.nextInt();
        
        System.out.println(dinero + " Euros se descomponen en");
        int billetesCincuenta = dinero / 50;
        int resto = dinero % 50;
        if (billetesCincuenta >0){
            System.out.println("Billetes de 50: " +billetesCincuenta);
        }
        int billetesVeinte = resto / 20;
        resto = resto % 20;
        if (billetesVeinte >0){
            System.out.println("Billetes de 20: " +billetesVeinte);
        }
        int billetesDiez = resto / 10;
        resto = resto % 10;        
        if (billetesDiez >0){
            System.out.println("Billetes de 10: " +billetesDiez);
        }
        int billetesCinco = resto / 5 ;
        resto = resto % 5;        
        if (billetesCinco >0){
            System.out.println("Billetes de 5: " +billetesCinco);
        }
        int monedasDos = resto / 2;        
        if (monedasDos >0){
            System.out.println("Monedas de 2: " + monedasDos);
        }
        int monedasUno = resto % 2;
        if (monedasUno >0){
            System.out.println("Monedas de 1: " + monedasUno );
        }    
    }
    
}
