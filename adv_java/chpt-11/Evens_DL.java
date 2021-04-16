import java.util.Scanner;

public class Evens_DL {

    static int number = 0;
    static int count = 0;

    public static int printEvens(int number) {

        if (number < 0) {
            return 0;
        }

        if (number % 2 == 0) {
            ++count;
            System.out.print(number + " ");
            printEvens(number - 2);
        }

        else {
            printEvens(number - 1);
        }
        
        return count;
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
    
        do {
            try {
                System.out.println("Please enter a positive number.");
                number = keyboard.nextInt();
            } catch (Exception e) {
                keyboard.nextLine();
                System.out.println("Not a number!");
                continue;
            }   
            valid = true;
        } while (valid == false);

        System.out.println("The even numbers from 0 to " + number + " are: ");
        count = printEvens(number);
        System.out.println();

        System.out.println("There are " + count + " even numbers between 0 and " + number + ".");
        keyboard.close();
    }//end main
}//end class