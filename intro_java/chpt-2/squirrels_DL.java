import java.util.Scanner;

public class squirrels_DL
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    int n;

    int squirell1;
    int squirell2;
    int squirell3;
    int squirell4;
    int squirell5;
    int origPile;
    int chipmunk;
    int pile;

    System.out.println("Please enter a positive, whole number: ");
    n = keyboard.nextInt();

    origPile = (12495 + 15625 * n);
    System.out.println("The original pile had " + origPile + " nuts.");

    squirell1 = (origPile / 5);
    chipmunk = 1;
    pile = ((origPile - squirell1) -1);
    System.out.println("The first squirrel took " + squirell1 +  " nuts and the chipmunk got one nut.");

    squirell2 = (pile / 5);
    chipmunk = (chipmunk + 1);
    pile = (pile - squirell2 - 1);
    System.out.println("The second squirrel took " + squirell2 +  " nuts and the chipmunk got one nut.");

    squirell3 = (pile / 5);
    chipmunk = (chipmunk +1);
    pile = (pile - squirell3 - 1);
    System.out.println("The third squirrel took " + squirell3 +  " nuts and the chipmunk got one nut.");

    squirell4 = (pile / 5);
    chipmunk = (chipmunk +1);
    pile = (pile - squirell4 - 1);
    System.out.println("The fourth squirrel took " + squirell4 +  " nuts and the chipmunk got one nut.");

    squirell5 = (pile / 5);
    chipmunk = (chipmunk +1);
    pile = (pile - squirell5 - 1);
    System.out.println("The fifth squirrel took " + squirell5 +  " nuts and the chipmunk got one nut.");

    // outputs
    System.out.println("In the morning there are " + pile + " nuts left in the pile.");
    System.out.println("Each squirell gets " + (pile / 5) + " nuts and the chipmunk ends up with " + (chipmunk + 1) + " nuts.");

  } //end main
} //end class
