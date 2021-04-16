public class SugarSmashPlayer {
    private int playerID, n = 10;
    private String playerScreenName;
    private int[] highestScores;

    public SugarSmashPlayer() {
        playerID = 0;
        playerScreenName = "uknown";
        highestScores = new int[10];
        for (int i = 0; i < 10; ++i) {
            highestScores[i] = 0;
        }
    }// end default consructor

    public SugarSmashPlayer(int playerIDPassed, String playerScreenNamePassed) {
        playerID = playerIDPassed;
        playerScreenName = playerScreenNamePassed;
        

    }// end non default

    


}//end class
