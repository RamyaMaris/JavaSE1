
package com.ntuc.demo.datatypes.typecasting;

public class WideCasting {
    public static void main(String[] args) {
        //widening casting is done automatically when passing a smaller size type oto a larger size type.
        int myInt = 9;
        double myDouble = myInt;//Automatic casting : int to double
        System.out.println(myInt);//output is 9
        System.out.println(myDouble);//output is 9.0
    }
}
