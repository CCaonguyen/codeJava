/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DemoQuwue;

/**
 *
 * @author admin
 */
public class MyQueue {
   public int max;
   public int first, last;
   Node[] a;

    public MyQueue(int max) {
       
        this.max = max;
        a = new Node[max];
        first = last =-1;
    }
   //Phương thức kiểm tra hàng đợi đầy
    public boolean isFull(){
        return (first ==0&& last == max-1);
    }
   //Phương thức kiểm tra hàng đợi rỗng
   
   public boolean isEmpty(){
       return (first ==-1);
   }

   //Phương thức enqueue để đưa 1 phần tử vào hàng đợi
   //Kiểm tra hàng đợi đầy hay chưa?
  //Tăng last lên, đưa phần tử vào a[last]
    public void enqueue(Node x){
        if(isFull()){
            System.out.println("Hàng đợi đầy rồi");
        }else{
            last++;
            a[last] = x;
           
        }
    }
   
   //Phương thức dequeue để lấy phần tử ra hàng đợi
   //Kiểm tra hàng đợi rỗng?
    //Lấy ra phần tử first , tăng first lên
    public Node dequeue(){
        if(isEmpty()){
            System.out.println("Hàng đợi rỗng");
            return null;
                   
        }
        else{
             //Lấy node head ra
        Node node = a[first];
        first++;
        return node;
        }
         
    }
   
    public void print(){
        //Duyệt mảng và in ra các phần tử của mảng
        for (int i = 0; i < max; i++) {
            if(a[i] !=null){
                a[i].printInfo();
            }
        }
    }
   
   
   
   

 
}