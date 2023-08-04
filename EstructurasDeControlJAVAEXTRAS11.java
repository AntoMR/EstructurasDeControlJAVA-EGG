
package estructurasdecontroljavaextras11;

import java.util.Scanner;


public class EstructurasDeControlJAVAEXTRAS11 {

   
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();

        // Calcular la cantidad de dígitos
        int cantidadDigitos = 0;
        int numeroAbsoluto = Math.abs(numero); // Tomar el valor absoluto para tratar números negativos

        do {
            numeroAbsoluto /= 10;
            cantidadDigitos++;
        } while (numeroAbsoluto != 0);

        System.out.println("El número de dígitos es: " + cantidadDigitos);
    }
    
}
