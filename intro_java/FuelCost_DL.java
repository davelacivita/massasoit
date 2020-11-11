import java.util.Scanner;

public class FuelCost_DL
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    // declare variables

    int beginningOdometerReading, endingOdometerReading,totalMilesPerFillUp, numberMilesDrivenPerYear;
    double gallonsToFillTank, costPerGallonsOfGas, milesPerGallon, costToFillTank, costFuelPerMile, annualCostOfFuel;

    // ask for user input

    System.out.println("Please enter the beginning odoemter reading: ");
    beginningOdometerReading = keyboard.nextInt();
    System.out.println("Please enter the ending odometer reading: ");
    endingOdometerReading = keyboard.nextInt();
    System.out.println("Please enter the number of gallons to fill the tank: ");
    gallonsToFillTank = keyboard.nextDouble();
    System.out.println("Please enter the cost per gallon of fuel: ");
    costPerGallonsOfGas = keyboard.nextDouble();
    System.out.println("Please enter the number of miles driven per year: ");
    numberMilesDrivenPerYear = keyboard.nextInt();

    // calculations - I used these as variables but decided
    // to use the calculations instead:
    // totalMilesPerFillUp = endingOdometerReading - beginningOdometerReading;
    // milesPerGallon = totalMilesPerFillUp / gallonsToFillTank;
    // costToFillTank = costPerGallonsOfGas * gallonsToFillTank;
    // costFuelPerMile = costToFillTank / totalMilesPerFillUp;
    // annualCostOfFuel = costFuelPerMile * numberMilesDrivenPerYear;

    // output totals
    System.out.printf("Your average miles per gallon is %1.2f \n", ((endingOdometerReading - beginningOdometerReading) / gallonsToFillTank));
    System.out.printf("Your cost per mile is $%,1.2f \n", ((costPerGallonsOfGas * gallonsToFillTank) / (endingOdometerReading - beginningOdometerReading)));
    System.out.printf("Your annual cost of fuel is $%,1.2f \n", ((costPerGallonsOfGas * gallonsToFillTank) / (endingOdometerReading - beginningOdometerReading)) * numberMilesDrivenPerYear);

    // Every time I tried to combine it into 1 long line I got errors.



  }//end main
}//end class
