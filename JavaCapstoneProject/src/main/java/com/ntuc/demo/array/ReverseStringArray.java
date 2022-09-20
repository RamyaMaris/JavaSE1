
package com.ntuc.demo.array;

import java.util.Scanner;

/*
1. Create a String Array
2. Accept user Input to the elements in the string array
3. Print the reverse of each element

 */
public class ReverseStringArray {
    Scanner sc = new Scanner(System.in);
    static String[] str_array;
    public static void main(String[] args) {
        ReverseStringArray cs = new ReverseStringArray();
        System.out.println("How many string going to enter? \nEnter the number : ");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        cs.inputString(index);
        cs.reverString(str_array);
    }
    void inputString(int index)
    {
        str_array = new String[index];
        for (int i = 0; i < str_array.length; i++) {
            str_array[i] = sc.next();
        }
    }
   
    void reverString(String[] str_array) {
       
        System.out.println("Reverse String Array : ");
        for (int i = 0; i < str_array.length; i++) {
            String temp_str = "";
            for (int j = str_array[i].length()-1; j >= 0; j--) {
                temp_str += str_array[i].charAt(j);
            }
            System.out.println(temp_str);
        }
    }
}
