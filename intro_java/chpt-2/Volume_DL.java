import java.util.Scanner;

public class Volume_DL
{
  public static void main(String[] args)
  {
    // declare variables
    double radius;
    double height;
    double volumeOfCylinder;
    double gallonsOfWater;

    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter the radius of the cylinder in inches ");
    radius = keyboard.nextDouble();
    System.out.println("Please enter the height of the cylinder in inches ");
    height = keyboard.nextDouble();

    // convert to feet
    radius = radius / 12;
    height = height / 12;

    // find volumeOfCylinder and gallonsOfWater
    volumeOfCylinder = Math.PI * Math.pow(radius, 2) * height;
    gallonsOfWater = volumeOfCylinder * 7.48;
    System.out.printf("Your cylinder has a volume of " + volumeOfCylinder + " cubic feet.\n");
    System.out.printf("Your cylinder will hold " + gallonsOfWater + " gallons of water.\n");
    keyboard.close();
  }//end main
}//end class
