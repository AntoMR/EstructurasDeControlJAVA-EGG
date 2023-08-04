
package estructurasdecontroljavaextras14;

import java.util.Scanner;


public class EstructurasDeControlJAVAEXTRAS14 {

   
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de familias: ");
        int numFamilias = sc.nextInt();

        int totalHijos = 0;
        double sumaEdades = 0.0;

        for (int i = 1; i <= numFamilias; i++) {
            System.out.print("Ingrese la cantidad de hijos de la familia " + i + ": ");
            int numHijos = sc.nextInt();
            totalHijos += numHijos;

            for (int j = 1; j <= numHijos; j++) {
                System.out.print("Ingrese la edad del hijo " + j + " de la familia " + i + ": ");
                int edadHijo = sc.nextInt();
                sumaEdades += edadHijo;
            }
        }

        double mediaEdad = sumaEdades / totalHijos;

        System.out.println("La media de edad de los hijos de todas las familias es: " + mediaEdad + " años.");

    }
    
}
