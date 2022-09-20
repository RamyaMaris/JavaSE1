
package com.ntuc.demo.datatypes.typecasting;

public class NarrowCasting {
    public static void main(String args[]) {
        // Narrowing casting must be done manually by placing the type in parentheses in front of the value:
        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9
    }
}
