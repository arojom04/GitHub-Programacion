package creaciondepersonajes;
import java.util.Scanner;

/**
 *
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 28/09/2026
 */
public class CreacionDePersonajes {

    static final int VIDA_POR_NIVEL = 20;
    static final int XP_POR_NIVEL = 200;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int edad, nivel, vida, experiencia;
        char inicial;
        double altura;
        int vidaMaxima;
        int xpSiguienteNivel;
        int vidaRestante;
        int danio = 80;

        System.out.println("// FASE 1: LECTURA DE DATOS\n" +
        "================================\n" +
            "CREACIÓN DE PERSONAJE\n" +
        "================================");
        System.out.println("Bienvenido a la creación de tu personaje.");
        System.out.println("Introduzca sus datos porfavor.");
        System.out.println("Introduzca la letra inicial de tu nombre.");
        inicial = entrada.next().charAt(0);
        System.out.println("Introduzca la edad de tu personaje.");
        edad = entrada.nextInt();
        System.out.println("Introduzca la altura de tu personaje.");
        altura = entrada.nextDouble();
        System.out.println("Introduzca el nivel de tu personaje.");
        nivel = entrada.nextInt();
        System.out.println("Introduzca la vida de tu personaje.");
        vida = entrada.nextInt();
        System.out.println("Introduzca la experiencia de tu personaje.");
        experiencia = entrada.nextInt();
        System.out.println("\nEstas son las características de tu personaje:");

        System.out.println("Inicial: " + inicial);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Nivel: " + nivel);
        System.out.println("Vida inicial: " + vida);
        System.out.println("Experiencia: " + experiencia);
        
        // FASE 2: ATRIBUTOS CALCULADOS
        
        vidaMaxima = nivel * VIDA_POR_NIVEL;
        xpSiguienteNivel = nivel * XP_POR_NIVEL;
        vidaRestante = vida - danio;
        
        System.out.println("\n// FASE 2: ATRIBUTOS CALCULADOS");
        System.out.println("================================");
        System.out.println("PERSONAJE");
        System.out.println("================================");
        
        System.out.println("Nombre: " + inicial + " | Edad: " + edad + " años");
        System.out.println("Vida inicial: " + vida + " | Vida máx: " + vidaMaxima);
        System.out.println("Experiencia: " + experiencia + " | XP sig. nivel: " + xpSiguienteNivel);
        System.out.println("[!] Tras recibir " + danio + " pts de daño:");
        System.out.println("Vida restante: " + vidaRestante + " pts");
    }
}

/** FALLOS ENCONTRADOS
 * 
 * 1. La vida inicial puede ser mayor que la vida máxima.
 *    Ejemplo: Nivel 3 y vida inicial 200 → vida máxima 60.
 * 
 * 2. La vida restante puede ser negativa.
 *    Ejemplo: Vida inicial 60 y 80 puntos de daño → -30 de vida.
 * 
 * 3. Se pueden introducir valores negativos.
 *    Ejemplo: Edad -5 o nivel -2 → el programa acepta los valores
 *    y puede calcular vida máxima y experiencia negativas.
 */
