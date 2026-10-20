package ejercicios;

/**
 *
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 07/10/2026
 */
public class Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Aqui calculamos el número aleatorio y hacemos lo de "(int) Math.floor(Math.random() * 100+1)" para asegurarnos de que lo que nos salga sea un número entero.
        int aleatorioEntero = (int) Math.floor(Math.random() * 100+1);

        //Con esto hacemos que el número aleatorio que salga se nos diga si es par o impar.
        if(aleatorioEntero%2==0){
        System.out.println("El numero aleatorio es " +aleatorioEntero+" y es par.");
        }else{
        System.out.println("El numero aleatorio es " +aleatorioEntero+" y es impar.");            
        }
    }
    
}
