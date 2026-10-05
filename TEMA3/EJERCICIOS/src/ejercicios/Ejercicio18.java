package ejercicios;
import java.util.Scanner;
/**
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 05/10/2026
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int contrasenha = 1234;
        int intentos = 0;
        System.out.print("Introduzca la contraseña. Tienes 3 intentos: ");
        do{
            contrasenha = entrada.nextInt();
            if (contrasenha == 1234){
                System.out.println("Has obtenido acceso.");
            }else{
                intentos++;
                System.out.println("Error, has fallado. Te quedan " +(3 - intentos)+ " intentos restantes.");
            }
        }while(contrasenha!=1234&&intentos<3);
    }
    
}
