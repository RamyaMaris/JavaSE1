package com.ntuc.demo.array;

import java.util.Scanner;

public class ArraySample {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[3];
        System.out.println("Enter a Number");

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }

        System.out.println("Print Value : ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
