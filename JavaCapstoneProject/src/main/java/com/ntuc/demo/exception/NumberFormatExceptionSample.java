package com.ntuc.demo.exception;

public class NumberFormatExceptionSample {

    public static void main(String[] args) {
        try {
            int n = Integer.parseInt("ss");
//            int n = Integer.parseInt("100");
            System.out.println(n);
        } catch(NumberFormatException e) {
            System.out.println(e);
        }
    }
}
