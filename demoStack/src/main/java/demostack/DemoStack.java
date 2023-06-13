/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package demostack;

/**
 *
 * @author admin
 */
public class DemoStack {

    
     public static void decToBin(int k) {
        MyStack s = new MyStack(10);
        int top =-1;
        while (k > 0) {   
        int m = k % 2;
        s.push (new Node(m));
         k  = k / 2;}
    
        System.out.println("Binary");
        while(!(s.isEmpty())){
        Node x = s.pop();
        x.printInfo(0);}
     }
    public static void main(String[] args) {
        //khai bao ngan xep kich thuoc oi da 5
        MyStack ms = new MyStack(5);
        ms.push(new Node(2));
        ms.push(new Node(3));
        ms.push(new Node(5));
        ms.push(new Node(7));
        
        
      System.out.println("ngan xep ban dau");
      ms.print();
      System.out.println("ngan xep khi push them ");
      ms.push(new Node(16));
      ms.print();
     
      System.out.println("phan tu tren cung ngan xep la");
      Node x = ms.topEl();
      x.printInfo(0);
  
      System.out.println("ngan xep sau khi lay ra 1 phan tu");
     Node y = ms.pop();
     ms.print();
      System.out.println("phan tu lay ra");
      y.printInfo(0);
    
   decToBin(10);
   
      
    }
}

