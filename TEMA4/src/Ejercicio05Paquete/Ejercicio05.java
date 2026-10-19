package Ejercicio05Paquete;

/**
 *
 * @author Alejandro Rojo Martín
 * @since 19/10/2026
 * @version 1
 */
public class Ejercicio05 {
    /**
     * 
     * @param num 
     */
    public static void numero(int num){ //DECLARO EL MÉTODO Y CON EL IF CONSIGO VER SI ES PAR O IMPAR.
        if(num%2==0){
            System.out.println("El número introducido es par.");
        }else if(num%2!=0){
            System.out.println("El número introducido es impar.");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
