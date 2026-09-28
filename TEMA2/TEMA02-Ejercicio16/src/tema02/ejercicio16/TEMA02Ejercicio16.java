package tema02.ejercicio16;

/**
 *
 * @author Alejandro Rojo Martín
 * @verse 1
 * @since 21/09/2026
 */
public class TEMA02Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dineroCartera = 130;
        int valorBilletesCincuenta = 50;
        int valorBilletesDiez = 10; 
        int billetesCincuenta, resto, billetesDiez;
        
        billetesCincuenta = dineroCartera / valorBilletesCincuenta;
        resto = dineroCartera % valorBilletesCincuenta;
        billetesDiez = resto / valorBilletesDiez;
        
        System.out.println(+ dineroCartera + " euros hacen un total de: " + billetesCincuenta + " billetes de 50 euros y " + billetesDiez + " billetes de 10 euros.");
    }
    
}
