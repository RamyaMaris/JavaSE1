package com.ntuc.demo.practicework;

import java.util.Scanner;

public class ConsonantsVowels {

    static String str = " ";

    public static void main(String[] args) {

        ConsonantsVowels cs = new ConsonantsVowels();
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();

        System.out.println("Enter "+index +" String Array : ");
        String[] str_array = new String[index];
        for (int i = 0; i < str_array.length; i++) {
            str_array[i] = sc.next();
        }
        System.out.println("-------------------------");
        System.out.println("String after romove vowels: ");
        cs.removeVowels(str_array);
    }

    public void removeVowels(String[] s) {

        String st = " ";
        for (String item : s) {
            str = item.toLowerCase();
            //        for (int i = 0; i < s.length; i++) {
//            str = s[i].toLowerCase();
            st = str.replace('a', '\u0000');
            st = st.replace('e', '\u0000');
            st = st.replace('i', '\u0000');
            st = st.replace('o', '\u0000');
            st = st.replace('u', '\u0000');
            System.out.println(st);
        }

    }
}
