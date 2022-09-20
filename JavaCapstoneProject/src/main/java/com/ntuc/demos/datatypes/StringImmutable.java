
package com.ntuc.demos.datatypes;

public class StringImmutable {
    public static void main(String[] args) {
        //Showing that Strings are immutable
        
        String str1 = "Welcome";
        
        System.out.println(str1.hashCode());//showing the object Id of string 
        str1 = "Welcome to Java";
        
        System.out.println(str1.hashCode());//showing after reassigning the different value
        
    }
}
