public class LabCourse extends Course {
   
     public LabCourse() {
        department = "unknown";
        courseNumber = 0;
        courseCredits = 0;
        courseCost = 0;
     }

     public LabCourse(String departmentPassed, int courseCreditsPassed, int courseNumberPassed) {
        department = departmentPassed;
        courseNumber = courseNumberPassed;
        courseCredits = courseCreditsPassed;
        courseCost = (courseCredits/2) * 500;
    }

    public double setCourseCost() {
        if (department == "COMP" || department == "SCIE" || department == "PHYS") {
            courseCost = courseCost + 100; 
        }
        return courseCost;
    }

    @Override
    public String toString() {
        return "Department: " + this.department +
                "\nCourse Number: " + this.courseNumber + 
                "\nCourse Cresits: " + this.courseCredits + 
                "\nCourse Cost: " + this.courseCost; 
    }

    @Override
    public Boolean equals(Course coursePassed) {
        return
        this.department == coursePassed.department &&
        this.courseNumber == coursePassed.courseNumber &&
        this.courseCredits == coursePassed.courseCredits &&
        this.courseCost == coursePassed.courseCost;
    }
}
