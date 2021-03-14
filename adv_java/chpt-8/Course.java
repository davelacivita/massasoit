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

   

    public static int setCourseNumber() {
        int courseNum;
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.println("Please enter the course number between 001 - 399");
            courseNum = keyboard.nextInt();
        }
        while (courseNum <= 0 && courseNum >= 399);
        //keyboard.close();
        return courseNum;
    }

    public static int setCourseCredits() {
        int courseCredits;
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.println("Please enter the course credits: 3, 4 or 6");
            courseCredits = keyboard.nextInt();
        }
        while (courseCredits != 3 || courseCredits != 4 || courseCredits != 6);
        //keyboard.close();
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
