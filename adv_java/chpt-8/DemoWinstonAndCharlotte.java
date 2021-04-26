import java.util.Scanner;

public class DemoWinstonAndCharlotte {
    public static void main(String[] args) {
        //declare variables
        Scanner keyboard = new Scanner(System.in);
        int n;
        String departmentEntered;
        int creditsEntered, courseNumberEntered;

        //get number of classes from user
        System.out.println("PLease enter the number of classes you will be taking:");
        n = keyboard.nextInt();

        //declare array
        Course[] schedule = new Course[n];

        //get rest of the info from the user for each class (for loop based on number of classes taken)
        for (int i = 0; i < n; ++i) {
            keyboard.nextLine();
            System.out.println("Please enter the department:");
            departmentEntered = keyboard.nextLine();
            System.out.println("Please enter the course number:");
            courseNumberEntered = keyboard.nextInt();
            System.out.println("Please enter the number of credits:");
            creditsEntered = keyboard.nextInt();

            //populate array with LabCourse objects
            if (departmentEntered.equals("COMP") || departmentEntered.equals("SCIE")
                    || departmentEntered.equals("PHYS"))
                schedule[i] = new LabCourse(departmentEntered, courseNumberEntered, creditsEntered);
            //populate array with Course objects
            else if (departmentEntered.equals("ENGL") || departmentEntered.equals("HIST")
                    || departmentEntered.equals("MATH") || departmentEntered.equals("LANG")
                    || departmentEntered.equals("HUMN"))
                schedule[i] = new Course(departmentEntered, courseNumberEntered, creditsEntered);
            else {
                --i;
                continue;
            }
        } // end for loop

        //loop through schedule array and print course dept., number, and cost
        for (int i = 0; i < schedule.length; ++i)
            System.out.println(schedule[i].toString());

    }// end main
}// end class