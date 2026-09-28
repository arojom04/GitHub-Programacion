package tema02.ejercicio21;
import java.util.Scanner;
/**
 *
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 23/09/2026
 */
public class TEMA02Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           int segundos;
           
           Scanner entrada = new Scanner (System.in);
           
           System.out.println("Por favor, introduzca un número de segundos:");
           segundos = entrada.nextInt();
           System.out.println(segundos+ " son los segundos que has introducido.");                   
           int días = segundos / 86400;
           int horas = ((segundos % 86400)/3600);
           int minutos = (segundos % 3600)/ 60;
           int segundos2 = segundos % 60;
           System.out.println(segundos +" segundos hacen un total de: " + días + " días, " + horas + " horas, " + minutos + " minutos, y " + segundos2 + " segundos.");
    }
    
}
