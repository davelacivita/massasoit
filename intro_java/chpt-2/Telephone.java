import java.util.Scanner;

public class Telephone
{
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    int firstThree;
    int lastFour;
    int n;

    // firstThree * 80
    // +1
    // *250
    // add last 4
    //add last

    System.out.println("Please enter the first 3 digits of your phone number");
    firstThree = keyboard.nextInt();

    System.out.println("Please enter the last 4 digits of your phone number");
    lastFour = keyboard.nextInt();

    n = firstThree * 80;
    n = n+1;
    n  = n * 250;
    n = n + lastFour;
    n =n + lastFour;
    n = n - 250;
    n = n/2;

    System.out.println(n);
    keyboard.close();


  } //end of main
} // end of class
