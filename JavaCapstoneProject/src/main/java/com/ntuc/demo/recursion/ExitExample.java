
package com.ntuc.demo.recursion;

import java.util.Scanner;

public class ExitExample {
    Scanner scan = new Scanner(System.in);
    int i =0;
    int j;
    public static void main(String[] args) {
        ExitExample ex = new ExitExample();
        ex.readInput();
//        System.out.println(ex.i);
    }
    public void readInput()
    {
        System.out.println("Enter a number");
        j = scan.nextInt();
        
        if(j != 0)
        {
            i = i + j;
           // System.out.println(j);
            readInput();
        }
       
        System.out.println(i);
//        System.exit(0);
    }
    
}
