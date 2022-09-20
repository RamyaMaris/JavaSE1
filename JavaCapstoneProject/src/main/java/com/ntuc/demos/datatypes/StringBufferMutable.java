
package com.ntuc.demos.datatypes;

public class StringBufferMutable {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Welcome");// introduce in java 1.4
        System.out.println(sb);
        System.out.println(sb.hashCode());
        sb.append(" To java");

//        StringBuffer sb1 = new StringBuffer(" To java");// introduce in java 1.4
        System.out.println(sb);
        System.out.println(sb.hashCode());
    }
}
