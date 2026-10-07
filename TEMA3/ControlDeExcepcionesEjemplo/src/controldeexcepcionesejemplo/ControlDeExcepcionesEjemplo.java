/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controldeexcepcionesejemplo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ControlDeExcepcionesEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        
        try{
            Scanner entrada = new Scanner (System.in);
            System.out.println("Introduzca su edad: ");
            edad=entrada.nextInt();
            System.out.println("Tu edad es: " + edad);
        }catch(InputMismatchException e){
            System.out.println("Dato no válido; debes introducir un número entero.");
        }finally{
            System.out.println("Dato pedido al usuario.");
        }     
    }
    
}
