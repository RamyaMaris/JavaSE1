
package com.ntuc.demos.conditions;

import com.ntuc.demo.staticinstance.Calculator;
import java.util.Scanner;

public class UseCalculatorMethodScanner {
        static Calculator c = new Calculator();
        static Scanner sc1 = new Scanner(System.in);
        static int i;
        static int j;
        
    public static void main(String[] args) {
        System.out.println("Calculation using method of Calculator which have in different Package");
        System.out.println("-----------------------------------------");
        
        
        i = sc1.nextInt();
        j = sc1.nextInt();
        
        System.out.println("Addtion ->" + c.add(i, j));
        System.out.println("Subtraction ->" + c.sub(i, j));
        System.out.println("Multifilication ->" + c.multi(i, j));
        System.out.println("Division ->" + c.div(i, j));
    }
}
