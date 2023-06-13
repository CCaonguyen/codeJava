/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doublylinkedlist;


/**
 *
 * @author admin
 */
public class Student {
    private int StudentId;
    private String StudentName;
    private  int StudentAge;
    public Student(int StudentId, int StudentAge){
        this.StudentId = StudentId;
        this.StudentName = StudentName;
        this.StudentAge = StudentAge;
    }

    
    public int getStudentId(){
        return StudentId;
    }
    public void setStudentId(int StudentId){
        this.StudentId = StudentId;
    }
    public String getStudentName(){
        return StudentName;
    }
    public void setStudentName(String StudentName){
        this.StudentName = StudentName;
    }
    public int getStudentAge() {
        return StudentAge;
    }

    public void setStudentAge(int StudentAge) {
        this.StudentAge = StudentAge;
    }
    public void printInfo(){
        System.out.print("\n ID:" + this.StudentId);
        System.out.print("\n Name:" + this.StudentName);
        System.out.print("\n Age:" + this.StudentAge);
    }
}