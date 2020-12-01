import java.util.Scanner;

public class Ounces
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
  int gallons, halfGallons, quarts, pints, cups, originalOunces, ounces;

  System.out.println("Please enter the number of ounces: ");
  originalOunces = keyboard.nextInt();

  gallons = originalOunces/128;
  ounces = originalOunces%128;
  halfGallons = ounces/64;
  ounces = ounces%64;
  quarts = ounces/32;
  ounces = ounces%32;
  pints = ounces/16;
  ounces = ounces%16;
  cups = ounces/8;
  ounces = ounces%8;

  System.out.println("You will need the following containers for that many ounces" + originalOunces);
  System.out.println("If you spill " + originalOunces + " you will need the following containers for that many ounces.");
  System.out.println("Gallon containers: " + gallons);
  System.out.println("Half gallon containers: " + halfGallons);
  System.out.println("Quart containers: " + quarts);
  System.out.println("Pint containers: " + pints);
  System.out.println("Cup containers: " + cups);
  System.out.println("Remaining ounces: " + ounces);
  keyboard.close();
  }
}
