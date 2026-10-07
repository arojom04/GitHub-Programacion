package ejercicios;

/**
 *
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 07/10/2026
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int numero1=111;  
    int suma=0;
        do{
            if(numero1%2!=0){
                suma+=numero1;
            }
            numero1++;
        }while(numero1<222);
        System.out.println("La suma total de todos los números impares existentes entre 111 y 222 es " +suma );
        }    
    
}
