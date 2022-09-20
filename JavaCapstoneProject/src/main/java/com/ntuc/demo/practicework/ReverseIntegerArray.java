
package com.ntuc.demo.practicework;

import java.util.Scanner;

public class ReverseIntegerArray {
    public static void main(String[] args) {
        int reverse = 0;
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int remain = number % 10;
        reverse = reverse * 10 + remain;
        number = number/10;
        System.out.println("--->"+reverse);
    }
    
}
