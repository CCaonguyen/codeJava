/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package democlass.democlass;

/**
 *
 * @author admin
 */
public class Democlass {



    public static void main(String[] args) {
   PhysicsStudent physicsStudent = new PhysicsStudent(new double[]{50}, 50);
        double physicsAverageGrade = physicsStudent.calculateAverageGrade();
    System.out.println("PhysicsAverage: " + physicsAverageGrade);
    
    double [] mang = {0, 1, 2};
     PhysicsStudent physicsStudent1 = new PhysicsStudent(mang, 50);
      PhysicsStudent physicsStudent2 = new PhysicsStudent(mang, 50);
    

    MathsStudent mathsStudent = new MathsStudent(new double[]{55}, 65);
    double mathsAverageGrade = mathsStudent.calculateAverageGrade();
    System.out.println("MathsAverage: " + mathsAverageGrade);
    }
}

