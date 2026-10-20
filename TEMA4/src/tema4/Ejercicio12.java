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
    
    public static boolean comprobacion (boolean correcto, int contrasenha, int contrasenia, int contador){
        correcto = false;
        do{
            if(contrasenha==contrasenia && contador<3){
                correcto = true;
                System.out.println("La contraseña es correcta. Has obtenido acceso.");
            }else if (contrasenha!=contrasenia){
                contador++;
                System.out.println("La contraseña es incorrecta. Te quedan " +(3-contador));
            }else if(contador>3){
                System.out.println("Ya no te quedan intentos.");
            }  
        }while(correcto==false && contador<3); 
        return correcto;
    }
    
    public static void resultado(){
        
}
            
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contrasenha=0;
        int contrasenia = 153;
        int contador = 0;
        System.out.println("Introduzca la contraseña: ");
        contrasenha = contrasena(contrasenha);
    }
    
}
