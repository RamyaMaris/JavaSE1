
package com.ntuc.demos.datatypes;

public class StringBufferMethods {
    
    public static void main(String[] args) {
        
        //String Instanstance Methods
        
        
        StringBuffer str_buf = new StringBuffer("Welcome");
        StringBuffer str_buf1 = new StringBuffer(" To Java");
        
        
        System.out.println("Character postion 0   :: " + str_buf.charAt(0));//Returns the char value in this sequence at the specified index.
        System.out.println("String Concatination  :: " + str_buf.append(str_buf1));//Appends the specified StringBuffer to this sequence.
        System.out.println("String Equals         :: " + str_buf.equals(str_buf1));
        System.out.println("String Length         :: " + str_buf.length());
        System.out.println("Sub String            :: " + str_buf.substring(4));//Returns a new String that contains a subsequence of characters currently contained in this character sequence.
        System.out.println("Lowercase String      :: " + str_buf.toString().toLowerCase());
        System.out.println("Uppercase String      :: " + str_buf.toString().toUpperCase());
        System.out.println("Capacity of String" + str_buf.capacity());//The capacity is the number of characters that can be stored 
        System.out.println("Check string empty r not:: " + str_buf.isEmpty()); // Returns a boolean -- False
        System.out.println("Find chr by index       :: " + str_buf.indexOf("e"));//the index of the first occurance of the param -- 1
        System.out.println("Reverse String          :: " + str_buf.reverse()); //character sequence to be replaced by the reverse of the sequence
    }
}
