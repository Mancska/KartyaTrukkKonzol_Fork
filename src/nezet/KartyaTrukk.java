
package nezet;



import java.util.Scanner;
import modell.Pakli;

public class KartyaTrukk {
    
  
    
  
 private static final Scanner sc = new Scanner(System.in);
    public KartyaTrukk() {
    }
  private void  indit(){
      Pakli pakli = new Pakli() ;
      Pakli.getPakli();
      Pakli.setPakli(0);
  }
  
  
    private static int melyik() {
        boolean jo;
        int oszlop;
        do {
            System.out.print("melyik oszlop (1-3): ");
            oszlop = sc.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
        return oszlop;
    }
    private static void kirak() {
        for (int i = 1; i < pakli.length; i++) {
            System.out.printf("%-8s", pakli[i]);
            if (i % 3 == 0) {
                System.out.println("");
            }
        }
    }
    private static void ezVolt() {
        System.out.println("A választott lap: " + pakli[11]);
    }
    
    
}
