
package estructurasdecontroljava02;

import java.util.Scanner;


public class EstructurasDeControlJAVA02 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa una frase: ");
        String frase = leer.nextLine();
        
        if (frase.equals("Eureka") ){
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
    
}
