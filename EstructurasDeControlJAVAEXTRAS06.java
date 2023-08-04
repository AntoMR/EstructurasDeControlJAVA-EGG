
package estructurasdecontroljavaextras06;

import java.util.Scanner;


public class EstructurasDeControlJAVAEXTRAS06 {

    
    public static void main(String[] args) {
       
         Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de personas (N): ");
        int N = sc.nextInt();

        double sumaTotalEstaturas = 0;
        double sumaEstaturasMenor160 = 0;
        int contadorEstaturasMenor160 = 0;

        for (int i = 1; i <= N; i++) {
            System.out.print("Ingrese la altura de la persona " + i + " (en metros): ");
            double altura = sc.nextDouble();
            sumaTotalEstaturas += altura;

            if (altura < 1.60) {
                sumaEstaturasMenor160 += altura;
                contadorEstaturasMenor160++;
            }
        }

        double promedioGeneral = sumaTotalEstaturas / N;
        double promedioEstaturasMenor160 = 0;

        if (contadorEstaturasMenor160 > 0) {
            promedioEstaturasMenor160 = sumaEstaturasMenor160 / contadorEstaturasMenor160;
        }

        System.out.println("Promedio de estaturas en general: " + promedioGeneral + " metros.");
        System.out.println("Promedio de estaturas por debajo de 1.60 mts: " + promedioEstaturasMenor160 + " metros.");

    }
    
}
