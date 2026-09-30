package reto_podiocarrera;
import java.util.Scanner;

/**
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 30/09/2026
 */
public class Reto_PodioCarrera {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduzca el tiempo del primer participante: ");
        double tiempo1 = entrada.nextDouble();
        System.out.println("Introduzca el tiempo del segundo participante: ");
        double tiempo2 = entrada.nextDouble();   
        System.out.println("Introduzca el tiempo del tercer participante: ");
        double tiempo3 = entrada.nextDouble();   
        System.out.println("Introduzca el tiempo del cuarto participante: ");
        double tiempo4 = entrada.nextDouble();      

        double t1 = tiempo1, t2 = tiempo2, t3 = tiempo3, t4 = tiempo4;
        int primero = 1, segundo = 2, tercero = 3, cuarto = 4;

        double tiempo;
        int puesto;

        // Usamos el método de la burbuja.
        if (t1 > t2) {
            tiempo = t1; t1 = t2; t2 = tiempo;
            puesto = primero; primero = segundo; segundo = puesto;
        }
        if (t2 > t3) {
            tiempo = t2; t2 = t3; t3 = tiempo;
            puesto = segundo; segundo = tercero; tercero = puesto;
        }
        if (t3 > t4) {
            tiempo = t3; t3 = t4; t4 = tiempo;
            puesto = tercero; tercero = cuarto; cuarto = puesto;
        }
        if (t1 > t2) {
            tiempo = t1; t1 = t2; t2 = tiempo;
            puesto = primero; primero = segundo; segundo = puesto;
        }
        if (t2 > t3) {
            tiempo = t2; t2 = t3; t3 = tiempo;
            puesto = segundo; segundo = tercero; tercero = puesto;
        }
        if (t1 > t2) {
            tiempo = t1; t1 = t2; t2 = tiempo;
            puesto = primero; primero = segundo; segundo = puesto;
        }

        
        
        System.out.println("\n--- RESULTADOS ORDENADOS ---");
        System.out.println("1. Puesto: Participante " + primero + " - Tiempo: " + t1 + " seg.");
        System.out.println("2. Puesto: Participante " + segundo + " - Tiempo: " + t2 + " seg.");
        System.out.println("3. Puesto: Participante " + tercero + " - Tiempo: " + t3 + " seg.");
        System.out.println("4. Puesto: Participante " + cuarto + " - Tiempo: " + t4 + " seg.");
        
        if (t1 == t2){
        System.out.println("\nHay un empate en el primer puesto.");
        }
        
        double diferencia = t2 - t1; 
        System.out.println("\nHay una diferencia de "+ diferencia + " segundos entre el primer y el segundo puesto.");
        
        if (t1 == t2 || t2 == t3 || t3 == t4) {
            System.out.println("Resultado global: Hay tiempos empatados en la carrera.");
        } else {
            System.out.println("Resultado global: Todos los tiempos son completamente distintos.");    
        }
    }
    
}
