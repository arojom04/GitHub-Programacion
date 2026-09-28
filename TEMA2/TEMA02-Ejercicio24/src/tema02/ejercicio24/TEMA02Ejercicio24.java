package tema02.ejercicio24;
import java.util.Scanner;
/**
 *
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 23/09/2026 
 */
public class TEMA02Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("A continuación le preguntaremos sus notas del Ciclo de DAW.");
        System.out.println("Por favor, introduzca la nota de Programación: ");
        int prog = entrada.nextInt();
        System.out.println("Por favor, introduzca la nota de Lenguajes de Marcas: ");
        int lmsgi = entrada.nextInt();
        System.out.println("Por favor, introduzca la nota de Bases de Datos: ");
        int bd = entrada.nextInt();
        System.out.println("Por favor, introduzca la nota de Entornos de Desarrollo: ");
        int ed = entrada.nextInt();
        System.out.println("Por favor, introduzca la nota de Sistemas Informáticos: ");
        int si = entrada.nextInt();
        System.out.println("Por favor, introduzca la nota de Formación y Orientación Laboral: ");
        int fol = entrada.nextInt();
        double notaMedia = (prog + lmsgi + bd + ed + si + fol) / 6;
        System.out.println("Su nota media del curso es de: " + notaMedia);
    }
    
}
