
package tema4;

import java.util.Scanner;

public class Ejercicio19 {

    /**
     * 
     * @return 
     */
    public static String obtenerDia() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca un día de la semana: ");
        String dia = entrada.nextLine();
        return dia;
    }

    /**
     * 
     * @param dia 
     */
    public static void diaSemana(String dia) {

        switch (dia) {
            case "Lunes" -> System.out.println("El Lunes es el primer día de la semana");
            case "Martes" -> System.out.println("El Martes es el segundo día de la semana");
            case "Miércoles" -> System.out.println("El Miércoles es el tercer día de la semana");
            case "Jueves" -> System.out.println("El Jueves es el cuarto día de la semana");
            case "Viernes" -> System.out.println("El Viernes es el quinto día de la semana");
            case "Sábado" -> System.out.println("El Sábado es el sexto día de la semana");
            case "Domingo" -> System.out.println("El Domingo es el séptimo día de la semana");
            default -> System.out.println("El día introducido no es válido");
        }
    }

    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        String dia = obtenerDia();
        diaSemana(dia);
    }
}
