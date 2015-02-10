/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author nagnello
 */
public abstract class ProgrammingCourse {
    public String courseName;
    public String courseNumber;
    public double credits;
    
    public ProgrammingCourse(String courseName, String courseNumber, double numCredits){
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(numCredits);
    }
    
    public String getCourseNumber(){
        return courseNumber;
    }
    public String getCourseName(){
        return courseName;
    }
    public double getCredits(){
        return credits;
    }
    
    public final void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }
       
    
    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }
    
    public abstract void printCourseInfo();
}
