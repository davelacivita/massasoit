import java.util.Scanner;
//import java.util.Arrays;
public class MovingDay_DL {
    public static void main(String[] args) {
        int numTrue, numFalse;

        numTrue = getTrue();
        numFalse = getFalse();

        int size = numFalse + numTrue +1;
        boolean[] movingDayArray = new boolean[size];

        //movingDayArray[numTrue + 1] = 

        for (int t = 0; t < numTrue; ++t) {
            movingDayArray[t] = true;
            //System.out.println(t);
            //System.out.println(movingDayArray[t]);
        }//end for

        for (int f = numTrue + 1; f < size; ++f ) {
            movingDayArray[f] = false;
            //System.out.println(f);
            //System.out.println(movingDayArray[f]);
        }//end for
        System.out.println();

        // for (int i = 0; i < size; ++i) {
        //     System.out.print(" " + i + "  ");
        // }        
        // System.out.println();

        for (int i = 0; i < size; ++i) {
            System.out.print("| " + movingDayArray[i] + " ");
        }  
        System.out.print("|");
        System.out.println();


        System.out.println("Choose a position between 0 and " + (size - 1) + " to move.");
        Scanner keyboard = new Scanner(System.in);
        int move = keyboard.nextInt();


    }//end main

    public static int getTrue() {
        int trues;
        System.out.println("Using an integer, please enter the number of Trues:");
        Scanner keyboard = new Scanner(System.in);
        return trues = keyboard.nextInt();
    }//end method

    public static int getFalse() {
        int falses;
        System.out.println("Using an integer, please enter the number of Falses:");
        Scanner keyboard = new Scanner(System.in);
        return falses = keyboard.nextInt();

    }//end method
}//end class
