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
    private String prerequisites;

    /*public ProgrammingCourse(String courseName, String courseNumber, double numCredits, String prerequisites){
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(numCredits);
        this.setPrerequisites(prerequisites);
    }*/
    
    public final String getPrerequisites() {
        return prerequisites;
    }

    public final void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            prerequisites = "NONE";
            
        }
        
        this.prerequisites = prerequisites;
    }
    
    
    public final String getCourseNumber(){
        return courseNumber;
    }
    public final String getCourseName(){
        return courseName;
    }
    public final double getCredits(){
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
       
    
    public final void setCredits(double credits) {
        if(credits < 0 || credits > 5.0) {
            throw new IllegalArgumentException();
        }
        this.credits = credits;
    }
    
    public final void printCourseInfo(){
        System.out.println("Course Name: " + this.getCourseName());
        System.out.println("Course Number: " + this.getCourseNumber());
        System.out.println("Number of Credits: " + this.getCredits());
        System.out.println("Prerequisite Course: " + this.getPrerequisites()+ "\n");
    }
}
