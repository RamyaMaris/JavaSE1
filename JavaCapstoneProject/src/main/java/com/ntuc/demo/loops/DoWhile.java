
package com.ntuc.demo.loops;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String capture;
        String text = "";
        do{
            capture = scan.next();
            text += " " + capture;
        }while(!capture.toLowerCase().equals("done"));
        System.out.println(capture);
    }
}
