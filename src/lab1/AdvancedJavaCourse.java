package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      Nick Agnello
 * @version     1.00
 */
public class AdvancedJavaCourse extends ProgrammingCourse{
    String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber, String prerequisites) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setPrerequisites(prerequisites);
    }

    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }


    public String getPrerequisites() {
        return prerequisites;
    }

    private void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    


    private void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    
    private void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    
    
}
