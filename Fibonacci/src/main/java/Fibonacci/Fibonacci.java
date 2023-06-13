/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Fibonacci;

/**
 *
 * @author admin
 */
public class Fibonacci {

 
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int number = 6;
        for (int i = 0; i <= number; i++) {
            int result = fibonacci(i);
            System.out.print(result + " ");
        }
    }
}

