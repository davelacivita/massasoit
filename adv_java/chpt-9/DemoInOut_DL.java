import java.util.Scanner;

public class DemoInOut_DL {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a single character that is an upper case letter, or a lower case letter, or a single digit.");
        String input = keyboard.nextLine();
        testChar(input);
        keyboard.close();
    }// end main

    public static void testChar(String input) {
        int ascii = (int) input.charAt(0);
        try {
                if ((ascii < 65 || ascii > 90) && (ascii < 97 || ascii > 122) && (ascii < 0 || ascii > 9)) {
                    throw new InputException("Please enter a single character that is an upper case letter, or a lower case letter, or a single digit.");
            } 
        } catch (InputException e) {
            System.out.println(e.getMessage());
        }
    }
}
