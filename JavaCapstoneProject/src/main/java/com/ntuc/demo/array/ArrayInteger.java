
package com.ntuc.demo.array;

import java.util.Scanner;

public class ArrayInteger {
    public static void main(String[] args) {
        int[] x = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the "+ x.length +" values :");
        for(int i = 0; i<x.length; i++){
            x[i] = sc.nextInt();
        }
        System.out.println("Integer Array Values:");
        for(int i = 0; i<x.length; i++){
        System.out.println(x[i]);
        }
    }
}
