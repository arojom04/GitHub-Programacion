/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlexcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class CONTROLEXCEPCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CONTROL DE EXCEPCIONES
        try{ //Le estoy diciendo al programa "Intenta hacer esto"
            Scanner entrada = new Scanner (System.in);  //PARTE DEL CODIGO DONDE PUEDE SUCEDER LA EXCEPCIÓN
            System.out.println("Edad: ");   
            int edad = entrada.nextInt();   
        }catch(InputMismatchException e){ //e es el nombre de la variable donde se guarda la excepcion.
            System.out.println("Dato no válido.");    
        }catch(ArithmeticException e){
            System.out.println("Ha sucedido una excepción aritmética.");//EXISTE LA EXCEPCION EXCEPTION QUE SUELE SIEMPRE SER EL ULTIMO CATCH, CAPTURA CUALQUIER EXCEPTION.
        }finally{ //BLOQUE OPCIONAL, ESTE SIEMPRE SE VA A MOSTAR.
            System.out.println("Bloque final.");
        }
        
    }
    
}
