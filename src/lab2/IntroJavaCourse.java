package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse implements ProgrammingCourse{
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

//    public IntroJavaCourse(String courseName, String courseNumber, double numCredits,String prerequisites) {
//        this.setCourseName(courseName);
//        this.setCourseNumber(courseNumber);
//        this.setCredits(numCredits);
//        this.setPrerequisites(prerequisites);
//    }

    public final String getCourseNumber() {
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public final double getCredits() {
        return credits;
    }

    public final void setCredits(double credits) {
        this.credits = credits;
    }

    public final String getPrerequisites() {
        return prerequisites;
    }

    public final void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public final String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
       if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

    public final void printCourseInfo() {
        System.out.println("Course Name: " + this.getCourseName());
        System.out.println("Course Number: " + this.getCourseNumber());
        System.out.println("Number of Credits: " + this.getCredits());
        System.out.println("Prerequisite Course: " + this.getPrerequisites()+ "\n");
    }

    
}
