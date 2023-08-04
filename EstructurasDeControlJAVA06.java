
package estructurasdecontroljava06;

import java.util.Scanner;


public class EstructurasDeControlJAVA06 {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num1, num2;
        char opcion;
        boolean salir = false;

        System.out.print("Ingrese el primer número entero positivo: ");
        num1 = sc.nextInt();
        System.out.print("Ingrese el segundo número entero positivo: ");
        num2 = sc.nextInt();

        while (!salir) {
            System.out.println("---------- MENÚ DE OPERACIONES ----------");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.println("-----------------------------------------");

            System.out.print("Ingrese una opción (1-5): ");
            opcion = sc.next().charAt(0);

            switch (opcion) {
                case '1':
                    System.out.println("Suma: " + (num1 + num2));
                    break;
                case '2':
                    System.out.println("Resta: " + (num1 - num2));
                    break;
                case '3':
                    System.out.println("Multiplicación: " + (num1 * num2));
                    break;
                case '4':
                    if (num2 != 0) {
                        System.out.println("División: " + ((double) num1 / num2));
                    } else {
                        System.out.println("No se puede dividir entre cero.");
                    }
                    break;
                case '5':
                    System.out.print("¿Está seguro que desea salir del programa? (S/N): ");
                    char confirmacion = sc.next().charAt(0);
                    if (confirmacion == 'S' || confirmacion == 's') {
                        salir = true;
                        System.out.println("Saliendo del programa...");
                    }
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida (1-5).");
                    break;
       
    }
    
}
    }
}
