/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package demo.demo;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author admin
 */
public class Demo {

  
      public static void main(String[] args) {

        int m = 0;
        int[] mang = {0, 0, 0};
        changeValue(m);
        System.out.println("Gia tri m sau khi thay doi :" + m);
        changeValue(mang);
        System.out.println("Gia tri mang [0] sau khi thay doi = " + mang[0]);
    }
    public static void changeValue( int a){
        a = a +1 ;

    }
    public static void changeValue (int [] arr){
        if (arr != null && arr.length > 0){
            arr[0] = arr[0] + 1;
        }
    }
}

