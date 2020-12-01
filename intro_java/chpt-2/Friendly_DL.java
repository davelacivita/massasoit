import java.util.Scanner;
public class Friendly_DL
{
  public static void main(String[] args)
  {

  int num, d1, d12, d123, d1234, d12345, score = 0;

  System.out.println("Please enter a 5 digit number");
  Scanner keyboard = new Scanner(System.in);
  num = keyboard.nextInt();

  if (num < 10000 || num > 99999)
  {
  System.out.println("Sorry, that won't work");
  System.exit(0);
  } // end if
  else
  {

    d1 = num / 10000;
    d12 = num / 1000;
    d123 = num / 100;
    d1234 = num / 10;
    d12345 = num;

    // System.out.println(d1);
    // System.out.println(d12);
    // System.out.println(d123);
    // System.out.println(d1234);
    // System.out.println(d12345);

    if (d1 % 1 == 0)
    {score = score + 1;}
    
    if (d12 % 2 == 0)
    {score = score + 1;}
    if (d123 % 3 == 0)
    {score = score + 1;}
    if (d1234 % 4 == 0)
    {score = score + 1;}
    if (d12345 % 5 == 0)
    {score = score + 1;}
    } // end else
    if (score == 5) {
      System.out.println("That's a friendly number!");
    } // end if
    else{
      System.out.println("Sorry that's not a friendly number!");
    } // end else
    keyboard.close();
  }// end main
}// end class
