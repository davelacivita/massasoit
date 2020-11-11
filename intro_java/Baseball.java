import java.util.Scanner;

public class Baseball
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    int costTicket = 150;
    int costPark = 50;
    int costBook = 5;
    double costBeers = 12.50;
    double costHotDogs = 5.50;
    final int COSTFINE = 500;
    int innings;
    int evenInnings;
    int oddInnings;
    double totalCostGame;
    double totalCostBeers;
    double totalCostHotDogs;

    System.out.println("Please enter the total number of innings played: ");
    innings = keyboard.nextInt();

    evenInnings = innings/2;
    oddInnings = innings - evenInnings;

    totalCostBeers = evenInnings * costBeers;
    totalCostHotDogs = oddInnings * costHotDogs;

    totalCostGame = totalCostBeers + totalCostHotDogs + costTicket + costPark + COSTFINE + costBook;

    System.out.println(totalCostGame);

  }//end main
}//end class
