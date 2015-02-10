package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      Nick Agnello
 * @version     1.00
 */
public class IntroJavaCourse extends ProgrammingCourse{
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    

    private void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    


    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

       
    

    
    private void setCourseName(String courseName) {
        this.courseName = courseName;
    }

}
