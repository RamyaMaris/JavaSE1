
package com.ntuc.demo.array;

import java.util.Scanner;

public class ArrayInputMethod {

    Scanner scan = new Scanner(System.in);
    static String[] names;
    public static void main(String args[]) {
        ArrayInputMethod obj = new ArrayInputMethod();
        names = obj.inputString(3);
        obj.printString(names);
    }
    public String[] inputString(int index)
    {
        names = new String[index];
        for (int i = 0; i < names.length; i++) {
            names[i] = scan.next();
        }
        return names;
    }
    public void printString(String[] str){
        System.out.println("Printing String Array: ");
        for (int i = 0; i < names.length; i++) {
            System.out.println(str[i]);
        }
    }
}
