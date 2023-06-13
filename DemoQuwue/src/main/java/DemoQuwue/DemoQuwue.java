/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package DemoQuwue;

/**
 *
 * @author admin
 */
public class DemoQuwue {

   public static void main(String[] args) {
        //khai bao ngan xep kich thuoc yoi da 5
        MyQueue mq = new MyQueue(5);
       mq.enqueue (new Node(1));
       mq.enqueue (new Node(2));
       mq.enqueue (new Node(3));
       mq.enqueue (new Node(4));
       
        
      System.out.println("hang doi sau khi enqueue la");
      mq.print();
      mq.enqueue(new Node(6));
      System.out.println("hang doi sau dequeue 1 phan tu la ");
      mq.dequeue();
      mq.print();
    
      System.out.println("hang doi sau dequeue 2 phan tu la ");
      mq.dequeue();
      mq.print();
   System.out.println("hang doi sau khi them phan tu thu 7 phan tu la ");
    
      mq.enqueue (new Node(7));
       mq.print();
  
     
}

   
}
