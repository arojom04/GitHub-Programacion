package ejercicios;
import java.util.Scanner;
/**
 *
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 30/09/2026
 */
public class Ejercicio9 {
    public static void main(String[] args) {
            Scanner entrada = new Scanner (System.in);
            
        System.out.println("Por favor, introduzca el primer numero: ");
        int numero1 = entrada.nextInt();
        System.out.println("Ahora, introduzca un segundo numero: ");
        int numero2 = entrada.nextInt();
        System.out.println("Introduzca el tercer numero: ");
        int numero3 = entrada.nextInt();
        System.out.println("Por último, introduzca un cuarto numero: ");
        int numero4 = entrada.nextInt();        
    
        int menor = 0, medio1 = 0, medio2 = 0, mayor = 0;

        if (numero1 >= numero2 && numero1 >= numero3 && numero1 >= numero4) {
            mayor = numero1;
            if (numero2 >= numero3 && numero2 >= numero4) {
                medio2 = numero2;
                if (numero3 >= numero4) {
                    medio1 = numero3;
                    menor = numero4;
                } else {
                    medio1 = numero4;
                    menor = numero3;
                }
            } else if (numero3 >= numero2 && numero3 >= numero4) {
                medio2 = numero3;
                if (numero2 >= numero4) {
                    medio1 = numero2;
                    menor = numero4;
                } else {
                    medio1 = numero4;
                    menor = numero2;
                }
            } else {
                medio2 = numero4;
                if (numero2 >= numero3) {
                    medio1 = numero2;
                    menor = numero3;
                } else {
                    medio1 = numero3;
                    menor = numero2;
                }
            }
        }

        if (numero2 >= numero1 && numero2 >= numero3 && numero2 >= numero4) {
            mayor = numero2;
            if (numero1 >= numero3 && numero1 >= numero4) {
                medio2 = numero1;
                if (numero3 >= numero4) {
                    medio1 = numero3;
                    menor = numero4;
                } else {
                    medio1 = numero4;
                    menor = numero3;
                }
            } else if (numero3 >= numero1 && numero3 >= numero4) {
                medio2 = numero3;
                if (numero1 >= numero4) {
                    medio1 = numero1;
                    menor = numero4;
                } else {
                    medio1 = numero4;
                    menor = numero1;
                }
            } else {
                medio2 = numero4;
                if (numero1 >= numero3) {
                    medio1 = numero1;
                    menor = numero3;
                } else {
                    medio1 = numero3;
                    menor = numero1;
                }
            }
        }

        if (numero3 >= numero2 && numero3 >= numero1 && numero3 >= numero4) {
            mayor = numero3;
            if (numero2 >= numero1 && numero2 >= numero4) {
                medio2 = numero2;
                if (numero1 >= numero4) {
                    medio1 = numero1;
                    menor = numero4;
                } else {
                    medio1 = numero4;
                    menor = numero1;
                }
            } else if (numero1 >= numero2 && numero1 >= numero4) {
                medio2 = numero1;
                if (numero2 >= numero4) {
                    medio1 = numero2;
                    menor = numero4;
                } else {
                    medio1 = numero4;
                    menor = numero2;
                }
            } else {
                medio2 = numero4;
                if (numero2 >= numero1) {
                    medio1 = numero2;
                    menor = numero1;
                } else {
                    medio1 = numero1;
                    menor = numero2;
                }
            }
        }
        
        if (numero4 >= numero2 && numero4 >= numero3 && numero4 >= numero1) {
            mayor = numero4;
            if (numero2 >= numero3 && numero2 >= numero1) {
                medio2 = numero2;
                if (numero3 >= numero1) {
                    medio1 = numero3;
                    menor = numero1;
                } else {
                    medio1 = numero1;
                    menor = numero3;
                }
            } else if (numero3 >= numero2 && numero3 >= numero1) {
                medio2 = numero3;
                if (numero2 >= numero1) {
                    medio1 = numero2;
                    menor = numero1;
                } else {
                    medio1 = numero1;
                    menor = numero2;
                }
            } else {
                medio2 = numero1;
                if (numero2 >= numero3) {
                    medio1 = numero2;
                    menor = numero3;
                } else {
                    medio1 = numero3;
                    menor = numero2;
                }
            }
        }
        System.out.println("El orden de los números introducidos es el " + menor + " - " + medio1 + " - " + medio2 + " - " + mayor);
    }
}
