import java.util.Scanner;
import java.util.InputMismatchException;

public class MsMallard {
    public static void main(String[] args) {
        String[] ducklings = { "Jack", "Nack", "Lack", "Mack", "Nack", "Oack", "Pack", "Quack" };
        Scanner keyboard = new Scanner(System.in);

        Duck p = new Duck(ducklings[0], null, null);
        Duck q = p;
        Duck r = null;
        for (int i = 1; i < ducklings.length; ++i) {
            r = new Duck(ducklings[i], q, null);
            q.setNext(r);
            q = r;
        }

        printListBackward(q);

        int selecion = 0;
        Boolean isValid;

        do {
            System.out.println("Ms Mallard and her Ducklings.");
            System.out.println("Enter your choice.");
            System.out.println("1 for front to back.");
            System.out.println("2 for back to front.");
            System.out.println("0 to end.");
            do {
                isValid = true;
                try {
                    selecion = keyboard.nextInt();
                    while (selecion < 0 || selecion > 2) {
                        System.out.println("\nMs Mallard and her Ducklings.");
                        System.out.println("Enter your choice.");
                        System.out.println("1 for front to back.");
                        System.out.println("2 for back to front.");
                        System.out.println("0 to end.");
                        selecion = keyboard.nextInt();
                    }
                } catch (InputMismatchException ime) {
                    System.out.println("Please enter an interger 0, 1, or 2.");
                    keyboard.nextInt();
                    isValid = false;
                }
            } while (selecion != 0);
        } while (!isValid);
        keyboard.close();

    }// end main

    public static void printListForward(Duck first) {
        Duck current = first;
        do {
            System.out.println(current.toString());
            current = current.getNext();
        } while (current != null);
    }

    public static void printListBackward(Duck last) {
        Duck current = last;
        do {
            System.out.println(current.toString());
            current = current.getPrevious();
        } while (current != null);
    }
}// end class
