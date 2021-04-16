public class LabCourse extends Course {

    public LabCourse() {
        super();
        courseCost = courseCost + 100;
    }// end defalt constructor

    public LabCourse( String departmentPassed, int courseNumberPassed, int courseCreditsPassed ){
        super(departmentPassed, courseNumberPassed, courseCreditsPassed);
        courseCost = courseCost + 100;
    }// end non-default constructor

}// end class
