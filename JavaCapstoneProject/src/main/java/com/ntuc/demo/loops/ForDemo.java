package com.ntuc.demo.loops;

public class ForDemo {

    public static void main(String[] args) {
//        for (int i = 0, j = 10; i < 10 || j < 9; i++, j++) {
//            System.out.println(i + " * " + j + " = " + (i * j));
//        }

        String str = "test";
        String str1 = "test";
        String str2 = new String("test");
        System.out.println("str (test) hashcode-->" + str.hashCode());
        System.out.println("str1 (test) hashcode-->" + str1.hashCode());
        System.out.println("str2 (test) hashcode-->" + str2.hashCode());

        //            ==  compared with Object ID's
//            .equals method = Compares content
        System.out.println("str==str1-->" + (str == str1));
        System.out.println("str==str2-->" + (str == str2));
        System.out.println("str.equals(str2)-->" + str.equals(str2));
        if (str == str1) {
            System.out.println("true");
        } else {
            System.out.println("false");

        }
    }
}
