package tema4;
import java.util.Scanner;
/**
 *
 * @author Alejandro Rojo Martín
 * @since 19/10/2026
 * @version 1
 */
public class Ejercicio06 {

    public static void calificacion(int nota){
        if(nota<=4 && nota>=0){
            System.out.println("La calificación del alumno es suspenso.");
        }else if(nota>=5 && nota<=6){
            System.out.println("La calificación del alumno es bien.");            
        }else if (nota>=7 && nota<=8){
            System.out.println("La calificación del alumno es notable.");           
        }else if (nota>=9 && nota<=10){
            System.out.println("La calificación del alumno es sobresaliente.");            
        }else{
            System.out.println("La nota introducida no esta entre el 0 y el 10.");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Introduzca la nota del alumno: ");
        int nota = entrada.nextInt();
        
        calificacion(nota);
    }
    
}
