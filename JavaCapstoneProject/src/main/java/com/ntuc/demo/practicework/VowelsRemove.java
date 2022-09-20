package com.ntuc.demo.practicework;

import java.util.Scanner;

public class VowelsRemove {
//    static 

    public static void main(String[] args) {
        VowelsRemove vr = new VowelsRemove();
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println(vr.RemoveVowels(s));
    }

    String RemoveVowels(String s) {
        char[] ch = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (!(s.toLowerCase().charAt(i) == 'a' && s.toLowerCase().charAt(i) == 'e' && s.toLowerCase().charAt(i) == 'i' && s.toLowerCase().charAt(i) == 'o' && s.toLowerCase().charAt(i) == 'u')) {
                ch[i] = s.charAt(i);
            }

        }
        String result = new String(ch);
        return result;
    }
}
