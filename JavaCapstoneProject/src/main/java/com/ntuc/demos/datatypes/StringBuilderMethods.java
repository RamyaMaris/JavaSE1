
package com.ntuc.demos.datatypes;

public class StringBuilderMethods {
    
    public static void main(String[] args) {
        
        //String Instanstance Methods
        
        
        StringBuilder str_bul = new StringBuilder("String Builder");
        StringBuilder str_bul1 = new StringBuilder(" String Builder1");
        
        
        System.out.println("Character postion 0   :: " + str_bul.charAt(0));//Returns the char value in this sequence at the specified index.
        System.out.println("String Concatination  :: " + str_bul.append(str_bul1));//Appends the specified StringBuffer to this sequence.
        System.out.println("String Equals         :: " + str_bul.equals(str_bul1));
        System.out.println("String Length         :: " + str_bul.length());
        System.out.println("Sub String            :: " + str_bul.substring(4));//Returns a new String that contains a subsequence of characters currently contained in this character sequence.
        System.out.println("Lowercase String      :: " + str_bul.toString().toLowerCase());
        System.out.println("Uppercase String      :: " + str_bul.toString().toUpperCase());
        System.out.println("Capacity of String    :: " + str_bul.capacity());//The capacity is the number of characters that can be stored 
        System.out.println("Check string empty r not:: " + str_bul.isEmpty()); // Returns a boolean -- False
        System.out.println("Find chr by index       :: " + str_bul.indexOf("e"));//the index of the first occurance of the param -- 1
        System.out.println("Reverse String          :: " + str_bul.reverse());
    }
}
