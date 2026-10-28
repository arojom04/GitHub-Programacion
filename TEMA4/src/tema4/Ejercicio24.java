package tema4;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio24 {

    public static String pedirNombre (){
        Scanner entrada = new Scanner (System.in);
        String nombre = entrada.nextLine();
        return nombre;
    }
    
    public static int pedirEdad () {
        Scanner entrada = new Scanner (System.in);
        int edad = entrada.nextInt();
        return edad;
    }
    
    public static void mayorDeEdad (int edad, String nombre){  
        if (edad<18){
            System.out.println(nombre+ " es menor de edad.");
        }else {
            System.out.println(nombre+ " es mayor de edad.");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        int edad;
        System.out.println("Introduzca su nombre.");
        nombre = pedirNombre();
        
        System.out.println("Introduzca su edad");
        edad = pedirEdad ();
        
        mayorDeEdad(edad, nombre);
    }
    
}
