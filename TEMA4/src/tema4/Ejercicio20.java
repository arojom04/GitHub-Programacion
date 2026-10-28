package tema4;
import java.util.Scanner;

/**
 *
 * @author Alejandro Rojo Martín
 * @since 26/10/2026 
 */
public class Ejercicio20 {

    public static final String PRIMERAPREGUNTA = "Madrid";
    public static final String SEGUNDAPREGUNTA = "Colón";

    public static boolean pregunta1() {
        Scanner entrada = new Scanner (System.in);
        System.out.print("1ª PREGUNTA: ¿Cuál es la capital de España?: ");
        String respuesta = entrada.nextLine();

        if (respuesta.equals(PRIMERAPREGUNTA)) {
            System.out.println("Muy bien, respuesta correcta.");
            return true;
        } else {
            System.out.println("No es correcto. La respuesta correcta sería " + PRIMERAPREGUNTA);
            return false;
        }
    }

    public static boolean pregunta2() {
        Scanner entrada = new Scanner (System.in);        
        System.out.print("2ª PREGUNTA: ¿Quién descubrió América?: ");
        String respuesta = entrada.nextLine();

        if (respuesta.equals(SEGUNDAPREGUNTA)) {
            System.out.println("Muy bien, respuesta correcta.");
            return true;
        } else {
            System.out.println("No es correcto. La respuesta correcta sería " + SEGUNDAPREGUNTA);
            return false;
        }
    }

    public static void main(String[] args) {
        int nota = 0;

        System.out.println("EXAMEN DE CULTURA GENERAL");

        if (pregunta1()) {
            nota += 5;
        }

        if (pregunta2()) {
            nota += 5;
        }

        System.out.println("NOTA DEL EXAMEN: " + nota);

    }
}