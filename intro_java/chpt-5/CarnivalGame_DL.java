import java.util.Random;

public class CarnivalGame_DL {
    public static void main(String[] args) {
        int sum;
        int wins = 0;

        for (int i = 1 ; i <= 100; ++i) {
            sum = 0;
            sum = sum + dieRoll(6);
            sum = sum + dieRoll(20);
            sum = sum + dieRoll(8);
            sum = sum + dieRoll(4);
            sum = sum + dieRoll(12);

            if (sum < 20 || sum > 35) {
                ++wins;
            } //end if
        } //end for
        System.out.println("The player won " + wins + " times.");

    } //end main

    public static int dieRoll(int x) {
        Random rng = new Random();
        return rng.nextInt(x) + 1;

    } //end dieRoll
} //end class
