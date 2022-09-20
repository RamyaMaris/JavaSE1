
package com.ntuc.demo.exception.throwsample;

import java.util.Scanner;

public class CallCalcPow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CalcPow cp = new CalcPow();
        
        int i = scan.nextInt();
        int m = scan.nextInt();
        
        try{
            System.out.println(cp.pow(i, m));
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
