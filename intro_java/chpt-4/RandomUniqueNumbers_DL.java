import java.util.Random;

public class RandomUniqueNumbers_DL {
  public static void main(String[] args) {
    Random rng = new Random();
    int n1, n2, n3, n4;

    do {
      n1 = rng.nextInt(20) + 1;
      n2 = rng.nextInt(20) + 1;
      n3 = rng.nextInt(20) + 1;
      n4 = rng.nextInt(20) + 1;
    } while (n1==n2||n1==n3||n1==n4||n2==n3||n2==n4||n3==n4);
    System.out.println(n1);
    System.out.println(n2);
    System.out.println(n3);
    System.out.println(n4);
    // System.out.println(n1+"  "+n2+"  "+n3+"  "+n4);
  }// end main
}// end class
