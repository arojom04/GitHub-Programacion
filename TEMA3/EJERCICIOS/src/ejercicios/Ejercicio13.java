package ejercicios;

/**
 *
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 05/10/2026
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 11; //Declaramos la variable.
        
        while (numero<133){  //Declaramos que se hará el modulo de numero / 2 mientras la variable numero sea menor a 133
            
            if (numero % 2 ==0){ //Si esta condición es correcta se imprimira numero, si no es correcta se sumara uno a la variable y continuara.
            System.out.println(numero);
            }
            
            numero++;
        }
    }
    
}
