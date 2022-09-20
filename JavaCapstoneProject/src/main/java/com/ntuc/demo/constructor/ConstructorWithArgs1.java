
package com.ntuc.demo.constructor;

public class ConstructorWithArgs1 {
    String language;
    int pref;

    public ConstructorWithArgs1(String l) {
        language = l;
        System.out.println(l+" is a programming language");
        
    }

    public ConstructorWithArgs1(String language, int pref) {
        this.language = language;
        this.pref = pref;
    }

    public ConstructorWithArgs1(int pref) {
        this.pref = pref;
    }

    public ConstructorWithArgs1() {
    }
    
    public static void main(String[] args) {
        ConstructorWithArgs1 c = new ConstructorWithArgs1();
        ConstructorWithArgs1 l1 = new ConstructorWithArgs1("Java");
        ConstructorWithArgs1 l2 = new ConstructorWithArgs1("C");
        ConstructorWithArgs1 pref = new ConstructorWithArgs1(5);
        ConstructorWithArgs1 preLan = new ConstructorWithArgs1("C++", 7);
        
    }
    
    
}
