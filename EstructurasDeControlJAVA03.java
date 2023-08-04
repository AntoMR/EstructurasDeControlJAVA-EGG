
package estructurasdecontrolenjava03;

import java.util.Scanner;


public class EstructurasDeControlEnJava03 {

  
    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase de 8 caracteres: ");
        String frase = leer.nextLine();
        
        int longitud = frase.length();
        
        if (longitud == 8){
            
            System.out.println("CORRECTO");
        } else {
            
            System.out.println("Incorrecto");
        
    }
    }
    
}
