public class DemoOutput {
  public static void main(String[] args) {
    // System.out.printf("%1.2f \n", 123.45678);
    // System.out.printf("%10d\n", 456);
    // System.out.printf("$%,1.2f\n", 123.123);
    // prints $123.12
    int n = 10;
    double price = 12.45;
    System.out.printf("%1d %1s $%,1.2f %1s%,1.2f\n", n, "widgets at", price, "each will cost a total of $", (n * price));
    // prints: 10 widgets at $12.45 each will cost a total of $124.50

  }
}
