import java.util.Scanner;
public class HeadsTailsRecursion_RMM
{
//initial totalBet to 0
static int totalBet = 0;
//recursive function getMaximumAmountLoss give Maximum amount you loss
//it take initial bet and number of tosses as parameter
public static int getMaximumAmountLoss(int bet, int n){
//if n equal to 0 then return totalBet
if(n == 0){
return totalBet;
}
//else
else{
//sum up bet to totalBet
totalBet += bet;
//recursive call getMaximumAmountLoss with doubling bet at each recursive call and decrement
//number of tosses n
return getMaximumAmountLoss(bet*2,--n);
}
}
  
   public static void main(String[] args) {
   //Scanner to read user input
   Scanner sc = new Scanner(System.in);
   //ask user to enter initial bet
   System.out.println("Enter the initial bet: ");
   //store in variable initialBet
   int initialBet = sc.nextInt();
   //ask user to enter number of tosses
   System.out.println("Enter the number of tosses: ");
   //store in variable numberOfToss
   int numberOfToss = sc.nextInt();
   //print Maximum amount you can loss
   System.out.println("Maximum amount you can loss $"+getMaximumAmountLoss(initialBet,numberOfToss));
   }
}