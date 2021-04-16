import java.io.*;
import java.util.*;

public class Combinations_DL {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please type a word.");
        String input = keyboard.nextLine();
        combos("", input);
        keyboard.close();

    }//end main

    public static void combos(String letters, String word) {
        int n = word.length();

        if (n == 0) {
            writeToFile(letters + "\n");
        }

        else {
            for (int i = 0; i < n; ++i) {
                combos(letters + word.charAt(i), word.substring(0, i) + word.substring(i + 1, n));
            }
        }
    }

    private static void writeToFile(String letters) {
        try {
            PrintWriter outputStream = new PrintWriter(new FileWriter("Output_DL.txt", true));
            outputStream.print(letters);     //println(letters);
            outputStream.close();
        } catch (Exception e) {
            System.out.println("Exception!" + e);
        }
    }
}//end class
