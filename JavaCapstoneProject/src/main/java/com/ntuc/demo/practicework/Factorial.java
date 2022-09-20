package com.ntuc.demo.practicework;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        Factorial obj = new Factorial();
        obj.calFactorial(val);
    }

    public void calFactorial(int i) {
        int temp = 1;
        for (int j = 2; j <= i; j++) {
            temp *= j;
        }

//        calFactorial(temp);
        System.out.println(i + "! is " + temp);

    }
}
