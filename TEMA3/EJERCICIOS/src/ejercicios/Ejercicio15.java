package ejercicios;
import java.util.Scanner; //Importamos el scanner
/**
 *
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 05/10/2026
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); //Declaramos el scanner
        int multiplicador = 0; //Declaramos la variable
        System.out.print("Introduzca un numero para calcular su tabla de multiplicar: ");
        int numero = entrada.nextInt();
        
        do{
            System.out.println(numero+ " X " +multiplicador+ " = " +numero*multiplicador); //Ponemos esto para que imprima eso.
            multiplicador++; //Esto le va sumando 1 a la variable multiplicador.
        }while(multiplicador<11);//Con esto nos aseguramos de que la tabla de multiplicar solo llegue a multiplicar hasta 10
        
    }
    
}
