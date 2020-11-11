import java.util.Random;
public class Craps
{
  public static void main(String[] args) {
    Random rng = new Random();
    int die1, die2;

    die1 = rng.nextInt(6) + 1;
    die2 = rng.nextInt(6) + 1;
      int sum = die1 + die2;
    System.out.println("You rolled: " + sum);
// switch statement
    switch(sum)
    {
      case 4:
      case 5:
      case 6:
      case 8:
      case 9:
        System.out.println("roll again");
        break;
      case 7:
      case 11:
        System.out.println("lose");
        break;
      case 2:
      case 3:
        System.out.println("win");
        break;
      case 12:
        System.out.println("neither win nor lose");
        break;
      default: System.out.println("RUN!");
    }
  }
}
