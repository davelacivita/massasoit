import java.util.Scanner;

public class HeadsTailsRecursion_DL {
    static int totalBet, initialBet;
    static int numFlips;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your intitial bet.");
        initialBet = keyboard.nextInt();
        System.out.println("Pleasse enter the number of flips");
        numFlips = keyboard.nextInt();
        System.out.println("The maximum you can lose is $" + maxLoss(initialBet, numFlips));
        keyboard.close();

    }// end main

    public static int maxLoss(int bet, int flips) {
        if (flips == 0) {
            return totalBet;
        }
        else {
            totalBet = bet + maxLoss(bet * 2, flips - 1);
        }
        return totalBet;

    }// end method

}// end class

// if (flips == 0) {
// return totalBet;
// }
// else {
// totalBet = bet + maxLoss(bet * 2, flips - 1);
// }