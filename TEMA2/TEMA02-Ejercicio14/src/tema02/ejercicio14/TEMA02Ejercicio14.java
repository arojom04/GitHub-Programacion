package tema02.ejercicio14;

/**
 *
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 21/09/2026
 */
public class TEMA02Ejercicio14 {
    
    final static float PI = 3.1416f;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float radio = 5.2f;

        float radioEnMetros = (radio * 0.01f);
        
        float area = (PI * (radioEnMetros * radioEnMetros));
       
        System.out.println("El area de una circunferencia cuyo radio vale " +radioEnMetros+ " seria igual a " +area+ " metros");
    }
    
}
