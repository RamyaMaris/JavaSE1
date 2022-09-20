
package com.ntuc.demo.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionSample {
    static int f;
    public static void main(String[] args) {
        System.out.println("The age Entered is "+ getAge());
    }
    static int getAge(){
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Enter your age :");
            f = scan.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Please enter a valid input for age");
            getAge();
        }finally{
            return f;
        }
    }
}
