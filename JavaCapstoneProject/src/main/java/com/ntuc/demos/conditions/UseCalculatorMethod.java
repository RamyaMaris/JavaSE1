
package com.ntuc.demos.conditions;

import com.ntuc.demo.staticinstance.Calculator;

public class UseCalculatorMethod {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Calculation using method of Calculator which have in different Package");
        System.out.println("-----------------------------------------");
        System.out.println("Addtion ->" + c.add(15, 5));
        System.out.println("Subtraction ->" + c.sub(15, 5));
        System.out.println("Multifilication ->" + c.multi(15, 5));
        System.out.println("Division ->" + c.div(15, 5));
    }
}
