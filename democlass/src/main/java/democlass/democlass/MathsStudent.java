/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package democlass.democlass;

/**
 *
 * @author admin
 */
public class MathsStudent extends Student {
     
   private final double advancedSubjectScore; 

    public MathsStudent(double basicSubjectScore[], double advancedSubjectScore) {
        super(basicSubjectScore);
        this.advancedSubjectScore = advancedSubjectScore;
    }
   @Override
   public double calculateAverageGrade(){
       double sum = 0.0;
        for (double score : basicSubjectScore) { sum += score; }
        double basicSubjectAverage = sum / basicSubjectScore.length;
        return (basicSubjectAverage + advancedSubjectScore) / 3.0;
    }
}
