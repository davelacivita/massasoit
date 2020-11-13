import java.util.Scanner;
public class Deprecation_DL {
  public static void main(String[] args) {
    /* bookValue cost - accDeprecation
    Straight Line Depreciation: Expense = (Cost - Salvage Value) / Useful life in years

    Double Declining Balance:
    Depreciation = Book value x (Straight line depreciation rate x 2)

    Straight line depreciation rate = 100% / Useful life in years

    Sum of the Years Digits:
    Depreciation expense = (Cost - Salvage value) x Fraction
      Fraction for the first year = n / (1+2+3+...+ n)
      Fraction for the second year = (n-1) / (1+2+3+...+ n)
      Fraction for the third year = (n-2) / (1+2+3+...+ n)
      Fraction for the last year = 1 / (1+2+3+...+ n)
    */

    double cost;
    double salvageValue;
    int usefulLife;
    double deprecation;
    double accDeprecation = 0;
    double bookValue;

    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter the cost of the assest:");
    cost = keyboard.nextLong();
    System.out.println("Please enter the salvage value of the assest:");
    salvageValue = keyboard.nextLong();
    System.out.println("Please enter the useful life of the assest:");
    usefulLife = keyboard.nextInt();

    // Straight Line
    System.out.println("The Straight Line Deprecation for the asset is: ");


    for (int u = 1; u <= usefulLife; ++u) {
      deprecation = (cost - salvageValue)/usefulLife;
      System.out.printf("For year " + u + " deprecation is: $%,1.2f \n", deprecation);
    }// end for loop

    // Double Declining Balance
    System.out.println("The Double Declining Balance Deprecation for the asset is: ");

    for (int u = 1; u <= usefulLife; ++u) {
      bookValue = cost - accDeprecation;
      deprecation = (bookValue) * ((1.0 / usefulLife) * 2);
      System.out.printf("For year " + u + " deprecation is: $%,1.2f \n", deprecation);
      accDeprecation = accDeprecation + deprecation;
    }// end for loop

    // Sum of Years Digits
    System.out.println("The Sum of the Year Digits Deprecation for the asset is: ");

    int denominator = 0;
    for (int u = 1; u <= usefulLife; ++u) {
      denominator = denominator + u;
    }// end for loop
    for (int u = 0; u < usefulLife; ++u) {
      deprecation = ((cost - salvageValue) * ((double)usefulLife - u))/denominator;
      System.out.printf("For year " + (u+1) + " depreciation is: $%,1.2f \n", deprecation);
    }// end for loop
    
    keyboard.close();

  }// end main
} // end class
