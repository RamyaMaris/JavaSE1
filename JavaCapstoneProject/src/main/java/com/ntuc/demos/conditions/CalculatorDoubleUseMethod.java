
package com.ntuc.demos.conditions;

import com.ntuc.demo.staticinstance.Calculator;
import java.util.Scanner;

public class CalculatorDoubleUseMethod {
    
    public static void main(String[] args) {
        
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Value 1 :: ");
        double val1 = sc1.nextDouble();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter Value 2 :: ");
        double val2 = sc2.nextDouble();
        
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter the Operator [+,-,*,/]:: ");
        String opr = sc3.nextLine();
        
        Calculator c = new Calculator();
        double result = 0.0;
        switch (opr){
            case "+":
                result = c.add_double(val1, val2);
                break;
            case "-":
                result = c.sub_double(val1, val2);
                break;
            case "*":
                result = c.multi_double(val1, val2);
                break;
            case "/":
                result = c.div_double(val1, val2);
                break;
            default:
                break;
                
        }
        System.out.println( val1 + opr + val2 + " = " + result);
        System.out.printf( "%.5f\t "+opr+" %.5f\t=\t%.5f",val1, val2, result);
    }
}
