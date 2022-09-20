
package day3;

import java.util.Scanner;

public class CalcAverage {
    public static void main(String[] args) {
        
        int val1, val2, val3;
        double result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value 1 ::");
        val1 = sc.nextInt();
        System.out.println("Enter the value 2 ::");
        val2 = sc.nextInt();
        System.out.println("Enter the value 3 ::");
        val3 = sc.nextInt();
        result = (val1 + val2 + val3)/3.0;
        System.out.println("The average value is ::" + result);
    }
}
