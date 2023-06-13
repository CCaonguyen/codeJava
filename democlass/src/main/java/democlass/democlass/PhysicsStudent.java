/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package democlass.democlass;

/**
 *
 * @author admin
 */
public class PhysicsStudent extends Student {
   
    private final double advancedSubjectScore; 
    private double getbasicSubjectScore;

    public PhysicsStudent(double basicSubjectScore[], double advancedSubjectScore) {
        super(basicSubjectScore);
        this.advancedSubjectScore = advancedSubjectScore;
    } 
    @Override
    public double calculateAverageGrade() {
        return (getbasicSubjectScore + advancedSubjectScore) / 2.5;
        
    }
}