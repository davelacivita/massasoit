import java.util.Scanner;

public class DemoWinstonAndCharlotte {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n;
        String departmentEntered;
        int creditsEntered, courseNumberEntered;

        System.out.println("PLease enter the number of classes you will be taking:");
        n = keyboard.nextInt();

        Course[] schedule = new Course[n];

        for (int i = 0; i < n; ++i) {
            keyboard.nextLine();
            System.out.println("Please enter the department:");
            departmentEntered = keyboard.nextLine();
            System.out.println("Please enter the course number:");
            courseNumberEntered = keyboard.nextInt();
            System.out.println("Please enter the number of credits:");
            creditsEntered = keyboard.nextInt();

            if (departmentEntered.equals("COMP") || departmentEntered.equals("SCIE")
                    || departmentEntered.equals("PHYS"))
                schedule[i] = new LabCourse(departmentEntered, courseNumberEntered, creditsEntered);
            else if (departmentEntered.equals("ENGL") || departmentEntered.equals("HIST")
                    || departmentEntered.equals("MATH") || departmentEntered.equals("LANG")
                    || departmentEntered.equals("HUMN"))
                schedule[i] = new Course(departmentEntered, courseNumberEntered, creditsEntered);
            else {
                --i;
                continue;
            }
        } // end for loop

        for (int i = 0; i < schedule.length; ++i)
            System.out.println(schedule[i].toString());

    }// end main
}// end class