
package com.ntuc.demo.exception;


public class ArrayIndexOutOfBoundSample {

    public static void main(String[] args) {
        try{
            int a[] = new int[5];
            a[6] = 9; // accessing 6th element in an array of size 5
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }finally{
            System.out.println("Finally block...");
        }
    }
}
