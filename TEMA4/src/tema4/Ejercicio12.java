package tema4;

import java.util.Scanner;

/**
 *
 * @author Alejandro Rojo Martín
 * @since 19/10/2026
 * @version 1
 */
public class Ejercicio12 {
    
    public static int contrasena (int contrasenha){
        Scanner entrada = new Scanner (System.in);
        contrasenha = entrada.nextInt();
        return contrasenha;
    }
    
    public static boolean comprobacion (int contrasenha, int contrasenia){
        return contrasenha == contrasenia;
    }
    

    public static void resultado(int contrasenia, int contrasenha, boolean correcto, int contador) {
        contador = 0;
        correcto = false;

        while (contador < 3 && !correcto) {
            
            System.out.println("Introduzca la contraseña: ");
            contrasenha = contrasena(contrasenha);

            correcto = comprobacion(contrasenha, contrasenia);

            if (!correcto) {
                contador++;

                if (contador < 3) {
                    System.out.println("Contraseña incorrecta. Te quedan " + (3 - contador) + " intentos.");
                }
            }
        }

        if (correcto) {
            System.out.println("¡Enhorabuena! Has obtenido acceso.");
        } else {
            System.out.println("Error de acceso.");
        }
    }

            
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contrasenha=0;
        int contrasenia = 1533;
        int contador = 0;
        boolean correcto = false;
        
        resultado(contrasenia, contrasenha, correcto, contador);        
        
    }
    
}
