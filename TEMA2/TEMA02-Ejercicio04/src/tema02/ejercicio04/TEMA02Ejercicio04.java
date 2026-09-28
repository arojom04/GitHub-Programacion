package tema02.ejercicio04;

/**
 *
 * @author Alejandro Rojo Martín
 * @since 21/09/2026
 * @version 1
 */
public class TEMA02Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String asignatura = "Programación";
        float examen1 = 7.2f; 
        float examen2 = 3.8f;
        float media;
        
        media = (examen1+examen2)/2;    
        System.out.println("La asignatura que estudio se llama " +asignatura);
        System.out.println("La nota del primer examen es " +examen1);
        System.out.println("La nota del segundo examen es " +examen2);
        System.out.println("Y mi nota media es " +media);        
    }
    
}
