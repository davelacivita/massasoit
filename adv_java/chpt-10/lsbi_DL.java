import java.util.Scanner;
import java.io.*;

public class lsbi_DL {
    public static void main(String[] args) {
        Scanner inputStream = null;
        try {
            inputStream = new Scanner(new FileReader("binary.txt"));
        } catch (Exception e) {
            System.out.println("File not found");
            System.exit(0);
        } // end try/catch

        while (inputStream.hasNextLine()) {
            
        }

        PrintWriter outputStream = null;
        try {
            outputStream = new PrintWriter(new FileOutputStream("stego_dl.txt", true));
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            System.exit(0);
        } // end try/catch 

    
    }// end main
}// end class
