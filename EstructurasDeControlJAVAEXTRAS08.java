
package estructurasdecontroljavaextras08;

import java.util.Scanner;


public class EstructurasDeControlJAVAEXTRAS08 {

   
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        int cantidadNumeros = 0;
        int cantidadPares = 0;
        int cantidadImpares = 0;

        while (true) {
            System.out.print("Ingrese un número entero (0 para salir): ");
            int numero = sc.nextInt();

            if (numero == 0) {
                break; // Salir del bucle si el número ingresado es cero
            }

            if (numero < 0) {
                continue; // Saltar el número negativo sin sumarlo a las estadísticas
            }

            cantidadNumeros++;

            if (numero % 2 == 0) {
                cantidadPares++;
            } else {
                cantidadImpares++;
            }

            if (numero % 5 == 0) {
                break; // Detener la lectura si se encuentra un número múltiplo de cinco
            }
        }

        System.out.println("Cantidad de números leídos: " + cantidadNumeros);
        System.out.println("Cantidad de números pares: " + cantidadPares);
        System.out.println("Cantidad de números impares: " + cantidadImpares);

    }
    
}
