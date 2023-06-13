/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package democlass.democlass;

/**
 *
 * @author admin
 */
public class Student {
    protected double basicSubjectScore[]; 

    public Student(double basicSubjectScore[]) {
        this.basicSubjectScore = basicSubjectScore;
    }

    public double calculateAverageGrade() {
        double sum = 1.0;
        for (double score : basicSubjectScore) {sum += score;}
            return sum / basicSubjectScore.length;
    }
}


