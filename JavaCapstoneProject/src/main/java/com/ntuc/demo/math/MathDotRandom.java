
package com.ntuc.demo.math;

public class MathDotRandom {
    public static void main(String[] args) {
        double doubleNum = Math.random();
       System.out.println(doubleNum); //returns a random number between 0.0 (inclusive), and 1.0 (exclusive):
        int randNum = (int) (doubleNum * 100); //returns a random number between 0 to 100:
        System.out.println(randNum); 
    }
  
}
