package ejercicios;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * @author Alejandro Rojo Martín
 * @version 1
 * @since 07/10/2026
 */
public class Reto_CajeroAutomatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int saldoInicial = 1000;
        int saldoActual=saldoInicial;
        int contador;
        int pin= 936;
        int opc = 0;
        
        do{
            System.out.println("---MENU---");    
            System.out.println("Tu saldo actual es de " + saldoActual + ". Que quieres hacer?");
            System.out.println("1. Consultar saldo.");
            System.out.println("2. Ingresar dinero.");
            System.out.println("3. Retirar dinero.");
            System.out.println("4. Salir del programa.");
            
            System.out.print("Elija una opción: ");
            opc = entrada.nextInt();             
            try{
                switch(opc){
                    case 1->System.out.println("Has eligido ver tu saldo actual. El cual es de " +saldoActual + "€.");
                    case 2->{
                        boolean correcto=false;
                    do{    
                        try{
                            System.out.println("Has eligido ingresar dinero. Introduzca la cantidad: ");
                            int ingreso = entrada.nextInt();
                            if(ingreso>0){
                                saldoActual += ingreso;
                                System.out.println("Se han ingresado " + ingreso + "€ con éxito.");
                                correcto = true;
                            }else{
                                System.out.println("La cantidad mínima de ingreso es de 0€. Porfavor, ponga otra cantidad.");
                            }
                        }catch(InputMismatchException e){
                            System.out.println("Error. Porfavor, no uses letras para poner los números.");
                            entrada.nextLine();
                        }
                    }while(!correcto);
                    }
                    
                    case 3->{
                        boolean correcto=false;
                    do{    
                        try{
                            System.out.println("\"Has eligido retirar dinero. Introduzca la cantidad: ");
                            int retiro = entrada.nextInt();
                            if(retiro>0 && retiro<500){
                                if(retiro>saldoActual){
                                    System.out.println("Has intentado retirar mas saldo del que tienes. Porfavor, intenta de nuevo.");
                                }else{
                                saldoActual -= retiro;
                                System.out.println("Se han retirado " + retiro + "€ con éxito.");
                                correcto = true;
                                }
                            }else{
                                    System.out.println("La cantidad mínima de retiro es de 0€ y la máxima es de 500€. Porfavor, ponga otra cantidad.");
                                }
                        }catch(InputMismatchException e){
                            System.out.println("Error. Porfavor, no uses letras para poner los números.");
                            entrada.nextLine();
                        }
                    }while(!correcto);
                    }    
                    case 4->System.out.println("Gracias por usar nuestro programa.");                
                }
            }catch(InputMismatchException e){
                System.out.println("Porfavor, introduzca el número en formato numérico.");
            }            
        } while(opc !=4);

        
    }
    
}
