
package estructurasdecontroljavaextras10;

import java.util.Scanner;


public class EstructurasDeControlJAVAEXTRAS10 {

    
    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);

        System.out.println("Adivina el resultado de la multiplicación:");

        // Generar dos números aleatorios entre 0 y 10
        int num1 = (int) (Math.random() * 11);
        int num2 = (int) (Math.random() * 11);

        // Calcular el resultado de la multiplicación
        int resultado = num1 * num2;

        int respuestaUsuario;
        do {
            System.out.print(num1 + " * " + num2 + " = ");
            respuestaUsuario = sc.nextInt();

            if (respuestaUsuario == resultado) {
                System.out.println("¡Respuesta correcta!");
            } else {
                System.out.println("Respuesta incorrecta. Intenta nuevamente.");
            }
        } while (respuestaUsuario != resultado);
    }
    
}
