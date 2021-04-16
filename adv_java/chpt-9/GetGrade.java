import java.util.*;

public class GetGrade {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        int score = 0;

        System.out.println("Please enter the score. ");
        score = keyboard.nextInt();

            try {
                if (score < 0 || score >= 100){
                    throw new RangeException("The score should be between 0 and 100.");
                }
    
            } catch (RangeException e) {
                System.out.println(e.getMessage());
                System.exit(0);
            }

        

        if (score < 60) {
            System.out.println("Grade F.");
        }
        else if (score >= 60 && score < 70) {
            System.out.println("Grade D.");
        }
        else if (score >= 70 && score < 80) {
            System.out.println("Grade C.");
        }
        else if (score >= 80 && score < 90) {
            System.out.println("Grade B.");
        }
        else if (score >= 90 && score <= 100) {
            System.out.println("Grade A.");
        }

        

    }//end main
}
