package Ejercicio03Paquete;

/**
 *
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 19/10/2026
 */
public class Ejercicio03 {
    public static void imprimir(int num1, int num2, int num3){
        if(num1>num2 && num1>num3){
            System.out.println("El número mayor de los introducidos es el " +num1);
        }else if (num2>num1 && num2>num3){
            System.out.println("El número mayor de los introducidos es el " +num2);
        }else if (num3>num1 && num3>num2){
            System.out.println("El número mayor de los introducidos es el " +num3);            
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
