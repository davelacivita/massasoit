public class LabCourse extends Course {

    public LabCourse() {
        //child class must call super first
        super();
        //add $100 for lab course
        courseCost = courseCost + 100;
    }// end defalt constructor

    public LabCourse( String departmentPassed, int courseNumberPassed, int courseCreditsPassed ){
        //send user entry to parent class
        super(departmentPassed, courseNumberPassed, courseCreditsPassed);
        //add $100 for lab course
        courseCost = courseCost + 100;
    }// end non-default constructor

}// end class
