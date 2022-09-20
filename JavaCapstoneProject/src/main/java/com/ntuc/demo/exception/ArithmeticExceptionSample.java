
package com.ntuc.demo.exception;

public class ArithmeticExceptionSample {
    public static void main(String[] args) {
        //divide by zero
        int dividend = 10;
        int divisor = 0;
        try{
            int res = dividend/divisor;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
