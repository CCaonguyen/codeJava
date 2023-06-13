/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package date.main;

/**
 *
 * @author admin
 */
public class Main {
   
  public static void main(String[] args) {
    Student student1 = new Student("", 11);
    Student student2 = new Student("", 10);
 
    System.out.println("Student Details:");
    student1.printStudentDetails();
    student2.printStudentDetails();
  
    System.out.println("Adding courses for " + student1.getName());
    student1.addCourse("Math");
    student1.addCourse("Physics");
    

    System.out.println(student1.getName() + "'s courses: " + student1.getCourses());

    System.out.println("\nAdding courses for " + student2.getName());

    student2.addCourse("Physics");
  
    System.out.println(student2.getName() + "'s courses: " + student2.getCourses());
    System.out.println("\nRemoving 'Science' course for " + student1.getName());
    student1.removeCourse("Science");
    System.out.println(student1.getName() + "'s courses: " + student1.getCourses());
  }
}