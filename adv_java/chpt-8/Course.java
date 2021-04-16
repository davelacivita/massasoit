
/*
College of Winston and Charlotte

This program will calculate the amount for a semester bill at The College of Winston and Charlotte.

The college has courses in these departments:

ENGL
MATH
COMP
HIST
HUMN
SCIE
LANG
PHYS
The cost of classes in the following departments are calculated: (courseCredits/2) * $500

ENGL
MATH
HIST
HUMN
LANG

The cost of classes in the following departments are calculated: (courseCredits/2) * $500 + $100

COMP
SCIE
PHYS
 

Part 1: 

Create a class Course.java:

The class has non-static instance variables:

private String department
private int courseNumber
private int courseCredits
private double courseCost
The class must have a default constructor which will set values as follows:

department = “unknown”
courseNumber = 0
courseCost = 0
courseCredits = 0

The class must have a non-default constructor which will set values as follows (use the setters):

department = value passed to constructor
courseNumber = value passed to constructor
courseCredits = value passed to constructor
courseCost = no value will be passed to the constructor, courseCost will be calculated as (courseCredits/2) * $500

The class must have the appropriate getter and setter methods. The setter methods must trap the user to enter valid information as follows:

courseNumbers must be 001 - 399 (inclusive)
courseCredits must be 3, 4 or 6
department must be ENGL, MATH, COMP, HIST, HUMN, SCIE, LANG, PHYS
courseCost will be calculated in the method based on the value of courseCredits: (courseCredits/2) * $500
The class must have a toString method and an equals method.


Part 3:

Develop a program (DemoWinstonAndCharlotte_yourInitials.java, where yourInitials represents your initials) that asks the user for the number of courses they will take,  creates an array of Courses, gets the information for each course (department, courseNumber, courseCredits), creates instances of the appropriate class, populates the array with the instances, calculates the cost of each course and the total bill and then prints the information for each course and the total of the bill to the user.

 

Submit all 3 files

*/
import java.util.Scanner;

public class Course {
    private String department;
    private int courseNumber;
    private int courseCredits;
    protected double courseCost;

    public Course() {
        this.department = "unknown";
        this.courseNumber = 0;
        this.courseCost = 0;
        this.courseCredits = 0;
    }// end default constructor

    public Course(String departmentPassed, int courseNumberPassed, int courseCreditsPassed) {
        setDepartment(departmentPassed);
        setCourseNumber(courseNumberPassed);
        setCourseCredits(courseCreditsPassed);
        setCourseCost(courseCreditsPassed);
    }// end non-default constructor

    public void setDepartment(String departmentPassed) {
        Scanner keyboard = new Scanner(System.in);
        while (!departmentPassed.equals("ENGL") && !departmentPassed.equals("MATH") && !departmentPassed.equals("COMP")
                && !departmentPassed.equals("HIST") && !departmentPassed.equals("HUMN")
                && !departmentPassed.equals("SCIE") && !departmentPassed.equals("LANG")
                && !departmentPassed.equals("PHYS")) {
            System.out.println("Please enter the department  ENGL, MATH, COMP, HIST, HUMN, SCIE, LANG, PHYS.");
            departmentPassed = keyboard.nextLine();
        } // end while
        this.department = departmentPassed;
    }// end method

    public void setCourseNumber(int courseNumberPassed) {
        Scanner keyboard = new Scanner(System.in);
        while (courseNumberPassed < 001 || courseNumberPassed > 399) {
            System.out.println("Please enter the course number.");
            courseNumberPassed = keyboard.nextInt();
            keyboard.nextLine();
        }
        this.courseNumber = courseNumberPassed;
    }// end method

    public void setCourseCredits(int courseCreditsPassed) {
        Scanner keyboard = new Scanner(System.in);
        while (courseCreditsPassed != 3 && courseCreditsPassed != 4 && courseCreditsPassed != 6) {
            System.out.println("Please enter the course credits.");
            courseCreditsPassed = keyboard.nextInt();
            keyboard.nextLine();
        }
        this.courseCredits = courseCreditsPassed;
    }// end method

    public void setCourseCost(int courseCreditsPassed) {
        this.courseCost = courseCreditsPassed / 2 * 500;
    }

    public String getDepartment() {
        return this.department;
    }// end method

    public int getCourseNumber() {
        return this.courseNumber;
    }// end method

    public int getCourseCredits() {
        return this.courseCredits;
    }// end method

    public double getCourseCost() {
        return this.courseCost;
    }// end method

    public String toString() {
        return "Department: " + this.department + "\nNumber: " + this.courseNumber + "\nCredits: " + this.courseCredits
                + "\nCost: " + this.courseCost;
    }// end method

    public boolean equals(Course coursePassed) {
        return this.department.equals(coursePassed.department) && this.courseNumber == coursePassed.courseNumber
                && this.courseCredits == coursePassed.courseCredits && this.courseCost == coursePassed.courseCost;
    }// end method

}// end class