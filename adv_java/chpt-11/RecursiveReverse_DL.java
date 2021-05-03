import java.util.Scanner;

public class RecursiveReverse_DL {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n;

        System.out.println("Please enter the size of the array.");
        n = keyboard.nextInt();
        int[] theArray = new int[n];
        System.out.println("Please enter the elements for the array");
        for (int i = 0; i < n; ++i) {
            theArray[i] = keyboard.nextInt();
        }//end for

        reverse(theArray, 0, n-1);

        System.out.println("The reversed array is: ");
        for (int j = 0; j < n; ++j) {
            System.out.print(theArray[j] + " ");
        }
        System.out.println();

        keyboard.close();
    }//end main

    public static void reverse(int[] array, int lo, int hi) {
        int temp;
        if (hi == lo) {
            return;
        }

        if (lo < hi){
            temp = array[hi];
            array[hi] = array[lo];
            array[lo] = temp;
            reverse(array, lo + 1, hi - 1);
        }
    }//end method
}//end class
