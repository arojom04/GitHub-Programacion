package condicionales;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduzca un número del 1 al 7.");
        num1 = entrada.nextInt();        
        // IF
        System.out.println("IF");
        if(num1%2==0){
            System.out.println("El número es par.");
        }
                // IF ELSE
        System.out.println("IF ELSE");
        if(num1%2==0){
            System.out.println("El número es par.");
        }else{
            System.out.println("El número es impar.");
        }
                // IF-ELSE IF-ELSE
        System.out.println("IF-ELSE IF-ELSE");
        if(num1>0){
            System.out.println("El número es positivo.");
        }else if(num1<0){
            System.out.println("El número es negativo.");
        }else{
            System.out.println(num1 + "es 0");
        }
                // SWITCH
        System.out.println("SWITCH");
        switch(num1){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;                
            default:
                System.out.println("No existe ese día de la semana.");
                
        }
    }
    
}
