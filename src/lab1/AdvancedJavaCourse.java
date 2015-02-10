package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      Nick Agnello
 * @version     1.00
 */
public class AdvancedJavaCourse extends ProgrammingCourse{
    
    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber, double numCredits, String prerequisites) {
        super(courseName,courseNumber,numCredits);
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

    public void printCourseInfo(){
        System.out.println("Course Name: " + this.getCourseName());
        System.out.println("Course Number: " + this.getCourseNumber());
        System.out.println("Number of Credits: " + this.getCredits());
        System.out.println("Prerequisite Course: " + this.getPrerequisites()+ "\n");
    }
    
}
