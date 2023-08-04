
package estructurasdecontroljavaextras02;


public class EstructurasDeControlJAVAEXTRAS02 {

   
    public static void main(String[] args) {
        
        int A = 10;
        int B = 20;
        int C = 30;
        int D = 40;

        System.out.println("Valores iniciales:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);

        int auxiliar = B;
        B = C;
        C = A;
        A = D;
        D = auxiliar;

        System.out.println("\nValores finales:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
    }
       
    }
    

