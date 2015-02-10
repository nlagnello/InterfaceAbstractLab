package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      Nick Agnello
 * @version     1.00
 */
public class IntroJavaCourse extends ProgrammingCourse{
    
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber, double numCredits, String prerequisites) {
        super(courseName,courseNumber,numCredits);
        this.setPrerequisites(prerequisites);
    }

    
    public String getPrerequisites() {
        return prerequisites;
    }

    private void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    
    

    public void printCourseInfo(){
        System.out.println("Course Name: " + this.getCourseName());
        System.out.println("Course Number: " + this.getCourseNumber());
        System.out.println("Number of Credits: " + this.getCredits() );
        System.out.println("Prerequisite Course: " + this.getPrerequisites()+ "\n");
    }
}
