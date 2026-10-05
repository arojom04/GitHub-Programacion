package ejercicios;

/**
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 05/10/2026
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 11;
        
        do{
            if (numero%2==0){
                System.out.println(numero);
            }
            
            numero++;
            
        }while(numero<133);
    }
    
}
