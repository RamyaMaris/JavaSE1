
package com.ntuc.demo.array;

import java.util.Scanner;

public class ArrayInput {

    
    public static void main(String args[]) {
        String[] names = new String[3];
        Scanner scan = new Scanner(System.in);

            System.out.println("Enter a Name: ");
        for (int i = 0; i < 3; i++) {
            names[i] = scan.nextLine();
        }
        System.out.println("Printing String Array: ");
        for (int i = 0; i < 3; i++) {
            System.out.println(names[i]);
        }
    }
}
