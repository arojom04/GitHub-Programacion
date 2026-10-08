package ejercicios;
import java.util.Scanner;
/**
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 07/10/2026
 */
public class Ejercicio34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int diaSalida;
        int horaSalida;  
        int minutoSalida;     
        int diaLlegada;
        int horaLlegada;  
        int minutoLlegada;                
        int horas=0;
        int minutosTotales=0;   
        
        System.out.println("Introduzca el día de Salida");
        diaSalida = entrada.nextInt();

        System.out.println("Introduzca la hora de Salida");
        horaSalida = entrada.nextInt();

        System.out.println("Introduzca el minuto de Salida");
        minutoSalida = entrada.nextInt();

        System.out.println("Introduzca el día de Llegada");
        diaLlegada = entrada.nextInt();

        System.out.println("Introduzca la hora de Llegada");
        horaLlegada = entrada.nextInt();

        System.out.println("Introduzca el minuto de Llegada");
        minutoLlegada = entrada.nextInt();

        int diaTotal = (diaLlegada*24*60) - (diaSalida*24*60);
        int horaTotal = (horaLlegada*60) - (horaSalida*60);         
        int minutos = minutoLlegada - minutoSalida;
        
        int total = diaTotal + horaTotal + minutos;
        
        if (total<0){
            System.out.println("Ha ocurrido un error con las fechas. Eso no es posible.");
        }else{
            horas = total / 60;
            minutosTotales = total % 60;
        }
       
        System.out.println("El tren tarda " + horas + " horas y " + minutosTotales + " minutos.");
        
        
        
    }
    
}