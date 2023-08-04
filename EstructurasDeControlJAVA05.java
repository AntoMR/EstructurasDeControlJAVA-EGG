
package estructurasdecontroljava05;

import java.util.Scanner;


public class EstructurasDeControlJAVA05 {

   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el límite positivo: ");
        int limite = leer.nextInt();
        int suma = 0;

        while (suma <= limite) {
            System.out.print("Ingrese un número: ");
            int numero = leer.nextInt();
            suma += numero;
        }

        System.out.println("La suma de los números introducidos superó el límite inicial de " + limite);
        System.out.println("La suma final es: " + suma);
       
    }
    
}
