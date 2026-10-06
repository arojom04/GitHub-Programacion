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
        int contrasenha = 1234; //Declaramos la contraseña
        int intentos = 0; //Declaramos la variable intento.
        System.out.print("Introduzca la contraseña. Tienes 3 intentos: ");
        do{
            contrasenha = entrada.nextInt(); //Ponemos para que el usuario escriba la contraseña.
            if (contrasenha == 1234){  //Aqui declaramos que si la contraseña introducida es 1234 el usuario consigue accesso.
                System.out.println("Has obtenido acceso.");
            }else{ //Y si no, se suma un intento con el intentos++ y se enseña la cantidad de intentos que le quedan.
                intentos++;
                System.out.println("Error, has fallado. Te quedan " +(3 - intentos)+ " intentos restantes.");
            }
        }while(contrasenha!=1234 && intentos<3); //Aqui declaramos que el bucle siga mientras la contraseña introducida no sea igual a 1234 y la variable intentos sea menor que 3
    }
    
}
