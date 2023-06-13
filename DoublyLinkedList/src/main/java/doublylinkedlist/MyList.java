/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublylinkedlist;

/**
 *
 * @author loanntm
 */
public class MyList {
    Node head, tail;
    public MyList(){
        head = tail = null;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public void add(Node x){
        //Nếu ds rỗng thì head và tail đều trỏ đến node mới
        if(isEmpty()){
            head = tail = new Node(x,null,null);
        } else{
            //Ngược lại đã có node  thì móc đuôi của tail vào node mới
            //Khởi tạo node mới có head =null, tail
            Node n = new Node(x, null, tail);
            tail.next = n;
            tail = n;
           
        }
    }
   
    public void traverse(){
        Node p = head;
        while(p!=null){
            System.out.println(p.info);
            p=p.next;
        }
    }

    void addFirst(Node node4) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void deleteFirst() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void removeById(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
}