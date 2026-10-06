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
        int numero = 20; //Declaramos la variable
        int contador = 0; //Declaramos la variable que nos ayudara a contar las veces.
            System.out.println("Los números impares existentes entre el número 20 y el 160 son: ");
        while(numero<160){ //Usamos while y declaramos que el bucle se haga hasta que numero no sea mayor o igual que 160
            
            if (numero%2!=0){ //Usamos el if para declarar que si el resto de numero entre 2 no es 0 que se imprima eso.
                System.out.print(numero);
                System.out.print(" - ");
                contador++; //Usamos esto para ir sumandole uno a la variable contador cada vez que ocurre esto.
            }
        numero++;    //Usamos esto para ir sumandole uno a la variable numero en el bucle.
        }
        System.out.println();
        System.out.println("La cantidad de números impares impresos han sido: " + contador);
        
    }
    
}
