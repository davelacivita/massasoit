import java.util.Scanner;

public class InputException extends Exception {
    public static void main(String[] args) {
        boolean isGood = false;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a single character that is an upper case letter, or a lower case letter, or a single digit.");

        while (isGood = false) {
            System.out.println("Please enter a single character that is an upper case letter, or a lower case letter, or a single digit.");
            String input = keyboard.nextLine();
            int ascii = (int) input.charAt(0);
            if ((ascii >= 65 || ascii <= 90) && (ascii >= 97 || ascii <= 122) && (ascii >= 0 || ascii <= 9)) {
                isGood = true;
            }//end if
            keyboard.close();
        }
        

    }
        
}// end class