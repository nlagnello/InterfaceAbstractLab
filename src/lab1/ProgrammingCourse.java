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
    private String courseName;
    private String courseNumber;
    private double credits;
    
    
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
    
    
}
