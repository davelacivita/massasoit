import java.util.Scanner;
import java.util.Random;

public class Rock_DL
{
  public static void main(String[] args) throws Exception
  {
  Scanner keyboard = new Scanner(System.in);
  String ROCK = "Rock";
  String PAPER = "Paper";
  String SCISSORS = "Scissors";
  String LIZARD = "Lizard";
  String SPOCK = "Spock";
  String userChoice = "poorly. Please choose either r, p, s, l, or k.";
  char r = 'r', p = 'p', s = 's', l = 'l', k = 'k';


  System.out.println("Please enter r for rock");
  System.out.println("Please enter p for paper");
  System.out.println("Please enter s for scissors");
  System.out.println("Please enter l for lizard");
  System.out.println("Please enter k for Spock");
  char userInput = (char)System.in.read();

  if (userInput == 'r') {
      userChoice = ROCK;
  }
  if (userInput == p) {
      userChoice = PAPER;
  }
  if (userInput == s) {
      userChoice = SCISSORS;
  }
  if (userInput == l) {
      userChoice = LIZARD;
  }
  if (userInput == k) {
      userChoice = SPOCK;
  }

  System.out.println("You chose " + userChoice);

  Random rand = new Random();
  int comp = rand.nextInt(5);
  keyboard.close();


  // System.out.println(comp);

switch(comp) {
case 0:
  // rock wins


      if (userInput == r && comp == 0) {
        System.out.println("The computer also chose rock, tie game.");
      }
      if ((comp == 0 && userInput == s) || (comp == 0 && userInput == l)) {
        System.out.println("The computer chose rock and rock beats " + userChoice + ". You lose.");
      }
  //rock loses
      if ((comp == 0 && userInput == k) || (comp == 0 && userInput == p)) {
        System.out.println("The computer chose rock and " +  userChoice + " beats rock. You win!");
      }
    break;
case 1:
    // paper wins
      if (userInput == p && comp == 1) {
        System.out.println("The computer also chose paper, tie game.");
      }
      if ((comp == 1 && userInput == r) || (comp == 1 && userInput == k)) {
        System.out.println("The computer chose paper and paper beats " + userChoice + ". You lose.");
      }
  //paper loses
      if ((comp == 1 && userInput == s) || (comp == 1 && userInput == l)) {
        System.out.println("The computer chose paper and " + userChoice + " beats paper. You win!");
      }
      break;
case 2:
    // scissors wins
      if (userInput == s && comp == 2) {
        System.out.println("The computer also chose scissors, tie game.");
      }
      if ((comp == 2 && userInput == p) || (comp == 2 && userInput == l)) {
        System.out.println("The computer chose scissors and scissors beats " + userChoice + ". You lose.");
      }
  //scissors loses
      if ((comp == 2 && userInput == k) || (comp == 2 && userInput == r)) {
        System.out.println("The computer chose scissors and " + userChoice + " beats scissors. You win!");
    }
    break;
case 3:
    // lizard wins
      if (userInput == l && comp == 3) {
        System.out.println("The computer also chose lizard, tie game.");
      }
      if ((comp == 3 && userInput == p) || (comp == 3 && userInput == k)) {
        System.out.println("The computer chose lizard and lizard beats " + userChoice + ". You lose.");
      }
  //lizard loses
      if ((comp == 3 && userInput == s) || (comp == 3 && userInput == r)) {
        System.out.println("The computer chose lizard and " + userChoice + " beats lizard. You win!");
    }
    break;
case 4:
    // spock wins
      if (userInput == k && comp == 4) {
        System.out.println("The computer also chose Spock, tie game.");
      }
      if ((comp == 4 && userInput == s) || (comp == 4 && userInput == r)) {
        System.out.println("The computer chose Spock and Spock beats " + userChoice + ". You lose.");
      }
    //spock loses
      if ((comp == 4 && userInput == p) || (comp == 4 && userInput == l)) {
        System.out.println("The computer chose Spock and " +  userChoice + " beats Spock. You win!");
      }
    break;
    // no default needed
} // end switch


  }//end main
}//end class
