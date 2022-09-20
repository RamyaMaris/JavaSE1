
package com.ntuc.demo.exception.throwsample;

public class CustomTestException {
    static void testage(int age) throws InvalidAgeException{
        if(age < 18){
        throw new InvalidAgeException("Invalid age entered");
        }
        else
        {
            System.out.println("Validated and accepted");
        }
    }
    public static void main(String[] args) {
        try{
//            testage(12);
            testage(26);
        }catch(InvalidAgeException ine){
            System.out.println(ine.getMessage());
        }
    }
}
