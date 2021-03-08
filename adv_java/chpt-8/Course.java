import java.util.Scanner;

public class Course {
    String department;
    int courseNumber, courseCredits;
    double courseCost;
    static String[] courseDept = {"ENGL", "MATH", "COMP", "HIST", "HUMN", "SCIE", "LANG", "PHYS"};

    //default
    public Course() {
        department = "unknown";
        courseNumber = 0;
        courseCredits = 0;
        courseCost = 0;
    }

    //nondefault
    public Course(String departmentPassed, int courseCreditsPassed, int courseNumberPassed) {
        department = departmentPassed;
        courseNumber = courseNumberPassed;
        courseCredits = courseCreditsPassed;
        courseCost = (courseCredits/2) * 500;
    }

    public static int setCourseNumber() {
        int courseNum;
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.println("Please enter the course number between 001 - 399");
            courseNum = keyboard.nextInt();
        }
        while (courseNum < 0 && courseNum > 399);
        keyboard.close();
        return courseNum;
    }

    public static int setCourseCredits() {
        int courseCredits;
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.println("Please enter the course credits: 3, 4 or 6");
            courseCredits = keyboard.nextInt();
        }
        while (courseCredits != 3 && courseCredits != 4 && courseCredits != 6);
        keyboard.close();
        return courseCredits;
    }

    public static String setCourseDept() {
        String userDept;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a department name: ENGL, MATH, COMP, HIST, HUMN, SCIE, LANG, PHYS");
        userDept = keyboard.nextLine();
        keyboard.close();
        for (int i = 0; i < courseDept.length; ++i) {
            if (courseDept[i] == userDept)
            return userDept;
        }
        return "Please enter a department name";

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
                "\nCourse Cresits: " + this.courseCredits + 
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
