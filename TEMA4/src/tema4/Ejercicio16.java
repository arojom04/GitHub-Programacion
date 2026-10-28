package tema4;

/**
 *
 * @author Alejandro Rojo Martín
 * @since 26/10/2026 
 */

public class Ejercicio16 {

    public static double raizCuadrada() {
        return Math.sqrt(64);
    }

    public static double cubo() {
        return Math.pow(8, 3);
    }

    public static double exponencial() {
        return Math.exp(2);
    }

    public static double logaritmo() {
        return Math.log(2.71828);
    }

    public static double menor() {
        return Math.min(2, 3);
    }

    public static double absoluto() {
        return Math.abs(-4.5);
    }

    public static double redondeo() {
        return Math.round(-4.5);
    }

    public static double seno() {
        return Math.sin(Math.toRadians(45));
    }

    public static void main(String[] args) {
        System.out.println("Raiz cuadrada de 64: " + raizCuadrada());
        System.out.println("8 elevado al cubo: " + cubo());
        System.out.println("Exponencial de 2: " + exponencial());
        System.out.println("Logaritmo de 2.71828: " + logaritmo());
        System.out.println("Menor valor entre 2 y 3: " + menor());
        System.out.println("Valor absoluto de -4.5: " + absoluto());
        System.out.println("Redondeo de -4.5: " + redondeo());
        System.out.println("Seno de 45 grados: " + seno());
    }
}

