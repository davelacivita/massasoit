import java.util.Scanner;
//import java.util.Arrays;
public class MovingDay_DL {
    public static void main(String[] args) {
        int numTrue, numFalse;

        numTrue = getTrue();
        numFalse = getFalse();

        int size = numFalse + numTrue +1;
        boolean[] movingDayArray = new boolean[size];

        populateArray(movingDayArray, numTrue, numFalse, size);

        printArray(movingDayArray, size);

        // System.out.println("Choose a position between 0 and " + (size - 1) + " to move.");
        // Scanner keyboard = new Scanner(System.in);
        // int move = keyboard.nextInt();


    }//end main

    public static int getTrue() {
        int trues;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Using an whole nmber, please enter the number of Trues:");
        return trues = keyboard.nextInt();
        
    }//end method

    public static int getFalse() {
        int falses;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Using an whole nmber, please enter the number of Falses:");
        return falses = keyboard.nextInt();
    }//end method

    public static void printArray(boolean[] movingDayArray, int size) {
        System.out.println();
        for (int i = 1; i < size + 1; ++i) {
            System.out.print(i + "\t");
        }//end for
        System.out.println();

        for (int i = 0; i < size; ++i) {
            System.out.print(movingDayArray[i] + "\t");
        }//end for  
        System.out.println();
    }//end method

    public static void populateArray(boolean[] arrayPassed, int numTrue, int numFalse, int size) {
        for (int t = 0; t < numTrue; ++t) {
            arrayPassed[t] = true;
        }//end for

        for (int f = numTrue + 1; f < size; ++f ) {
            arrayPassed[f] = false;
        }//end for
    }//end method

}//end class
