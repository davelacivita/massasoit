3import java.util.Scanner;

public class multiplicationTable_DL {
  public static void main(String[] args) {
    System.out.println("Plese enter a whole number");
    Scanner keyboard = new Scanner(System.in);
    int n = keyboard.nextInt();

    for (int k = 1; k<=n; ++k) {
      System.out.print("\t" + k);
    } // end for

    System.out.println();
    
    for (int i = 1; i <= n; ++i) {
      System.out.print(i + "\t");
      for (int j = 1; j <= n; ++j) {
        System.out.print(i*j + "\t");
      } // end for

      System.out.println();
    } // end for
    
    keyboard.close();


  }
}
