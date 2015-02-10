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
    private IntroToProgrammingCourse introCourse;
    private IntroJavaCourse javaCourse;
    private AdvancedJavaCourse advancedCourse;
    
    public String getCourseNumber(){
        return courseNumber;
    }
    public String getCourseName(){
        return courseName;
    }
    public double getCredits(){
        return credits;
    }
       
    public abstract void setCredits(double credits);
    
    
    
}
