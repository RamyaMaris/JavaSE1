
package com.ntuc.demo.recursion;

import java.util.Scanner;


public class RecursiveMethod1 {
    Scanner scan = new Scanner(System.in);
    int i = 0;
    public static void main(String args[]) {
        RecursiveMethod1 ex = new RecursiveMethod1();
        ex.readInput();
    }

    public void readInput() {
        System.out.println("Enter a number");
        int j = scan.nextInt();
        if (j != 0) {
            i = i + j;
            System.out.println("J is " + j);
            readInput();
        } else {
            System.out.println("i is " + i);
        }
    }
}
