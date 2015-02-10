/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author nagnello
 */
public class Startup {
    
    ProgrammingCourse introCourse = new IntroToProgrammingCourse("Intro To Programming","101");
        ProgrammingCourse javaCourse = new IntroJavaCourse("Intro To Java","201");
        ProgrammingCourse advancedCourse = new AdvancedJavaCourse("Advanced Java","301");
        
        introCourse.printCourseInfo();
        javaCourse.printCourseInfo();
        advancedCourse.printCourseInfo();
}
