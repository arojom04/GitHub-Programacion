package ejercicios;

/**
 *
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 05/10/2026
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /**Con el bucle for ponemos una variable entera con valor 1,
        * "Hola" se irá imprimiendo hasta que el valor entero llegue a 7.
        * En cada repetición se irá sumando uno. 
        * Y en este caso ponemos la variable hola en sout para que se imprima al lado del texto.
        */
        for(int hola = 1;hola<7;hola++){
            System.out.print("Hola"+hola);
            
                if (hola<6){
                    System.out.print(" - ");
            }
        }
        
    }
    
}
