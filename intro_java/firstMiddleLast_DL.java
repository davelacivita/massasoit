import java.util.Scanner;

public class firstMiddleLast_DL
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    String firstName;
    String middleName;
    String lastName;

    System.out.println("Please enter your first name: ");
    firstName = keyboard.nextLine();
    System.out.println("Please enter your middle name: ");
    middleName = keyboard.nextLine();
    System.out.println("Please enter your last name: ");
    lastName = keyboard.nextLine();

    int firstLength = firstName.length();
    int middleLength = middleName.length();
    int lastLength = lastName.length();
    firstName = firstName.toUpperCase();
    middleName = middleName.toUpperCase();
    lastName = lastName.toUpperCase();

    System.out.println("Your first name contains " + (firstLength) + " letters.");
    System.out.println("Your middle name contains " + (middleLength) + " letters.");
    System.out.println("Your last name contains " + (lastLength) + " letters.");

    System.out.println("Your whole name contains " + (firstLength + middleLength + lastLength) + " letters.");
    char first = firstName.charAt(0);
    char middle = middleName.charAt(0);
    char last = lastName.charAt(0);

    System.out.print(first);
    System.out.print(middle);
    System.out.println(last);
    System.out.println("Total ASCII value of your initials is " + ((int) first + (int) middle + (int) last));

  } // end main
} // end class
