package ejercicios;

/**
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 05/10/2026
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 20;
        int contador = 0;
            System.out.println("Los números impares existentes entre el número 20 y el 160 son: ");
        while(numero<160){
            
            if (numero%2!=0){
                System.out.print(numero);
                System.out.print(" - ");
                contador++;
            }
        numero++;    
        }
        System.out.println();
        System.out.println("La cantidad de números impares impresos han sido: " + contador);
        
    }
    
}
