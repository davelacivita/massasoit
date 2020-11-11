import java.util.Random;
import java.util.Scanner;

public class Rock_RMM
{
public static void main(String[] args) throws Exception
{

    Scanner keyboard = new Scanner(System.in);

    //int playerChoice;
    //char computerChoice;

    System.out.println("Which game object do you choose?" + System.lineSeparator() + "For rock, enter r." + System.lineSeparator() + "For paper, enter p." + System.lineSeparator() + "For scissors, enter s." + System.lineSeparator() + "For lizard, enter l." + System.lineSeparator() + "For spock, enter k.");
    //playerChoice = (int)System.in.read();

    System.out.println("Your choice: " + playerChoice);

    Random rng = new Random();
    //computerChoice = rng.nextChar();

    System.out.println("Computer's choice: " + computerChoice);
    System.out.println(" ");

    switch (playerChoice)

    {

    case 1: //rock

        if(playerChoice == computerChoice)
            System.out.println("Computer generated same choice. Draw game.");
        if(playerChoice == 1 && computerChoice == 3)
            System.out.println("Rock crushes scissors. Player wins.");
        if(playerChoice == 1 && computerChoice == 4)
            System.out.println("Rock crushes lizard. Player wins.");
        if(playerChoice == 1 && computerChoice == 2)
            System.out.println("Paper covers rock. Computer wins.");
        if(playerChoice == 1 && computerChoice == 5)
            System.out.println("Spock vaporizes rock. Computer wins");
        break;

    case 2: //paper

        if(playerChoice == computerChoice)
            System.out.println("Computer generated same choice. Draw game.");
        if(playerChoice == 2 && computerChoice == 1)
            System.out.print("Paper covers rock. Player wins.");
        if (playerChoice == 2 && computerChoice == 5)
            System.out.println("Paper disproves Spock. Player wins");
        if(playerChoice == 2 && computerChoice == 3)
            System.out.println("Scissors cuts paper. Computer wins.");
        if(playerChoice == 2 && computerChoice == 4)
            System.out.println("Lizard eats paper. Computer wins.");
        break;

    case 3: //scissors

        if(playerChoice == computerChoice)
            System.out.println("Computer generated same choice. Draw game.");
        if(playerChoice == 3 && computerChoice == 2)
            System.out.println("Scissors cuts paper. Player wins.");
        if(playerChoice == 3 && computerChoice == 4)
            System.out.println("Scissors decapitates lizard. Player wins.");
        if(playerChoice == 3 && computerChoice == 1)
            System.out.println("Rock crushes scissors. Computer wins.");
        if(playerChoice == 3 && computerChoice == 5)
            System.out.println("Spock smashes scissors. Computer wins.");
        break;

    case 4: //lizard

        if(playerChoice == computerChoice)
            System.out.println("Computer generated same choice. Draw game.");
        if(playerChoice == 4 && computerChoice == 2)
            System.out.println("Lizard eats paper. Player wins.");
        if(playerChoice == 4 && computerChoice == 5)
            System.out.println("Lizard poisons Spock. Player wins.");
        if(playerChoice == 4 && computerChoice == 1)
            System.out.println("Rock crushes lizard. Computer wins.");
        if(playerChoice == 4 && computerChoice == 3)
            System.out.println("Scissors decapitates lizard. Computer wins.");
        break;

    case 5://Spock

        if(playerChoice == computerChoice)
            System.out.println("Computer generated same choice. Draw game.");
        if(playerChoice == 5 && computerChoice == 1)
            System.out.println("Spock vaporizes rock. Player wins.");
        if(playerChoice == 5 && computerChoice == 3)
            System.out.println("Spock smashes scissors. Player wins.");
        if(playerChoice == 5 && computerChoice == 2)
            System.out.println("Paper disproves Spock. Computer wins.");
        if(playerChoice == 5 && computerChoice == 4)
            System.out.println("Lizard poisons Spock. Computer wins.");
        break;

    default:

        System.out.println("1,2,3,4, or 5 was not entered. Try playing again.");
        keyboard.close();

    }//end if

}//end main
}//end class
