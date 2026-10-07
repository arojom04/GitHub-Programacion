package ejercicios;
import java.util.Scanner;
/**
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 07/10/2026
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Introduzca el año actual:");
        int añoActual = entrada.nextInt();
        System.out.println("Introduzca el mes actual:");
        int mesActual = entrada.nextInt();
        System.out.println("Introduzca el día actual:");
        int diaActual = entrada.nextInt();
        
        System.out.println("Introduzca el año en el que naciste:");
        int añoNacimiento = entrada.nextInt();
        System.out.println("Introduzca el mes en el que naciste:");
        int mesNacimiento = entrada.nextInt();
        System.out.println("Introduzca el día en el que naciste:");
        int diaNacimiento = entrada.nextInt();        
        
        
        int años = añoActual - añoNacimiento;
        int meses = mesActual - mesNacimiento;
        int dias = diaActual - diaNacimiento;
        
        if(dias<0){
            dias += 30;
            meses--;
        }
        
        if(meses<0){
            meses += 12;
            años--;
        }
        
        System.out.println("Tu edad exacta es de: ");
        System.out.println(años + " años, " + meses + " meses y " + dias + " dias.");
    }
    
}
