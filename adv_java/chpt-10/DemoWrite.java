import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class DemoWrite {
    public static void main(String[] args) {
        int userInput;
        Scanner keyboard = new Scanner(System.in);
        PrintWriter outputStream = null;
        try {
            outputStream = new PrintWriter(new FileOutputStream("numbers.txt", true));
        } catch (FileNotFoundException fnfe) {
            System.out.println("File could not be opened.");
            System.exit(0);
        }

        System.out.println("Please enter a value to save to the file.");
        userInput = keyboard.nextInt();
        outputStream.println(userInput);
        outputStream.close();
        keyboard.close();
    }
    
}
