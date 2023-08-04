
package estructurasdecontroljavaextras12;


public class EstructurasDeControlJAVAEXTRAS12 {

   
    public static void main(String[] args) {
      
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    if (i == 3) {
                        System.out.print("E");
                    } else {
                        System.out.print(i);
                    }

                    System.out.print("-");

                    if (j == 3) {
                        System.out.print("E");
                    } else {
                        System.out.print(j);
                    }

                    System.out.print("-");

                    if (k == 3) {
                        System.out.print("E");
                    } else {
                        System.out.print(k);
                    }

                    System.out.print("  ");
                }
                System.out.println(); 
    }
    
        }
    }
}
