
package com.ntuc.demos.datatypes;

public class StringMethods {
    
    public static void main(String[] args) {
        
        //String Instanstance Methods
        
        String str = "Welcome";
        String str1 = "Welcome1";
        System.out.println("Character postion 0   :: " + str.charAt(0));// returns the character at the position 0  -- W
        System.out.println("String Concatination  :: " + str.concat(" To Java"));// join the strings -- Welcome To Java
        System.out.println("String Equals         :: " + str.equals(str1));// returns a Boolean -- False
        System.out.println("String Length         :: " + str.length());// returns the number of characters -- 7
        System.out.println("Sub String            :: " + str.substring(4));//Returns the number of characters from start to the param value -- Welc
        System.out.println("Lowercase String      :: " + str.toLowerCase()); // converts into lower case
        System.out.println("Uppercase String      :: " + str.toUpperCase()); // converts into upper case   
        System.out.println("Trim the String       :: " + str.trim());//  Removes spaces. both trailing and leading 
        System.out.println("Check string empty r not:: " + str.isEmpty()); // Returns a boolean -- False
        System.out.println("Find chr by index     :: " + str.indexOf('l'));//the index of the first occurance of the param -- 1
        
    }
}
