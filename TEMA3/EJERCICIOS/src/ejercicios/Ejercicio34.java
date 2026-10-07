```java
package ejercicios;

import java.util.Scanner;

/**
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 07/10/2026
 */
public class Ejercicio33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // DATOS DE SALIDA
        System.out.println("Introduzca el día de salida:");
        int diaSalida = entrada.nextInt();

        System.out.println("Introduzca la hora de salida:");
        int horaSalida = entrada.nextInt();

        System.out.println("Introduzca el minuto de salida:");
        int minutoSalida = entrada.nextInt();

        // DATOS DE LLEGADA
        System.out.println("Introduzca el día de llegada:");
        int diaLlegada = entrada.nextInt();

        System.out.println("Introduzca la hora de llegada:");
        int horaLlegada = entrada.nextInt();

        System.out.println("Introduzca el minuto de llegada:");
        int minutoLlegada = entrada.nextInt();

        // Convertimos la salida y la llegada a minutos
        int totalMinutosSalida = diaSalida * 24 * 60
                + horaSalida * 60
                + minutoSalida;

        int totalMinutosLlegada = diaLlegada * 24 * 60
                + horaLlegada * 60
                + minutoLlegada;

        // Comprobamos que la llegada no sea anterior a la salida
        if (totalMinutosLlegada < totalMinutosSalida) {

            System.out.println("La hora de llegada no puede ser anterior a la hora de salida.");

        } else {

            int duracion = totalMinutosLlegada - totalMinutosSalida;

            int horas = duracion / 60;
            int minutos = duracion % 60;

            System.out.println("El tren tarda " + horas + " horas y "
                    + minutos + " minutos en llegar a su destino.");
        }
    }
}
```
