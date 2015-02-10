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
    
    public ProgrammingCourse(String courseName, String courseNumber){
        this.courseName = courseName;
        this.courseNumber = courseNumber;
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
