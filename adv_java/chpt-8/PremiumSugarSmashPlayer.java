import java.util.Arrays;
import java.util.Scanner;

public class PremiumSugarSmashPlayer extends SugarSmashPlayer {
    private int[] highestScores;

    public PremiumSugarSmashPlayer() {
        super();
        highestScores = new int[50];
        Arrays.fill(highestScores, 0);
    }//end constructor

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
        return "\nplayerID: " + this.getPlayerID() + "\nPlayer Screen Name: " + this.getPlayerScreenName()
                + "\nPlayer Highest Score: " + scores;
    }

    public boolean equals(PremiumSugarSmashPlayer playerPassed) {
        boolean sameScores = true;
        if(this.highestScores.length != playerPassed.highestScores.length) {
            sameScores = false;
            return false;
        }

        for(int i = 0; i < playerPassed.highestScores.length; ++i) {
            if(this.highestScores[i] != playerPassed.highestScores[i]) {
                sameScores = false;
                return false;
            }
        }

        return 
        this.getPlayerID() == playerPassed.getPlayerID()
        &&
        this.getPlayerScreenName().equals(playerPassed.getPlayerScreenName())
        &&
        sameScores;

    }
    
}//end class
