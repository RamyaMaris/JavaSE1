
package com.ntuc.demo.exception;

public class StringIndexOutOfBoundException {
    public static void main(String[] args) {
        
        try{
            String s = "This is sample text";
            char c = s.charAt(10);
//            char c = s.charAt(20);
            System.out.println(c);
            int n = Integer.parseInt("s");
            System.out.println(n);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("SOB exception occured");
        }catch(NumberFormatException nfe){
            System.out.println("I can write my own text");
            
        }
        
    }
}
