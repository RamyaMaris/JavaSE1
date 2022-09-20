package com.ntuc.demo.methods;

import java.lang.reflect.Array;
import java.util.Scanner;

public class TitleCaseOverload {

    public static void main(String[] args) {
        TitleCaseOverload st = new TitleCaseOverload();
//        st.upperCase("ramYa","priya","vanI");
        String[] str = new String[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        System.out.println("Title Case: ");
        st.upperCase(str);

    }

    void upperCase(String str) {
        System.out.println(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
    }

    void upperCase(String... str) {
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i].substring(0, 1).toUpperCase() + str[i].substring(1).toLowerCase());

        }
//        System.out.println(str.substring(0, 1).toUpperCase()+ str.substring(1).toLowerCase());
    }
    void titleCase(String... str)
    {
        for (int i = 0; i < str.length; i++) {
            str[i] = str[i].toLowerCase();
            char[] cArray = str[i].toCharArray();
            cArray[0] = Character.toUpperCase(cArray[0]);
            str[i] = String.valueOf(cArray);
        }
//        System.out.println(Array.toString(str));
    }
}
