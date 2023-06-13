/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) { Queue queue = new Queue();
queue.enqueue(10);
queue.enqueue(20);
queue.enqueue(30);

System.out.println(queue.dequeue()); // Output: 10
System.out.println(queue.peek()); // Output: 20

System.out.println(queue.isEmpty());
}
}