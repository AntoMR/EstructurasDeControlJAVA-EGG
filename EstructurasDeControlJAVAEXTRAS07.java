
package estructurasdecontroljavaextras07;

import java.util.Scanner;


public class EstructurasDeControlJAVAEXTRAS07 {

    
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de N (número de números a calcular): ");
        int n = sc.nextInt();

        int contador = 0;
        int suma = 0;
        int valorMinimo = Integer.MAX_VALUE;
        int valorMaximo = Integer.MIN_VALUE;

        do {
            System.out.print("Ingrese el número " + (contador + 1) + ": ");
            int numero = sc.nextInt();

            suma += numero;

            if (numero < valorMinimo) {
                valorMinimo = numero;
            }

            if (numero > valorMaximo) {
                valorMaximo = numero;
            }

            contador++;
        } while (contador < n);

        double promedio = (double) suma / n;

        System.out.println("Valor máximo: " + valorMaximo);
        System.out.println("Valor mínimo: " + valorMinimo);
        System.out.println("Promedio: " + promedio);
    }
    
}
