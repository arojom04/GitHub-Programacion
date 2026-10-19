/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4;

import java.util.Scanner;
import Operaciones.Operaciones;

/**
 *
 * @author alumno
 */
public class TEMA4 {
    /**
     * Método que imprime por pantalla "Hola, mundo".
     */
    public static void saludar (){
        System.out.println("Hola, mundo");
    }
    
    //Pido un número entero al usuario.
    /**
     * Método que pide al usuario un número entero.
     * @return número que escribe el usuario. 
     */
    public static int pedirNumero(){
        Scanner entrada = new Scanner (System.in);
        System.out.print("Escriba el número: ");
        return entrada.nextInt();
    }
    /**
     * Método que multiplica dos números recibidos.
     * @param num1
     * @param num2
     * @return resultado
     */
    public static int multiplicar(int num1, int num2){
        return num1*num2;
    }
    
    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        saludar();
        
        int num1 = pedirNumero();
        int num2 = pedirNumero();
        
        int resultado = multiplicar(num1, num2);
        
        System.out.println("El resultado es: " +resultado);
        System.out.println(multiplicar(num1, num2));
        System.out.println(multiplicar(pedirNumero(), pedirNumero()));
        
        //Llamo al método sumar() de la clase Operaciones.
        
        Operaciones.sumar(num1, num2);
    }
    
}
