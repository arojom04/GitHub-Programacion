package tema02.ejercicio13;

/**
 *
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 21/09/2026
 */
public class TEMA02Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2; 
       
        System.out.println("La variable num1 contiene el valor " + num1 + " y la variable num2 contiene el valor " +num2);

        int vaso = num1;
        
        num1 = num2;
        num2 = vaso; 
        
        System.out.println("La variable num1 contiene el valor " + num1 + " y la variable num2 contiene el valor " +num2);        
    }
    
}
