package com.ntuc.demos.datatypes;

public class HelloWorld {

    public static void main(String[] args) {
        char ch[] = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'l', 'd'};
        String s = new String(ch);
        
        System.out.println(s);
        System.out.println(s.hashCode());
        s = "Welcome to java";
        System.out.println(s.hashCode());
        
        StringBuffer sbf = new StringBuffer("STRINGBUFFER");
        StringBuilder sb = new StringBuilder("STRINGBUILDER");;
        int length_buffer = sbf.length();
        int length_builder = sb.length();
        System.out.println("Hashcode Buffer-->" + sbf.hashCode());
        System.out.println("Length Buffer-->" + length_buffer);
        System.out.println("------------------------------------");
        System.out.println("Hashcode Builder-->" + sb.hashCode());
        System.out.println("Length Builder-->" + length_builder);
    }
}
