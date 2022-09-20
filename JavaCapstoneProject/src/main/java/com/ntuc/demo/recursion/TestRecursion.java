
package com.ntuc.demo.recursion;

import java.util.Scanner;

public class TestRecursion {
    static int count;

    public static void main(String args[]) {
        TestRecursion tj = new TestRecursion();
        tj.takeJ();
        System.out.println("\n Total Iterations: " + count);
    }
    public void takeJ() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value for J: ");
        int recursioncount = 0;
        int loopcount = 0;

        int j = scan.nextInt();
        loopcount = recursioncount = j;

        while (j != 0) {
            count++;
            System.out.println("Entering Recursion level " + recursioncount);
            takeJ();
            j--;
            recursioncount--;
        }
        System.out.println("exiting Loop  " + count);
    }
}

