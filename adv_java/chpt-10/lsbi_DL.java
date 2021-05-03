import java.util.Scanner;
import java.io.*;

public class lsbi_DL {
    public static void main(String[] args) {
        Scanner inputStream = null;
        int bits, least;
        int[] array = new int[8];

        try {
            inputStream = new Scanner(new FileReader("binary.txt"));
        } catch (Exception e) {
            System.out.println("File not found");
            System.exit(0);
        } // end try/catch

        PrintWriter outputStream = null;
        try {
            outputStream = new PrintWriter(new FileOutputStream("stego_dl.txt", true));
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            System.exit(0);
        } // end try/catch

        while (inputStream.hasNextLine()) {
            for (int i = 0; i < 8; ++i) {
                bits = inputStream.nextInt();
                least = bits % 10;
                outputStream.print(least);

            }
            outputStream.println();

   

            // System.out.println(least);
        } // end while

        outputStream.close();
        inputStream.close();

    }// end main
}// end class
