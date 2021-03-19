import java.util.Scanner;

public class Course {
    private String department;
    private int courseNumber, courseCredits;
    private double courseCost;

    //default
    public Course() {
        department = "unknown";
        courseNumber = 0;
        courseCredits = 0;
        courseCost = 0;
    }

    //nondefault
    public Course(String departmentPassed, int courseNumberPassed, int courseCreditsPassed) {
        department = departmentPassed;
        courseNumber = courseNumberPassed;
        courseCredits = courseCreditsPassed;
        courseCost = (courseCredits/2) * 500;
    }

    public static int setNumCourses() {
        System.out.println("Please enter the number of classes you will be taking ");
        Scanner keyboard = new Scanner(System.in);
        int numberOfClasses = keyboard.nextInt();
        //keyboard.close();
        return numberOfClasses;
        }

    public static String setCourseDept(boolean found, int numCourses, int i, String dept) {
        String[] courseDept = { "ENGL", "MATH", "COMP", "HIST", "HUMN", "LANG", "SCIE", "PHYS" };
        found = false;
        do {
            System.out.println("Please enter the department for course " + (i + 1)
                    + ": ENGL, MATH, COMP, HIST, HUMN, SCIE, LANG, PHYS");
            Scanner keyboard = new Scanner(System.in);
            String userDept = keyboard.nextLine();
            found = checkArray(userDept, courseDept);
            if (found == false) {
                System.out.println("Not a valid course. ");
            } else {
                dept = userDept;
            }
        } // end do
        while (found == false);
        return dept;

    }// end method

    private static boolean checkArray(String userDept, String[] arrayPassed) {
        boolean found = false;
        for (int i = 0; i < arrayPassed.length; ++i) {
            if (found == true) {
                break;
            } else if (arrayPassed[i].equals(userDept)) {
                found = true;
            } // end if

        } // end for
        return found;
    }// end method

    public static int setCourseNumber() {
        int courseNum = -1;
        Scanner keyboard = new Scanner(System.in);
        do {
                System.out.println("Please enter the course number between 001 - 399");
                courseNum = keyboard.nextInt();
        }
        while (courseNum <= 0 || courseNum >= 399);
        return courseNum;
    }

    public static int setCourseCredits() {
        int courseCredits = 0;
        Scanner keyboard = new Scanner(System.in);
        do {
                System.out.println("Please enter the nuber of credits for this class: 3, 4, OR 6.");
                courseCredits = keyboard.nextInt(); 
        }
        while (courseCredits != 3 && courseCredits != 4 && courseCredits != 6);
        return courseCredits;
    }

    public String getDepartment() {
        return this.department;
    }

    public int getcourseNumber() {
        return this.courseNumber;
    }

    public int getCourseCredits() {
        return this.courseCredits;
    }

    public double getCourseCost() {
        return this.courseCost;
    }
    

    public String toString() {
        return "Department: " + this.department +
                "\nCourse Number: " + this.courseNumber + 
                "\nCourse Credits: " + this.courseCredits + 
                "\nCourse Cost: " + this.courseCost; 
    }

    public Boolean equals(Course coursePassed) {
        return
        this.department == coursePassed.department &&
        this.courseNumber == coursePassed.courseNumber &&
        this.courseCredits == coursePassed.courseCredits &&
        this.courseCost == coursePassed.courseCost;
    }


}//end class
