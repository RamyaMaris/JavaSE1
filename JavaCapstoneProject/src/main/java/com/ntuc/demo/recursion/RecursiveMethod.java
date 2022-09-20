package com.ntuc.demo.recursion;

public class RecursiveMethod {

    public static void main(String args[]) {
        int result = sum(10);
        System.out.println(result);
    }

    public static int sum(int k) {
        System.out.println(k);
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
}
