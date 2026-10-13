package ejercicios;

/**
 *
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 07/10/2026
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int numero1=17;  
    int suma=0;
    
        do{
            if(numero1%2==0){
                suma+=numero1;
            }
            numero1++;
        }while(numero1<139);
        
        System.out.println("La suma total de todos los números pares existentes entre 17 y 139 es " +suma );
        }    
    
}
