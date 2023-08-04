
package estructurasdecontroljavaextras05;

import java.util.Scanner;


public class EstructurasDeControlJAVAEXTRAS05 {

   
    public static void main(String[] args) {
      
         Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la clase del socio (A, B o C): ");
        char claseSocio = sc.next().charAt(0);
        claseSocio = Character.toUpperCase(claseSocio); 

        double costoTratamiento;
        double importeAPagar;

        System.out.print("Ingrese el costo del tratamiento: ");
        costoTratamiento = sc.nextDouble();

        switch (claseSocio) {
            case 'A':
                importeAPagar = costoTratamiento * 0.5;
                break;
            case 'B':
                importeAPagar = costoTratamiento * 0.65; // 35% de descuento
                break;
            case 'C':
                importeAPagar = costoTratamiento; // Sin descuento
                break;
            default:
                System.out.println("Clase de socio inválida. Ingrese A, B o C.");
                sc.close();
                return;
        }

        System.out.println("Importe en efectivo a pagar: " + importeAPagar);

    }
    
}
