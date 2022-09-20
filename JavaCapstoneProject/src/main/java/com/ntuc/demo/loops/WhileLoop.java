
package com.ntuc.demo.loops;

import java.util.Scanner;

public class WhileLoop {
     public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        while (i > 0) {
            System.out.println(i);
            i--;
        }
    }
}
