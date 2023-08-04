
package estructurasdecontroljavaextras01;

import java.util.Scanner;


public class EstructurasDeControlJAVAEXTRAS01 {

  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tiempo en minutos: ");
        int minutos = sc.nextInt();

        int dias = minutos / 1440; // 1440 minutos en un día (24 horas * 60 minutos)
        int horas = (minutos % 1440) / 60;

        System.out.println(minutos + " minutos equivalen a:");
        System.out.println(dias + " día(s) y " + horas + " hora(s).");
       
    }
    
}
