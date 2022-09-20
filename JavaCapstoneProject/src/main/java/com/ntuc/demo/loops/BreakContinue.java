
package com.ntuc.demo.loops;


public class BreakContinue {
    public static void main(String args[]) {
        System.out.println("Print with Break");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        
        System.out.println("Print with Continue");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }

}
