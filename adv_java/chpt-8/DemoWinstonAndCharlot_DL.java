import java.util.Scanner;

public class DemoWinstonAndCharlot_DL {
    public static void main(String[] args) {
        int num = getNumCourses();
        String courseDept;
        courseDept = setCourseDept(false, num);


        Course[] arrayCourses = new Course[num];
        //add if statement for course or lab
       for (int i = 0; i < num; ++i) {
           arrayCourses[i] = new Course(setCourseDept(false, num), Course.setCourseNumber(), Course.setCourseCredits());
       }

    }//end main

    public static int getNumCourses() {
        System.out.println("Please enter the number of classes you will be taking ");
        Scanner keyboard = new Scanner(System.in);
        int numberOfClasses = keyboard.nextInt();
        //keyboard.close();
        return numberOfClasses;
        }

    public static String setCourseDept(boolean found, int num) {
        String[] courseDept = {"ENGL", "MATH", "COMP", "HIST", "HUMN", "COMP", "SCIE", "PHYS"};
        String dept = null;
        do {
            for (int i = 1; i <= num; ++i) {
                System.out.println("Please enter the department for course " + i + ": ENGL, MATH, COMP, HIST, HUMN, SCIE, LANG, PHYS");
            Scanner keyboard = new Scanner(System.in);
            String userDept = keyboard.nextLine();
            checkArray(userDept, courseDept);
                if (found = true) {
                    dept = userDept;
                }
                else {
                    System.out.println("Not a valid course. Please enter the department for course " + num + ": ENGL, MATH, COMP, HIST, HUMN, SCIE, LANG, PHYS");
                }
            }
            
        }//end do
        while (found = false);
        return dept; 
    }//end method

    public static boolean checkArray(String userDept, String[] arrayPassed) {
        boolean found = false;
        for (int i = 0; i < arrayPassed.length; ++i) {
            if (arrayPassed[i] == userDept) {
                return found;
            }//end if
        }//end for
        return found;
    }//end method

}//end class
