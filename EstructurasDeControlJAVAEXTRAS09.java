
package estructurasdecontroljavaextras09;

import java.util.Scanner;


public class EstructurasDeControlJAVAEXTRAS09 {

  
    public static void main(String[] args) {
       
        
         Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el dividendo (mayor que uno): ");
        int dividendo = sc.nextInt();

        System.out.print("Ingrese el divisor (mayor que uno): ");
        int divisor = sc.nextInt();

        if (dividendo <= 1 || divisor <= 1) {
            System.out.println("El dividendo y el divisor deben ser mayores que uno.");
        } else {
            int cociente = 0;
            while (dividendo >= divisor) {
                dividendo -= divisor;
                cociente++;
            }

            int residuo = dividendo;

            System.out.println("El cociente es: " + cociente);
            System.out.println("El residuo es: " + residuo);
        }
    }
    
}
