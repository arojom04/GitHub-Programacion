package ejercicios;

/**
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 05/10/2026
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 0;
        int contador = 0;
        
        while(contador<100){ //Esto dice que mientras la variable contador sea menor a 100 el bucle seguira.
            
            if (numero%2==0){ //Declaramos que si el modulo de numero / 2 es 0, se imprimira el numero y el contador subira en 1.
                System.out.println(numero);
                contador++;
            }
                numero++; //Si no es correcto, solo se sumara uno a la variable numero y ya.           
        }
        
        
    }
    
}
