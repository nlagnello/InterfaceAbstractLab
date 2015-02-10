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
public class Startup {
    /*
        Since the classes were already created in the program it took alot of time to
        create the abstract superclass because I had to inspect each and every method
        and property to see what can go into the abstract class and decide 
        what needed to be kept inside the subclasses. but overall there was not
        alot of code that i had to create since the method bodies were already 
        created
    
        I think it is very advantageous to use Liskov's Substitution principle.
        It was much easier to create and use the classes 
    */
    
    public static void main(String[] args) {
        /*ProgrammingCourse introCourse = new IntroToProgrammingCourse("Intro To Programming","101",2,"NONE");
        ProgrammingCourse javaCourse = new IntroJavaCourse("Intro To Java","201",3,"101");
        ProgrammingCourse advancedCourse = new AdvancedJavaCourse("Advanced Java","301",3.5,"201");
        
        introCourse.printCourseInfo();
        javaCourse.printCourseInfo();
        advancedCourse.printCourseInfo();*/
        
        
            ProgrammingCourse c1 = new AdvancedJavaCourse();
            c1.setCourseName("Advanced Java");
            c1.setPrerequisites("152-134");

            ProgrammingCourse c2 = new IntroJavaCourse();
            c2.setCourseName("Intro TO Java");
            c2.setPrerequisites("152-120");

            ProgrammingCourse c3 = new IntroToProgrammingCourse();
            c3.setCourseName("Intro To Programming");
            c3.setPrerequisites("none");
            

        ProgrammingCourse[] courses = {
            c1,c2,c3
        };
        
        for(ProgrammingCourse course : courses){
            course.printCourseInfo();
        }
    }
}
