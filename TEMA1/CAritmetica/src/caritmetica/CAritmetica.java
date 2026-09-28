package caritmetica;
        
public class CAritmetica {
    /**
     *  @author Alejandro Rojo Martín
     *  Operaciones Aritméticas
     *  @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int dato1;  //Declaro la variable entera dato1
        int dato2, resultado;   //Declaro, a la vez, dos variables enteras: dato2 y resultado            
    
        dato1 = 20;     // Asigno el valor 20 a la variable dato1
        dato2 = 10;
    
        System.out.println("dato1 = " + dato1);
        System.out.println("dato2 = " + dato2);
    
        //Suma
        resultado = dato1 + dato2; //La suma de ambas variables las guardo en una nueva llamada resultado
        System.out.println("dato1 + dato2 = resultado");        
        System.out.println(dato1 +  "+" + dato2 + "=" + resultado);
    
        //Resta
        resultado = dato1 - dato2;
        System.out.println("dato1 - dato2 = resultado");
        System.out.println(dato1 +  "-" + dato2 + "=" + resultado);

        //Producto
        resultado = dato1 * dato2;
        System.out.println("dato1 * dato2 = resultado");  
        System.out.println(dato1 +  "*" + dato2 + "=" + resultado);     

        //Cociente
        resultado = dato1 / dato2;
        System.out.println("dato1 / dato2 = resultado");  
        System.out.println(dato1 +  "/" + dato2 + "=" + resultado);             
    }
}
