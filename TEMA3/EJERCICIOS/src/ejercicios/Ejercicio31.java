package ejercicios;

/**
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 07/10/2026
 */
public class Ejercicio31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int intentos = 0;
        int impares=0;
        
        int impar1=0;
        int impar2=0;
        int impar3=0;        
        do{
        int aleatorioEntero = (int) Math.floor(Math.random() * 100) + 1;
            
            if(aleatorioEntero%2!=0){
                impares++;
                
                if(impares==1){
                    impar1=aleatorioEntero;
                }else if(impares==2){
                    impar2=aleatorioEntero;
                }else if(impares==3){
                    impar3=aleatorioEntero;
                }
            }
            intentos++;
        }while(impares<3);
        
        System.out.println("Los tres números impares son:");
        System.out.println(impar1);
        System.out.println(impar2);
        System.out.println(impar3);

        System.out.println("Se han generado " + intentos + " números.");
    }
    
}
