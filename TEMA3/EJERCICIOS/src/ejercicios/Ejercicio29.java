package ejercicios;
import java.util.Scanner;
/**
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 07/10/2026
 */
public class Ejercicio29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aleatorioEntero = (int) Math.floor(Math.random() * 100+1);
        Scanner entrada = new Scanner (System.in);
        int intentos=0;
        int numero;
        do{
            System.out.println("Introduce un número para empezar el juego.");
            numero = entrada.nextInt();
                intentos++;            
            if(numero>aleatorioEntero){
                System.out.println("El número que has introducido es mayor que el número elegido.");
            }
            
            if(numero<aleatorioEntero){
                System.out.println("El número que has introducido es menor que el número elegido.");
            }            
        }while(numero!=aleatorioEntero);
        
        System.out.println("Has acertado!! El número correcto es " +aleatorioEntero);
        System.out.println("Te ha costado "+intentos+" intentos.");
    }
    
}
