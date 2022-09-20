package com.ntuc.demo.strings;

import java.util.Scanner;

public class AsciiValues {

    public static void main(String[] args) {
        AsciiValues av = new AsciiValues();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String st = sc.next();
        av.converUpper(st);
    }

    void converUpper(String s) {
        String res = "";
        char[] chr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            int asc = s.charAt(i);
            if (asc < 91 && asc > 64) {

                res += chr[i];
            } else if (asc > 96 && asc < 123) {
                res += (char) (asc - 32);
            } else {
                res += chr[i];

            }

        }
        System.out.println("Chage to uppercase-->" + res);
    }
}
