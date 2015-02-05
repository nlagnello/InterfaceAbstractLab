/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

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
    public abstract void setCourseNumber(String courseNumber);
    
    public abstract void setCourseName(String courseName);
    public abstract double getCredits();
    public abstract void setCredits(double credits);
    
    public String getCourseName(){
        return courseName;
    }
    
}
