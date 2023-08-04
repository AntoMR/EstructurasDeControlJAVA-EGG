
package estructurasdecontrolenjava04;

import java.util.Scanner;


public class EstructurasDeControlEnJava04 {

   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase o palabra: ");
        String frase = leer.nextLine();
        
        String primeraLetra = frase.substring( 0 , 1);
        
        if(primeraLetra.equals("A") || primeraLetra.equals("a")){
            
            System.out.println("Correcto");
            
        }else {
            System.out.println("Incorrecto");
        }
        
        
    }
    
}
