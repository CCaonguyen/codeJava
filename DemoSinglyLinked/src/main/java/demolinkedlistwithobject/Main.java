/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demolinkedlistwithobject;

/**
 *
 * @author loanntm
 */
// Press Shift twice to open the Search Everywhere dialog and type show whitespaces,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MyList ml = new MyList();

        Student s1 = new Student(1,"Duc Anh", 20);
        Student s2 = new Student(2, "Hung", 19);
        Student s3 = new Student(3, "Cao", 20);
        Node node1 = new Node(s1);
        Node node2 = new Node(s2);
        Node node3 = new Node(s3);
        Node node4 = new Node(new Student(4, "Khoi", 25));
        ml.add(node1);
        ml.add(node2);
        ml.add(node3);
        ml.addFirst(node4);
       
        ml.deleteFirst();
        ml.traverse();
        ml.removeById(3);
        System.out.println("After removing the student with ID 2:");
        ml.traverse();
    }
}