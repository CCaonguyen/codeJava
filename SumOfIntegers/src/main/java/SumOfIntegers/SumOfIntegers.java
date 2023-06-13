/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package SumOfIntegers;

/**
 *
 * @author admin
 */
public class SumOfIntegers {

    
    public static int calculateSum(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + calculateSum(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5;
        int sum = calculateSum(number);
        System.out.println("The sum of the first " + number + " integers is: " + sum);
    }
}

