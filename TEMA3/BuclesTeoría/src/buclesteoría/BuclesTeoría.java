package buclesteoría;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class BuclesTeoría {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int indice = 0;
        int indice0= 0;
        //WHILE
        while(indice<10){
            System.out.println(indice);
            indice++;
        }
        
        //DO-WHILE
        do{
            System.out.println(indice0);
            indice0++;
        }while(indice0<10);
        
        //FOR
        for (int indice1 = 0;indice1<10;indice1++){
            if (indice%2 !=0){
            System.out.println(indice1);
            }
        }
        
        //MENUS
        int opc = 0;
        Scanner entrada = new Scanner (System.in);
        do {
            // MOSTRAMOS EL MENÚ AL USUARIO
            System.out.println("- MENU -");
            System.out.println("1. Ver catálogo");
            System.out.println("2. Solicitar libro");
            System.out.println("3. Devolver libro");
            System.out.println("4. Salir");
            
            //PEDIR OPCIÓN
            System.out.print("Elija una opción: ");
            opc = entrada.nextInt(); 
            
            //EJECUTAR LA OPCIÓN ELEGIDA POR EL USUARIO.
            switch(opc){
                case 1->System.out.println("Has eligido ver el catálogo.");
                case 2->System.out.println("Has eligido solicitar un libro."); 
                case 3->System.out.println("Has eligido devolver un libro.");     
                case 4->System.out.println("Gracias por usar nuestro programa.");                  
            }
            
            
        } while(opc !=4);
    }
    
}
