
package com.ntuc.demo.array;

import com.ntuc.demo.practicework.ReverseStringMethod;
import java.util.Scanner;

/*
1. Create a String Array
2. Accept user Input to the elements in the string array
3. Print the reverse of each element

 */
public class ReverseStringArrayMethod {
    Scanner sc = new Scanner(System.in);
    static String[] str_array;
    public static void main(String[] args) {
        ReverseStringArrayMethod rvs = new ReverseStringArrayMethod();
        ReverseStringMethod reverObj = new ReverseStringMethod();
        ArrayInputMethod inputObj = new ArrayInputMethod();
        System.out.println("How many string going to enter? \nEnter the number : ");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        str_array = inputObj.inputString(index);
        reverObj.reverString(str_array);
    }
}
