package tema4;
import java.util.Scanner;
/**
 *
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 19/10/2026
 */
public class Ejercicio07 {

    /**
     * DENTRO DEL MÉTODO USAMOS EL MÉTODO DE LA BURBUJA PARA DECLARAR CUAL ES EL ORDEN DE LOS NÚMEROS.
     * @param num1
     * @param num2
     * @param num3
     * @param num4 
     */
    public static void ordenar (int num1, int num2, int num3, int num4){
        
        int menor = num1;
        int medio1 = num2;
        int medio2 = num3;
        int mayor = num4;

        int temporal;

        if (menor > medio1) {
            temporal = menor; menor = medio1; medio1 = temporal;
        }
        if (medio1 > medio2) {
            temporal = medio1; medio1 = medio2; medio2 = temporal;
        }
        if (medio2 > mayor) {
            temporal = medio2; medio2 = mayor; mayor = temporal;
        }
        if (menor > medio1) {
            temporal = menor; menor = medio1; medio1 = temporal;
        }
        if (medio1 > medio2) {
            temporal = medio1; medio1 = medio2; medio2 = temporal;
        }
        if (menor > medio1) {
            temporal = menor; menor = medio1; medio1 = temporal;
        }
        System.out.println("El orden de los números introducidos es el " + menor + " - " + medio1 + " - " + medio2 + " - " + mayor);            
    }
    
    /**
     * TRAEMOS EL RESULTADO DEL OTRO MÉTODO A DENTRO DEL MÉTODO MAIN
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        
        System.out.println("Por favor, introduzca el primer numero: ");
        int num1 = entrada.nextInt();
        System.out.println("Ahora, introduzca un segundo numero: ");
        int num2 = entrada.nextInt();
        System.out.println("Introduzca el tercer numero: ");
        int num3 = entrada.nextInt();
        System.out.println("Por último, introduzca un cuarto numero: ");
        int num4 = entrada.nextInt();
        
        ordenar(num1,num2,num3,num4);
    }
    
}
