import java.util.Scanner;

public class UnderOver_DL {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //-2,147,483,648 to +2,147,483,647
        int a, b;
        System.out.println("Please enter a number.");
        a = keyboard.nextInt();
        System.out.println("Please enter another number.");
        b = keyboard.nextInt();
        keyboard.close();

        try {
            if (a >= 0 && b >= 0) {
                if (a + b < 0) {
                    throw new OverflowException("Whoa! That's an Overflow Exception");
                }
                else {
                    System.out.println(a + b);
                }
            }

            else if (a < 0 && b < 0) {
                if (a + b > 0) {
                    throw new UnderflowException("Whoa! That's an Underflow Exception");
                }
                else {
                    System.out.println(a + b);
                }
            }

            else {
                System.out.println(a + b);
            }
        } 
        catch (UnderflowException ue) {
            System.out.println(ue.getMessage());
        }

        catch (OverflowException oe) {
            System.out.println(oe.getMessage());

        }

    }//end main
}//end class
