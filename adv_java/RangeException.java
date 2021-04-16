import java.util.Scanner;
import java.util.RangeException;

public class RangeException {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int grade;

        System.out.println("Please enter the score to get the correct grade.");
        grade = keyboard.nextInt();

        try {    
            if (score < 0 || score > 100) {
                throw new Exception("");
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
