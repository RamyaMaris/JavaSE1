
package com.ntuc.demo.practicework;

import java.util.Scanner;


/*
Psueodo code:
-> Input text as a String
-> Create for loop starting from length of string and -1 to 0
-> Using this loop get each character of String one by one and store it in temporary string 
-> display the temporary string as output
*/
public class ReverseStringMethod {
    public static void main(String[] args) {
        System.out.println("Enter the String :");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String temp_str = "";
        for(int i = str.length()-1; i >= 0; i--)
        {
            temp_str += str.charAt(i);
        }
        System.out.println("Reverse String --> " + temp_str);
    }
    public void reverString(String[] str_array) {
       
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
