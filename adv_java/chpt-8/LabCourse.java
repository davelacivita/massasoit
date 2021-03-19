public class LabCourse extends Course {

    //default
    public LabCourse() {
        super();
    }

    //non default
    public LabCourse(String departmentPassed, int courseCreditsPassed, int courseNumberPassed) {
        super(departmentPassed, courseNumberPassed, courseCreditsPassed);
    }

    public void setCourseCost(double d) {
        if (getDepartment() == "COMP" || getDepartment() == "SCIE" || getDepartment() == "PHYS") {
            setCourseCost(getCourseCost() + 100);
        }
        
    }

    @Override
    public String toString() {
        return "Department: " + this.getDepartment() + "\nCourse Number: " + this.getcourseNumber() + "\nCourse Cresits: "
                + this.getCourseCredits() + "\nCourse Cost: " + this.getCourseCost();
    }

    @Override
    public Boolean equals(Course coursePassed) {
        return this.getDepartment() == coursePassed.getDepartment() &&
                this.getcourseNumber() == coursePassed.getcourseNumber() &&
                this.getCourseCredits() == coursePassed.getCourseCredits() &&
                this.getCourseCost() == coursePassed.getCourseCost();
    }
}
