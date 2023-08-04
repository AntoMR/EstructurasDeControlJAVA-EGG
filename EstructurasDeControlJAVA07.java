
 
package estructurasdecontroljava07;

import java.util.Scanner;


public class EstructurasDeControlJAVA07 {

  
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);

        int lecturasCorrectas = 0;
        int lecturasIncorrectas = 0;

        while (true) {
            System.out.print("Ingrese una cadena (o &&&&& para salir): ");
            String cadena = sc.nextLine();

            if (cadena.equals("&&&&&")) {
                System.out.println("Saliendo del programa...");
                break;
            }

            if (esCadenaValida(cadena)) {
                System.out.println("Lectura correcta");
                lecturasCorrectas++;
            } else {
                System.out.println("Lectura incorrecta");
                lecturasIncorrectas++;
            }
        }

        System.out.println("Informe:");
        System.out.println("Cantidad de lecturas correctas: " + lecturasCorrectas);
        System.out.println("Cantidad de lecturas incorrectas: " + lecturasIncorrectas);

        sc.close();
    }

    public static boolean esCadenaValida(String cadena) {
        if (cadena.length() == 5 && cadena.charAt(0) == 'X' && cadena.charAt(4) == 'O') {
            return true;
        } else {
            return false;
        }
    }
       
    }
    

