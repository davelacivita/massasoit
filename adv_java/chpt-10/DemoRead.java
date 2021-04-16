import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DemoRead {
    public static void main(String[] args) {
        Scanner inputStream = null;
        int numberRead;

        try {
            inputStream = new Scanner(new FileInputStream("numbers.txt"));
        } catch (FileNotFoundException fnfe) {
            System.out.println("File could not be opened.");
            System.exit(0);
        }
        while (inputStream.hasNextInt()) {
            numberRead = inputStream.nextInt();
            System.out.println(numberRead);
        }
        inputStream.close();
    }//end main    
}//end class
