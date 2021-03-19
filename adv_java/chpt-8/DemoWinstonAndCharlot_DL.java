import java.util.Scanner;

public class DemoWinstonAndCharlot_DL {
    public static void main(String[] args) {
        String dept = "unknown";
        String userDept = "unknon";
        int courseNumber = 0;
        int credits = 0;
        Scanner keyboard = new Scanner(System.in);
        int numCourses = Course.setNumCourses();
        Course[] userCourses = new Course[numCourses];

        for (int i = 0; i < numCourses; ++i) {
            userDept = Course.setCourseDept(false, numCourses, i, dept);
            courseNumber = Course.setCourseNumber();
            credits = Course.setCourseCredits();
            if (userDept == "COMP" || userDept == "SCIE" || userDept == "PHYS") {
                LabCourse courseLab = new LabCourse(userDept, courseNumber, credits);
                userCourses[i] = courseLab;
        }
            else {
                Course course = new Course(userDept, courseNumber, credits);
                userCourses[i] = course;
            }
        
        
        } // end for
       
        // for (int a = 0; a < numCourses; ++a) {
        //     System.out.print(userCourses[a] + "\t");
        // }
        // System.out.println();
        
        

    }// end main

    

    

}// end class

// for (int a = 0; a < numCourses; ++a) {
        //     System.out.print(userCourses[a] + "\t");
        // }
        // System.out.println();
        // Course.setCourseNumber(userCourses);
        // Course.setCourseCredits();
         // userCourses[i] = userDept;