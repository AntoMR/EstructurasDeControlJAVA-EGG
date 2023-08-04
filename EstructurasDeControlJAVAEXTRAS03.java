
package estructurasdecontroljavaextras03;

import java.util.Scanner;


public class EstructurasDeControlJAVAEXTRAS03 {

  
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una letra: ");
        String letra = sc.next().toLowerCase(); // Convertir la letra a minúscula para facilitar la comparación

        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("La letra ingresada es una vocal.");
        } else {
            System.out.println("La letra ingresada NO es una vocal.");
        }
        
    }
    
}
