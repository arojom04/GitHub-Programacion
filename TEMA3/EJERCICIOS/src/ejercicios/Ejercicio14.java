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
        
        while(contador<100){
            
            if (numero%2==0){
                System.out.println(numero);
                contador++;
            }
                numero++;            
        }
        
        
    }
    
}
