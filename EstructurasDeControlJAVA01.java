
package estructuras.de.control.java01;

import java.util.Scanner;


public class EstructurasDeControlJAVA01 {

   
    
    public static void main(String[] args) {
        

        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero");
        int numero = leer.nextInt();
        
        if ( numero%2 == 0) {
            System.out.println("El numero " + numero + " es par");
        }else {
            System.out.println("El numero " + numero + " es impar");
        }
                
       
    }
    
}
