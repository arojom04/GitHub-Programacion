package caritmetica2;
        
public class CAritmetica2 {
    /**
     *  @author Alejandro Rojo Martín
     *  Operaciones Aritméticas
     *  @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int dato1, dato2;  //Declaro las variables enteras dato1 y dato2
        int dato3, resultado;   //Declaro, a la vez, dos variables enteras: dato3 y resultado            
    
        dato1 = 20;     // Asigno el valor 20 a la variable dato1
        dato2 = 10;
        dato3 = 5;
    
        System.out.println("dato1 = " + dato1);
        System.out.println("dato2 = " + dato2);
        System.out.println("dato3 = " + dato3);
        
        //Suma
        resultado = dato1 + dato2 + dato3; //La suma de ambas variables las guardo en una nueva llamada resultado
        System.out.println("dato1 + dato2 + dato3 = resultado");        
        System.out.println(dato1 +  "+" + dato2 + "+" + dato3 + "=" + resultado);
    
        //Resta
        resultado = dato1 - dato2 - dato3;
        System.out.println("dato1 - dato2 - dato3 = resultado");          
        System.out.println(dato1 +  "-" + dato2 + "-" + dato3 + "=" + resultado);

        //Producto
        resultado = dato1 * dato2 * dato3;
        System.out.println("dato1 * dato2 * dato3 = resultado");  
        System.out.println(dato1 +  "*" + dato2 + "*" + dato3 + "=" + resultado);     

        //Cociente
        resultado = dato1 / dato2 / dato3;
        System.out.println("dato1 / dato2 / dato3 = resultado");  
        System.out.println(dato1 +  "/" + dato2 + "/" + dato3 + "=" + resultado);             
    }
}
