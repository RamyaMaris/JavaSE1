
package com.ntuc.demo.staticinstance;

public class StaticNonStatic {
    public static void main(String[] args) {
        StaticNonStatic sns = new StaticNonStatic();
        sns.NonStaticMethod();
        StaticNonStatic.StaticMethod();
    }
    
    void NonStaticMethod(){
        System.out.println("Non Static Moethod.....");
    }
    static void StaticMethod(){
        System.out.println("Static Moethod.....");
    }
}
