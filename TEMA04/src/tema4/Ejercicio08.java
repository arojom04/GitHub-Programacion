package tema4;

import java.util.Scanner;

/**
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 19/10/2026
 */
public class Ejercicio08 {
    
    
    public static void dinero (int cantidad){
        
        System.out.println(cantidad + " Euros se descomponen en");
        
        int billetesCincuenta = cantidad / 50;
        int resto = cantidad % 50;
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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, indique una cantidad de dinero: ");
        int cantidad = entrada.nextInt();
        
        dinero(cantidad);
    }
    
}
