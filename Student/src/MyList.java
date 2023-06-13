
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template


import org.w3c.dom.Node;

import org.w3c.dom.Node;

/**
 *
 * @author loanntm
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

}