/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demolinkedlistwithobject;

/**
 *

 */
public class MyList {
    private Node head;
    private Node tail;

    public MyList() {

        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;

    }
    public void addFirst(Node node){
        // chưa có node nào
        if (isEmpty()) {
            head = tail = node;
        } else {
            //Lấy node móc vào head
            //gán head là node mới
            node.next = head;
            head = node;
        }

    }
    public void deleteFirst() {
        if (isEmpty()) {
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeById(int id){
        if (head == null) {
            System.out.println("The linked list is empty.");
            return;
        }

        if (head.getStudent().getStudentId() == id) {
            head = head.getNext();
            return;
        }

        Node current = head;
        Node previous = null;

        while (current != null) {
            if (current.getStudent().getStudentId() == id) {
                previous.setNext(current.getNext());
                return;
            }

            previous = current;
            current = current.getNext();
        }

        System.out.println("No student with the given ID found in the linked list.");
    }


    public void addAt(int position, Node node){
        if (position == 1){
            node.next =head;
            head = node;
        } else {
            Node previousNode = head;
            int count =1;
            while (count < position - 1 && previousNode.next != null){
                previousNode = previousNode.next;
                count++;
            }
            node.next = previousNode.next;
            previousNode.next =node;
        }
    }
    public void add(Node node) {
        // chưa có node nào
        if (isEmpty()) {
            head = tail = node;
        } else {
            //Lấy tail móc vào node mới
            //Tail là node mới
            tail.next = node;
            tail = node;
        }
    }
    
    public void traverse(){
        //Dùng 1 node làm con trỏ và trỏ từ head đến null
        Node currentNode = head;
        while(currentNode !=null){
            currentNode.printData();
            currentNode = currentNode.next;
        }
    }

    void search() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

}