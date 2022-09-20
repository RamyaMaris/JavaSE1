
package com.ntuc.demos.conditions;

import java.util.Scanner;

public class CalculatorDouble {
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
        
        double result = 0.0;
        switch (opr){
            case "+":
                result = val1 + val2;
                break;
            case "-":
                result = val1 - val2;
                break;
            case "*":
                result = val1 * val2;
                break;
            case "/":
                result = val1 / val2;
                break;
            default:
                break;
                
        }
        System.out.println( val1 + opr + val2 + " = " + result);
        System.out.printf( "%.5f\t "+opr+" %.5f\t=\t%.5f",val1, val2, result);
    }
}
