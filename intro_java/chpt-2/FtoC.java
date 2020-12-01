import java.util.Scanner;

public class FtoC
{
  public static void main(String[] args) {
    int f;
    int c;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter a temp in Fahrenheit: ");
    f = keyboard.nextInt();

    c = (f-32)*5/9;
    System.out.println(c);
    keyboard.close();
  } //end of main
} // end of class
