import java.security.Key;
import java.util.Arrays;
import java.util.Scanner;

public class SugarSmashPlayer {
    private int playerID;
    private String playerScreenName;
    private int[] highestScores;

    public SugarSmashPlayer() {
        playerID = 0;
        playerScreenName = "unknown";
        highestScores = new int[10];
        Arrays.fill(highestScores, 0);
    }// end constructor

    public int getPlayerID() {
        return this.playerID;
    }

    public String getPlayerScreenName() {
        return this.playerScreenName;
    }

    public int getHighestScore(int gameLevelPassed) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Invalid, please enter a game level");
        gameLevelPassed = keyboard.nextInt();
        while (gameLevelPassed < 0 || gameLevelPassed >= highestScores.length);
        return highestScores[gameLevelPassed];
    }//end method

    public void setPlayerID(int playerIDPassed) {
        this.playerID = playerIDPassed;
    }

    public void setPlayerScreenName(String playerScreenNamePassed) {
        this.playerScreenName = playerScreenNamePassed;
    }

    public void setHighScore(int gameLevelPassed, int scorePassed) {
        while (gameLevelPassed < 0 || gameLevelPassed >= highestScores.length
                || (gameLevelPassed > 0 && highestScores[gameLevelPassed - 1] < 100)) {
            Scanner keyboard = new Scanner(System.in);
            gameLevelPassed = keyboard.nextInt();
            highestScores[gameLevelPassed] = scorePassed;
        }
    }

    public String toString() {
        String scores = "";
        for (int score : highestScores) {
            scores = scores + " " + score;
        }
        return "\nplayerID: " + this.playerID + "\nPlayer Screen Name: " + this.playerScreenName
                + "\nPlayer Highest Score: " + scores;
    }

    // public static void main(String[] args) {
    //     SugarSmashPlayer SSP1 = new SugarSmashPlayer();
    //     System.out.println(SSP1);

    //     SugarSmashPlayer SSP2 = new SugarSmashPlayer();
    //     SSP2.setPlayerID(10);
    //     System.out.println(SSP2.toString());
    // }// end main

    public boolean equals(SugarSmashPlayer playerPassed) {
        boolean sameScores = true;
        if (this.highestScores.length != playerPassed.highestScores.length) {
            sameScores = false;
            return false;
        }

        for (int i = 0; i < playerPassed.highestScores.length; ++i) {
            if (this.highestScores[i] != playerPassed.highestScores[i])
            sameScores = false;
        }
        return this.playerID == playerPassed.playerID && 
        this.playerScreenName.equals(playerPassed.playerScreenName) &&
        sameScores;
    }//end method

}// end class
