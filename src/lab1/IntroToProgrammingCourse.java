package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      Nick Agnello
 * @version     1.00
 */
public class IntroToProgrammingCourse extends ProgrammingCourse{
    

    public IntroToProgrammingCourse(String courseName, String courseNumber, double numCredits) {
        super(courseName,courseNumber,numCredits);
        
    }

    public void printCourseInfo(){
        System.out.println("Course Name: " + this.getCourseName());
        System.out.println("Course Number: " + this.getCourseNumber());
        System.out.println("Number of Credits: " + this.getCredits() + "\n");
        
    }
}
