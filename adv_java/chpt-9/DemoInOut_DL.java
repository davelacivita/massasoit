import java.util.Scanner;

public class DemoInOut_DL {
    static int count = 0;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a single character that is an upper case letter, or a lower case letter, or a single digit.");

                try {
                    for (int i = 0;; ++i) {
                        char input = keyboard.next().charAt(0);
                        testChar(input);
                    }
                } catch (InputException e) {
                    System.out.println(e);    
                }
    }// end main

    public static void testChar(char input) throws InputException {
        int ascii = (int) input;
        if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122) || (ascii >= '0' && ascii <= '9')) {
            ++count;
        }

        else {
            System.out.println("Total characters: " + count);
            throw new InputException("Not a valid character");
        }
        
    }
}
