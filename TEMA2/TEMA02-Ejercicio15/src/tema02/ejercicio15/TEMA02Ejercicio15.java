package tema02.ejercicio15;

/**
 *
 * @author Alejandro Rojo Martín
 * @verse 1
 * @since 21/09/2026
 */
public class TEMA02Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tiempo = 10000;
        int segundos, horas, minutos;
        
        
       horas = tiempo / 3600;
       minutos = (tiempo % 3600)/ 60;
       segundos = tiempo % 60;
       
       System.out.println("10.000 segundos hacen un total de: " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");
    }
    
}
