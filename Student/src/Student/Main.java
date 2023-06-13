/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package demolinkedlistwithobject;*/

/**
 *
 * @author loanntm
 */
public class Main {
    public static void main(String[] args) {
        MyList ml = new MyList();
       
        Student s1 = new Student(1,"Thủy", 20);
        Student s2 = new Student(2, "Hoàng Anh", 19);
        Student s3 = new Student(3, "Phúc", 20);
        Node node1 = new Node(s1);
        Node node2 = new Node(s2);
        Node node3 = new Node(s3);
        ml.add(node1);
        ml.add(node2);
        ml.add(node3);
        ml.traverse();
    }
   
}