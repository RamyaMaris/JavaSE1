
package com.ntuc.demo.methods.inheritance;

public class Child extends Parent{
    // This method overrides show() of Parent
    @Override
   void show(){
      System.out.println("Child's Activities");
        System.out.println("___________________"); 
   } 
    @Override
   void write() {
        System.out.println("Writes with left hand");
    }
   void study(){
        System.out.println("Am studying in the 5th grade");
    }
}
