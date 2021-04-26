/*
Part #3:

Create a program that instantiates several objects of each type and demonstrates the 
methods.  Save the file as DemoSugarSmash.java.
*/


public class DemoSugarSmash
{
public static void main(String[] args)
{

//create instance
SugarSmashPlayer SSP1  = new SugarSmashPlayer();
SugarSmashPlayer SSP2  = new SugarSmashPlayer();
PremiumSugarSmashPlayer PSSP1  = new PremiumSugarSmashPlayer();
PremiumSugarSmashPlayer PSSP2  = new PremiumSugarSmashPlayer();

//test methods SugarSmashPlayer
System.out.println(SSP1.getPlayerID());
System.out.println(SSP1.getHighestScore(0));
System.out.println(SSP1.getPlayerScreenName());
SSP1.setPlayerID(1);
SSP1.setPlayerScreenName("one");
SSP1.setHighScore(0,  100);  //valid gameLevelPassed, valid scorePassed
System.out.println(SSP1.toString());
System.out.println(SSP1.equals(SSP1));

System.out.println(SSP2.getPlayerID());
System.out.println(SSP2.getHighestScore(0));
System.out.println(SSP2.getPlayerScreenName());
SSP2.setPlayerID(2);
SSP2.setPlayerScreenName("two");
SSP2.setHighScore(1,  10);  //invalid  gameLevelPassed
System.out.println(SSP2.toString());
System.out.println(SSP1.equals(SSP2));

//test methods PremiumSugarSmashPlayer
System.out.println(PSSP1.getPlayerID());
System.out.println(PSSP1.getHighestScore(0));
System.out.println(PSSP1.getPlayerScreenName());
PSSP1.setPlayerID(1);
PSSP1.setPlayerScreenName("one");
PSSP1.setHighScore(0,  100);  //valid gameLevelPassed, valid scorePassed
System.out.println(PSSP1.toString());
System.out.println(PSSP1.equals(PSSP1));

System.out.println(PSSP2.getPlayerID());
System.out.println(PSSP2.getHighestScore(0));
System.out.println(PSSP2.getPlayerScreenName());
PSSP2.setPlayerID(2);
PSSP2.setPlayerScreenName("two");
PSSP2.setHighScore(100,  10);  //invalid  gameLevelPassed
System.out.println(PSSP2.toString());
System.out.println(PSSP1.equals(PSSP2));


}//end main
}//end class
