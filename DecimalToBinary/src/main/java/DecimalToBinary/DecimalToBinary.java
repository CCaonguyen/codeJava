/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package DecimalToBinary;

/**
 *
 * @author admin
 */
import java.util.Stack;


  public class DecimalToBinary {
    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        
        StringBuilder binary = new StringBuilder();
        
        while (decimal > 0) {
            binary.insert(0, decimal % 2);
            decimal /= 2;
        }
        
        return binary.toString();
    }
    
    public static void main(String[] args) {
        int decimalNumber = 42;
        String binaryNumber = decimalToBinary(decimalNumber);
        System.out.println("Decimal: " + decimalNumber);
        System.out.println("Binary: " + binaryNumber);
    }
}