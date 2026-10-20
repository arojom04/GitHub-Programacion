package tema4;

import java.util.Scanner;

/**
 *
 * @author Alejandro Rojo Martín
 * @since 19/10/2026
 * @version 1
 */
public class Ejercicio10 {
    
    public static int pedirNumero (int num){
        Scanner entrada = new Scanner (System.in);
        num = entrada.nextInt();
        return num;
    }
    
    public static void tablaMultiplicar(int multiplicador, int num, int resultado){
        do{
            multiplicador++;
            resultado=(num*multiplicador);
            System.out.println(num + " x " + multiplicador+ " = " + resultado);
        }while(multiplicador<10);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int multiplicador = 0;
        int num=0;
        int resultado=0;
        System.out.println("Introduzca un numero para calcular su tabla de multiplicar: ");
        num = pedirNumero(num);
        
        tablaMultiplicar(multiplicador, num, resultado);
    }
    
}
